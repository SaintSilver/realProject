package Main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import Order.OrderDAO;
import Start.LoginGUI;
import User.UserDAO;
import User.UserVO;

public class OrderGUI {
	private JFrame frame;
	private LoginGUI login = new LoginGUI();
	private String path;
	private UserVO user;
	private OrderDAO dao = new OrderDAO();
	private OrderDAO orderDAO = new OrderDAO();
	private MainGUI mainGUI = new MainGUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderGUI window = new OrderGUI();
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
	public OrderGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String myID = login.getMyID();
		
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 897, 574);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 54, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 0, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, frame.getContentPane());
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(192, 192, 192));
		panel_5.setPreferredSize(new Dimension(10, 5000));
		scrollPane.setViewportView(panel_5);
		panel_5.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_8.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uAE50\uD48D\uAE30\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_8, "name_42806277536259");
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_7);
		panel_7.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("\uAE50\uD48D\uAE30\uB3C4\uC2DC\uB77D");
		lblNewLabel_9.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_9);
		
		JLabel lblNewLabel_104 = new JLabel("4300\uC6D0");
		lblNewLabel_104.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_104.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_104);
		
		JSpinner spinner = new JSpinner();
		spinner.setBackground(Color.WHITE);
		spinner.setFont(new Font("±¼¸²", Font.PLAIN, 13));
		panel_7.add(spinner);
		
		
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uAE50\uAE50\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(lblNewLabel_10, "name_42806277536259");
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_9);
		panel_9.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("\uAE50\uAE50\uB3C4\uC2DC\uB77D");
		lblNewLabel_11.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_11);
		
		JLabel lblNewLabel_105 = new JLabel("5800\uC6D0");
		lblNewLabel_105.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_105.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_105);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setBackground(Color.WHITE);
		spinner2.setFont(new Font("±¼¸²", Font.PLAIN, 13));
		panel_9.add(spinner2);

		
		JPanel panel_10 = new JPanel();
		panel_5.add(panel_10);
		panel_10.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB098\uC2DC\uACE0\uB7AD.jpg")));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_12, "name_42806277536259");
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_11);
		panel_11.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_13 = new JLabel("\uB098\uC2DC\uACE0\uB7AD");
		lblNewLabel_13.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_13);
		
		JLabel lblNewLabel_190 = new JLabel("4500\uC6D0");
		lblNewLabel_190.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_190.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_190);
		
		JSpinner spinner3 = new JSpinner();
		panel_11.add(spinner3);
		
		
		
		JPanel panel_12 = new JPanel();
		panel_5.add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB370\uBBF8\uADF8\uB77C\uC2A4\uD568\uBC15\uC2A4\uD14C\uC774\uD06C.jpg")));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_14, "name_42806277536259");
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_13);
		panel_13.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_15 = new JLabel("\uB370\uBBF8\uADF8\uB77C\uC2A4\uD568\uBC15\uC2A4\uD14C\uC774\uD06C");
		lblNewLabel_15.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_15);
		
		JLabel lblNewLabel_191 = new JLabel("5800\uC6D0");
		lblNewLabel_191.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_191.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_191);
		
		JSpinner spinner4 = new JSpinner();
		panel_13.add(spinner4);
		
		
		
		JPanel panel_14 = new JPanel();
		panel_5.add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uACE0\uB4F1\uC5B4\uC870\uB9BC \uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.LEFT);
		panel_14.add(lblNewLabel_16, "name_42806277536259");
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_15);
		panel_15.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_17 = new JLabel("\uACE0\uB4F1\uC5B4\uC870\uB9BC\uB3C4\uC2DC\uB77D");
		lblNewLabel_17.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lblNewLabel_17);
		
		JLabel lblNewLabel_192 = new JLabel("5800\uC6D0");
		lblNewLabel_192.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_192.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lblNewLabel_192);
		
		JSpinner spinner5 = new JSpinner();
		panel_15.add(spinner5);
		
		
		
		JPanel panel_16 = new JPanel();
		panel_5.add(panel_16);
		panel_16.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB9E4\uD654\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.LEFT);
		panel_16.add(lblNewLabel_18, "name_42806277536259");
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_17);
		panel_17.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_19 = new JLabel("\uB9E4\uD654\uB3C4\uC2DC\uB77D");
		lblNewLabel_19.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_17.add(lblNewLabel_19);
		
		JLabel lblNewLabel_193 = new JLabel("10000\uC6D0");
		lblNewLabel_193.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_193.setHorizontalAlignment(SwingConstants.CENTER);
		panel_17.add(lblNewLabel_193);
		
		JSpinner spinner6 = new JSpinner();
		panel_17.add(spinner6);
		
		
		
		
		JPanel panel_18 = new JPanel();
		panel_5.add(panel_18);
		panel_18.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uAC1C\uB098\uB9AC\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.LEFT);
		panel_18.add(lblNewLabel_20, "name_42806277536259");
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_19);
		panel_19.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_21 = new JLabel("\uAC1C\uB098\uB9AC\uB3C4\uC2DC\uB77D");
		lblNewLabel_21.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_19.add(lblNewLabel_21);
		
		JLabel lblNewLabel_194 = new JLabel("8000\uC6D0");
		lblNewLabel_194.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_194.setHorizontalAlignment(SwingConstants.CENTER);
		panel_19.add(lblNewLabel_194);
		
		JSpinner spinner7 = new JSpinner();
		panel_19.add(spinner7);
		
		
		
		JPanel panel_20 = new JPanel();
		panel_5.add(panel_20);
		panel_20.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC9C4\uB2EC\uB798\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_20.add(lblNewLabel_22, "name_42806277536259");
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_21);
		panel_21.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_23 = new JLabel("\uC9C4\uB2EC\uB798\uB3C4\uC2DC\uB77D");
		lblNewLabel_23.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_21.add(lblNewLabel_23);
		
		JLabel lblNewLabel_195 = new JLabel("7000\uC6D0");
		lblNewLabel_195.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_195.setHorizontalAlignment(SwingConstants.CENTER);
		panel_21.add(lblNewLabel_195);
		
		JSpinner spinner8 = new JSpinner();
		panel_21.add(spinner8);
		
		

		
		JPanel panel_22 = new JPanel();
		panel_5.add(panel_22);
		panel_22.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uACE0\uAE30\uACE0\uAE30\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_22.add(lblNewLabel_24, "name_42806277536259");
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_23);
		panel_23.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_25 = new JLabel("\uACE0\uAE30\uACE0\uAE30\uB3C4\uC2DC\uB77D");
		lblNewLabel_25.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_23.add(lblNewLabel_25);
		
		JLabel lblNewLabel_196 = new JLabel("3600\uC6D0");
		lblNewLabel_196.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_196.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		panel_23.add(lblNewLabel_196);
		
		JSpinner spinner9 = new JSpinner();
		panel_23.add(spinner9);
		
		
		
		
		JPanel panel_24 = new JPanel();
		panel_5.add(panel_24);
		panel_24.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uD584\uCE58\uACE0\uAE30\uACE0\uAE30\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_24.add(lblNewLabel_26, "name_42806277536259");
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_25);
		panel_25.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_27 = new JLabel("\uD584\uCE58\uACE0\uAE30\uACE0\uAE30\uB3C4\uC2DC\uB77D");
		lblNewLabel_27.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_27);
		
		JLabel lblNewLabel_197 = new JLabel("5000\uC6D0");
		lblNewLabel_197.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_197.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_197);
		
		JSpinner spinner10 = new JSpinner();
		panel_25.add(spinner10);
		
		
		
		
		JPanel panel_26 = new JPanel();
		panel_5.add(panel_26);
		panel_26.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB3C8\uCE58\uACE0\uAE30\uACE0\uAE30\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_26.add(lblNewLabel_28, "name_42806277536259");
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_27);
		panel_27.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_29 = new JLabel("\uB3C8\uCE58\uACE0\uAE30\uACE0\uAE30\uB3C4\uC2DC\uB77D");
		lblNewLabel_29.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel_27.add(lblNewLabel_29);
		
		JLabel lblNewLabel_198 = new JLabel("5200\uC6D0");
		lblNewLabel_198.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_198.setHorizontalAlignment(SwingConstants.CENTER);
		panel_27.add(lblNewLabel_198);
		
		JSpinner spinner11 = new JSpinner();
		panel_27.add(spinner11);
		
		
		
		
		
		JPanel panel_28 = new JPanel();
		panel_5.add(panel_28);
		panel_28.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_30 = new JLabel("");
		lblNewLabel_30.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC0C8\uCE58\uACE0\uAE30\uACE0\uAE30\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_28.add(lblNewLabel_30, "name_42806277536259");
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_29);
		panel_29.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_31 = new JLabel("\uC0C8\uCE58\uACE0\uAE30\uACE0\uAE30\uB3C4\uC2DC\uB77D");
		lblNewLabel_31.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_29.add(lblNewLabel_31);
		
		JLabel lblNewLabel_199 = new JLabel("6000\uC6D0");
		lblNewLabel_199.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_199.setHorizontalAlignment(SwingConstants.CENTER);
		panel_29.add(lblNewLabel_199);
		
		JSpinner spinner12 = new JSpinner();
		panel_29.add(spinner12);
		
		
		
		
		JPanel panel_30 = new JPanel();
		panel_5.add(panel_30);
		panel_30.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_32 = new JLabel("");
		lblNewLabel_32.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE60\uB9AC\uD3EC\uD06C\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_30.add(lblNewLabel_32, "name_42806277536259");
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_31);
		panel_31.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_33 = new JLabel("\uCE60\uB9AC\uD3EC\uD06C\uB3C4\uC2DC\uB77D");
		lblNewLabel_33.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_31.add(lblNewLabel_33);
		
		JLabel lblNewLabel_200 = new JLabel("3600\uC6D0");
		lblNewLabel_200.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_200.setHorizontalAlignment(SwingConstants.CENTER);
		panel_31.add(lblNewLabel_200);
		
		JSpinner spinner13 = new JSpinner();
		panel_31.add(spinner13);
		
		
		
		
		JPanel panel_32 = new JPanel();
		panel_5.add(panel_32);
		panel_32.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_34 = new JLabel("");
		lblNewLabel_34.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB3C4\uB828\uB2D8\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		panel_32.add(lblNewLabel_34, "name_42806277536259");
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_33);
		panel_33.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_35 = new JLabel("\uB3C8\uAE4C\uC2A4\uB3C4\uB828\uB2D8\uB3C4\uC2DC\uB77D");
		lblNewLabel_35.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		panel_33.add(lblNewLabel_35);
		
		JLabel lblNewLabel_201 = new JLabel("3600\uC6D0");
		lblNewLabel_201.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_201.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		panel_33.add(lblNewLabel_201);
		
		JSpinner spinner14 = new JSpinner();
		panel_33.add(spinner14);
	
		
		
		JPanel panel_34 = new JPanel();
		panel_5.add(panel_34);
		panel_34.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_36 = new JLabel("");
		lblNewLabel_36.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uAD6D\uD654\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		panel_34.add(lblNewLabel_36, "name_42806277536259");
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_35);
		panel_35.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_37 = new JLabel("\uAD6D\uD654\uB3C4\uC2DC\uB77D");
		lblNewLabel_37.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
		panel_35.add(lblNewLabel_37);
		
		JLabel lblNewLabel_202 = new JLabel("4000\uC6D0");
		lblNewLabel_202.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_202.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		panel_35.add(lblNewLabel_202);
		
		JSpinner spinner15 = new JSpinner();
		panel_35.add(spinner15);

		
		
		
		JPanel panel_36 = new JPanel();
		panel_5.add(panel_36);
		panel_36.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_38 = new JLabel("");
		lblNewLabel_38.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE58\uD0A8\uC81C\uC721\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
		panel_36.add(lblNewLabel_38, "name_42806277536259");
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_37);
		panel_37.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_39 = new JLabel("\uCE58\uD0A8\uC81C\uC721\uB3C4\uC2DC\uB77D");
		lblNewLabel_39.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		panel_37.add(lblNewLabel_39);
		
		JLabel lblNewLabel_203 = new JLabel("4300\uC6D0");
		lblNewLabel_203.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_203.setHorizontalAlignment(SwingConstants.CENTER);
		panel_37.add(lblNewLabel_203);
		
		JSpinner spinner16 = new JSpinner();
		panel_37.add(spinner16);
		
		
		
		JPanel panel_38 = new JPanel();
		panel_5.add(panel_38);
		panel_38.setLayout(new CardLayout(0, 0));
		JLabel lblNewLabel_40 = new JLabel("");
		lblNewLabel_40.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB3C8\uCE58\uBD88\uACE0\uAE30\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
		panel_38.add(lblNewLabel_40, "name_42806277536259");
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_39);
		panel_39.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_41 = new JLabel("\uB3C8\uCE58\uBD88\uACE0\uAE30\uB3C4\uC2DC\uB77D");
		lblNewLabel_41.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		panel_39.add(lblNewLabel_41);
		
		JLabel lblNewLabel_204 = new JLabel("4700\uC6D0");
		lblNewLabel_204.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_204.setHorizontalAlignment(SwingConstants.CENTER);
		panel_39.add(lblNewLabel_204);
		
		JSpinner spinner17 = new JSpinner();
		panel_39.add(spinner17);
		
		
		
		
		
		JPanel panel_40 = new JPanel();
		panel_5.add(panel_40);
		panel_40.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_42 = new JLabel("");
		lblNewLabel_42.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB3D9\uBC31\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
		panel_40.add(lblNewLabel_42, "name_42806277536259");
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_41);
		panel_41.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_43 = new JLabel("\uB3D9\uBC31\uB3C4\uC2DC\uB77D");
		lblNewLabel_43.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_43.setHorizontalAlignment(SwingConstants.CENTER);
		panel_41.add(lblNewLabel_43);
		
		JLabel lblNewLabel_205 = new JLabel("5000\uC6D0");
		lblNewLabel_205.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_205.setHorizontalAlignment(SwingConstants.CENTER);
		panel_41.add(lblNewLabel_205);
		
		JSpinner spinner18 = new JSpinner();
		panel_41.add(spinner18);
		
		
		
		JPanel panel_42 = new JPanel();
		panel_5.add(panel_42);
		panel_42.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_44 = new JLabel("");
		lblNewLabel_44.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uD574\uD53C\uBC15\uC2A4.jpg")));
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		panel_42.add(lblNewLabel_44, "name_42806277536259");
		
		JPanel panel_43 = new JPanel();
		panel_43.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_43);
		panel_43.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_45 = new JLabel("\uD574\uD53C\uBC15\uC2A4");
		lblNewLabel_45.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
		panel_43.add(lblNewLabel_45);
		
		JLabel lblNewLabel_206 = new JLabel("3000\uC6D0");
		lblNewLabel_206.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_206.setHorizontalAlignment(SwingConstants.CENTER);
		panel_43.add(lblNewLabel_206);
		
		JSpinner spinner19 = new JSpinner();
		panel_43.add(spinner19);
		
		
		
		
		JPanel panel_44 = new JPanel();
		panel_5.add(panel_44);
		panel_44.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_46 = new JLabel("");
		lblNewLabel_46.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB3C4\uB828\uB2D8\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_46.setHorizontalAlignment(SwingConstants.CENTER);
		panel_44.add(lblNewLabel_46, "name_42806277536259");
		
		JPanel panel_45 = new JPanel();
		panel_45.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_45);
		panel_45.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_47 = new JLabel("\uB3C4\uB828\uB2D8\uB3C4\uC2DC\uB77D");
		lblNewLabel_47.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_47.setHorizontalAlignment(SwingConstants.CENTER);
		panel_45.add(lblNewLabel_47);
		
		JLabel lblNewLabel_207 = new JLabel("3400\uC6D0");
		lblNewLabel_207.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_207.setHorizontalAlignment(SwingConstants.CENTER);
		panel_45.add(lblNewLabel_207);
		
		JSpinner spinner20 = new JSpinner();
		panel_45.add(spinner20);
		
		
		
		JPanel panel_46 = new JPanel();
		panel_5.add(panel_46);
		panel_46.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_48 = new JLabel("");
		lblNewLabel_48.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB514\uB7ED\uC2A4\uC81C\uC721\uBCF6\uC74C\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		panel_46.add(lblNewLabel_48, "name_42806277536259");
		
		JPanel panel_47 = new JPanel();
		panel_47.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_47);
		panel_47.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_49 = new JLabel("\uB514\uB7ED\uC2A4\uC81C\uC721\uBCF6\uC74C\uB3C4\uC2DC\uB77D");
		lblNewLabel_49.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		panel_47.add(lblNewLabel_49);
		
		JLabel lblNewLabel_208 = new JLabel("3500\uC6D0");
		lblNewLabel_208.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_208.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		panel_47.add(lblNewLabel_208);
		
		JSpinner spinner21 = new JSpinner();
		panel_47.add(spinner21);
		
		

		
		JPanel panel_48 = new JPanel();
		panel_5.add(panel_48);
		panel_48.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_50 = new JLabel("");
		lblNewLabel_50.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE74\uB808\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
		panel_48.add(lblNewLabel_50, "name_42806277536259");
		
		JPanel panel_49 = new JPanel();
		panel_49.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_49);
		panel_49.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_51 = new JLabel("\uCE74\uB808\uB3C4\uC2DC\uB77D");
		lblNewLabel_51.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		panel_49.add(lblNewLabel_51);
		
		JLabel lblNewLabel_209 = new JLabel("2700\uC6D0");
		lblNewLabel_209.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_209.setHorizontalAlignment(SwingConstants.CENTER);
		panel_49.add(lblNewLabel_209);
		
		JSpinner spinner22 = new JSpinner();
		panel_49.add(spinner22);
		
		
		
		
		JPanel panel_50 = new JPanel();
		panel_5.add(panel_50);
		panel_50.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_52 = new JLabel("");
		lblNewLabel_52.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB3C8\uAE4C\uC2A4\uCE74\uB808.jpg")));
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.CENTER);
		panel_50.add(lblNewLabel_52, "name_42806277536259");
		
		JPanel panel_51 = new JPanel();
		panel_51.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_51);
		panel_51.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_53 = new JLabel("\uB3C8\uAE4C\uC2A4\uCE74\uB808");
		lblNewLabel_53.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_53.setHorizontalAlignment(SwingConstants.CENTER);
		panel_51.add(lblNewLabel_53);
		
		JLabel lblNewLabel_210 = new JLabel("3800\uC6D0");
		lblNewLabel_210.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_210.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		panel_51.add(lblNewLabel_210);
		
		JSpinner spinner23 = new JSpinner();
		panel_51.add(spinner23);
		
		
		
		
		JPanel panel_52 = new JPanel();
		panel_5.add(panel_52);
		panel_52.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_54 = new JLabel("");
		lblNewLabel_54.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uD3F4\uB9AC\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_54.setHorizontalAlignment(SwingConstants.CENTER);
		panel_52.add(lblNewLabel_54, "name_42806277536259");
		
		JPanel panel_53 = new JPanel();
		panel_53.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_53);
		panel_53.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_55 = new JLabel("\uD3F4\uB9AC\uB3C4\uC2DC\uB77D");
		lblNewLabel_55.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_55.setHorizontalAlignment(SwingConstants.CENTER);
		panel_53.add(lblNewLabel_55);
		
		JLabel lblNewLabel_211 = new JLabel("3800\uC6D0");
		lblNewLabel_211.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_211.setHorizontalAlignment(SwingConstants.CENTER);
		panel_53.add(lblNewLabel_211);
		
		JSpinner spinner24 = new JSpinner();
		panel_53.add(spinner24);
		
		
		
		
		
		JPanel panel_54 = new JPanel();
		panel_5.add(panel_54);
		panel_54.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_56 = new JLabel("");
		lblNewLabel_56.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCC38\uCE58\uC640\uC0AC\uB9C8\uC694.jpg")));
		lblNewLabel_56.setHorizontalAlignment(SwingConstants.CENTER);
		panel_54.add(lblNewLabel_56, "name_42806277536259");
		
		JPanel panel_55 = new JPanel();
		panel_55.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_55);
		panel_55.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_57 = new JLabel("\uCE58\uD0A8\uC640\uC0AC\uB9C8\uC694");
		lblNewLabel_57.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_57.setHorizontalAlignment(SwingConstants.CENTER);
		panel_55.add(lblNewLabel_57);
		
		JLabel lblNewLabel_212 = new JLabel("3200\uC6D0");
		lblNewLabel_212.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_212.setHorizontalAlignment(SwingConstants.CENTER);
		panel_55.add(lblNewLabel_212);
		
		JSpinner spinner25 = new JSpinner();
		panel_55.add(spinner25);
		
		
		
		
		JPanel panel_56 = new JPanel();
		panel_5.add(panel_56);
		panel_56.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_58 = new JLabel("");
		lblNewLabel_58.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCC38\uCE58\uC640\uC0AC\uB9C8\uC694.jpg")));
		lblNewLabel_58.setHorizontalAlignment(SwingConstants.CENTER);
		panel_56.add(lblNewLabel_58, "name_42806277536259");
		
		JPanel panel_57 = new JPanel();
		panel_57.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_57);
		panel_57.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_59 = new JLabel("\uCC38\uCE58\uC640\uC0AC\uB9C8\uC694");
		lblNewLabel_59.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_59.setHorizontalAlignment(SwingConstants.CENTER);
		panel_57.add(lblNewLabel_59);
		
		JLabel lblNewLabel_213 = new JLabel("3200\uC6D0");
		lblNewLabel_213.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_213.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		panel_57.add(lblNewLabel_213);
		
		JSpinner spinner26 = new JSpinner();
		panel_57.add(spinner26);
		
		
		
		
		JPanel panel_58 = new JPanel();
		panel_5.add(panel_58);
		panel_58.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_60 = new JLabel("");
		lblNewLabel_60.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE58\uD0A8\uC0D0\uB7EC\uB4DC\uC640\uC0AC\uB9C8\uC694.jpg")));
		lblNewLabel_60.setHorizontalAlignment(SwingConstants.CENTER);
		panel_58.add(lblNewLabel_60, "name_42806277536259");
		
		JPanel panel_59 = new JPanel();
		panel_59.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_59);
		panel_59.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_61 = new JLabel("\uCE58\uD0A8\uC0D0\uB7EC\uB4DC\uC640\uC0AC\uB9C8\uC694");
		lblNewLabel_61.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_61.setHorizontalAlignment(SwingConstants.CENTER);
		panel_59.add(lblNewLabel_61);
		
		JLabel lblNewLabel_214 = new JLabel("3700\uC6D0");
		lblNewLabel_214.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_214.setHorizontalAlignment(SwingConstants.CENTER);
		panel_59.add(lblNewLabel_214);
		
		JSpinner spinner27 = new JSpinner();
		panel_59.add(spinner27);
	
		
		
		JPanel panel_60 = new JPanel();
		panel_5.add(panel_60);
		panel_60.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_62 = new JLabel("");
		lblNewLabel_62.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCC38\uCE58\uC0D0\uB7EC\uB4DC\uC640\uC0AC\uB9C8\uC694.jpg")));
		lblNewLabel_62.setHorizontalAlignment(SwingConstants.CENTER);
		panel_60.add(lblNewLabel_62, "name_42806277536259");
		
		JPanel panel_61 = new JPanel();
		panel_61.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_61);
		panel_61.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_63 = new JLabel("\uCC38\uCE58\uC0D0\uB7EC\uB4DC\uC640\uC0AC\uB9C8\uC694");
		lblNewLabel_63.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_63.setHorizontalAlignment(SwingConstants.CENTER);
		panel_61.add(lblNewLabel_63);
		
		JLabel lblNewLabel_215 = new JLabel("3700\uC6D0");
		lblNewLabel_215.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_215.setHorizontalAlignment(SwingConstants.CENTER);
		panel_61.add(lblNewLabel_215);
		
		JSpinner spinner28 = new JSpinner();
		panel_61.add(spinner28);

		
		
		
		JPanel panel_62 = new JPanel();
		panel_5.add(panel_62);
		panel_62.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_64 = new JLabel("");
		lblNewLabel_64.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBE45\uCE58\uD0A8\uC640\uC0AC\uB9C8\uC694.jpg")));
		lblNewLabel_64.setHorizontalAlignment(SwingConstants.CENTER);
		panel_62.add(lblNewLabel_64, "name_42806277536259");
		
		JPanel panel_63 = new JPanel();
		panel_63.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_63);
		panel_63.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_65 = new JLabel("\uBE45\uCE58\uD0A8\uC640\uC0AC\uB9C8\uC694");
		lblNewLabel_65.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_65.setHorizontalAlignment(SwingConstants.CENTER);
		panel_63.add(lblNewLabel_65);
		
		JLabel lblNewLabel_216 = new JLabel("3800\uC6D0");
		lblNewLabel_216.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_216.setHorizontalAlignment(SwingConstants.CENTER);
		panel_63.add(lblNewLabel_216);
		
		JSpinner spinner29 = new JSpinner();
		panel_63.add(spinner29);
		
		
		
		JPanel panel_64 = new JPanel();
		panel_5.add(panel_64);
		panel_64.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_66 = new JLabel("");
		lblNewLabel_66.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB3C8\uCE58\uC640\uC0AC\uB9C8\uC694.jpg")));
		lblNewLabel_66.setHorizontalAlignment(SwingConstants.CENTER);
		panel_64.add(lblNewLabel_66, "name_42806277536259");
		
		JPanel panel_65 = new JPanel();
		panel_65.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_65);
		panel_65.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_67 = new JLabel("\uB3C8\uCE58\uC640\uC0AC\uB9C8\uC694");
		lblNewLabel_67.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_67.setHorizontalAlignment(SwingConstants.CENTER);
		panel_65.add(lblNewLabel_67);
		
		JLabel lblNewLabel_217 = new JLabel("3800\uC6D0");
		lblNewLabel_217.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_217.setHorizontalAlignment(SwingConstants.CENTER);
		panel_65.add(lblNewLabel_217);
		
		JSpinner spinner30 = new JSpinner();
		panel_65.add(spinner30);
		
		
		
		JPanel panel_66 = new JPanel();
		panel_5.add(panel_66);
		panel_66.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_68 = new JLabel("");
		lblNewLabel_68.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE58\uD0A8\uB9C8\uC694.jpg")));
		lblNewLabel_68.setHorizontalAlignment(SwingConstants.CENTER);
		panel_66.add(lblNewLabel_68, "name_42806277536259");
		
		JPanel panel_67 = new JPanel();
		panel_67.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_67);
		panel_67.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_69 = new JLabel("\uCE58\uD0A8\uB9C8\uC694");
		lblNewLabel_69.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_69.setHorizontalAlignment(SwingConstants.CENTER);
		panel_67.add(lblNewLabel_69);
		
		JLabel lblNewLabel_218 = new JLabel("2700\uC6D0");
		lblNewLabel_218.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_218.setHorizontalAlignment(SwingConstants.CENTER);
		panel_67.add(lblNewLabel_218);
		
		JSpinner spinner31 = new JSpinner();
		panel_67.add(spinner31);
		
		
		
		JPanel panel_68 = new JPanel();
		panel_5.add(panel_68);
		panel_68.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_70 = new JLabel("");
		lblNewLabel_70.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCC38\uCE58\uB9C8\uC694.jpg")));
		lblNewLabel_70.setHorizontalAlignment(SwingConstants.CENTER);
		panel_68.add(lblNewLabel_70, "name_42806277536259");
		
		JPanel panel_69 = new JPanel();
		panel_69.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_69);
		panel_69.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_71 = new JLabel("\uCC38\uCE58\uB9C8\uC694");
		lblNewLabel_71.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_71.setHorizontalAlignment(SwingConstants.CENTER);
		panel_69.add(lblNewLabel_71);
		
		JLabel lblNewLabel_219 = new JLabel("2700\uC6D0");
		lblNewLabel_219.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_219.setHorizontalAlignment(SwingConstants.CENTER);
		panel_69.add(lblNewLabel_219);
		
		JSpinner spinner32 = new JSpinner();
		panel_69.add(spinner32);
		
		
		
		
		JPanel panel_70 = new JPanel();
		panel_5.add(panel_70);
		panel_70.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_72 = new JLabel("");
		lblNewLabel_72.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE58\uD0A8\uC0D0\uB7EC\uB4DC\uB9C8\uC694.jpg")));
		lblNewLabel_72.setHorizontalAlignment(SwingConstants.CENTER);
		panel_70.add(lblNewLabel_72, "name_42806277536259");
		
		JPanel panel_71 = new JPanel();
		panel_71.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_71);
		panel_71.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_73 = new JLabel("\uCE58\uD0A8\uC0D0\uB7EC\uB4DC\uB9C8\uC694");
		lblNewLabel_73.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_73.setHorizontalAlignment(SwingConstants.CENTER);
		panel_71.add(lblNewLabel_73);
		
		JLabel lblNewLabel_220 = new JLabel("3200\uC6D0");
		lblNewLabel_220.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_220.setHorizontalAlignment(SwingConstants.CENTER);
		panel_71.add(lblNewLabel_220);
		
		JSpinner spinner33 = new JSpinner();
		panel_71.add(spinner33);
		
		
		
		JPanel panel_72 = new JPanel();
		panel_5.add(panel_72);
		panel_72.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_74 = new JLabel("");
		lblNewLabel_74.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCC38\uCE58\uC0D0\uB7EC\uB4DC\uB9C8\uC694.jpg")));
		lblNewLabel_74.setHorizontalAlignment(SwingConstants.CENTER);
		panel_72.add(lblNewLabel_74, "name_42806277536259");
		
		JPanel panel_73 = new JPanel();
		panel_73.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_73);
		panel_73.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_75 = new JLabel("\uCC38\uCE58\uC0D0\uB7EC\uB4DC\uB9C8\uC694");
		lblNewLabel_75.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_75.setHorizontalAlignment(SwingConstants.CENTER);
		panel_73.add(lblNewLabel_75);
		
		JLabel lblNewLabel_221 = new JLabel("3200\uC6D0");
		lblNewLabel_221.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_221.setHorizontalAlignment(SwingConstants.CENTER);
		panel_73.add(lblNewLabel_221);
		
		JSpinner spinner34 = new JSpinner();
		panel_73.add(spinner34);
		
		

		
		JPanel panel_74 = new JPanel();
		panel_5.add(panel_74);
		panel_74.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_76 = new JLabel("");
		lblNewLabel_76.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBE45\uCE58\uD0A8\uB9C8\uC694.jpg")));
		lblNewLabel_76.setHorizontalAlignment(SwingConstants.CENTER);
		panel_74.add(lblNewLabel_76, "name_42806277536259");
		
		JPanel panel_75 = new JPanel();
		panel_75.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_75);
		panel_75.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_77 = new JLabel("\uBE45\uCE58\uD0A8\uB9C8\uC694");
		lblNewLabel_77.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_77.setHorizontalAlignment(SwingConstants.CENTER);
		panel_75.add(lblNewLabel_77);
		
		JLabel lblNewLabel_222 = new JLabel("3300\uC6D0");
		lblNewLabel_222.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_222.setHorizontalAlignment(SwingConstants.CENTER);
		panel_75.add(lblNewLabel_222);
		
		JSpinner spinner35 = new JSpinner();
		panel_75.add(spinner35);
		
		
		
		
		JPanel panel_76 = new JPanel();
		panel_5.add(panel_76);
		panel_76.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_78 = new JLabel("");
		lblNewLabel_78.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB3C8\uCE58\uB9C8\uC694.jpg")));
		lblNewLabel_78.setHorizontalAlignment(SwingConstants.CENTER);
		panel_76.add(lblNewLabel_78, "name_42806277536259");
		
		JPanel panel_77 = new JPanel();
		panel_77.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_77);
		panel_77.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_79 = new JLabel("\uB3C8\uCE58\uB9C8\uC694");
		lblNewLabel_79.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_79.setHorizontalAlignment(SwingConstants.CENTER);
		panel_77.add(lblNewLabel_79);
		
		JLabel lblNewLabel_223 = new JLabel("3300\uC6D0");
		lblNewLabel_223.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_223.setHorizontalAlignment(SwingConstants.CENTER);
		panel_77.add(lblNewLabel_223);
		
		JSpinner spinner36 = new JSpinner();
		panel_77.add(spinner36);
		
		
		
		
		JPanel panel_78 = new JPanel();
		panel_5.add(panel_78);
		panel_78.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_80 = new JLabel("");
		lblNewLabel_80.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB3C8\uAE4C\uC2A4\uB36E\uBC25'.jpg")));
		lblNewLabel_80.setHorizontalAlignment(SwingConstants.CENTER);
		panel_78.add(lblNewLabel_80, "name_42806277536259");
		
		JPanel panel_79 = new JPanel();
		panel_79.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_79);
		panel_79.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_81 = new JLabel("\uB3C8\uAE4C\uC2A4\uB36E\uBC25");
		lblNewLabel_81.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_81.setHorizontalAlignment(SwingConstants.CENTER);
		panel_79.add(lblNewLabel_81);
		
		JLabel lblNewLabel_224 = new JLabel("3400\uC6D0");
		lblNewLabel_224.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_224.setHorizontalAlignment(SwingConstants.CENTER);
		panel_79.add(lblNewLabel_224);
		
		JSpinner spinner37 = new JSpinner();
		panel_79.add(spinner37);
		
		
		
		
		
		JPanel panel_80 = new JPanel();
		panel_5.add(panel_80);
		panel_80.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_82 = new JLabel("");
		lblNewLabel_82.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC0C8\uC6B0\uB3C8\uAE4C\uC2A4\uB36E\uBC25.jpg")));
		lblNewLabel_82.setHorizontalAlignment(SwingConstants.CENTER);
		panel_80.add(lblNewLabel_82, "name_42806277536259");
		
		JPanel panel_81 = new JPanel();
		panel_81.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_81);
		panel_81.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_83 = new JLabel("\uC0C8\uC6B0\uB3C8\uAE4C\uC2A4\uB36E\uBC25");
		lblNewLabel_83.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_83.setHorizontalAlignment(SwingConstants.CENTER);
		panel_81.add(lblNewLabel_83);
		
		JLabel lblNewLabel_225 = new JLabel("3600\uC6D0");
		lblNewLabel_225.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_225.setHorizontalAlignment(SwingConstants.CENTER);
		panel_81.add(lblNewLabel_225);
		
		JSpinner spinner38 = new JSpinner();
		panel_81.add(spinner38);
		
		
		
		
		JPanel panel_82 = new JPanel();
		panel_5.add(panel_82);
		panel_82.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_84 = new JLabel("");
		lblNewLabel_84.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uAE40\uCE58\uBCF6\uC74C\uBC25.jpg")));
		lblNewLabel_84.setHorizontalAlignment(SwingConstants.CENTER);
		panel_82.add(lblNewLabel_84, "name_42806277536259");
		
		JPanel panel_83 = new JPanel();
		panel_83.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_83);
		panel_83.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_85 = new JLabel("\uAE40\uCE58\uBCF6\uC74C\uBC25");
		lblNewLabel_85.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_85.setHorizontalAlignment(SwingConstants.CENTER);
		panel_83.add(lblNewLabel_85);
		
		JLabel lblNewLabel_226 = new JLabel("2900\uC6D0");
		lblNewLabel_226.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_226.setHorizontalAlignment(SwingConstants.CENTER);
		panel_83.add(lblNewLabel_226);
		
		JSpinner spinner39 = new JSpinner();
		panel_83.add(spinner39);
		
		
		
		
		JPanel panel_84 = new JPanel();
		panel_5.add(panel_84);
		panel_84.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_86 = new JLabel("");
		lblNewLabel_86.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBD88\uACE0\uAE30\uAE40\uCE58\uBCF6\uC74C\uBC25.jpg")));
		lblNewLabel_86.setHorizontalAlignment(SwingConstants.CENTER);
		panel_84.add(lblNewLabel_86, "name_42806277536259");
		
		JPanel panel_85 = new JPanel();
		panel_85.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_85);
		panel_85.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_87 = new JLabel("\uBD88\uACE0\uAE30\uAE40\uCE58\uBCF6\uC74C\uBC25");
		lblNewLabel_87.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_87.setHorizontalAlignment(SwingConstants.CENTER);
		panel_85.add(lblNewLabel_87);
		
		JLabel lblNewLabel_227 = new JLabel("3700\uC6D0");
		lblNewLabel_227.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_227.setHorizontalAlignment(SwingConstants.CENTER);
		panel_85.add(lblNewLabel_227);
		
		JSpinner spinner40 = new JSpinner();
		panel_85.add(spinner40);
	
		
		
		JPanel panel_86 = new JPanel();
		panel_5.add(panel_86);
		panel_86.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_88 = new JLabel("");
		lblNewLabel_88.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBD88\uB2ED\uBE44\uBE54\uBC25.jpg")));
		lblNewLabel_88.setHorizontalAlignment(SwingConstants.CENTER);
		panel_86.add(lblNewLabel_88, "name_42806277536259");
		
		JPanel panel_87 = new JPanel();
		panel_87.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_87);
		panel_87.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_89 = new JLabel("\uBD88\uB2ED\uBE44\uBE54\uBC25");
		lblNewLabel_89.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_89.setHorizontalAlignment(SwingConstants.CENTER);
		panel_87.add(lblNewLabel_89);
		
		JLabel lblNewLabel_228 = new JLabel("4500\uC6D0");
		lblNewLabel_228.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_228.setHorizontalAlignment(SwingConstants.CENTER);
		panel_87.add(lblNewLabel_228);
		
		JSpinner spinner41 = new JSpinner();
		panel_87.add(spinner41);

		
		
		
		JPanel panel_88 = new JPanel();
		panel_5.add(panel_88);
		panel_88.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_90 = new JLabel("");
		lblNewLabel_90.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC5F4\uBB34\uAC15\uB41C\uC7A5\uBE44\uBE54\uBC25.jpg")));
		lblNewLabel_90.setHorizontalAlignment(SwingConstants.CENTER);
		panel_88.add(lblNewLabel_90, "name_42806277536259");
		
		JPanel panel_89 = new JPanel();
		panel_89.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_89);
		panel_89.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_91 = new JLabel("\uC5F4\uBB34\uAC15\uB41C\uC7A5\uBE44\uBE54\uBC25");
		lblNewLabel_91.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_91.setHorizontalAlignment(SwingConstants.CENTER);
		panel_89.add(lblNewLabel_91);
		
		JLabel lblNewLabel_229 = new JLabel("3500\uC6D0");
		lblNewLabel_229.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_229.setHorizontalAlignment(SwingConstants.CENTER);
		panel_89.add(lblNewLabel_229);
		
		JSpinner spinner42 = new JSpinner();
		panel_89.add(spinner42);
		
		
		
		JPanel panel_90 = new JPanel();
		panel_5.add(panel_90);
		panel_90.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_92 = new JLabel("");
		lblNewLabel_92.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBD88\uACE0\uAE30\uBE44\uBE54\uBC25.jpg")));
		lblNewLabel_92.setHorizontalAlignment(SwingConstants.CENTER);
		panel_90.add(lblNewLabel_92, "name_42806277536259");
		
		JPanel panel_91 = new JPanel();
		panel_91.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_91);
		panel_91.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_93 = new JLabel("\uBD88\uACE0\uAE30\uBE44\uBE54\uBC25");
		lblNewLabel_93.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_93.setHorizontalAlignment(SwingConstants.CENTER);
		panel_91.add(lblNewLabel_93);
		
		JLabel lblNewLabel_230 = new JLabel("4500\uC6D0");
		lblNewLabel_230.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_230.setHorizontalAlignment(SwingConstants.CENTER);
		panel_91.add(lblNewLabel_230);
		
		JSpinner spinner43 = new JSpinner();
		panel_91.add(spinner43);
		
		
		
		
		
		JPanel panel_92 = new JPanel();
		panel_5.add(panel_92);
		panel_92.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_94 = new JLabel("");
		lblNewLabel_94.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC81C\uC721\uAC15\uB41C\uC7A5\uBE44\uBE54\uBC25.jpg")));
		lblNewLabel_94.setHorizontalAlignment(SwingConstants.CENTER);
		panel_92.add(lblNewLabel_94, "name_42806277536259");
		
		JPanel panel_93 = new JPanel();
		panel_93.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_93);
		panel_93.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_95 = new JLabel("\uC81C\uC721\uAC15\uB41C\uC7A5\uBE44\uBE54\uBC25");
		lblNewLabel_95.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_95.setHorizontalAlignment(SwingConstants.CENTER);
		panel_93.add(lblNewLabel_95);
		
		JLabel lblNewLabel_231 = new JLabel("4500\uC6D0");
		lblNewLabel_231.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_231.setHorizontalAlignment(SwingConstants.CENTER);
		panel_93.add(lblNewLabel_231);
		
		JSpinner spinner44 = new JSpinner();
		panel_93.add(spinner44);
		
		
		
		JPanel panel_94 = new JPanel();
		panel_5.add(panel_94);
		panel_94.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_96 = new JLabel("");
		lblNewLabel_96.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCC38\uCE58\uC57C\uCC44\uACE0\uCD94\uC7A5.jpg")));
		lblNewLabel_96.setHorizontalAlignment(SwingConstants.CENTER);
		panel_94.add(lblNewLabel_96, "name_42806277536259");
		
		JPanel panel_95 = new JPanel();
		panel_95.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_95);
		panel_95.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_97 = new JLabel("\uCC38\uCE58\uC57C\uCC44\uACE0\uCD94\uC7A5");
		lblNewLabel_97.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_97.setHorizontalAlignment(SwingConstants.CENTER);
		panel_95.add(lblNewLabel_97);
		
		JLabel lblNewLabel_232 = new JLabel("2800\uC6D0");
		lblNewLabel_232.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_232.setHorizontalAlignment(SwingConstants.CENTER);
		panel_95.add(lblNewLabel_232);
		
		JSpinner spinner45 = new JSpinner();
		panel_95.add(spinner45);
		
		
		
		
		JPanel panel_96 = new JPanel();
		panel_5.add(panel_96);
		panel_96.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_98 = new JLabel("");
		lblNewLabel_98.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uAE40\uCE58\uCC0C\uAC1C\uB3C4\uC2DC\uB77D.jpg")));
		lblNewLabel_98.setHorizontalAlignment(SwingConstants.CENTER);
		panel_96.add(lblNewLabel_98, "name_42806277536259");
		
		JPanel panel_97 = new JPanel();
		panel_97.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_97);
		panel_97.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_99 = new JLabel("\uAE40\uCE58\uCC0C\uAC1C\uB3C4\uC2DC\uB77D");
		lblNewLabel_99.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_99.setHorizontalAlignment(SwingConstants.CENTER);
		panel_97.add(lblNewLabel_99);
		
		JLabel lblNewLabel_233 = new JLabel("3000\uC6D0");
		lblNewLabel_233.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_233.setHorizontalAlignment(SwingConstants.CENTER);
		panel_97.add(lblNewLabel_233);
		
		JSpinner spinner46 = new JSpinner();
		panel_97.add(spinner46);
		
		
		
		JPanel panel_98 = new JPanel();
		panel_5.add(panel_98);
		panel_98.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_100 = new JLabel("");
		lblNewLabel_100.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC721\uAC1C\uC7A5.jpg")));
		lblNewLabel_100.setHorizontalAlignment(SwingConstants.CENTER);
		panel_98.add(lblNewLabel_100, "name_42806277536259");
		
		JPanel panel_99 = new JPanel();
		panel_99.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_99);
		panel_99.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_101 = new JLabel("\uC721\uAC1C\uC7A5");
		lblNewLabel_101.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_101.setHorizontalAlignment(SwingConstants.CENTER);
		panel_99.add(lblNewLabel_101);
		
		JLabel lblNewLabel_234 = new JLabel("3500\uC6D0");
		lblNewLabel_234.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_234.setHorizontalAlignment(SwingConstants.CENTER);
		panel_99.add(lblNewLabel_234);
		
		JSpinner spinner47 = new JSpinner();
		panel_99.add(spinner47);
		
		

		
		JPanel panel_100 = new JPanel();
		panel_5.add(panel_100);
		panel_100.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_102 = new JLabel("");
		lblNewLabel_102.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uAE50\uAE50\uCF64\uBE44.jpg")));
		lblNewLabel_102.setHorizontalAlignment(SwingConstants.CENTER);
		panel_100.add(lblNewLabel_102, "name_42806277536259");
		
		JPanel panel_101 = new JPanel();
		panel_101.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_101);
		panel_101.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_103 = new JLabel("\uBC18\uCC2C\uAE50\uAE50\uCF64\uBE44");
		lblNewLabel_103.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_103.setHorizontalAlignment(SwingConstants.CENTER);
		panel_101.add(lblNewLabel_103);
		
		JLabel lblNewLabel_235 = new JLabel("4800\uC6D0");
		lblNewLabel_235.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_235.setHorizontalAlignment(SwingConstants.CENTER);
		panel_101.add(lblNewLabel_235);
		
		JSpinner spinner48 = new JSpinner();
		panel_101.add(spinner48);
		
		
		
		
		JPanel panel_104 = new JPanel();
		panel_5.add(panel_104);
		panel_104.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_106 = new JLabel("");
		lblNewLabel_106.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uAE50\uC1FC\uCE60\uB9AC\uC0C8\uC6B0.jpg")));
		lblNewLabel_106.setHorizontalAlignment(SwingConstants.CENTER);
		panel_104.add(lblNewLabel_106, "name_42806277536259");
		
		JPanel panel_105 = new JPanel();
		panel_105.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_105);
		panel_105.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_107 = new JLabel("\uBC18\uCC2C\uAE50\uC1FC\uCE60\uB9AC\uC0C8\uC6B0");
		lblNewLabel_107.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_107.setHorizontalAlignment(SwingConstants.CENTER);
		panel_105.add(lblNewLabel_107);
		
		JLabel lblNewLabel_236 = new JLabel("6000\uC6D0");
		lblNewLabel_236.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_236.setHorizontalAlignment(SwingConstants.CENTER);
		panel_105.add(lblNewLabel_236);
		
		JSpinner spinner49 = new JSpinner();
		panel_105.add(spinner49);
		
		
		
		
		JPanel panel_106 = new JPanel();
		panel_5.add(panel_106);
		panel_106.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_108 = new JLabel("");
		lblNewLabel_108.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uAE50\uD48D\uAE30.jpg")));
		lblNewLabel_108.setHorizontalAlignment(SwingConstants.CENTER);
		panel_106.add(lblNewLabel_108, "name_42806277536259");
		
		JPanel panel_107 = new JPanel();
		panel_107.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_107);
		panel_107.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_109 = new JLabel("\uBC18\uCC2C\uAE50\uD48D\uAE30");
		lblNewLabel_109.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_109.setHorizontalAlignment(SwingConstants.CENTER);
		panel_107.add(lblNewLabel_109);
		
		JLabel lblNewLabel_237 = new JLabel("3000\uC6D0");
		lblNewLabel_237.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_237.setHorizontalAlignment(SwingConstants.CENTER);
		panel_107.add(lblNewLabel_237);
		
		JSpinner spinner50 = new JSpinner();
		panel_107.add(spinner50);
		
		
		
		
		
		JPanel panel_108 = new JPanel();
		panel_5.add(panel_108);
		panel_108.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_110 = new JLabel("");
		lblNewLabel_110.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uB370\uBBF8\uD568\uBC15.jpg")));
		lblNewLabel_110.setHorizontalAlignment(SwingConstants.CENTER);
		panel_108.add(lblNewLabel_110, "name_42806277536259");
		
		JPanel panel_109 = new JPanel();
		panel_109.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_109);
		panel_109.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_111 = new JLabel("\uBC18\uCC2C\uB370\uBBF8\uD568\uBC15");
		lblNewLabel_111.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_111.setHorizontalAlignment(SwingConstants.CENTER);
		panel_109.add(lblNewLabel_111);
		
		JLabel lblNewLabel_238 = new JLabel("4800\uC6D0");
		lblNewLabel_238.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_238.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		panel_109.add(lblNewLabel_238);
		
		JSpinner spinner51 = new JSpinner();
		panel_109.add(spinner51);
		
		
		
		
		JPanel panel_110 = new JPanel();
		panel_5.add(panel_110);
		panel_110.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_112 = new JLabel("");
		lblNewLabel_112.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uACE0\uB4F1\uC5B4\uC870\uB9BC.jpg")));
		lblNewLabel_112.setHorizontalAlignment(SwingConstants.CENTER);
		panel_110.add(lblNewLabel_112, "name_42806277536259");
		
		JPanel panel_111 = new JPanel();
		panel_111.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_111);
		panel_111.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_113 = new JLabel("\uBC18\uCC2C\uACE0\uB4F1\uC5B4\uC870\uB9BC");
		lblNewLabel_113.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_113.setHorizontalAlignment(SwingConstants.CENTER);
		panel_111.add(lblNewLabel_113);
		
		JLabel lblNewLabel_239 = new JLabel("4800\uC6D0");
		lblNewLabel_239.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_239.setHorizontalAlignment(SwingConstants.CENTER);
		panel_111.add(lblNewLabel_239);
		
		JSpinner spinner52 = new JSpinner();
		panel_111.add(spinner52);		
		
		
		
		JPanel panel_112 = new JPanel();
		panel_5.add(panel_112);
		panel_112.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_114 = new JLabel("");
		lblNewLabel_114.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uC21C\uC0B4\uACE0\uB4F1\uC5B4\uB370\uB9AC\uC57C\uB07C.jpg")));
		lblNewLabel_114.setHorizontalAlignment(SwingConstants.CENTER);
		panel_112.add(lblNewLabel_114, "name_42806277536259");
		
		JPanel panel_113 = new JPanel();
		panel_113.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_113);
		panel_113.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_115 = new JLabel("\uBC18\uCC2C\uC21C\uC0B4\uACE0\uB4F1\uC5B4\uB370\uB9AC\uC57C\uB07C");
		lblNewLabel_115.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_115.setHorizontalAlignment(SwingConstants.CENTER);
		panel_113.add(lblNewLabel_115);
		
		JLabel lblNewLabel_240 = new JLabel("3400\uC6D0");
		lblNewLabel_240.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_240.setHorizontalAlignment(SwingConstants.CENTER);
		panel_113.add(lblNewLabel_240);
		
		JSpinner spinner53 = new JSpinner();
		panel_113.add(spinner53);
		
		
		
		JPanel panel_114 = new JPanel();
		panel_5.add(panel_114);
		panel_114.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_116 = new JLabel("");
		lblNewLabel_116.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uBD88\uACE0\uAE30.jpg")));
		lblNewLabel_116.setHorizontalAlignment(SwingConstants.CENTER);
		panel_114.add(lblNewLabel_116, "name_42806277536259");
		
		JPanel panel_115 = new JPanel();
		panel_115.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_115);
		panel_115.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_117 = new JLabel("\uBC18\uCC2C\uBD88\uACE0\uAE30");
		lblNewLabel_117.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_117.setHorizontalAlignment(SwingConstants.CENTER);
		panel_115.add(lblNewLabel_117);
		
		JLabel lblNewLabel_241 = new JLabel("3900\uC6D0");
		lblNewLabel_241.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_241.setHorizontalAlignment(SwingConstants.CENTER);
		panel_115.add(lblNewLabel_241);
		
		JSpinner spinner54 = new JSpinner();
		panel_115.add(spinner54);

		
		
		
		JPanel panel_116 = new JPanel();
		panel_5.add(panel_116);
		panel_116.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_118 = new JLabel("");
		lblNewLabel_118.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uACE0\uAE30\uACE0\uAE30.jpg")));
		lblNewLabel_118.setHorizontalAlignment(SwingConstants.CENTER);
		panel_116.add(lblNewLabel_118, "name_42806277536259");
		
		JPanel panel_117 = new JPanel();
		panel_117.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_117);
		panel_117.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_119 = new JLabel("\uBC18\uCC2C\uACE0\uAE30\uACE0\uAE30");
		lblNewLabel_119.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_119.setHorizontalAlignment(SwingConstants.CENTER);
		panel_117.add(lblNewLabel_119);
		
		JLabel lblNewLabel_242 = new JLabel("2900\uC6D0");
		lblNewLabel_242.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_242.setHorizontalAlignment(SwingConstants.CENTER);
		panel_117.add(lblNewLabel_242);
		
		JSpinner spinner55 = new JSpinner();
		panel_117.add(spinner55);
		
		
		
		JPanel panel_118 = new JPanel();
		panel_5.add(panel_118);
		panel_118.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_120 = new JLabel("");
		lblNewLabel_120.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uC81C\uC721\uBCF6\uC74C.jpg")));
		lblNewLabel_120.setHorizontalAlignment(SwingConstants.CENTER);
		panel_118.add(lblNewLabel_120, "name_42806277536259");
		
		JPanel panel_119 = new JPanel();
		panel_119.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_119);
		panel_119.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_121 = new JLabel("\uBC18\uCC2C\uC81C\uC721\uBCF6\uC74C");
		lblNewLabel_121.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_121.setHorizontalAlignment(SwingConstants.CENTER);
		panel_119.add(lblNewLabel_121);
		
		JLabel lblNewLabel_243 = new JLabel("2800\uC6D0");
		lblNewLabel_243.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_243.setHorizontalAlignment(SwingConstants.CENTER);
		panel_119.add(lblNewLabel_243);
		
		JSpinner spinner56 = new JSpinner();
		panel_119.add(spinner56);
		
		
		
		JPanel panel_120 = new JPanel();
		panel_5.add(panel_120);
		panel_120.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_122 = new JLabel("");
		lblNewLabel_122.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uCE58\uD0A8.jpg")));
		lblNewLabel_122.setHorizontalAlignment(SwingConstants.CENTER);
		panel_120.add(lblNewLabel_122, "name_42806277536259");
		
		JPanel panel_121 = new JPanel();
		panel_121.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_121);
		panel_121.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_123 = new JLabel("\uBC18\uCC2C\uCE58\uD0A8");
		lblNewLabel_123.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_123.setHorizontalAlignment(SwingConstants.CENTER);
		panel_121.add(lblNewLabel_123);
		
		JLabel lblNewLabel_280 = new JLabel("3200\uC6D0");
		lblNewLabel_280.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_280.setHorizontalAlignment(SwingConstants.CENTER);
		panel_121.add(lblNewLabel_280);
		
		JSpinner spinner57 = new JSpinner();
		panel_121.add(spinner57);
		
		
		
		
		JPanel panel_124 = new JPanel();
		panel_5.add(panel_124);
		panel_124.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_126 = new JLabel("");
		lblNewLabel_126.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uB3C8\uAE4C\uC2A4\uB3C4\uB828\uB2D8.jpg")));
		lblNewLabel_126.setHorizontalAlignment(SwingConstants.CENTER);
		panel_124.add(lblNewLabel_126, "name_42806277536259");
		
		JPanel panel_125 = new JPanel();
		panel_125.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_125);
		panel_125.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_127 = new JLabel("\uBC18\uCC2C\uB3C8\uAE4C\uC2A4\uB3C4\uB828\uB2D8");
		lblNewLabel_127.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_127.setHorizontalAlignment(SwingConstants.CENTER);
		panel_125.add(lblNewLabel_127);
		
		JLabel lblNewLabel_245 = new JLabel("2900\uC6D0");
		lblNewLabel_245.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_245.setHorizontalAlignment(SwingConstants.CENTER);
		panel_125.add(lblNewLabel_245);
		
		JSpinner spinner59 = new JSpinner();
		panel_125.add(spinner59);
		
		
		
		JPanel panel_126 = new JPanel();
		panel_5.add(panel_126);
		panel_126.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_128 = new JLabel("");
		lblNewLabel_128.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uCE60\uB9AC\uD0D5\uC218\uC721.jpg")));
		lblNewLabel_128.setHorizontalAlignment(SwingConstants.CENTER);
		panel_126.add(lblNewLabel_128, "name_42806277536259");
		
		JPanel panel_127 = new JPanel();
		panel_127.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_127);
		panel_127.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_129 = new JLabel("\uBC18\uCC2C\uCE60\uB9AC\uD0D5\uC218\uC721");
		lblNewLabel_129.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_129.setHorizontalAlignment(SwingConstants.CENTER);
		panel_127.add(lblNewLabel_129);
		
		JLabel lblNewLabel_246 = new JLabel("2600\uC6D0");
		lblNewLabel_246.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_246.setHorizontalAlignment(SwingConstants.CENTER);
		panel_127.add(lblNewLabel_246);
		
		JSpinner spinner60 = new JSpinner();
		panel_127.add(spinner60);
		
		

		
		JPanel panel_128 = new JPanel();
		panel_5.add(panel_128);
		panel_128.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_130 = new JLabel("");
		lblNewLabel_130.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uCC2C\uB3C8\uAE4C\uC2A4.jpg")));
		lblNewLabel_130.setHorizontalAlignment(SwingConstants.CENTER);
		panel_128.add(lblNewLabel_130, "name_42806277536259");
		
		JPanel panel_129 = new JPanel();
		panel_129.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_129);
		panel_129.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_131 = new JLabel("\uBC18\uCC2C\uB3C8\uAE4C\uC2A4");
		lblNewLabel_131.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_131.setHorizontalAlignment(SwingConstants.CENTER);
		panel_129.add(lblNewLabel_131);
		
		JLabel lblNewLabel_247 = new JLabel("2500\uC6D0");
		lblNewLabel_247.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_247.setHorizontalAlignment(SwingConstants.CENTER);
		panel_129.add(lblNewLabel_247);
		
		JSpinner spinner61 = new JSpinner();
		panel_129.add(spinner61);
		
		
		
		
		JPanel panel_130 = new JPanel();
		panel_5.add(panel_130);
		panel_130.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_132 = new JLabel("");
		lblNewLabel_132.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uAE40\uCE58.jpg")));
		lblNewLabel_132.setHorizontalAlignment(SwingConstants.CENTER);
		panel_130.add(lblNewLabel_132, "name_42806277536259");
		
		JPanel panel_131 = new JPanel();
		panel_131.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_131);
		panel_131.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_133 = new JLabel("\uAE40\uCE58");
		lblNewLabel_133.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_133.setHorizontalAlignment(SwingConstants.CENTER);
		panel_131.add(lblNewLabel_133);
		
		JLabel lblNewLabel_248 = new JLabel("200\uC6D0");
		lblNewLabel_248.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_248.setHorizontalAlignment(SwingConstants.CENTER);
		panel_131.add(lblNewLabel_248);
		
		JSpinner spinner62 = new JSpinner();
		panel_131.add(spinner62);
		
		
		
		
		JPanel panel_132 = new JPanel();
		panel_5.add(panel_132);
		panel_132.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_134 = new JLabel("");
		lblNewLabel_134.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBCF6\uC74C\uAE40\uCE58.jpg")));
		lblNewLabel_134.setHorizontalAlignment(SwingConstants.CENTER);
		panel_132.add(lblNewLabel_134, "name_42806277536259");
		
		JPanel panel_133 = new JPanel();
		panel_133.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_133);
		panel_133.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_135 = new JLabel("\uBCF6\uC74C\uAE40\uCE58");
		lblNewLabel_135.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_135.setHorizontalAlignment(SwingConstants.CENTER);
		panel_133.add(lblNewLabel_135);
		
		JLabel lblNewLabel_249 = new JLabel("300\uC6D0");
		lblNewLabel_249.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_249.setHorizontalAlignment(SwingConstants.CENTER);
		panel_133.add(lblNewLabel_249);
		
		JSpinner spinner63 = new JSpinner();
		panel_133.add(spinner63);
		
		
		
		
		
		JPanel panel_134 = new JPanel();
		panel_5.add(panel_134);
		panel_134.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_136 = new JLabel("");
		lblNewLabel_136.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBB34\uB9D0\uB7AD\uC774.jpg")));
		lblNewLabel_136.setHorizontalAlignment(SwingConstants.CENTER);
		panel_134.add(lblNewLabel_136, "name_42806277536259");
		
		JPanel panel_135 = new JPanel();
		panel_135.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_135);
		panel_135.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_137 = new JLabel("\uBB34\uB9D0\uB7AD\uC774");
		lblNewLabel_137.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_137.setHorizontalAlignment(SwingConstants.CENTER);
		panel_135.add(lblNewLabel_137);
		
		JLabel lblNewLabel_250 = new JLabel("200\uC6D0");
		lblNewLabel_250.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_250.setHorizontalAlignment(SwingConstants.CENTER);
		panel_135.add(lblNewLabel_250);
		
		JSpinner spinner64 = new JSpinner();
		panel_135.add(spinner64);
		
		
		
		
		JPanel panel_136 = new JPanel();
		panel_5.add(panel_136);
		panel_136.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_138 = new JLabel("");
		lblNewLabel_138.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC5F4\uBB34\uC5BC\uAC08\uC774\uAE40\uCE58.jpg")));
		lblNewLabel_138.setHorizontalAlignment(SwingConstants.CENTER);
		panel_136.add(lblNewLabel_138, "name_42806277536259");
		
		JPanel panel_137 = new JPanel();
		panel_137.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_137);
		panel_137.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_139 = new JLabel("\uC5F4\uBB34\uC5BC\uAC08\uC774\uAE40\uCE58");
		lblNewLabel_139.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_139.setHorizontalAlignment(SwingConstants.CENTER);
		panel_137.add(lblNewLabel_139);
		
		JLabel lblNewLabel_251 = new JLabel("300\uC6D0");
		lblNewLabel_251.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_251.setHorizontalAlignment(SwingConstants.CENTER);
		panel_137.add(lblNewLabel_251);
		
		JSpinner spinner65 = new JSpinner();
		panel_137.add(spinner65);
		
		
		
		
		JPanel panel_138 = new JPanel();
		panel_5.add(panel_138);
		panel_138.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_140 = new JLabel("");
		lblNewLabel_140.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBB34\uC0DD\uCC44.jpg")));
		lblNewLabel_140.setHorizontalAlignment(SwingConstants.CENTER);
		panel_138.add(lblNewLabel_140, "name_42806277536259");
		
		JPanel panel_139 = new JPanel();
		panel_139.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_139);
		panel_139.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_141 = new JLabel("\uBB34\uC0DD\uCC44");
		lblNewLabel_141.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_141.setHorizontalAlignment(SwingConstants.CENTER);
		panel_139.add(lblNewLabel_141);
		
		JLabel lblNewLabel_252 = new JLabel("300\uC6D0");
		lblNewLabel_252.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_252.setHorizontalAlignment(SwingConstants.CENTER);
		panel_139.add(lblNewLabel_252);
		
		JSpinner spinner66 = new JSpinner();
		panel_139.add(spinner66);
	
		
		
		JPanel panel_140 = new JPanel();
		panel_5.add(panel_140);
		panel_140.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_142 = new JLabel("");
		lblNewLabel_142.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uD55C\uC1A5\uBC25.jpg")));
		lblNewLabel_142.setHorizontalAlignment(SwingConstants.CENTER);
		panel_140.add(lblNewLabel_142, "name_42806277536259");
		
		JPanel panel_141 = new JPanel();
		panel_141.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_141);
		panel_141.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_143 = new JLabel("\uD55C\uC1A5\uBC25");
		lblNewLabel_143.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_143.setHorizontalAlignment(SwingConstants.CENTER);
		panel_141.add(lblNewLabel_143);
		
		JLabel lblNewLabel_253 = new JLabel("900\uC6D0");
		lblNewLabel_253.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_253.setHorizontalAlignment(SwingConstants.CENTER);
		panel_141.add(lblNewLabel_253);
		
		JSpinner spinner67 = new JSpinner();
		panel_141.add(spinner67);

		
		
		
		JPanel panel_142 = new JPanel();
		panel_5.add(panel_142);
		panel_142.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_144 = new JLabel("");
		lblNewLabel_144.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uD604\uBBF8\uBC25.jpg")));
		lblNewLabel_144.setHorizontalAlignment(SwingConstants.CENTER);
		panel_142.add(lblNewLabel_144, "name_42806277536259");
		
		JPanel panel_143 = new JPanel();
		panel_143.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_143);
		panel_143.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_145 = new JLabel("\uD604\uBBF8\uBC25");
		lblNewLabel_145.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_145.setHorizontalAlignment(SwingConstants.CENTER);
		panel_143.add(lblNewLabel_145);
		
		JLabel lblNewLabel_254 = new JLabel("1700\uC6D0");
		lblNewLabel_254.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_254.setHorizontalAlignment(SwingConstants.CENTER);
		panel_143.add(lblNewLabel_254);
		
		JSpinner spinner68 = new JSpinner();
		panel_143.add(spinner68);
		
		
		
		JPanel panel_144 = new JPanel();
		panel_5.add(panel_144);
		panel_144.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_146 = new JLabel("");
		lblNewLabel_146.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC601\uC591\uBC25.jpg")));
		lblNewLabel_146.setHorizontalAlignment(SwingConstants.CENTER);
		panel_144.add(lblNewLabel_146, "name_42806277536259");
		
		JPanel panel_145 = new JPanel();
		panel_145.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_145);
		panel_145.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_147 = new JLabel("\uC601\uC591\uBC25");
		lblNewLabel_147.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_147.setHorizontalAlignment(SwingConstants.CENTER);
		panel_145.add(lblNewLabel_147);
		
		JLabel lblNewLabel_255 = new JLabel("2200\uC6D0");
		lblNewLabel_255.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_255.setHorizontalAlignment(SwingConstants.CENTER);
		panel_145.add(lblNewLabel_255);
		
		JSpinner spinner69 = new JSpinner();
		panel_145.add(spinner69);
		
		
		
		
		
		JPanel panel_146 = new JPanel();
		panel_5.add(panel_146);
		panel_146.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_148 = new JLabel("");
		lblNewLabel_148.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uACE0\uAD6C\uB9C8\uBE60\uC2A4.jpg")));
		lblNewLabel_148.setHorizontalAlignment(SwingConstants.CENTER);
		panel_146.add(lblNewLabel_148, "name_42806277536259");
		
		JPanel panel_147 = new JPanel();
		panel_147.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_147);
		panel_147.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_149 = new JLabel("\uACE0\uAD6C\uB9C8\uBE60\uC2A4");
		lblNewLabel_149.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_149.setHorizontalAlignment(SwingConstants.CENTER);
		panel_147.add(lblNewLabel_149);
		
		JLabel lblNewLabel_256 = new JLabel("1600\uC6D0");
		lblNewLabel_256.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_256.setHorizontalAlignment(SwingConstants.CENTER);
		panel_147.add(lblNewLabel_256);
		
		JSpinner spinner70 = new JSpinner();
		panel_147.add(spinner70);
		
		
		
		JPanel panel_148 = new JPanel();
		panel_5.add(panel_148);
		panel_148.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_150 = new JLabel("");
		lblNewLabel_150.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE58\uD0A8BOXwith\uBC18\uB2EC\uAC10\uC790\uD280\uAE40(\uB300).jpg")));
		lblNewLabel_150.setHorizontalAlignment(SwingConstants.CENTER);
		panel_148.add(lblNewLabel_150, "name_42806277536259");
		
		JPanel panel_149 = new JPanel();
		panel_149.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_149);
		panel_149.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_151 = new JLabel("\uCE58\uD0A8BOXwith\uBC18\uB2EC\uAC10\uC790\uD280\uAE40(\uB300)");
		lblNewLabel_151.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_151.setHorizontalAlignment(SwingConstants.CENTER);
		panel_149.add(lblNewLabel_151);
		
		JLabel lblNewLabel_257 = new JLabel("10000\uC6D0");
		lblNewLabel_257.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_257.setHorizontalAlignment(SwingConstants.CENTER);
		panel_149.add(lblNewLabel_257);
		
		JSpinner spinner71 = new JSpinner();
		panel_149.add(spinner71);
		
		
		
		
		JPanel panel_150 = new JPanel();
		panel_5.add(panel_150);
		panel_150.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_152 = new JLabel("");
		lblNewLabel_152.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE58\uD0A8BOXwith\uBC18\uB2EC\uAC10\uC790\uD280\uAE40(\uC911).jpg")));
		lblNewLabel_152.setHorizontalAlignment(SwingConstants.CENTER);
		panel_150.add(lblNewLabel_152, "name_42806277536259");
		
		JPanel panel_151 = new JPanel();
		panel_151.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_151);
		panel_151.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_153 = new JLabel("\uCE58\uD0A8BOXwith\uBC18\uB2EC\uAC10\uC790\uD280\uAE40(\uC911)");
		lblNewLabel_153.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_153.setHorizontalAlignment(SwingConstants.CENTER);
		panel_151.add(lblNewLabel_153);
		
		JLabel lblNewLabel_258 = new JLabel("5000\uC6D0");
		lblNewLabel_258.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_258.setHorizontalAlignment(SwingConstants.CENTER);
		panel_151.add(lblNewLabel_258);
		
		JSpinner spinner72 = new JSpinner();
		panel_151.add(spinner72);
		
		
		
		JPanel panel_152 = new JPanel();
		panel_5.add(panel_152);
		panel_152.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_154 = new JLabel("");
		lblNewLabel_154.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE58\uD0A8BOXwith\uBC18\uB2EC\uAC10\uC790\uD280\uAE40(\uC18C).jpg")));
		lblNewLabel_154.setHorizontalAlignment(SwingConstants.CENTER);
		panel_152.add(lblNewLabel_154, "name_42806277536259");
		
		JPanel panel_153 = new JPanel();
		panel_153.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_153);
		panel_153.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_155 = new JLabel("\uCE58\uD0A8BOXwith\uBC18\uB2EC\uAC10\uC790\uD280\uAE40(\uC18C)");
		lblNewLabel_155.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_155.setHorizontalAlignment(SwingConstants.CENTER);
		panel_153.add(lblNewLabel_155);
		
		JLabel lblNewLabel_259 = new JLabel("2500\uC6D0");
		lblNewLabel_259.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_259.setHorizontalAlignment(SwingConstants.CENTER);
		panel_153.add(lblNewLabel_259);
		
		JSpinner spinner73 = new JSpinner();
		panel_153.add(spinner73);
		
		

		
		JPanel panel_154 = new JPanel();
		panel_5.add(panel_154);
		panel_154.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_156 = new JLabel("");
		lblNewLabel_156.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE60\uB9AC\uD0D5\uC218\uC721BOX(\uB300).jpg")));
		lblNewLabel_156.setHorizontalAlignment(SwingConstants.CENTER);
		panel_154.add(lblNewLabel_156, "name_42806277536259");
		
		JPanel panel_155 = new JPanel();
		panel_155.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_155);
		panel_155.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_157 = new JLabel("\uCE60\uB9AC\uD0D5\uC218\uC721BOX(\uB300)");
		lblNewLabel_157.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_157.setHorizontalAlignment(SwingConstants.CENTER);
		panel_155.add(lblNewLabel_157);
		
		JLabel lblNewLabel_260 = new JLabel("8000\uC6D0");
		lblNewLabel_260.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_260.setHorizontalAlignment(SwingConstants.CENTER);
		panel_155.add(lblNewLabel_260);
		
		JSpinner spinner74 = new JSpinner();
		panel_155.add(spinner74);
		
		
		
		
		JPanel panel_156 = new JPanel();
		panel_5.add(panel_156);
		panel_156.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_158 = new JLabel("");
		lblNewLabel_158.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE60\uB9AC\uD0D5\uC218\uC721BOX(\uC911).jpg")));
		lblNewLabel_158.setHorizontalAlignment(SwingConstants.CENTER);
		panel_156.add(lblNewLabel_158, "name_42806277536259");
		
		JPanel panel_157 = new JPanel();
		panel_157.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_157);
		panel_157.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_159 = new JLabel("\uCE60\uB9AC\uD0D5\uC218\uC721BOX(\uC911)");
		lblNewLabel_159.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_159.setHorizontalAlignment(SwingConstants.CENTER);
		panel_157.add(lblNewLabel_159);
		
		JLabel lblNewLabel_261 = new JLabel("4000\uC6D0");
		lblNewLabel_261.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_261.setHorizontalAlignment(SwingConstants.CENTER);
		panel_157.add(lblNewLabel_261);
		
		JSpinner spinner75 = new JSpinner();
		panel_157.add(spinner75);
		
		
		
		
		JPanel panel_158 = new JPanel();
		panel_5.add(panel_158);
		panel_158.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_160 = new JLabel("");
		lblNewLabel_160.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB2ED\uAC15\uC815(\uC911).jpg")));
		lblNewLabel_160.setHorizontalAlignment(SwingConstants.CENTER);
		panel_158.add(lblNewLabel_160, "name_42806277536259");
		
		JPanel panel_159 = new JPanel();
		panel_159.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_159);
		panel_159.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_161 = new JLabel("\uB2ED\uAC15\uC815(\uC911)");
		lblNewLabel_161.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_161.setHorizontalAlignment(SwingConstants.CENTER);
		panel_159.add(lblNewLabel_161);
		
		JLabel lblNewLabel_262 = new JLabel("7000\uC6D0");
		lblNewLabel_262.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_262.setHorizontalAlignment(SwingConstants.CENTER);
		panel_159.add(lblNewLabel_262);
		
		JSpinner spinner76 = new JSpinner();
		panel_159.add(spinner76);
		
		
		
		
		
		JPanel panel_160 = new JPanel();
		panel_5.add(panel_160);
		panel_160.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_162 = new JLabel("");
		lblNewLabel_162.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB2ED\uAC15\uC815(\uC18C).jpg")));
		lblNewLabel_162.setHorizontalAlignment(SwingConstants.CENTER);
		panel_160.add(lblNewLabel_162, "name_42806277536259");
		
		JPanel panel_161 = new JPanel();
		panel_161.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_161);
		panel_161.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_163 = new JLabel("\uB2ED\uAC15\uC815(\uC18C)");
		lblNewLabel_163.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_163.setHorizontalAlignment(SwingConstants.CENTER);
		panel_161.add(lblNewLabel_163);
		
		JLabel lblNewLabel_263 = new JLabel("2500\uC6D0");
		lblNewLabel_263.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_263.setHorizontalAlignment(SwingConstants.CENTER);
		panel_161.add(lblNewLabel_263);
		
		JSpinner spinner77 = new JSpinner();
		panel_161.add(spinner77);
		
		
		
		
		JPanel panel_162 = new JPanel();
		panel_5.add(panel_162);
		panel_162.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_164 = new JLabel("");
		lblNewLabel_164.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBC18\uB2EC\uAC10\uC790\uD280\uAE40.jpg")));
		lblNewLabel_164.setHorizontalAlignment(SwingConstants.CENTER);
		panel_162.add(lblNewLabel_164, "name_42806277536259");
		
		JPanel panel_163 = new JPanel();
		panel_163.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_163);
		panel_163.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_165 = new JLabel("\uBC18\uB2EC\uAC10\uC790\uD280\uAE40");
		lblNewLabel_165.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_165.setHorizontalAlignment(SwingConstants.CENTER);
		panel_163.add(lblNewLabel_165);
		
		JLabel lblNewLabel_264 = new JLabel("1200\uC6D0");
		lblNewLabel_264.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_264.setHorizontalAlignment(SwingConstants.CENTER);
		panel_163.add(lblNewLabel_264);
		
		JSpinner spinner78 = new JSpinner();
		panel_163.add(spinner78);
		
		
		
		
		JPanel panel_164 = new JPanel();
		panel_5.add(panel_164);
		panel_164.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_166 = new JLabel("");
		lblNewLabel_166.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC218\uC81C\uACE0\uB85C\uCF00.jpg")));
		lblNewLabel_166.setHorizontalAlignment(SwingConstants.CENTER);
		panel_164.add(lblNewLabel_166, "name_42806277536259");
		
		JPanel panel_165 = new JPanel();
		panel_165.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_165);
		panel_165.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_167 = new JLabel("\uC218\uC81C\uACE0\uB85C\uCF00");
		lblNewLabel_167.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_167.setHorizontalAlignment(SwingConstants.CENTER);
		panel_165.add(lblNewLabel_167);
		
		JLabel lblNewLabel_265 = new JLabel("1200\uC6D0");
		lblNewLabel_265.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_265.setHorizontalAlignment(SwingConstants.CENTER);
		panel_165.add(lblNewLabel_265);
		
		JSpinner spinner79 = new JSpinner();
		panel_165.add(spinner79);
	
		
		
		JPanel panel_166 = new JPanel();
		panel_5.add(panel_166);
		panel_166.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_168 = new JLabel("");
		lblNewLabel_168.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB9E4\uCF64\uAD70\uB9CC\uB450.jpg")));
		lblNewLabel_168.setHorizontalAlignment(SwingConstants.CENTER);
		panel_166.add(lblNewLabel_168, "name_42806277536259");
		
		JPanel panel_167 = new JPanel();
		panel_167.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_167);
		panel_167.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_169 = new JLabel("\uB9E4\uCF64\uAD70\uB9CC\uB450");
		lblNewLabel_169.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_169.setHorizontalAlignment(SwingConstants.CENTER);
		panel_167.add(lblNewLabel_169);
		
		JLabel lblNewLabel_266 = new JLabel("1300\uC6D0");
		lblNewLabel_266.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_266.setHorizontalAlignment(SwingConstants.CENTER);
		panel_167.add(lblNewLabel_266);
		
		JSpinner spinner80 = new JSpinner();
		panel_167.add(spinner80);

		
		
		
		JPanel panel_168 = new JPanel();
		panel_5.add(panel_168);
		panel_168.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_170 = new JLabel("");
		lblNewLabel_170.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC2A4\uB0B5\uBAA8\uB4EC\uD280\uAE40.jpg")));
		lblNewLabel_170.setHorizontalAlignment(SwingConstants.CENTER);
		panel_168.add(lblNewLabel_170, "name_42806277536259");
		
		JPanel panel_169 = new JPanel();
		panel_169.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_169);
		panel_169.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_171 = new JLabel("\uC2A4\uB0B5\uBAA8\uB4EC\uD280\uAE40");
		lblNewLabel_171.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_171.setHorizontalAlignment(SwingConstants.CENTER);
		panel_169.add(lblNewLabel_171);
		
		JLabel lblNewLabel_267 = new JLabel("3000\uC6D0");
		lblNewLabel_267.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_267.setHorizontalAlignment(SwingConstants.CENTER);
		panel_169.add(lblNewLabel_267);
		
		JSpinner spinner81 = new JSpinner();
		panel_169.add(spinner81);
		
		
		
		JPanel panel_170 = new JPanel();
		panel_5.add(panel_170);
		panel_170.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_172 = new JLabel("");
		lblNewLabel_172.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCE58\uD0A8\uC0D0\uB7EC\uB4DC.jpg")));
		lblNewLabel_172.setHorizontalAlignment(SwingConstants.CENTER);
		panel_170.add(lblNewLabel_172, "name_42806277536259");
		
		JPanel panel_171 = new JPanel();
		panel_171.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_171);
		panel_171.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_173 = new JLabel("\uCE58\uD0A8\uC0D0\uB7EC\uB4DC");
		lblNewLabel_173.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_173.setHorizontalAlignment(SwingConstants.CENTER);
		panel_171.add(lblNewLabel_173);
		
		JLabel lblNewLabel_268 = new JLabel("3600\uC6D0");
		lblNewLabel_268.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_268.setHorizontalAlignment(SwingConstants.CENTER);
		panel_171.add(lblNewLabel_268);
		
		JSpinner spinner82 = new JSpinner();
		panel_171.add(spinner82);
		
		
		
		JPanel panel_172 = new JPanel();
		panel_5.add(panel_172);
		panel_172.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_174 = new JLabel("");
		lblNewLabel_174.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uADF8\uB9B0\uC0D0\uB7EC\uB4DC.jpg")));
		lblNewLabel_174.setHorizontalAlignment(SwingConstants.CENTER);
		panel_172.add(lblNewLabel_174, "name_42806277536259");
		
		JPanel panel_173 = new JPanel();
		panel_173.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_173);
		panel_173.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_175 = new JLabel("\uADF8\uB9B0\uC0D0\uB7EC\uB4DC");
		lblNewLabel_175.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_175.setHorizontalAlignment(SwingConstants.CENTER);
		panel_173.add(lblNewLabel_175);
		
		JLabel lblNewLabel_269 = new JLabel("2900\uC6D0");
		lblNewLabel_269.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_269.setHorizontalAlignment(SwingConstants.CENTER);
		panel_173.add(lblNewLabel_269);
		
		JSpinner spinner83 = new JSpinner();
		panel_173.add(spinner83);
		
		
		
		JPanel panel_174 = new JPanel();
		panel_5.add(panel_174);
		panel_174.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_176 = new JLabel("");
		lblNewLabel_176.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBBF8\uB2C8\uC0D0\uB7EC\uB4DC.jpg")));
		lblNewLabel_176.setHorizontalAlignment(SwingConstants.CENTER);
		panel_174.add(lblNewLabel_176, "name_42806277536259");
		
		JPanel panel_175 = new JPanel();
		panel_175.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_175);
		panel_175.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_177 = new JLabel("\uBBF8\uB2C8\uC0D0\uB7EC\uB4DC");
		lblNewLabel_177.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_177.setHorizontalAlignment(SwingConstants.CENTER);
		panel_175.add(lblNewLabel_177);
		
		JLabel lblNewLabel_270 = new JLabel("1500\uC6D0");
		lblNewLabel_270.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_270.setHorizontalAlignment(SwingConstants.CENTER);
		panel_175.add(lblNewLabel_270);
		
		JSpinner spinner84 = new JSpinner();
		panel_175.add(spinner84);
		
		
		
		
		JPanel panel_176 = new JPanel();
		panel_5.add(panel_176);
		panel_176.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_178 = new JLabel("");
		lblNewLabel_178.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uBCF6\uC74C\uACE0\uCD94\uC7A5.jpg")));
		lblNewLabel_178.setHorizontalAlignment(SwingConstants.CENTER);
		panel_176.add(lblNewLabel_178, "name_42806277536259");
		
		JPanel panel_177 = new JPanel();
		panel_177.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_177);
		panel_177.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_179 = new JLabel("\uBCF6\uC74C\uACE0\uCD94\uC7A5");
		lblNewLabel_179.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_179.setHorizontalAlignment(SwingConstants.CENTER);
		panel_177.add(lblNewLabel_179);
		
		JLabel lblNewLabel_271 = new JLabel("600\uC6D0");
		lblNewLabel_271.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_271.setHorizontalAlignment(SwingConstants.CENTER);
		panel_177.add(lblNewLabel_271);
		
		JSpinner spinner85 = new JSpinner();
		panel_177.add(spinner85);
		
		
		
		JPanel panel_178 = new JPanel();
		panel_5.add(panel_178);
		panel_178.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_180 = new JLabel("");
		lblNewLabel_180.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uCF69\uB098\uBB3C\uBD81\uC5B4\uAD6D.jpg")));
		lblNewLabel_180.setHorizontalAlignment(SwingConstants.CENTER);
		panel_178.add(lblNewLabel_180, "name_42806277536259");
		
		JPanel panel_179 = new JPanel();
		panel_179.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_179);
		panel_179.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_181 = new JLabel("\uCF69\uB098\uBB3C\uBCF5\uC5B4\uAD6D");
		lblNewLabel_181.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_181.setHorizontalAlignment(SwingConstants.CENTER);
		panel_179.add(lblNewLabel_181);
		
		JLabel lblNewLabel_272 = new JLabel("700\uC6D0");
		lblNewLabel_272.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_272.setHorizontalAlignment(SwingConstants.CENTER);
		panel_179.add(lblNewLabel_272);
		
		JSpinner spinner86 = new JSpinner();
		panel_179.add(spinner86);
		
		

		
		JPanel panel_180 = new JPanel();
		panel_5.add(panel_180);
		panel_180.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_182 = new JLabel("");
		lblNewLabel_182.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uC2DC\uAE08\uCE58\uB41C\uC7A5\uAD6D.jpg")));
		lblNewLabel_182.setHorizontalAlignment(SwingConstants.CENTER);
		panel_180.add(lblNewLabel_182, "name_42806277536259");
		
		JPanel panel_181 = new JPanel();
		panel_181.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_181);
		panel_181.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_183 = new JLabel("\uC2DC\uAE08\uCE58\uB41C\uC7A5\uAD6D");
		lblNewLabel_183.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_183.setHorizontalAlignment(SwingConstants.CENTER);
		panel_181.add(lblNewLabel_183);
		
		JLabel lblNewLabel_273 = new JLabel("700\uC6D0");
		lblNewLabel_273.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_273.setHorizontalAlignment(SwingConstants.CENTER);
		panel_181.add(lblNewLabel_273);
		
		JSpinner spinner87 = new JSpinner();
		panel_181.add(spinner87);
		
		
		
		
		JPanel panel_182 = new JPanel();
		panel_5.add(panel_182);
		panel_182.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_184 = new JLabel("");
		lblNewLabel_184.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/H\uC2A4\uD398\uC15C\uD2F0 \uCE74\uD398\uB77C\uB5BC.jpg")));
		lblNewLabel_184.setHorizontalAlignment(SwingConstants.CENTER);
		panel_182.add(lblNewLabel_184, "name_42806277536259");
		
		JPanel panel_183 = new JPanel();
		panel_183.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_183);
		panel_183.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_185 = new JLabel("H\uC2A4\uD398\uC15C\uD2F0\uCE74\uD398\uB77C\uB5BC");
		lblNewLabel_185.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_185.setHorizontalAlignment(SwingConstants.CENTER);
		panel_183.add(lblNewLabel_185);
		
		JLabel lblNewLabel_274 = new JLabel("1200\uC6D0");
		lblNewLabel_274.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_274.setHorizontalAlignment(SwingConstants.CENTER);
		panel_183.add(lblNewLabel_274);
		
		JSpinner spinner88 = new JSpinner();
		panel_183.add(spinner88);
		
		
		
		
		JPanel panel_184 = new JPanel();
		panel_5.add(panel_184);
		panel_184.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_186 = new JLabel("");
		lblNewLabel_186.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uACE0\uAD6C\uB9C8\uC0D0\uB7EC\uB4DC.jpg")));
		lblNewLabel_186.setHorizontalAlignment(SwingConstants.CENTER);
		panel_184.add(lblNewLabel_186, "name_42806277536259");
		
		JPanel panel_185 = new JPanel();
		panel_185.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_185);
		panel_185.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_187 = new JLabel("\uACE0\uAD6C\uB9C8\uC0D0\uB7EC\uB4DC");
		lblNewLabel_187.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_187.setHorizontalAlignment(SwingConstants.CENTER);
		panel_185.add(lblNewLabel_187);
		
		JLabel lblNewLabel_275 = new JLabel("1500\uC6D0");
		lblNewLabel_275.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_275.setHorizontalAlignment(SwingConstants.CENTER);
		panel_185.add(lblNewLabel_275);
		
		JSpinner spinner89 = new JSpinner();
		panel_185.add(spinner89);
		
		
		
		
		
		JPanel panel_186 = new JPanel();
		panel_5.add(panel_186);
		panel_186.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_188 = new JLabel("");
		lblNewLabel_188.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uAC10\uC790\uC0D0\uB7EC\uB4DC.jpg")));
		lblNewLabel_188.setHorizontalAlignment(SwingConstants.CENTER);
		panel_186.add(lblNewLabel_188, "name_42806277536259");
		
		JPanel panel_187 = new JPanel();
		panel_187.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_187);
		panel_187.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_189 = new JLabel("\uAC10\uC790\uC0D0\uB7EC\uB4DC");
		lblNewLabel_189.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_189.setHorizontalAlignment(SwingConstants.CENTER);
		panel_187.add(lblNewLabel_189);
		
		JLabel lblNewLabel_276 = new JLabel("1500\uC6D0");
		lblNewLabel_276.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_276.setHorizontalAlignment(SwingConstants.CENTER);
		panel_187.add(lblNewLabel_276);
		
		JSpinner spinner90 = new JSpinner();
		panel_187.add(spinner90);
		
		
		
		
		
		JPanel panel_188 = new JPanel();
		panel_5.add(panel_188);
		panel_188.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_278 = new JLabel("");
		lblNewLabel_278.setIcon(new ImageIcon(OrderGUI.class.getResource("/image/\uB2E8\uD638\uBC15\uC0D0\uB7EC\uB4DC.jpg")));
		lblNewLabel_278.setHorizontalAlignment(SwingConstants.CENTER);
		panel_188.add(lblNewLabel_278, "name_42806277536259");
		
		JPanel panel_189 = new JPanel();
		panel_189.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_189);
		panel_189.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel_279 = new JLabel("\uB2E8\uD638\uBC15\uC0D0\uB7EC\uB4DC");
		lblNewLabel_279.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_279.setHorizontalAlignment(SwingConstants.CENTER);
		panel_189.add(lblNewLabel_279);
		
		JLabel lblNewLabel_277 = new JLabel("1500\uC6D0");
		lblNewLabel_277.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 15));
		lblNewLabel_277.setHorizontalAlignment(SwingConstants.CENTER);
		panel_189.add(lblNewLabel_277);
		
		JSpinner spinner91 = new JSpinner();
		panel_189.add(spinner91);
		
		JLabel timeLabel = new JLabel("\uC2DC\uAC04");
		timeLabel.setFont(new Font("°íµµ M", Font.PLAIN, 12));
		springLayout.putConstraint(SpringLayout.NORTH, timeLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, timeLabel, -210, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, timeLabel, 0, SpringLayout.NORTH, scrollPane);
		springLayout.putConstraint(SpringLayout.EAST, timeLabel, -10, SpringLayout.EAST, frame.getContentPane());
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(timeLabel);
		

		Clock clock = new Clock(timeLabel);
		
		// ½ºÇÇ³Ê ¸®µå
		HashMap<String, JSpinner> map = new HashMap<>();
		map.put("±ñÇ³±âµµ½Ã¶ô",spinner);
		map.put("±ñ±ñµµ½Ã¶ô",spinner2);
		map.put("³ª½Ã°í·©",spinner3);
		map.put("µ¥¹Ì±×¶ó½ºÇÔ¹Ú½ºÅ×ÀÌÅ©",spinner4);
		map.put("°íµî¾îÁ¶¸²µµ½Ã¶ô",spinner5);
		map.put("¸ÅÈ­µµ½Ã¶ô",spinner6);
		map.put("°³³ª¸®µµ½Ã¶ô",spinner7);
		map.put("Áø´Þ·¡µµ½Ã¶ô",spinner8);
		map.put("°í±â°í±âµµ½Ã¶ô",spinner9);
		map.put("ÇÜÄ¡°í±â°í±âµµ½Ã¶ô",spinner10);
		map.put("µ·Ä¡°í±â°í±âµµ½Ã¶ô",spinner11);
		map.put("»õÄ¡°í±â°í±âµµ½Ã¶ô",spinner12);
		map.put("Ä¥¸®Æ÷Å©µµ½Ã¶ô",spinner13);
		map.put("µ·±î½ºµµ·Ã´Ôµµ½Ã¶ô",spinner14);
		map.put("±¹È­µµ½Ã¶ô",spinner15);
		map.put("Ä¡Å²Á¦À°µµ½Ã¶ô",spinner16);
		map.put("µ·Ä¡ºÒ°í±âµµ½Ã¶ô",spinner17);
		map.put("µ¿¹éµµ½Ã¶ô",spinner18);
		map.put("ÇØÇÇ¹Ú½º",spinner19);
		map.put("µµ·Ã´Ôµµ½Ã¶ô",spinner20);
		map.put("µð·°½ºÁ¦À°ººÀ½µµ½Ã¶ô",spinner21);
		map.put("Ä«·¹µµ½Ã¶ô",spinner22);
		map.put("µ·±î½ºÄ«·¹",spinner23);
		map.put("Æú¸®µµ½Ã¶ô",spinner24);
		map.put("Ä¡Å²¿Í»ç¸¶¿ä",spinner25);
		map.put("ÂüÄ¡¿Í»ç¸¶¿ä",spinner26);
		map.put("Ä¡Å²»ø·¯µå¿Í»ç¸¶¿ä",spinner27);
		map.put("ÂüÄ¡»ø·¯µå¿Í»ç¸¶¿ä",spinner28);
		map.put("ºòÄ¡Å²¿Í»ç¸¶¿ä",spinner29);
		map.put("µ·Ä¡¿Í»ç¸¶¿ä",spinner30);
		map.put("Ä¡Å²¸¶¿ä",spinner31);
		map.put("ÂüÄ¡¸¶¿ä",spinner32);
		map.put("Ä¡Å²»ø·¯µå¸¶¿ä",spinner33);
		map.put("ÂüÄ¡»ø·¯µå¸¶¿ä",spinner34);
		map.put("ºòÄ¡Å²¸¶¿ä",spinner35);
		map.put("µ·Ä¡¸¶¿ä",spinner36);
		map.put("µ·±î½ºµ¤¹ä",spinner37);
		map.put("»õ¿ìµ·±î½ºµ¤¹ä",spinner38);
		map.put("±èÄ¡ººÀ½¹ä",spinner39);
		map.put("ºÒ°í±â±èÄ¡ººÀ½¹ä",spinner40);
		map.put("ºÒ´ßºñºö¹ä",spinner41);
		map.put("¿­¹«°­µÈÀåºñºö¹ä",spinner42);
		map.put("ºÒ°í±âºñºö¹ä",spinner43);
		map.put("Á¦À°°­µÈÀåºñºö¹ä",spinner44);
		map.put("ÂüÄ¡¾ßÃ¤°íÃßÀå",spinner45);
		map.put("±èÄ¡Âî°³µµ½Ã¶ô",spinner46);
		map.put("À°°³Àå",spinner47);
		map.put("¹ÝÂù±ñ±ñÄÞºñ",spinner48);
		map.put("¹ÝÂù±ñ¼îÄ¥¸®»õ¿ì",spinner49);
		map.put("¹ÝÂù±ñÇ³±â",spinner50);
		map.put("¹ÝÂùµ¥¹ÌÇÔ¹Ú",spinner51);
		map.put("¹ÝÂù°íµî¾îÁ¶¸²",spinner52);
		map.put("¹ÝÂù¼ø»ì°íµî¾îµ¥¸®¾ß³¢",spinner53);
		map.put("¹ÝÂùºÒ°í±â",spinner54);
		map.put("¹ÝÂù°í±â°í±â",spinner55);
		map.put("¹ÝÂùÁ¦À°ººÀ½",spinner56);
		map.put("¹ÝÂùÄ¡Å²",spinner57);
		map.put("¹ÝÂùµ·±î½ºµµ·Ã´Ô",spinner59);
		map.put("¹ÝÂùÄ¥¸®ÅÁ¼öÀ°",spinner60);
		map.put("¹ÝÂùµ·±î½º",spinner61);
		map.put("±èÄ¡",spinner62);
		map.put("ººÀ½±èÄ¡",spinner63);
		map.put("¹«¸»·©ÀÌ",spinner64);
		map.put("¿­¹«¾ó°¥ÀÌ±èÄ¡",spinner65);
		map.put("¹«»ýÃ¤",spinner66);
		map.put("ÇÑ¼Ü¹ä",spinner67);
		map.put("Çö¹Ì¹ä",spinner68);
		map.put("¿µ¾ç¹ä",spinner69);
		map.put("°í±¸¸¶ºü½º",spinner70);
		map.put("Ä¡Å²BOXwith¹Ý´Þ°¨ÀÚÆ¢±è(´ë)",spinner71);
		map.put("Ä¡Å²BOXwith¹Ý´Þ°¨ÀÚÆ¢±è(Áß)",spinner72);
		map.put("Ä¡Å²BOXwith¹Ý´Þ°¨ÀÚÆ¢±è(¼Ò)",spinner73);
		map.put("Ä¥¸®ÅÁ¼öÀ°BOX (´ë)",spinner74);
		map.put("Ä¥¸®ÅÁ¼öÀ°BOX(Áß)",spinner75);
		map.put("´ß°­Á¤(Áß)",spinner76);
		map.put("´ß°­Á¤(¼Ò)",spinner77);
		map.put("¹Ý´Þ°¨ÀÚÆ¢±è",spinner78);
		map.put("¼öÁ¦°í·ÎÄÉ",spinner79);
		map.put("¸ÅÄÞ±º¸¸µÎ",spinner80);
		map.put("½º³¼¸ðµëÆ¢±è",spinner81);
		map.put("Ä¡Å²»ø·¯µå",spinner82);
		map.put("±×¸°»ø·¯µå",spinner83);
		map.put("¹Ì´Ï»ø·¯µå",spinner84);
		map.put("ººÀ½°íÃßÀå",spinner85);
		map.put("Äá³ª¹°ºÏ¾î±¹",spinner86);
		map.put("½Ã±ÝÄ¡µÈÀå±¹",spinner87);
		map.put("H½ºÆä¼ÈÆ¼Ä«Æä¶ó¶¼",spinner88);
		map.put("°í±¸¸¶»ø·¯µå",spinner89);
		map.put("°¨ÀÚ»ø·¯µå",spinner90);
		map.put("´ÜÈ£¹Ú»ø·¯µå",spinner91);
		
		/*ArrayList<JSpinner> list = new ArrayList<>();
		list.add(spinner);list.add(spinner2);list.add(spinner3);list.add(spinner4);list.add(spinner5);list.add(spinner6);list.add(spinner7);list.add(spinner8);list.add(spinner9);list.add(spinner10);
		list.add(spinner11);list.add(spinner12);list.add(spinner13);list.add(spinner14);list.add(spinner15);list.add(spinner16);list.add(spinner17);list.add(spinner18);list.add(spinner19);list.add(spinner20);
		list.add(spinner21);list.add(spinner22);list.add(spinner23);list.add(spinner24);list.add(spinner25);list.add(spinner26);list.add(spinner27);list.add(spinner28);list.add(spinner29);list.add(spinner30);
		list.add(spinner31);list.add(spinner32);list.add(spinner33);list.add(spinner34);list.add(spinner35);list.add(spinner36);list.add(spinner37);list.add(spinner38);list.add(spinner39);list.add(spinner40);
		list.add(spinner41);list.add(spinner42);list.add(spinner43);list.add(spinner44);list.add(spinner45);list.add(spinner46);list.add(spinner47);list.add(spinner48);list.add(spinner49);list.add(spinner50);
		list.add(spinner51);list.add(spinner52);list.add(spinner53);list.add(spinner54);list.add(spinner55);list.add(spinner56);list.add(spinner57);list.add(spinner59);list.add(spinner60);
		list.add(spinner61);list.add(spinner62);list.add(spinner63);list.add(spinner64);list.add(spinner65);list.add(spinner66);list.add(spinner67);list.add(spinner68);list.add(spinner69);list.add(spinner70);
		list.add(spinner71);list.add(spinner72);list.add(spinner73);list.add(spinner74);list.add(spinner75);list.add(spinner76);list.add(spinner77);list.add(spinner78);list.add(spinner79);list.add(spinner80);
		list.add(spinner81);list.add(spinner82);list.add(spinner83);list.add(spinner84);list.add(spinner85);list.add(spinner86);list.add(spinner87);list.add(spinner88);list.add(spinner89);list.add(spinner90);*/
		
		JButton btnNewButton = new JButton("\uC8FC\uBB38");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean check = true;
				StringBuffer sb = new StringBuffer("ÁÖ¹®ÇÏ½Å »óÇ°Àº ");
				//»óÇ°ÀÌ¸§, »óÇ°°³¼ö¿ë ÇØ½¬¸Ê
				HashMap<String, Integer> hashmap = new HashMap<>();
				
				for (String key : map.keySet()) {
				if(Integer.parseInt(map.get(key).getValue().toString())<0){
					JOptionPane.showMessageDialog(frame, "À¯È¿ÇÏÁö ¾ÊÀº ÁÖ¹®ÀÔ´Ï´Ù.");
					check = false;
					break;
				}else if(Integer.parseInt(map.get(key).getValue().toString())>0) {
						hashmap.put(key,Integer.parseInt(map.get(key).getValue().toString()));
						sb.append(key+" "+ Integer.parseInt(map.get(key).getValue().toString())+"°³, ");
					}
				}//for
				
				sb.deleteCharAt(sb.length()-2);
				sb.append("ÀÔ´Ï´Ù. ¸Â½À´Ï±î?");
			
				if(check) {
					if ((JOptionPane.showConfirmDialog(null, sb.toString(), "ÁÖ¹®È®ÀÎ",
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
						
						//ÁÖ¹®¿äÃ»
						orderDAO.Order(hashmap, myID);
						
						JOptionPane.showMessageDialog(frame, "ÁÖ¹®ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
						frame.dispose();
						
						mainGUI.main(null);
						
					} else {
					    // no option
					}
				}
				
				
				
				
				
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("°íµµ M", Font.PLAIN, 16));
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, timeLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JButton exitButton = new JButton("\uB098\uAC00\uAE30");
		springLayout.putConstraint(SpringLayout.EAST, exitButton, 100, SpringLayout.EAST, btnNewButton);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mainGUI.main(null);
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, exitButton, 0, SpringLayout.NORTH, timeLabel);
		springLayout.putConstraint(SpringLayout.WEST, exitButton, 14, SpringLayout.EAST, btnNewButton);
		exitButton.setFont(new Font("°íµµ M", Font.PLAIN, 16));
		exitButton.setBackground(Color.WHITE);
		frame.getContentPane().add(exitButton);
		
		ImageIcon img = new ImageIcon("D:\\\uC774\uBBF8\uC9C0\\\uACE0\uAD6C\uB9C8\uC0D0\uB7EC\uB4DC.jpg");
		Image img1 = img.getImage();
		img1.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		img = new ImageIcon(img1);
		File fileInSamePackage = new File(path + "background.jpg");
		
		ImageIcon img2 = new ImageIcon("D:\\\uC774\uBBF8\uC9C0\\\uACE0\uAD6C\uB9C8\uC0D0\uB7EC\uB4DC.jpg");
		Image img3 = img2.getImage();
		img3.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		img2 = new ImageIcon(img3);

	}
}
