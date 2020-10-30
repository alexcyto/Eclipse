package SAX;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Ejemplo{
	

	public static void main(String[] args) {
		
		try {
			File inputFile = new File("books.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			XMLSaxHandler userhandler = new XMLSaxHandler();
			saxParser.parse(inputFile, userhandler);
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
