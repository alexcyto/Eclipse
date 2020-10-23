package DOM;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomMetodos {
	
	public static Document cargarXML(String documento) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File(documento));
	 return doc;		
	}
	

	public static Document modificarDatos(Document doc) throws ParserConfigurationException, SAXException, IOException {
		
		System.out.println("Modificar");
		System.out.println("----------------------------------------------");
		((Element)doc.getLastChild()).getElementsByTagName("Client").item(0).setTextContent("xd");;
		
		return doc;
	}
	
	public static Document eliminarDatos(Document doc) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		
		System.out.println("Eliminar");
		System.out.println("------------------------------------------------");
		int number=doc.getElementsByTagName("Booking").getLength();
		Element deleteElement = (Element)doc.getElementsByTagName("Booking").item(number -1);
		deleteElement.getParentNode().removeChild(deleteElement);

		return doc;
			
	}
	
	public static Document mostrarDatosActuales(Document doc) {
		NodeList nodes = doc.getElementsByTagName("Booking");		
		for(int i=0; i<nodes.getLength(); i++) {
			Node node = nodes.item(i);
			Element element = (Element)node;
			System.out.println("Location number " + element.getAttribute("location_number"));
			System.out.println("Client : "+ element.getElementsByTagName("Client").item(0).getTextContent());
            System.out.println("Price : "+ element.getElementsByTagName("Price").item(0).getTextContent());
            System.out.println("Hotel : "+ element.getElementsByTagName("Hotel").item(0).getTextContent());
            System.out.println("Agency : "+ element.getElementsByTagName("Agency").item(0).getTextContent());
            System.out.println("-----------------------------------------------");
			}
			separar();
		return doc;
	}
				

	public static Document crearDatos(Document doc) throws ParserConfigurationException, SAXException, IOException {
		
		System.out.println("Crear Datos");
		System.out.println("---------------------------------------------");
		
			//Atributo elemento padre booking
		Node nodeBooking=doc.createElement("Booking");
        ((Element)nodeBooking).setAttribute("location_number", "04");

        	//Cliente
        Node nodeClient=doc.createElement("Client");
        Node nodeClientText=doc.createTextNode("Antonio Machado");
        nodeClient.appendChild(nodeClientText);

        	//Precio
        Node nodePrice=doc.createElement("Price");
        Node nodePriceText=doc.createTextNode("50");
        nodePrice.appendChild(nodePriceText);

        	//Hotel
        Node nodeHotel=doc.createElement("Hotel");
        Node nodeHotelText=doc.createTextNode("Hotel Machado");
        nodeHotel.appendChild(nodeHotelText);

        	//Agency
        Node nodeAgency=doc.createElement("Agency");
        Node nodeAgencyText=doc.createTextNode("Logitravel");
        nodeAgency.appendChild(nodeAgencyText);

        nodeBooking.appendChild(nodeClient);
        nodeBooking.appendChild(nodePrice);
        nodeBooking.appendChild(nodeHotel);
        nodeBooking.appendChild(nodeAgency);

        doc.getLastChild().appendChild(nodeBooking);
       
		return doc;		
		
	}
	
	public static void separar() {
		System.out.println("\n");
		System.out.println("\n");
	}

	public static void guardarXML(Document doc, String nuevodocumento) throws TransformerException {
		
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transf = tf.newTransformer();
        transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transf.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(doc);
        StreamResult file = new StreamResult(new File(nuevodocumento));
        transf.transform(source, file);
    
    
        System.out.println("SE HA GUARDADO:");
        System.out.println("---------------------------------------------");
        
     
			}
			
		
    
	
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException{
	
	Document doc = cargarXML("books.xml");
	
	cargarXML("books.xml");
	
	System.out.println("Datos Base");
	System.out.println("-----------------------------------------------");
	mostrarDatosActuales(doc);
	
	modificarDatos(doc);
	mostrarDatosActuales(doc);
		
	crearDatos(doc);
	mostrarDatosActuales(doc);
	
	eliminarDatos(doc);
	mostrarDatosActuales(doc);

	
	guardarXML(doc, "new_books.xml");
	mostrarDatosActuales(doc);
 }
}

		