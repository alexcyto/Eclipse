package SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
-Crea un programa SAX que llegeixi un XML videojocs.xml que tinguis ja creat.
-Tamb� ha de llegir els atributs si es que t� alguns.
-Si el programa detecta un element amb el text �Nada� imprimir per pantalla un miassatge de error amb system.err.println(�Nodo vacio�).
-Crea un m�tode que mostri una llista dels t�tols dels videojocs.


-Crea un m�tode que introdueixis per par�metre 2 anys(per exemple 2010,2020) i mostri tots els jocs que s�han creat dins d�aquell per�ode.
-Crea un m�tode que rebi per par�metre un any i mostri el joc de l�any indicat.
 */

public class XMLSaxHandler extends DefaultHandler {
	
	String arr[];
	String titulo = "";
	int e = 0;
	//qName = <creador>
	
	public void startDocument() throws SAXException{
		System.out.println("-------------------------------------------------");
		System.out.println("Start of the document");
		System.out.println("-------------------------------------------------");
		arr = new String[5];
	}
	
	public void mostrarTitulos() {
		for(int i=0; arr.length > i;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void endDocument() throws SAXException{
		mostrarTitulos();
		System.out.println("-------------------------------------------------");
		System.out.println("End of the document document:");
		System.out.println("-------------------------------------------------");
	}


	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
		this.titulo = qName;
		if(attributes.getValue(0)!=null) {
			System.out.println("Start Element name:"+ qName + " Attributo: " + attributes.getValue(0));
		}else {
			System.out.println("Start Element name:"+qName);
		}
		
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException{
		System.out.println("End of element:"+qName);
	}
	
	public void characters(char ch[],int start,int length) throws SAXException{
		String s = new String(ch,start,length);
		if(s.equals(" ")) {
			System.err.println("Nodo vacio");
		}else {			
			System.out.println("Characters :"+ new String(ch,start,length));
		}
		if(this.titulo.equals("titulo")) {
			arr[e] = s;
			e++;
			this.titulo = "";
		}
	}	
	
}
	
	//2012 = HappyWars 
	//print titulo del juego if atribute creado_en = parametro
	
