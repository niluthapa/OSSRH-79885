package org.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ReadAndWriteXMLFile {



  public static void main(String argv[])
      throws ParserConfigurationException, SAXException, IOException, XPathExpressionException, TransformerFactoryConfigurationError, TransformerException {
//    Node node;
    File file =
        new File("\\Pictures\\Unilever\\MMA\\demo-poc\\src\\main\\resources\\org\\poc\\unsupported-component-in-mma.xml");
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document xmlDocument = db.parse(file);
    // Document xmlDocument = loadXMLDocument();
    XPathFactory _xpathFactory = XPathFactory.newInstance();
    XPath _xpath = _xpathFactory.newXPath();
    XPathExpression exp = _xpath.compile("./mule/flow");

    System.out.println(exp.evaluate(xmlDocument));


//    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(file.toString()));
//
//    XPath xpath = XPathFactory.newInstance().newXPath();
//    Node nodde =   (Node) xpath.evaluate("./mule/flow", doc, XPathConstants.NODESET);
//    System.out.println(nodde);
//    
    

//    for (int idx = 0; idx < element.getLength(); idx++) {
//      nodes.item(idx).;
//    }

//    Transformer xformer = TransformerFactory.newInstance().newTransformer();
//    xformer.transform(new DOMSource(doc), new StreamResult(new File(file.toString())));
//    System.out.println("success");
  }
}
