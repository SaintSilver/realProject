package Admin;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import Clock.Clock;
import Start.LoginGUI;

import java.awt.GridLayout;
import java.awt.SystemColor;

public class Admin_MainGUI {
	private JFrame frame;
	private String menuList;
	private JPanel mainPanel;
	
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
	
	public Admin_MainGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 522);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(new Color(254, 194, 15));
		sl_panel.putConstraint(SpringLayout.WEST, menuPanel, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, menuPanel, 0, SpringLayout.SOUTH, panel);
		panel.add(menuPanel);
		
		JPanel titlePanel = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, titlePanel, 50, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, titlePanel, 104, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, titlePanel, 0, SpringLayout.EAST, panel);
		titlePanel.setBackground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.SOUTH, titlePanel, 92, SpringLayout.NORTH, panel);
		
		mainPanel = new JPanel();
		sl_panel.putConstraint(SpringLayout.EAST, menuPanel, -1, SpringLayout.WEST, mainPanel);
		sl_panel.putConstraint(SpringLayout.WEST, mainPanel, 110, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, mainPanel, -10, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, menuPanel, 0, SpringLayout.NORTH, mainPanel);
		sl_panel.putConstraint(SpringLayout.NORTH, mainPanel, 6, SpringLayout.SOUTH, titlePanel);
		sl_panel.putConstraint(SpringLayout.SOUTH, mainPanel, -10, SpringLayout.SOUTH, panel);
		mainPanel.setBackground(Color.DARK_GRAY);
		panel.add(mainPanel);
		mainPanel.setLayout(new CardLayout(0, 0));
		
		//main panel
		SystemPanel systemPanel = new SystemPanel();
		systemPanel.setBackground(Color.white);
		SpringLayout springLayout = (SpringLayout) systemPanel.getLayout();
		mainPanel.add(systemPanel, "SystemPanel");
		
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
		btnOrder_current.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
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
				lblNewLabel.setText("¿À´ÃÀÇÁÖ¹®");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "order_current");
			}
		});
		menuPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnUserManage = new JButton("\uD68C\uC6D0\uD604\uD669");
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
				lblNewLabel.setText("È¸¿øÇöÈ²");
				mainPanel.setBackground(Color.BLUE);
				mainPanel.setVisible(true);
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "userManagePanel");	
			}
		});
		
		JButton btnMenuMange = new JButton("\uD68C\uC6D0\uAD00\uB9AC");
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
				lblNewLabel.setText("È¸¿ø°ü¸®");
				mainPanel.setBackground(Color.BLUE);
				mainPanel.setVisible(true);
				
				frame.dispose();
				UserManagementGUI userManagementGUI = new UserManagementGUI();
				userManagementGUI.main(null);
			}
		});
		btnMenuMange.setBackground(new Color(254, 194, 15));
		btnMenuMange.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
		menuPanel.add(btnMenuMange);
		btnUserManage.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
		menuPanel.add(btnUserManage);
		btnOrder_current.setBackground(new Color(254, 194, 15));
		menuPanel.add(btnOrder_current);
		
		JButton btnPayment = new JButton("\uB204\uC801\uC8FC\uBB38");
		btnPayment.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
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
				lblNewLabel.setText("´©ÀûÁÖ¹®Á¶È¸");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "paymentPanel");
			}
		});
		btnPayment.setBackground(new Color(254, 194, 15));
		menuPanel.add(btnPayment);
		
		JButton btnGame = new JButton("\uACB0\uC81C\uC790\uCD94\uCCA8");
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
		btnGame.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
		btnGame.setBackground(new Color(254, 194, 15));
		menuPanel.add(btnGame);
		panel.add(titlePanel);
		
		JPanel panel_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, titlePanel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, -6, SpringLayout.NORTH, titlePanel);
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel label = new JLabel("\uAD00\uB9AC\uC790\uBAA8\uB4DC");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.WHITE);
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 21));
		panel_1.add(label, "name_63540991356036");
		
		JLabel timeLabel = new JLabel("\"\"");
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, timeLabel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, -449, SpringLayout.WEST, timeLabel);
		sl_panel.putConstraint(SpringLayout.NORTH, timeLabel, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, timeLabel, -212, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, timeLabel, -10, SpringLayout.EAST, panel);
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ Light", Font.ITALIC, 14));
		panel.add(timeLabel);
		
		JButton button = new JButton("\uB85C\uADF8\uC544\uC6C3");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame, "·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
				frame.dispose();
				LoginGUI login = new LoginGUI();
				login.main(null);
				
			}
		});
		sl_panel.putConstraint(SpringLayout.SOUTH, button, -6, SpringLayout.NORTH, titlePanel);
		sl_panel.putConstraint(SpringLayout.EAST, button, 0, SpringLayout.EAST, mainPanel);
		button.setFont(new Font("°íµµ B", Font.PLAIN, 10));
		button.setBackground(Color.WHITE);
		panel.add(button);
		
		Clock clock = new Clock(timeLabel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
