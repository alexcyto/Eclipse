/*Es demana una programa que faci el següent.

-Carregui un xml biblioteca.xml
-Crea un mètode per afegir al XML fills llibre amb  els nodes  títol, autor , text, editorial   i l’atribut publicado_en.
-Finalment crea el mètode que esrigui el arbre en un nou XML anomentar modificat.xml.
-Crea un mètode per mostrar el contingut del arbre actual.
-Crea un mètode que rebi per paràmetre el títol d’un llibre i modifiqui el títol al nou títol també introduït per paràmetre.

-Crea un mètode que rebi per paràmetre el títol d’un llibre i l’elimini.


-El programa principal haurà de fer:

-Crear un arbre amb 5 nodes llibre.
-Modificar 2 llibres.
-Eliminar 1 llibre.
-Crear un nou xml amb les modificacions.

Es valorarà:

-Comentaris dient les passes que segueixes.
-L'estructura dels mètodes.
-Claredat del codi.
-El funcionament correcte del programa.
-Optimització dels recursos (variables amb les mides corresponents, etc.).
*/

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

import java.util.Scanner;

public class DomSinMétodos {
	
	public static void guardarDatos() throws ParserConfigurationException, SAXException, IOException, TransformerException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("biblioteca.xml"));
		
		TransformerFactory tf = TransformerFactory.newInstance();	
		Transformer transf = tf.newTransformer();
		transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transf.setOutputProperty(OutputKeys.INDENT, "yes");
		
		DOMSource source = new DOMSource(doc);
		StreamResult file = new StreamResult(new File("modificat.xml"));
		transf.transform(source, file);	
		
	}
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException{
		
		Scanner sc = new Scanner(System.in);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("biblioteca.xml"));
		NodeList nodes = doc.getElementsByTagName("libro");
		
		
    	for(int i=0; i<nodes.getLength(); i++) {
			Node node = nodes.item(i);
			Element element = (Element)node;
			System.out.println("Año de publicación : " + element.getAttribute("publicado_en"));
			System.out.println("Título : "+ element.getElementsByTagName("titulo").item(0).getTextContent());
            System.out.println("Autor : "+ element.getElementsByTagName("autor").item(0).getTextContent());
            System.out.println("Fragmento de texto : "+ element.getElementsByTagName("texto").item(0).getTextContent());
            System.out.println("Editorial : "+ element.getElementsByTagName("editorial").item(0).getTextContent());
            System.out.println("-----------------------------------------------");
    	}
    		
    		System.out.println("\n");
    		System.out.println("\n");
            
			System.out.println("Introduce el año de publicación:");
	        Node nodelibro=doc.createElement("libro");
	        ((Element)nodelibro).setAttribute("publicado_en", sc.next());

	        System.out.println("Introduce el titulo del libro:");
	        Node nodetitulo=doc.createElement("titulo");
	        Node nodetituloText=doc.createTextNode(sc.next());
	        nodetitulo.appendChild(nodetituloText);

	        System.out.println("Introduce el autor:");
	        Node nodeautor=doc.createElement("autor");
	        Node nodeautorText=doc.createTextNode(sc.next());
	        nodeautor.appendChild(nodeautorText);

	        System.out.println("Introduce un fragmento de texto del libro:"); 	
	        Node nodetexto=doc.createElement("texto");
	        Node nodetextoText=doc.createTextNode(sc.next());
	        nodetexto.appendChild(nodetextoText);

	        System.out.println("Introduce la editorial del libro:");
	        Node nodeeditorial=doc.createElement("editorial");
	        Node nodeeditorialText=doc.createTextNode(sc.next());
	        nodeeditorial.appendChild(nodeeditorialText);

	        nodelibro.appendChild(nodetitulo);
	        nodelibro.appendChild(nodeautor);
	        nodelibro.appendChild(nodetexto);
	        nodelibro.appendChild(nodeeditorial);

	        doc.getLastChild().appendChild(nodelibro);
	        
	        System.out.println("\n");
    		System.out.println("\n");
	        
	        for(int i=0; i<nodes.getLength(); i++) {
				Node node = nodes.item(i);
				Element element = (Element)node;
				System.out.println("Año de publicación : " + element.getAttribute("publicado_en"));
				System.out.println("Título : "+ element.getElementsByTagName("titulo").item(0).getTextContent());
	            System.out.println("Autor : "+ element.getElementsByTagName("autor").item(0).getTextContent());
	            System.out.println("Fragmento de texto : "+ element.getElementsByTagName("texto").item(0).getTextContent());
	            System.out.println("Editorial : "+ element.getElementsByTagName("editorial").item(0).getTextContent());
	            System.out.println("-----------------------------------------------");
	    	}
	        
	        System.out.println("\n");
    		System.out.println("\n");
	        
    		//modificar
	        
	        System.out.println("Introduce el numero del libro que quieres eliminar y su nuevo titulo");
	        ((Element)doc.getLastChild()).getElementsByTagName("titulo").item(sc.nextInt()).setTextContent(sc.next());;
	        
	        System.out.println("Introduce el numero del libro que quieres eliminar y su nuevo titulo");
	        ((Element)doc.getLastChild()).getElementsByTagName("titulo").item(sc.nextInt()).setTextContent(sc.next());;
			
			 for(int i=0; i<nodes.getLength(); i++) {
					Node node = nodes.item(i);
					Element element = (Element)node;
					System.out.println("Año de publicación : " + element.getAttribute("publicado_en"));
					System.out.println("Título : "+ element.getElementsByTagName("titulo").item(0).getTextContent());
		            System.out.println("Autor : "+ element.getElementsByTagName("autor").item(0).getTextContent());
		            System.out.println("Fragmento de texto : "+ element.getElementsByTagName("texto").item(0).getTextContent());
		            System.out.println("Editorial : "+ element.getElementsByTagName("editorial").item(0).getTextContent());
		            System.out.println("-----------------------------------------------");
		            }
			 
		     System.out.println("\n");
	    	 System.out.println("\n");
			
			//eliminar
	    	 
			 	int number=doc.getElementsByTagName("libro").getLength();
				Element deleteElement = (Element)doc.getElementsByTagName("libro").item(number -1);
				deleteElement.getParentNode().removeChild(deleteElement);
				
					
			 for(int i=0; i<nodes.getLength(); i++) {
					Node node = nodes.item(i);
					Element element = (Element)node;
					System.out.println("Año de publicación : " + element.getAttribute("publicado_en"));
					System.out.println("Título : "+ element.getElementsByTagName("titulo").item(0).getTextContent());
		            System.out.println("Autor : "+ element.getElementsByTagName("autor").item(0).getTextContent());
		            System.out.println("Fragmento de texto : "+ element.getElementsByTagName("texto").item(0).getTextContent());
		            System.out.println("Editorial : "+ element.getElementsByTagName("editorial").item(0).getTextContent());
		            System.out.println("-----------------------------------------------");
		            }
			 
			 TransformerFactory tf = TransformerFactory.newInstance();	
				Transformer transf = tf.newTransformer();
				transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
				transf.setOutputProperty(OutputKeys.INDENT, "yes");
				
				DOMSource source = new DOMSource(doc);
				StreamResult file = new StreamResult(new File("modificat.xml"));
				transf.transform(source, file);	
			 
			 
	}
}
