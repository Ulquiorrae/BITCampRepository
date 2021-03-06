public class URLTest {

	public static void main(String[] args) {
		testSimpleUrl("http://pik.ba/");
		testSimpleUrl("http://www.pik.ba/artikal/14438431/golf-4-karavan/");
	}

	private static void testSimpleUrl(String urlString) {
		URL parsedUrl = URL.parse(urlString);
		if (urlString.equals(parsedUrl.toString())) {
			System.out.println("testSimpleUrl OK");
		} else {
			System.out.printf(
					"testSimpleUrl FAILED. Expected: \n%s, Got:  \n%s\n",
					urlString, parsedUrl);
		}

	}
}

