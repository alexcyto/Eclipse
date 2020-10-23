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

public class EjEvaluable {
	
	//M�todo que carga el xml ya creado previamente
	public static Document cargarXML(String documento) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("videojocs.xml"));
		return doc;		
	}
	
	//M�todo que muestra el contenido del xml despu�s de cada modificaci�n o no
	public static Document mostrarDatosActuales(Document doc) {
		NodeList nodes = doc.getElementsByTagName("juego");		
		for(int i=0; i<nodes.getLength(); i++) {
			Node node = nodes.item(i);
			Element element = (Element)node;
			System.out.println("Creado en: " + element.getAttribute("creado_en"));
			System.out.println("Titulo : "+ element.getElementsByTagName("titulo").item(0).getTextContent());
            System.out.println("Creador: "+ element.getElementsByTagName("creador").item(0).getTextContent());
            System.out.println("Sinopsis : "+ element.getElementsByTagName("sinopsis").item(0).getTextContent());
            System.out.println("Plataforma : "+ element.getElementsByTagName("plataforma").item(0).getTextContent());
            System.out.println("-----------------------------------------------");
			}
			System.out.println("\n");
			System.out.println("\n");
		return doc;
	}
	
	//M�todo para modificar el t�tulo de un juego a trav�s de un par�metro t�tulo
	public static Document modificarTituloJuego(Document doc, String titulo,String nuevoTitulo) throws ParserConfigurationException, SAXException, IOException {
	
		System.out.println("Modificar");
		System.out.println("----------------------------------------------");
		
		NodeList nodes = doc.getElementsByTagName("juego");		
		for(int i=0; i<nodes.getLength(); i++) {
			Node node = nodes.item(i);
			Element element=(Element)node;
            String titulodoc = element.getElementsByTagName("titulo").item(0).getTextContent();
            if (titulodoc.equals(titulo)){
                ((Element)doc.getLastChild()).getElementsByTagName("titulo").item(i).setTextContent(nuevoTitulo);
		}		
		}
		return doc;
	}
	
	
	//M�todo para eliminar un elemento juego a trav�s de un par�metro t�tulo
	public static Document eliminarJuego(Document doc, String titulo) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		
		System.out.println("Eliminar");
		System.out.println("------------------------------------------------");
		
		NodeList nodes = doc.getElementsByTagName("juego");		
		for(int i=0; i<nodes.getLength(); i++) {
			Node node = nodes.item(i);
			Element element=(Element)node;
            String titulodoc = element.getElementsByTagName("titulo").item(0).getTextContent();
            if (titulodoc.equals(titulo)){
            	element.getParentNode().removeChild(element);
		}		
		}
		return doc;
	}
		
	
				
	//m�todo para crear un elemento juego con datos que pide al usuario
	public static void crearJuegoUsuario(Document doc) throws ParserConfigurationException, SAXException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Crear Juego");
		System.out.println("---------------------------------------------");
		
		 System.out.println("Introduce el a�o de publicaci�n: ");
		
		Node nodejuego=doc.createElement("juego");
        ((Element)nodejuego).setAttribute("creado_en", sc.next());

        System.out.println("Introduce el titulo: ");
        
        Node nodetitulo=doc.createElement("titulo");
        Node nodetituloText=doc.createTextNode(sc.next());
        nodetitulo.appendChild(nodetituloText);

        System.out.println("Introduce el creador: ");
        
        Node nodecreador=doc.createElement("creador");
        Node nodecreadorText=doc.createTextNode(sc.next());
        nodecreador.appendChild(nodecreadorText);

        System.out.println("Introduce la sinopsis: ");	
        
        Node nodesinopsis=doc.createElement("sinopsis");
        Node nodesinopsisText=doc.createTextNode(sc.next());
        nodesinopsis.appendChild(nodesinopsisText);
        
        System.out.println("Introduce la plataforma: ");
        
        Node nodeplataforma=doc.createElement("plataforma");
        Node nodeplataformaText=doc.createTextNode(sc.next());
        nodeplataforma.appendChild(nodeplataformaText);

        nodejuego.appendChild(nodetitulo);
        nodejuego.appendChild(nodecreador);
        nodejuego.appendChild(nodesinopsis);
        nodejuego.appendChild(nodeplataforma);


        doc.getLastChild().appendChild(nodejuego);
        
   
	}
    
	//m�todo que guarda el nuevo xml con todas las modificaciones
	public static Document guardarXML(Document doc, String nuevodocumento) throws ParserConfigurationException, SAXException, IOException, TransformerException {	
		
		System.out.println("SE HA GUARDADO:");
	    System.out.println("---------------------------------------------");
		TransformerFactory tf = TransformerFactory.newInstance();	
		Transformer transf = tf.newTransformer();
		transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transf.setOutputProperty(OutputKeys.INDENT, "yes");
				
		DOMSource source = new DOMSource(doc);
		StreamResult file = new StreamResult(new File(nuevodocumento));
		transf.transform(source, file);
				
		return doc;
		
	}
		
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException{
			
	Document doc = cargarXML("videojocs.xml");
	
	//cargo el xml con este m�todo y hago un print de "datos iniciales" para dejar claro el contenido del xml base
	cargarXML("videojocs.xml");
	System.out.println("Datos Iniciales");
	System.out.println("------------------------------------------------");
	mostrarDatosActuales(doc);
	
	crearJuegoUsuario(doc);
	crearJuegoUsuario(doc);
	crearJuegoUsuario(doc);
	crearJuegoUsuario(doc);
	crearJuegoUsuario(doc);
	mostrarDatosActuales(doc);
	
	modificarTituloJuego(doc, "Bomberman", "Elpepe");
	mostrarDatosActuales(doc);
	
	modificarTituloJuego(doc, "Happy Wars", "Las Guerras Felices");
	mostrarDatosActuales(doc);
	
	eliminarJuego(doc, "Dark Souls III");
	mostrarDatosActuales(doc);
	
	guardarXML(doc, "videojocsmodificat.xml");
	mostrarDatosActuales(doc);
	
	/*Se pide que se haga lo siguiente en el main:
	
	//1.	Crear 5  elementos juegos con sus respectivos subelementos
	//2.    Modificar 2 juegos a traves de un par�metro titulo
	//3.    Eliminar 1 juego a trav�s de un par�metro titulo
	//4.    Crear un nuevo xml con las modificaciones
	
	/*Es demana una programa que faci el seg�ent.
	 
	-Carregui un xml anomenat videojocs.xml
	-Crea un m�tode per afegir al XML fills videojoc amb  els nodes  t�tol, creador, sinopsis, plataforma  i l�atribut creat_en.
	-Crea un m�tode per mostrar el contingut de l�arbre actual.
	-Crea un m�tode que rebi per par�metre el t�tol d�un joc i modifiqui el t�tol al nou t�tol tamb� introdu�t per par�metre.
	-Crea un m�tode que rebi per par�metre el t�tol d�un joc i elimini el joc.
	-Finalment crea el m�tode que escrigui l�arbre en un nou XML anomentat modificat.xml.	
	*/
 }
}

		