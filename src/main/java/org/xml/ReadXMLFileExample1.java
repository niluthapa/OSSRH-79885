package org.xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ReadXMLFileExample1 {

  public static void main(String argv[]) {
    try {
      Node node;
      File file = new File("\\Pictures\\Unilever\\MMA\\demo-poc\\src\\main\\resources\\org\\poc\\unsupported-component-in-mma.xml");
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(file);
      doc.getDocumentElement().normalize();
      System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
      NodeList nodeList = doc.getElementsByTagName("flow");
      for (int itr = 0; itr < nodeList.getLength(); itr++) {
         node = nodeList.item(itr);
//        System.out.println("name l---------"+node.getLastChild());
//        System.out.println("\nNode Name :" + node.getNodeName());
       System.out.println(getLastChildElement(node)); 
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static Element getLastChildElement(Node node)
  {
      node = node.getLastChild();
      while (node != null && node.getNodeType() != Node.ELEMENT_NODE)
      {
          node = node.getPreviousSibling();
      }
      return (Element)node;
  }

}
