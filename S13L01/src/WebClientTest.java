import java.io.IOException;
import java.net.UnknownHostException;

public class WebClientTest {

	public static void main(String[] args) {

		try {
			Response response;
			String url = "http://pik.ba/";
			do {
				response = WebClient.get(url);
				System.out.println(response.getBody());
				url = response.getHeaders().get("Location");
			} while(response.getStatusCode() >= 300 && response.getStatusCode() <= 399);
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
