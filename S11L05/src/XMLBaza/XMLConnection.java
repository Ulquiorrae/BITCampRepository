package XMLBaza;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Shared.Article;

public class XMLConnection {

	private DocumentBuilder docReader;
	private Document xmldoc;
	
	public XMLConnection() throws ParserConfigurationException {
		docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	} 
	
	public void setDocument(String tableName) throws ParserConfigurationException, SAXException, IOException {
		
		String path = "/Users/hariskrkalic/Desktop/" + tableName + ".xml";
		
		xmldoc = docReader.parse(new File(path));
	}
	
	public NodeList query(String tableName, String query) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		
		setDocument(tableName);
		
		query = "//item"; //trebat ce nam xpath, provjeriti ovo!
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		NodeList xmlNodeList = (NodeList) xPath.compile(query).evaluate(xmldoc, XPathConstants.NODESET);
		
		return xmlNodeList;
	}
	
//	public boolean testXMLquery() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
//		
//		XMLConnection connection = new XMLConnection();
//		
//		if(connection.query("Articles", "//item") instanceof NodeList == false) {
//			return false;
//		}
//		
//		NodeList xmlArticle = connection.query("Article", "//item");
//		Node testItem = xmlArticle.item(0);
//		Article testArticle = new Article(testItem);
//		
//		if(testArticle.getId() != 1) {
//			return false;
//		}
//		if(testArticle.getAutorID() != 1) {
//			return false;
//		}
//		if(testArticle.getPubDate() != 0) {
//			return false;
//		}
//		return true;
//	}
	
	public static void main(String[] args) {
		
		
		
	}
}


