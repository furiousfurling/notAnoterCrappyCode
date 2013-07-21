package tribes2d.xmlreadwrite;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XMLRead 
{
    static private String resX,resY,playername;
    static File root = new File("src/main/resources/config.xml");
    public static int getResX(){
    try {

    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    Document doc = dBuilder.parse(root);
    doc.getDocumentElement().normalize();
    NodeList nodes = doc.getElementsByTagName("config");


    for (int i = 0; i < nodes.getLength(); i++) {
    Node node = nodes.item(i);

    if (node.getNodeType() == Node.ELEMENT_NODE) 
    {
    Element element = (Element) node;
    resX = getValue("ResX", element);

    }
    }
    } catch (Exception ex) {
    ex.printStackTrace();
    }
        return Integer.parseInt(resX);
    }
    public static int getResY(){
    try {

    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    Document doc = dBuilder.parse(root);
    doc.getDocumentElement().normalize();
    NodeList nodes = doc.getElementsByTagName("config");


    for (int i = 0; i < nodes.getLength(); i++) {
    Node node = nodes.item(i);

    if (node.getNodeType() == Node.ELEMENT_NODE) 
    {
    Element element = (Element) node;
    resY = getValue("ResY", element);

    }
    }
    } catch (Exception ex) {
    ex.printStackTrace();
    }
        return Integer.parseInt(resY);
    }
    public static String getPlayerName(){
    
    try {

    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    Document doc = dBuilder.parse(root);
    doc.getDocumentElement().normalize();
    NodeList nodes = doc.getElementsByTagName("config");


    for (int i = 0; i < nodes.getLength(); i++) {
    Node node = nodes.item(i);

    if (node.getNodeType() == Node.ELEMENT_NODE) 
    {
    Element element = (Element) node;
    playername = getValue("playername", element);

    }
    }
    } catch (Exception ex) {
    ex.printStackTrace();
    }
    return playername;
    }
    private static String getValue(String tag, Element element) {
NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
Node node = (Node) nodes.item(0);
return node.getNodeValue();
}
}

