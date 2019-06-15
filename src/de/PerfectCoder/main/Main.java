package de.PerfectCoder.main;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Main{

	public boolean active;
	
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("window"));
		frame.setBounds(100, 100, 758, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("UMWELT");
		mntmNewMenuItem_1.setFont(new Font("Impact", Font.PLAIN, 15));
		mntmNewMenuItem_1.setForeground(Color.WHITE);
		mntmNewMenuItem_1.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("- Aktuelle Beiträge");
		mntmNewMenuItem.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		mntmNewMenuItem.setForeground(Color.WHITE);
		mntmNewMenuItem.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("- Klimawandel");
		mntmNewMenuItem_2.setForeground(Color.WHITE);
		mntmNewMenuItem_2.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("- Zeit bis Katastrophe");
		mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JEditorPane editorPane = new JEditorPane();
				editorPane.setBounds(338, 101, 420, 532);
				editorPane.setContentType("text/html");
				
				String html = "\n" + 
						"<!DOCTYPE html>\n" + 
						"<html class=\"no-js\" lang=\"en-US\">\n" + 
						"    <head>\n" + 
						"        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n" + 
						"        <meta charset=\"UTF-8\">\n" + 
						"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
						"        <title>The Countdown 2º Clock</title>\n" + 
						"        <link rel=\"stylesheet\" type=\"text/css\" href=\"carbon_clock.css\">\n" + 
						"        <script type=\"text/javascript\" src=\"carbon_clock-Dateien/jquery_002.js\"></script>\n" + 
						"        <script type=\"text/javascript\" src=\"carbon_clock-Dateien/CO2Calculator.js?i=374267543\"></script>\n" + 
						"    </head>\n" + 
						"    <body>\n" + 
						"        <video id=\"video_background\" preload=\"auto\" autoplay loop muted volume=\"0\"> \n" + 
						"            <source src=\"carbon_clock-Dateien/MCC_CO2_ani_2_bb_small_lq.mp4\" type=\"video/mp4\"> \n" + 
						"        </video>\n" + 
						"        <div id=\"main\">\n" + 
						"            <div id=\"wrapper\" align=\"center\">\n" + 
						"                <div id=\"footer\">Minx, Creutzig, Edenhofer: \"Climate goals require fast learning in negative emission technologies\" (in press)</div>\n" + 
						"                <div id=\"buttons\">\n" + 
						"                    <ul id=\"deg\">\n" + 
						"                        <li><a id=\"2\" href=\"javascript:void(0)\" class=\"active\">2°C scenario</a></li>\n" + 
						"                        <li id=\"onedeg\"><a id=\"1.5\" href=\"javascript:void(0)\">1.5°C scenario</a></li>\n" + 
						"                    </ul>\n" + 
						"                    <ul id=\"range\" style=\"display: none\">\n" + 
						"                        <li><a id=\"max\" href=\"javascript:void(0)\">upper estimate</a></li>\n" + 
						"                        <li><a id=\"med\" href=\"javascript:void(0)\" class=\"active\">medium estimate</a></li>\n" + 
						"                        <li><a id=\"min\" href=\"javascript:void(0)\">lower estimate</a></li>\n" + 
						"                    </ul>\n" + 
						"                    <ul id=\"growth\">\n" + 
						"                        <li id=\"growth1\"><a id=\"zero\" href=\"javascript:void(0)\" class=\"active\">no growth</a></li>\n" + 
						"                        <li id=\"growth2\"><a id=\"current\" href=\"javascript:void(0)\" class=\"\">current growth</a></li>\n" + 
						"                        <li><a target=\"_blank\" href=\"https://www.mcc-berlin.net/en/research/co2-budget.html \" style=\"border: 0; background: black;\"><img style=\"width: 100%;\" src=\"/fileadmin/data/img/mcc_logo_rz_1c_negativ.png \" \n" + 
						"onmouseover=\"this.src='/fileadmin/data/img/mcc_logo_rz_1c_negativ_blue.png'\"\n" + 
						"onmouseout=\"this.src='/fileadmin/data/img/mcc_logo_rz_1c_negativ.png'\" /></a></li>\n" + 
						"\n" + 
						"                    </ul>\n" + 
						"                </div>  \n" + 
						"                <h1 id=\"global-temp\">CO<sub>2</sub> emissions [tons/sec]</h1>\n" + 
						"                <div id=\"global-temp-container\"><span id=\"currentrate\" class=\"bold grad\">1.293</span></div>\n" + 
						"                <h1 id=\"time-to-two\">time left until CO<sub>2</sub> budget depleted</h1>\n" + 
						"                <div id=\"timecountdown\">\n" + 
						"                    <table cellpadding=0 cellspacing=0>\n" + 
						"                        <tr>\n" + 
						"                            <th style=\"padding-left: 0;\">year</th>\n" + 
						"                            <th>month</th>\n" + 
						"                            <th>day</th>\n" + 
						"                            <th>hour</th>\n" + 
						"                            <th>min</th>\n" + 
						"                            <th>sec</th>\n" + 
						"                            <th>&nbsp;</th>\n" + 
						"                        </tr><tr>\n" + 
						"                            <td id=\"years\"></td>\n" + 
						"                            <td id=\"months\"></td>\n" + 
						"                            <td id=\"days\"></td>\n" + 
						"                            <td id=\"hours\"></td>\n" + 
						"                            <td id=\"minutes\"></td>\n" + 
						"                            <td id=\"seconds\"></td>\n" + 
						"                            <td id=\"milliseconds\"></td>\n" + 
						"                        </tr>\n" + 
						"                    </table>\n" + 
						"                </div>\n" + 
						"                <!--<h5 id=\"timecountdown-labels\"><span>y&nbsp;&nbsp;</span><span>m&nbsp;&nbsp;</span><span>d&nbsp;&nbsp;</span><span>h&nbsp;&nbsp;</span><span>m&nbsp;&nbsp;</span><span>s&nbsp;&nbsp;</span><span>cs</span></h5>-->\n" + 
						"                <h1 id=\"tonnes\">CO<sub>2</sub> budget left [tons]</h1>\n" + 
						"                <div id=\"carbontonnes\">error</div>\n" + 
						"            </div>\n" + 
						"        </div>\n" + 
						"        <script>\n" + 
						"            switchScenarios();\n" + 
						"            $('#med').click();\n" + 
						"            $('#zero').click();\n" + 
						"        </script>\n" + 
						"    </body>\n" + 
						"</html>";
				
				editorPane.setText(html);
				
				frame.getContentPane().add(editorPane);
				
			}
		});
		mntmNewMenuItem_3.setBackground(Color.DARK_GRAY);
		mntmNewMenuItem_3.setForeground(Color.WHITE);
		popupMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("- Tipps");
		mntmNewMenuItem_4.setForeground(Color.WHITE);
		mntmNewMenuItem_4.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_4);
		
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
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("- Kinderamut");
		mntmNewMenuItem_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editorPane.setText(readRSS(""));
				
			}

			public static String readRSS(String urlAdress) { 
				URL rssURL = new URL("");
				BufferedReader in = new BufferedReader(new InputStreamReader(rssURL.openStream()));
				String sourcecode = "";
				String line;
				while((line = in.readLine()) != null) {
				   if(line.contains("<title>")) {
					   int firstPos = line.indexOf("<title>");
					   String temp = line.substring(firstPos);
					   temp = temp.replace("<title>", " ");
					   int lastPos = temp.indexOf("<title>");
					   temp = temp.substring(0, lastPos);
					   sourcecode += temp+"\n";
					   
				   }
					
			
		}
				
				return null;
			}
		});
		mntmNewMenuItem_6.setForeground(Color.WHITE);
		mntmNewMenuItem_6.setBackground(Color.DARK_GRAY);
		popupMenu.add(mntmNewMenuItem_6);
		
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