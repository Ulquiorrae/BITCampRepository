import java.io.ObjectInputStream.GetField;

public class URL {

	private String schema;
	private String host;
	private String path;

	public URL() {
		this.schema = schema;
		this.host = host;
		this.path = path;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public static URL parse(String url) {
		URL newurl = new URL();
		String[] schemaAndOthers = url.split("://");
		newurl.schema = schemaAndOthers[0];
		String[] hostAndPath = schemaAndOthers[1].split("/", 2);
		newurl.host = hostAndPath[0];
		
		if(hostAndPath.length > 1) {
			newurl.path = "/" + hostAndPath[1];
		} else {
			newurl.path = "/";
		}
		return newurl;
	}
	
	@Override
	public String toString() {
		return String.format("%s://%s%s", schema, host, path);
	} 
	
	
	public static void main(String[] args) {

		String url = "http://www.pik.ba/pretraga?burek";

		

	}

}
