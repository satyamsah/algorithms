package test1;





import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
//import java.util.stream;
import java.nio.file.Files;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStream;

import java.io.File;
import java.io.FileReader;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
//import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
//import org.jdom2.*;
//import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.Document;



/**

 * Index all text files under a directory.

 * <p>

 * This is a command-line application demonstrating simple Lucene indexing. Run

 * it with no command-line arguments for usage information.

 */

public class generateIndex {



	private generateIndex() {

	}



	/** Index all text files under a directory. */

	public static void main(String[] args) {


		
				try {
					File fXmlFile = new File("C:\\Users\\satyam\\Desktop\\bhadani\\staff.xml");
					DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
					Document doc = dBuilder.parse(fXmlFile);

					//optional, but recommended
					//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
					doc.getDocumentElement().normalize();

					//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

					NodeList nList = doc.getElementsByTagName("staff");

					System.out.println("----------------------------"+nList.getLength() );

					for (int temp = 0; temp < nList.getLength(); temp++) {

						Node nNode = nList.item(temp);

						System.out.println("\nCurrent Element :" + nNode.getNodeName());

						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							Element eElement = (Element) nNode;
							System.out.println(eElement.getTextContent());

							System.out.println("Staff id : " + eElement.getAttribute("id"));
							System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
							System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
							System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
							System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

						}
					}
				    } catch (Exception e) {
					e.printStackTrace();
				    }
				  

}
}