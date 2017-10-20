package Admin;

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


public class Admin_MainGUI {

	
	
	
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
					Admin_MainGUI window = new Admin_MainGUI();
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
	public Admin_MainGUI() {
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
		sl_panel.putConstraint(SpringLayout.NORTH, titlePanel, 50, SpringLayout.NORTH, panel);
		titlePanel.setBackground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.WEST, titlePanel, 0, SpringLayout.EAST, menuPanel);
		sl_panel.putConstraint(SpringLayout.SOUTH, titlePanel, 92, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, titlePanel, 780, SpringLayout.EAST, menuPanel);
		
		mainPanel = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, mainPanel, 6, SpringLayout.SOUTH, titlePanel);
		sl_panel.putConstraint(SpringLayout.SOUTH, mainPanel, -10, SpringLayout.SOUTH, panel);
		mainPanel.setBackground(Color.DARK_GRAY);
		sl_panel.putConstraint(SpringLayout.WEST, mainPanel, 6, SpringLayout.EAST, menuPanel);
		sl_panel.putConstraint(SpringLayout.EAST, mainPanel, 770, SpringLayout.EAST, menuPanel);
		panel.add(mainPanel);
		mainPanel.setLayout(new CardLayout(0, 0));
		
		//order panel
		MenuManagementPanel menuManagementPanel = new MenuManagementPanel();
		menuManagementPanel.setBackground(Color.WHITE);
		SpringLayout springLayout = (SpringLayout) menuManagementPanel.getLayout();
		mainPanel.add(menuManagementPanel, "menuManagementPanel");
		
		//order_current
		Order_current_panel order_current = new Order_current_panel();
		mainPanel.add(order_current, "order_current");
		
		//payment panel
		PaymentPanel paymentPanel = new PaymentPanel();
		mainPanel.add(paymentPanel,"paymentPanel");
		//game panel
		GamePanel gamePanel = new GamePanel();
		mainPanel.add(gamePanel, "gamePanel");
		
		//user ManageMent panel
		UserManagePanel userManagePanel = new UserManagePanel();
		mainPanel.add(userManagePanel, "userManagePanel");
		
		
		SpringLayout sl_titlePanel = new SpringLayout();
		titlePanel.setLayout(sl_titlePanel);
		
		JLabel lblNewLabel = new JLabel(menuList);
		lblNewLabel.setFont(new Font("³ª´®°íµñ", Font.BOLD, 26));
		sl_titlePanel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, titlePanel);
		sl_titlePanel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -10, SpringLayout.SOUTH, titlePanel);
		titlePanel.add(lblNewLabel);
		
		
		JButton btnOrder_current = new JButton("\uC8FC\uBB38\uD604\uD669");
		sl_menuPanel.putConstraint(SpringLayout.NORTH, btnOrder_current, 181, SpringLayout.NORTH, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.WEST, btnOrder_current, 0, SpringLayout.WEST, menuPanel);
		btnOrder_current.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 15));
		btnOrder_current.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnOrder_current.setBackground(new Color(255, 255, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnOrder_current.setBackground(new Color(254, 194, 15));
			}
		});
		btnOrder_current.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("ÁÖ¹®ÇöÈ²");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "order_current");
			}
		});
		btnOrder_current.setBackground(new Color(254, 194, 15));
		menuPanel.add(btnOrder_current);
		
		JButton btnPayment = new JButton("\uACB0\uC81C\uD655\uC778");
		sl_menuPanel.putConstraint(SpringLayout.NORTH, btnPayment, 242, SpringLayout.NORTH, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.WEST, btnPayment, 0, SpringLayout.WEST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.EAST, btnPayment, 0, SpringLayout.EAST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.SOUTH, btnOrder_current, -6, SpringLayout.NORTH, btnPayment);
		sl_menuPanel.putConstraint(SpringLayout.EAST, btnOrder_current, 0, SpringLayout.EAST, btnPayment);
		btnPayment.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 15));
		btnPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPayment.setBackground(new Color(255, 255, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPayment.setBackground(new Color(254, 194, 15));
			}
		});
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("°áÁ¦È®ÀÎ");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "paymentPanel");
			}
		});
		btnPayment.setBackground(new Color(254, 194, 15));
		menuPanel.add(btnPayment);
		
		JButton btnGame = new JButton("\uACB0\uC81C\uC790\uCD94\uCCA8");
		sl_menuPanel.putConstraint(SpringLayout.WEST, btnGame, 0, SpringLayout.WEST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.EAST, btnGame, 0, SpringLayout.EAST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.SOUTH, btnPayment, -6, SpringLayout.NORTH, btnGame);
		sl_menuPanel.putConstraint(SpringLayout.NORTH, btnGame, 303, SpringLayout.NORTH, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.SOUTH, btnGame, -126, SpringLayout.SOUTH, menuPanel);
		btnGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnGame.setBackground(new Color(255, 255, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGame.setBackground(new Color(254, 194, 15));
			}
		});
		btnGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("°áÁ¦ÀÚÃßÃ·");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "gamePanel");	
			}
		});
		btnGame.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 15));
		btnGame.setBackground(new Color(254, 194, 15));
		menuPanel.add(btnGame);
		
		
	
		
		
		JButton btnMenuMange = new JButton("\uBA54\uB274\uAD00\uB9AC");
		sl_menuPanel.putConstraint(SpringLayout.NORTH, btnMenuMange, 70, SpringLayout.NORTH, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.WEST, btnMenuMange, 0, SpringLayout.WEST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.SOUTH, btnMenuMange, -56, SpringLayout.NORTH, btnOrder_current);
		sl_menuPanel.putConstraint(SpringLayout.EAST, btnMenuMange, 0, SpringLayout.EAST, menuPanel);
		btnMenuMange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMenuMange.setBackground(new Color(255, 255, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnMenuMange.setBackground(new Color(254, 194, 15));
			}
		});
		btnMenuMange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("¸Þ´º°ü¸®");
				mainPanel.setBackground(Color.BLUE);
				mainPanel.setVisible(true);
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "menuManagementPanel");	
			}
		});
		btnMenuMange.setBackground(new Color(254, 194, 15));
		btnMenuMange.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
		menuPanel.add(btnMenuMange);
		panel.add(titlePanel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 6, SpringLayout.EAST, menuPanel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, 42, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, 770, SpringLayout.EAST, menuPanel);
		
		JButton btnUserManage = new JButton("\uD68C\uC6D0\uAD00\uB9AC");
		btnUserManage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUserManage.setBackground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnUserManage.setBackground(new Color(254, 194, 15));
			}
		});
		btnUserManage.setBackground(new Color(254, 194, 15));
		btnUserManage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("È¸¿ø°ü¸®");
				mainPanel.setBackground(Color.BLUE);
				mainPanel.setVisible(true);
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "userManagePanel");	
			}
		});
		btnUserManage.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
		sl_menuPanel.putConstraint(SpringLayout.NORTH, btnUserManage, 6, SpringLayout.SOUTH, btnMenuMange);
		sl_menuPanel.putConstraint(SpringLayout.WEST, btnUserManage, 0, SpringLayout.WEST, menuPanel);
		sl_menuPanel.putConstraint(SpringLayout.SOUTH, btnUserManage, -6, SpringLayout.NORTH, btnOrder_current);
		sl_menuPanel.putConstraint(SpringLayout.EAST, btnUserManage, 0, SpringLayout.EAST, btnOrder_current);
		menuPanel.add(btnUserManage);
		panel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel label = new JLabel("\uAD00\uB9AC\uC790\uBAA8\uB4DC");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBackground(Color.WHITE);
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 21));
		panel_1.add(label, "name_63540991356036");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
