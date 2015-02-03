package XMLBaza;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Shared.Article;

public class Test {

	private static boolean testArticleConstructor() throws ParserConfigurationException, SAXException, IOException{
		
		DocumentBuilder docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		Document xmldoc = docReader.parse(new File("/Users/hariskrkalic/Desktop/Articles.xml"));
		Node testItem = xmldoc.getElementsByTagName("item").item(0);
		Article testArticle = new Article(testItem);
		
		if(testArticle.getId() != 1) {
			return false;
		}
		if(testArticle.getAutorID() != 1) {
			return false;
		}
		if(testArticle.getPubDate() != 0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws XPathExpressionException {
		
		try {
			if(testArticleConstructor() == false) {
				System.err.println("Article constructor test FAILED!");
			}
			else {
				System.out.println("testArticleConstructor true");
			}
			if(testXMLquery() == false) {
				System.err.println("XML TEST FAILED!");
			}
			else {
				System.out.println("XML TEST PASSED!!!!!");
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {

			System.err.println("testArticleConstructor false");
			e.printStackTrace();
		} 
		
	}
	
	public static boolean testXMLquery() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		
		XMLConnection connection = new XMLConnection();
		
		if(connection.query("Articles", "//item") instanceof NodeList == false) {
			return false;
		}
		
		NodeList xmlArticle = connection.query("Article", "//item");
		Node testItem = xmlArticle.item(0);
		Article testArticle = new Article(testItem);
		
		if(testArticle.getId() != 1) {
			return false;
		}
		if(testArticle.getAutorID() != 1) {
			return false;
		}
		if(testArticle.getPubDate() != 0) {
			return false;
		}
		return true;
	}
	
}
