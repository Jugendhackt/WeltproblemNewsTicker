package de.PerfectCoder.main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Frame2 {

	private static JFrame frame;
	public static String s;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main2() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("window2"));
		frame.setBounds(100, 100, 758, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Weltproblem-NewsTicker");
		frame.setVisible(true);
		frame.setEnabled(true);
		
			try {
				s = XMLParser.takeURLContent("https://www.spiegel.de/schlagzeilen/index.rss")	;		
				String preparedString = XMLParser.prepareParse(s);
				XMLParser.xmlparse(preparedString);
				
				
			} catch (Exception ex) {
				System.out.println(ex.toString());
				
				}
		
		
		JTextPane txtpnAktuelleWeltProbleme = new JTextPane();
		txtpnAktuelleWeltProbleme.setFont(new Font("Geeza Pro", Font.BOLD, 15));
		txtpnAktuelleWeltProbleme.setForeground(Color.WHITE);
		txtpnAktuelleWeltProbleme.setBackground(Color.DARK_GRAY);
		txtpnAktuelleWeltProbleme.setText("        \n                                                          AKTUELLE WELTPROBLEME");
		txtpnAktuelleWeltProbleme.setBounds(0, 0, 777, 61);
		txtpnAktuelleWeltProbleme.setEditable(false);
		frame.getContentPane().add(txtpnAktuelleWeltProbleme);
		
		JTextPane txtpnChat = new JTextPane();
		txtpnChat.setBackground(Color.DARK_GRAY);
		txtpnChat.setForeground(Color.WHITE);
		txtpnChat.setFont(new Font("Krungthep", Font.PLAIN, 14));
		txtpnChat.setText("                                                              \n\t\t                   CHAT");
		txtpnChat.setBounds(328, 59, 430, 43);
		txtpnChat.setEditable(false);
		frame.getContentPane().add(txtpnChat);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.DARK_GRAY);
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 101, 344, 532);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setForeground(Color.WHITE);
		popupMenu.setBackground(Color.DARK_GRAY);
		popupMenu.setSize(56, 16);
		addPopup(panel, popupMenu);
		popupMenu.setLocation(24, 156);
		
		// --- UMWELT --- 
		
		
		if(Main.umwelt == true) {
			JMenuItem mntmNewMenuItem_1 = new JMenuItem("UMWELT");
			mntmNewMenuItem_1.setFont(new Font("Impact", Font.PLAIN, 15));
			mntmNewMenuItem_1.setForeground(Color.WHITE);
			mntmNewMenuItem_1.setBackground(Color.DARK_GRAY);
			
			JMenuItem mntmNewMenuItem = new JMenuItem("- Aktuelle Beiträge");
			mntmNewMenuItem.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
			mntmNewMenuItem.setForeground(Color.WHITE);
			mntmNewMenuItem.setBackground(Color.DARK_GRAY);
			
			JMenuItem mntmNewMenuItem_2 = new JMenuItem("- Klimawandel");
			mntmNewMenuItem_2.setForeground(Color.WHITE);
			mntmNewMenuItem_2.setBackground(Color.DARK_GRAY);
			
			JMenuItem mntmNewMenuItem_3 = new JMenuItem("- Zeit bis Katastrophe");
			mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					JEditorPane editorPane = new JEditorPane();
					editorPane.setBounds(338, 101, 420, 532);
					editorPane.setContentType("text/html");
					
					editorPane.setText(s);
					
					frame.getContentPane().add(editorPane);
					
				}
			});
			mntmNewMenuItem_3.setBackground(Color.DARK_GRAY);
			mntmNewMenuItem_3.setForeground(Color.WHITE);
			
			JMenuItem mntmNewMenuItem_4 = new JMenuItem("- Tipps");
			mntmNewMenuItem_4.setForeground(Color.WHITE);
			mntmNewMenuItem_4.setBackground(Color.DARK_GRAY);
			
			
			popupMenu.add(mntmNewMenuItem_1);
			popupMenu.add(mntmNewMenuItem);
			popupMenu.add(mntmNewMenuItem_2);
			popupMenu.add(mntmNewMenuItem_3);
			popupMenu.add(mntmNewMenuItem_4);
			
		}
		
		// --- AKTUELLE PROBLEME
		if(Main.aktuelle == true) {
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("AKTUELLE PROBLEME");
		mntmNewMenuItem_5.setFont(new Font("Impact", Font.PLAIN, 15));
		mntmNewMenuItem_5.setBackground(Color.DARK_GRAY);
		mntmNewMenuItem_5.setForeground(Color.WHITE);
		popupMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("- Versorgung mit sauberem Wasser");
		mntmNewMenuItem_7.setForeground(Color.WHITE);
		mntmNewMenuItem_7.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("- Autoritär Regtime und Demokratie");
		mntmNewMenuItem_8.setBackground(Color.DARK_GRAY);
		mntmNewMenuItem_8.setForeground(Color.WHITE);
		popupMenu.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("- Bedrohung vor Krankheitserregern");
		mntmNewMenuItem_9.setBackground(Color.DARK_GRAY);
		mntmNewMenuItem_9.setForeground(Color.WHITE);
		popupMenu.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("- Organisierte Kriminalität");
		mntmNewMenuItem_10.setForeground(Color.WHITE);
		mntmNewMenuItem_10.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("- Rechte der Frau");
		mntmNewMenuItem_11.setBackground(Color.DARK_GRAY);
		mntmNewMenuItem_11.setForeground(Color.WHITE);
		popupMenu.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("- Steigender Energiebedarf der Menschen");
		mntmNewMenuItem_12.setForeground(Color.WHITE);
		mntmNewMenuItem_12.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_12);
		
		}
		
		// --- VERGANGENHEIT ---
		
		if(Main.vergangen == true) {
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("VERGANGENHEIT");
		mntmNewMenuItem_13.setFont(new Font("Impact", Font.PLAIN, 15));
		mntmNewMenuItem_13.setForeground(Color.WHITE);
		mntmNewMenuItem_13.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("- Wichtige Themen");
		mntmNewMenuItem_14.setForeground(Color.WHITE);
		mntmNewMenuItem_14.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("- Schlimmste Ereignisse");
		mntmNewMenuItem_15.setForeground(Color.WHITE);
		mntmNewMenuItem_15.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("- Kinderamut");
		mntmNewMenuItem_6.setForeground(Color.WHITE);
		mntmNewMenuItem_6.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_6);
		
	}
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.DARK_GRAY);
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 60, 329, 42);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(6, 0, 49, 44);
		panel_1.add(btnX);	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setBounds(338, 101, 420, 532);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(338, 101, 420, 532);
		frame.getContentPane().add(editorPane);
		
		btnX.addMouseListener(new MouseAdapter() {	
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnX.getText().equalsIgnoreCase("X")) {
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
					btnX.setText("=");
					
					} else if(btnX.getText().equalsIgnoreCase("=")) {
						btnX.setText("X");
						
					}
				
			}
		});
		
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnX.getText().equalsIgnoreCase("=")) {
					btnX.setText("X");
					
				} else {
					
					
				}
				
			}
		});
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnX.getText().equalsIgnoreCase("=")) {
					btnX.setText("X");
					
				} else {
					
					
				}
				
			}
		});
		
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnX.getText().equalsIgnoreCase("=")) {
					btnX.setText("X");
					
				} else {
					
					
				}
				
			}
		});
		
		txtpnChat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnX.getText().equalsIgnoreCase("=")) {
					btnX.setText("X");
					
				} else {
					
					
				}
				
			}
		});
		
		txtpnAktuelleWeltProbleme.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnX.getText().equalsIgnoreCase("=")) {
					btnX.setText("X");
					
				} else {
					
					
					
				}
				
			}
		});
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		
	}
		
	}
	
