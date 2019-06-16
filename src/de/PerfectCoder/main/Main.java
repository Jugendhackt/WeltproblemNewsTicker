package de.PerfectCoder.main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;

public class Main{
	
	public static String s;
	private JFrame firstframe;

	  public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.firstframe.setVisible(true);
					
			} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
			try {
				s = XMLParser.takeURLContent("https://www.spiegel.de/schlagzeilen/index.rss")	;		
				String preparedString = XMLParser.prepareParse(s);
				Document doc = XMLParser.xmlparse(preparedString);
				
				
			} catch (Exception ex) {
				System.out.println(ex.toString());
				
				}

	}
	public Main() {
		initialize();
	}

	private void initialize() {
		firstframe = new JFrame();
		firstframe.getContentPane().setBackground(UIManager.getColor("window1"));
		firstframe.getContentPane().setLayout(null);
		firstframe.setBounds(100, 100, 758, 655);
		firstframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstframe.setVisible(true);
		firstframe.setEnabled(true);
		
		// FirstFrame
		
	}
	
}