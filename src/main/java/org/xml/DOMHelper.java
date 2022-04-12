package org.xml;


import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DOMHelper {

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
