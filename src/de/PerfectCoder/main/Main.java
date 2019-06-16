package de.PerfectCoder.main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import org.w3c.dom.Document;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;

public class Main{
	
	public static boolean umwelt;
	public static boolean aktuelle;
	public static boolean vergangen;
	public static String s;
	private JFrame firstframe;

	  public static void main(String[] args) {
		  Frame2.main2(args);
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
				@SuppressWarnings("unused")
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
		firstframe.setBounds(100, 100, 758, 655);
		firstframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstframe.setTitle("Treffe deine Auswahl!");
		firstframe.setVisible(true);
		firstframe.setEnabled(true);
		firstframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 758, 633);
		firstframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 0, 759, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnSageUnsNoch = new JTextPane();
		txtpnSageUnsNoch.setFont(new Font("Krungthep", Font.BOLD, 20));
		txtpnSageUnsNoch.setForeground(Color.WHITE);
		txtpnSageUnsNoch.setBackground(Color.DARK_GRAY);
		txtpnSageUnsNoch.setText("  Sage uns noch für welche Themen du dich interessierst!");
		txtpnSageUnsNoch.setBounds(60, 12, 639, 38);
		txtpnSageUnsNoch.setEditable(false);
		panel_1.add(txtpnSageUnsNoch);
		
		JCheckBox chckbxUmwelt = new JCheckBox("Umwelt");
		chckbxUmwelt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		chckbxUmwelt.setBounds(41, 170, 128, 23);
		panel.add(chckbxUmwelt);
		
		JCheckBox chckbxAkutelleProbleme = new JCheckBox("Akutelle Probleme");
		chckbxAkutelleProbleme.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		chckbxAkutelleProbleme.setBounds(234, 170, 208, 23);
		panel.add(chckbxAkutelleProbleme);
		
		JCheckBox chckbxVergangenheit = new JCheckBox("Vergangenheit");
		chckbxVergangenheit.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		chckbxVergangenheit.setBounds(529, 170, 177, 23);
		panel.add(chckbxVergangenheit);
		
		// FirstFrame
		
	}
}