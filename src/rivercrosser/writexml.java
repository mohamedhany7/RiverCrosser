package rivercrosser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;



import java.io.IOException;
import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;



import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class writexml{
    
 public void write(List<ICrosser> left,List<ICrosser> right,int story)
    {
DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            //add elements to Document
            Element rootElement = doc.createElementNS("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\RiverCrosser\\src\\rivercrosser\\employee.xml", "Employees");
            //append root element to document
            doc.appendChild(rootElement);

            //append first child element to root element
            //rootElement.appendChild(getEmployee(doc, "1", "Pankaj", "29", "Java Developer", "Male"));

            //append second child
            //rootElement.appendChild(getEmployee(doc, "2", "Lisa", "35", "Manager", "Female"));

            //for output to file, console
            //TransformerFactory transformerFactory = TransformerFactory.newInstance();
            //Transformer transformer = transformerFactory.newTransformer();
            //for pretty print
            //transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            //DOMSource source = new DOMSource(doc);

            //write to console or file
            //StreamResult console = new StreamResult(System.out);
            //StreamResult file = new StreamResult(new File(("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\RiverCrosser\\src\\rivercrosser\\employee.xml")));

            //write data
            //transformer.transform(source, console);
            //transformer.transform(source, file);
            System.out.println("DONE");

        } catch (Exception e) {
            e.printStackTrace();
        }
}
}

