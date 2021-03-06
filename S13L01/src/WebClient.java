import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

public class WebClient {

	public static Response get(String urlString) throws UnknownHostException, IOException {

		URL url = URL.parse(urlString);
		Socket webSocket = new Socket(url.getHost(), 80);
		
		PrintWriter requestWriter = new PrintWriter(new OutputStreamWriter(webSocket.getOutputStream()));

		BufferedReader responseReader = new BufferedReader(new InputStreamReader(webSocket.getInputStream()));
		
		requestWriter.printf("GET %s HTTP/1.1\n", url.getPath());
		requestWriter.printf("Host: %s\n", url.getHost());
		requestWriter.println("User-Agent: bitcamp(WebServer)");
		requestWriter.println();
		requestWriter.flush();
		
//		StringBuilder responseBuilder = new StringBuilder();
		Response response = new Response();
		response.setStatusLine(responseReader.readLine());
		
		while (true) {
			String line = responseReader.readLine();
			if (line == null || line.isEmpty()) {
				break;
			}
			String[] headerField = line.split(": ", 2);
			response.getHeaders().put(headerField[0], headerField[1]);
		}
		
		//čitamo tijelo 
		StringBuilder bodyBuilder = new StringBuilder();
		
		while (true) {
			String line = responseReader.readLine();
			if (line == null) {
				break;
			}
			bodyBuilder.append(line);
			bodyBuilder.append('\n');
		}
		response.setBody(bodyBuilder.toString());
		
		return response;
	}

}
