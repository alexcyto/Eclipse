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

public class Ejemplo {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException{
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("books.xml"));
		
		NodeList nodes = doc.getElementsByTagName("Booking");
		
		//obtener los datos//
		
				System.out.println("\n");
				System.out.println("\n");
				
		        System.out.println("//////////////////////////////////");
				System.out.println("Estos son los datos base del xml");
				System.out.println("////////////////////////////////");


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
				System.out.println("///////////////////////////////////");
				System.out.println("Aquí acaban los datos base del xml");
				System.out.println("///////////////////////////////////");
				
				System.out.println("\n");
				System.out.println("\n");

		
		
			
		//Creación de un nuevo elemento
				
		
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
        
    	System.out.println("///////////////////////////////////");
		System.out.println("Aquí imprimo todos los datos anteriores + el nuevo elemento que he creado");
		System.out.println("///////////////////////////////////");
		
		System.out.println("\n");
		System.out.println("\n");
        
        //modificar un elemento
		((Element)doc.getLastChild()).getElementsByTagName("Client").item(0).setTextContent("xd");;
		
		System.out.println("///////////////////////////////////");
		System.out.println("Aquí modifico el cliente 1 cambiando su nombre de Enric a xd");
		System.out.println("///////////////////////////////////");
		
	
		
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
        
    	

		
		
		//eliminar elemento
		int number=doc.getElementsByTagName("Booking").getLength();
		Element deleteElement = (Element)doc.getElementsByTagName("Booking").item(number -1);
		deleteElement.getParentNode().removeChild(deleteElement);
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("///////////////////////////////////");
		System.out.println("Aquí elimino el último elemento (el que tiene location number 04)");
		System.out.println("///////////////////////////////////");
		
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
		
		//la verdad es que podría hacer un metodo para el for para no tener que ponerlo todo el rato para ver los cambios
		
		//guardar archivo
		TransformerFactory tf = TransformerFactory.newInstance();	
		Transformer transf = tf.newTransformer();
		transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transf.setOutputProperty(OutputKeys.INDENT, "yes");
		
		DOMSource source = new DOMSource(doc);
		StreamResult file = new StreamResult(new File("newfile.xml"));
		transf.transform(source, file);	
	}

}