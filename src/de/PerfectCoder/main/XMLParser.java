package de.PerfectCoder.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class XMLParser {

	public static Document xmlparse(String s9) {
		
		Document doc = convertStringToXMLDocument(s9);
		return doc;
//        doc.getElementsByTagName("catogory");
//     	System.out.println(((Node) doc).getFirstChild().getNodeName());	
		
	}
	
	private static Document convertStringToXMLDocument(String s9) {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
     
		DocumentBuilder builder = null;
		
    try {
    	
        builder = factory.newDocumentBuilder();
         
        Document doc = (Document) builder.parse(new InputSource(new StringReader(s9)));
        return doc;
        
    } catch (Exception e) {
        e.printStackTrace();
        
    		}
    
    return null;
    
		}
	public static String prepareParse(String xmlString) {
		String g = "=";
		String s2 = xmlString.replaceAll(g, " ");
		String[] testString = s2.split("\n");
		String s3 = s2.replaceAll("version ", "version=");
		String s4 = s3.replaceAll("encoding ", "encoding=");
		String s5 = s4.replaceAll("content ", "content=");
		String s6 = s5.replaceAll("standalone ", "standalone=");
		String s7 = s6.replaceAll("type ", "type=");
		String s8 = s7.replaceAll("url ", "url=");
		String s9 = s8.replaceAll("src ", "src=");
		return s9;
	}
	
	public static String takeURLContent(String urlName ) throws IOException {
		InputStream is = null;
		
		URL url = new URL(urlName);
		URLConnection connection = url.openConnection();
		
		is = connection.getInputStream();
		String s = (new Scanner(is).useDelimiter( "\\Z" ).next());
		is.close();
		return s;
		
	}
}
