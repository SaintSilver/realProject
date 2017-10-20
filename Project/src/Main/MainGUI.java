package Main;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MainGUI {

	private JFrame frame;
	private String menuList;
	private JPanel mainPanel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JPanel menuPanel = new JPanel();
		sl_panel.putConstraint(SpringLayout.EAST, menuPanel, 104, SpringLayout.WEST, panel);
		menuPanel.setBackground(new Color(254, 194, 15));
		sl_panel.putConstraint(SpringLayout.NORTH, menuPanel, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, menuPanel, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, menuPanel, 0, SpringLayout.SOUTH, panel);
		panel.add(menuPanel);
		SpringLayout sl_menuPanel = new SpringLayout();
		menuPanel.setLayout(sl_menuPanel);
		
		
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.NORTH, titlePanel, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, titlePanel, 0, SpringLayout.EAST, menuPanel);
		sl_panel.putConstraint(SpringLayout.SOUTH, titlePanel, 92, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, titlePanel, 780, SpringLayout.EAST, menuPanel);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.DARK_GRAY);
		sl_panel.putConstraint(SpringLayout.NORTH, mainPanel, 6, SpringLayout.SOUTH, titlePanel);
		sl_panel.putConstraint(SpringLayout.WEST, mainPanel, 6, SpringLayout.EAST, menuPanel);
		sl_panel.putConstraint(SpringLayout.SOUTH, mainPanel, 382, SpringLayout.SOUTH, titlePanel);
		sl_panel.putConstraint(SpringLayout.EAST, mainPanel, 770, SpringLayout.EAST, menuPanel);
		panel.add(mainPanel);
		mainPanel.setLayout(new CardLayout(0, 0));
		
		//order panel
		OrderPanel order_panel = new OrderPanel();
		mainPanel.add(order_panel, "order");
		
		
		//order_current
		Order_current order_current = new Order_current();
		mainPanel.add(order_current, "order_current");
		
		//payment panel
		MyOrderPanel paymentPanel = new MyOrderPanel();
		mainPanel.add(paymentPanel,"paymentPanel");
		//game panel
		GamePanel gamePanel = new GamePanel();
		mainPanel.add(gamePanel, "gamePanel");
		
		
		SpringLayout sl_titlePanel = new SpringLayout();
		titlePanel.setLayout(sl_titlePanel);
		
		JLabel lblNewLabel = new JLabel(menuList);
		lblNewLabel.setFont(new Font("³ª´®°íµñ", Font.BOLD, 26));
		sl_titlePanel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, titlePanel);
		sl_titlePanel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -10, SpringLayout.SOUTH, titlePanel);
		titlePanel.add(lblNewLabel);
		
		
		JButton btnNewButton = new JButton("\uC8FC\uBB38\uD604\uD669");
		btnNewButton.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 15));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(255, 255, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(254, 194, 15));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("ÁÖ¹®ÇöÈ²");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "order_current");
			}
		});
		btnNewButton.setBackground(new Color(254, 194, 15));
		sl_menuPanel.putConstraint(SpringLayout.NORTH, btnNewButton, 114, SpringLayout.NORTH, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.SOUTH, btnNewButton, 169, SpringLayout.NORTH, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.EAST, btnNewButton, 104, SpringLayout.WEST, menuPanel);
		menuPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB0B4 \uC8FC\uBB38");
		btnNewButton_1.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 15));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(255, 255, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(254, 194, 15));
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("³» ÁÖ¹®");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "paymentPanel");
			}
		});
		btnNewButton_1.setBackground(new Color(254, 194, 15));
		sl_menuPanel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.SOUTH, btnNewButton);
		sl_menuPanel.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 55, SpringLayout.SOUTH, btnNewButton);
		sl_menuPanel.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, btnNewButton);
		menuPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uACB0\uC81C\uC790\uCD94\uCCA8");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_2.setBackground(new Color(255, 255, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBackground(new Color(254, 194, 15));
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("°áÁ¦ÀÚÃßÃ·");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "gamePanel");	
			}
		});
		btnNewButton_2.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(254, 194, 15));
		sl_menuPanel.putConstraint(SpringLayout.NORTH, btnNewButton_2, 0, SpringLayout.SOUTH, btnNewButton_1);
		sl_menuPanel.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 55, SpringLayout.SOUTH, btnNewButton_1);
		sl_menuPanel.putConstraint(SpringLayout.EAST, btnNewButton_2, 0, SpringLayout.EAST, btnNewButton);
		menuPanel.add(btnNewButton_2);
		
		
	
		
		
		JButton btnNewButton_3 = new JButton("\uC8FC\uBB38");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3.setBackground(new Color(255, 255, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3.setBackground(new Color(254, 194, 15));
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("ÁÖ¹®ÇÏ±â");
				mainPanel.setBackground(Color.BLUE);
				mainPanel.setVisible(true);
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "order");	
			}
		});
		btnNewButton_3.setBackground(new Color(254, 194, 15));
		btnNewButton_3.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
		sl_menuPanel.putConstraint(SpringLayout.NORTH, btnNewButton_3, -44, SpringLayout.NORTH, btnNewButton);
		sl_menuPanel.putConstraint(SpringLayout.WEST, btnNewButton_3, 0, SpringLayout.WEST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.SOUTH, btnNewButton_3, 0, SpringLayout.NORTH, btnNewButton);
		sl_menuPanel.putConstraint(SpringLayout.EAST, btnNewButton_3, 0, SpringLayout.EAST, btnNewButton);
		menuPanel.add(btnNewButton_3);
		panel.add(titlePanel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
