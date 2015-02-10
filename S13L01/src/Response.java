import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Response {

	private String statusLine;
	private Map<String, String> headers = new HashMap<String, String>();
	private String body;
	private int statusCode;

	
	public String getStatusLine() {
		return statusLine;
	}
	public void setStatusLine(String statusLine) {
		this.statusLine = statusLine;
		Scanner s = new Scanner(statusLine);
		s.next();
		this.statusCode = s.nextInt();
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	
	public Map<String, String> getHeaders() {
		return headers;
	}
	
	public int getStatusCode() {
		return statusCode;
	}
}
