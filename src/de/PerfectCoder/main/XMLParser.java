package de.PerfectCoder.main;

import java.io.StringReader;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class XMLParser {

	public static void xmlparse(String s) {
		
		Document doc = convertStringToXMLDocument(s);
     
    		System.out.println(((Node) doc).getFirstChild().getNodeName());	
		
	}
	
	private static Document convertStringToXMLDocument(String s) {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
     
		DocumentBuilder builder = null;
		
    try {
    	
        builder = factory.newDocumentBuilder();
         
        Document doc = (Document) builder.parse(new InputSource(new StringReader(s)));
        return doc;
        
    } catch (Exception e) {
        e.printStackTrace();
        
    		}
    
    return null;
    
		}
	
}
