package Main;

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

import User.ChangeInfoGUI;

import javax.swing.SwingConstants;

import Start.LoginGUI;

import java.awt.GridLayout;


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
		sl_panel.putConstraint(SpringLayout.EAST, menuPanel, 110, SpringLayout.WEST, panel);
		menuPanel.setBackground(new Color(254, 194, 15));
		sl_panel.putConstraint(SpringLayout.WEST, menuPanel, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, menuPanel, 0, SpringLayout.SOUTH, panel);
		panel.add(menuPanel);
		
		
		
		JPanel titlePanel = new JPanel();
		sl_panel.putConstraint(SpringLayout.EAST, titlePanel, 0, SpringLayout.EAST, panel);
		titlePanel.setBackground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.NORTH, titlePanel, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, titlePanel, 92, SpringLayout.NORTH, panel);
		
		mainPanel = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, mainPanel, 6, SpringLayout.SOUTH, titlePanel);
		sl_panel.putConstraint(SpringLayout.SOUTH, mainPanel, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, titlePanel, 0, SpringLayout.WEST, mainPanel);
		sl_panel.putConstraint(SpringLayout.WEST, mainPanel, 0, SpringLayout.EAST, menuPanel);
		sl_panel.putConstraint(SpringLayout.EAST, mainPanel, -10, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, menuPanel, 0, SpringLayout.NORTH, mainPanel);
		mainPanel.setBackground(Color.DARK_GRAY);
		panel.add(mainPanel);
		mainPanel.setLayout(new CardLayout(0, 0));
		
		//main panel
		UserMainPanel userMainPanel = new UserMainPanel();
		userMainPanel.setBackground(Color.WHITE);
		SpringLayout springLayout = (SpringLayout) userMainPanel.getLayout();
		mainPanel.add(userMainPanel, "UserMainPanel");
		
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
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 26));
		sl_titlePanel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, titlePanel);
		sl_titlePanel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -10, SpringLayout.SOUTH, titlePanel);
		titlePanel.add(lblNewLabel);
		
		
		JButton btnNewButton = new JButton("\uC8FC\uBB38\uD604\uD669");
		btnNewButton.setFont(new Font("고도 M", Font.PLAIN, 16));
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
				lblNewLabel.setText("주문현황");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "order_current");
			}
		});
		menuPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		
	
		
		
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
				lblNewLabel.setText("주문하기");
				mainPanel.setBackground(Color.BLUE);
				mainPanel.setVisible(true);
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "order");	
				
				frame.dispose();
				OrderGUI order = new OrderGUI();
				order.main(null);
				
				
			}
		});
		btnNewButton_3.setBackground(new Color(254, 194, 15));
		btnNewButton_3.setFont(new Font("고도 M", Font.PLAIN, 16));
		menuPanel.add(btnNewButton_3);
		btnNewButton.setBackground(new Color(254, 194, 15));
		menuPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB0B4 \uC8FC\uBB38");
		btnNewButton_1.setFont(new Font("고도 M", Font.PLAIN, 16));
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
				lblNewLabel.setText("내 주문");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "paymentPanel");
			}
		});
		btnNewButton_1.setBackground(new Color(254, 194, 15));
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
				lblNewLabel.setText("결제자추첨");
				((CardLayout)mainPanel.getLayout()).show(mainPanel, "gamePanel");	
			}
		});
		btnNewButton_2.setFont(new Font("고도 M", Font.PLAIN, 16));
		btnNewButton_2.setBackground(new Color(254, 194, 15));
		menuPanel.add(btnNewButton_2);
		panel.add(titlePanel);
		
		JButton logoutButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		sl_titlePanel.putConstraint(SpringLayout.EAST, logoutButton, -10, SpringLayout.EAST, titlePanel);
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				JOptionPane.showMessageDialog(frame, "로그아웃 되었습니다.");
				LoginGUI login = new LoginGUI();
				login.main(null);
			}
		});
		logoutButton.setBackground(Color.WHITE);
		logoutButton.setFont(new Font("고도 B", Font.PLAIN, 10));
		titlePanel.add(logoutButton);
		
		JButton changeInfoButton = new JButton("\uC815\uBCF4\uC218\uC815");
		sl_titlePanel.putConstraint(SpringLayout.WEST, logoutButton, 6, SpringLayout.EAST, changeInfoButton);
		sl_titlePanel.putConstraint(SpringLayout.NORTH, changeInfoButton, 39, SpringLayout.NORTH, titlePanel);
		sl_titlePanel.putConstraint(SpringLayout.WEST, changeInfoButton, 592, SpringLayout.WEST, titlePanel);
		sl_titlePanel.putConstraint(SpringLayout.EAST, changeInfoButton, -99, SpringLayout.EAST, titlePanel);
		changeInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ChangeInfoGUI changeInfoGUI = new ChangeInfoGUI();
				changeInfoGUI.main(null);
			}
		});
		changeInfoButton.setFont(new Font("고도 B", Font.PLAIN, 10));
		changeInfoButton.setBackground(Color.WHITE);
		titlePanel.add(changeInfoButton);
		
		JLabel timeLabel = new JLabel("\"\"");
		sl_titlePanel.putConstraint(SpringLayout.NORTH, logoutButton, 8, SpringLayout.SOUTH, timeLabel);
		sl_titlePanel.putConstraint(SpringLayout.NORTH, timeLabel, 10, SpringLayout.NORTH, titlePanel);
		sl_titlePanel.putConstraint(SpringLayout.WEST, timeLabel, 564, SpringLayout.WEST, titlePanel);
		sl_titlePanel.putConstraint(SpringLayout.SOUTH, timeLabel, -61, SpringLayout.SOUTH, titlePanel);
		sl_titlePanel.putConstraint(SpringLayout.EAST, timeLabel, -10, SpringLayout.EAST, titlePanel);
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("나눔바른고딕 Light", Font.ITALIC, 14));
		titlePanel.add(timeLabel);
		
		Clock clock = new Clock(timeLabel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
