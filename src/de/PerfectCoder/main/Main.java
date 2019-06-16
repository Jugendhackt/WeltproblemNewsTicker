package de.PerfectCoder.main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.w3c.dom.Document;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main{
	
	public static boolean umwelt = false;
	public static boolean aktuelle = false;
	public static boolean vergangen = false;
	private static int a = 0;
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
		firstframe.setBounds(100, 100, 729, 367);
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
		chckbxUmwelt.setBounds(29, 170, 128, 23);
		panel.add(chckbxUmwelt);
		
		JCheckBox chckbxAktuelleProbleme = new JCheckBox("Aktuelle Probleme");
		chckbxAktuelleProbleme.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		chckbxAktuelleProbleme.setBounds(240, 170, 208, 23);
		panel.add(chckbxAktuelleProbleme);
		
		JCheckBox chckbxVergangenheit = new JCheckBox("Vergangenheit");
		chckbxVergangenheit.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		chckbxVergangenheit.setBounds(526, 170, 177, 23);
		panel.add(chckbxVergangenheit);
		
		JButton btnFertig = new JButton("Fertig");
		btnFertig.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxUmwelt.isSelected()) {
					umwelt = true;
					a += 1;
					
				}
				
				if(chckbxAktuelleProbleme.isSelected()) {
					aktuelle = true;
					a += 1;
					
				}
				
				if(chckbxVergangenheit.isSelected()) {
					vergangen = true;
					a += 1;
					
				}
				
				if(a > 0) {
					Frame2.main2();
					firstframe.setEnabled(false);
					firstframe.setVisible(false);
					
				} else {
					JOptionPane.showMessageDialog(null, "Bitte wähle mindestens 1 Thema aus!");
					
				}
				
			}
		});
		btnFertig.setBounds(287, 293, 117, 29);
		panel.add(btnFertig);
		
		
		
		// FirstFrame
		
	}
}