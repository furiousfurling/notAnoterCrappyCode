
package tribes2d.xmlreadwrite;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLWrite 
{
public static void main(String ResX,String ResY,String playername) {
 
	  try {
 
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
 
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("root");
		doc.appendChild(rootElement);
 
		Element config = doc.createElement("config");
		rootElement.appendChild(config);
 
		Element firstname = doc.createElement("ResX");
		firstname.appendChild(doc.createTextNode(ResX));
		config.appendChild(firstname);
 
		Element lastname = doc.createElement("ResY");
		lastname.appendChild(doc.createTextNode(ResY));
		config.appendChild(lastname);
 
		Element nickname = doc.createElement("playername");
		nickname.appendChild(doc.createTextNode(playername));
		config.appendChild(nickname);
 
		
		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("src/main/resources/config.xml"));
 
		transformer.transform(source, result);
 
 
	  } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
	}
}
