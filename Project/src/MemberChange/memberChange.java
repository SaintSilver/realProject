package MemberChange;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class memberChange {
	
	private BufferedImage icon;

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_number;
	private JPasswordField txt_passwd;
	private JPasswordField txt_passwd2;
	private UserVO user = new UserVO();
	private boolean checkID = true;
	private JLabel lbl_warning;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberChange window = new memberChange();
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
	public memberChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1020, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel() {
			

			public void paintComponent(Graphics g) {
	            try {
	                String path = C.class.getResource("").getPath();//a클래스 위치 가지고오기
	                File fileInSamePackage = new File(path + "background10.jpg");
	                icon = ImageIO.read(fileInSamePackage);
	                Dimension d = getSize();// 전체화면
	                g.drawImage(icon, 0, 0, d.width, d.height, null);
	                setOpaque(false);
	                super.paintComponent(g);
	             } catch (IOException e) {
	                e.printStackTrace();
	             }
          }
		};
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		
		
		JPanel panel_15 = new JPanel();		
		panel_15.setBackground(new Color(255, 255, 255));
		panel.add(panel_15);
		panel_15.setLayout(new CardLayout(0, 0));
		
		
		
		JLabel lbl_warning = new JLabel("");
		lbl_warning.setForeground(new Color(255, 0, 0));
		lbl_warning.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lbl_warning, "name_16166810697614");
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		sl_panel.putConstraint(SpringLayout.WEST, panel_15, 0, SpringLayout.WEST, panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 129, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, 361, SpringLayout.WEST, panel);
		panel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_id = new JLabel("아이디");
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setHorizontalTextPosition(SwingConstants.LEFT);
		lbl_id.setBackground(new Color(255, 255, 255));
		panel_1.add(lbl_id, "name_6276979150165");
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setForeground(new Color(0, 0, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 179, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, -320, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, panel_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, -21, SpringLayout.NORTH, panel_2);
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 248, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, 361, SpringLayout.WEST, panel);
		panel.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_passwd = new JLabel("비밀번호");
		lbl_passwd.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lbl_passwd, "name_6318912461603");
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBackground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_3, 225, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_3, 248, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_3, -643, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_3, 46, SpringLayout.SOUTH, panel_2);
		panel.add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_name = new JLabel("이름");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lbl_name, "name_6374285422864");
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setBackground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_4, 17, SpringLayout.SOUTH, panel_3);
		sl_panel.putConstraint(SpringLayout.WEST, panel_4, 248, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_4, 46, SpringLayout.SOUTH, panel_3);
		sl_panel.putConstraint(SpringLayout.EAST, panel_4, 361, SpringLayout.WEST, panel);
		panel.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_number = new JLabel("연락처");
		lbl_number.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lbl_number, "name_6396828168165");
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setBackground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_5, 0, SpringLayout.NORTH, panel_2);
		sl_panel.putConstraint(SpringLayout.WEST, panel_5, 178, SpringLayout.EAST, panel_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_5, 0, SpringLayout.SOUTH, panel_2);
		sl_panel.putConstraint(SpringLayout.EAST, panel_5, 281, SpringLayout.EAST, panel_2);
		panel.add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_passwd2 = new JLabel("비밀번호 확인");
		lbl_passwd2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_passwd2.setBackground(new Color(255, 255, 255));
		panel_5.add(lbl_passwd2, "name_6544355819733");
				
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_15, 54, SpringLayout.SOUTH, panel_6);
		panel_6.setBackground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_6, 20, SpringLayout.SOUTH, panel_4);
		sl_panel.putConstraint(SpringLayout.WEST, panel_6, 248, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_6, 49, SpringLayout.SOUTH, panel_4);
		sl_panel.putConstraint(SpringLayout.EAST, panel_6, 361, SpringLayout.WEST, panel);
		panel.add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("성별");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_2, "name_6604712353056");
		
		JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setBackground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_7, 0, SpringLayout.NORTH, panel_6);
		sl_panel.putConstraint(SpringLayout.WEST, panel_7, 18, SpringLayout.EAST, panel_6);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_7, 0, SpringLayout.SOUTH, panel_6);
		sl_panel.putConstraint(SpringLayout.EAST, panel_7, 167, SpringLayout.EAST, panel_6);
		panel.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		JRadioButton rdbtn_men = new JRadioButton("남자");
		rdbtn_men.setOpaque(false);
		rdbtn_men.setBackground(new Color(255, 255, 255));
		panel_7.add(rdbtn_men);
		
		JRadioButton rdbtn_woman = new JRadioButton("여자");
		rdbtn_woman.setOpaque(false);
		rdbtn_woman.setBackground(new Color(255, 255, 255));
		panel_7.add(rdbtn_woman);
		
		JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_8.setBackground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_8, 129, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_8, 18, SpringLayout.EAST, panel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_8, 158, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_8, 155, SpringLayout.EAST, panel_1);
		panel.add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setOpaque(false);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_9, 21, SpringLayout.SOUTH, panel_8);
		sl_panel.putConstraint(SpringLayout.WEST, panel_9, 18, SpringLayout.EAST, panel_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_9, 50, SpringLayout.SOUTH, panel_8);
		sl_panel.putConstraint(SpringLayout.EAST, panel_9, 155, SpringLayout.EAST, panel_2);
		panel.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setOpaque(false);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_10, 0, SpringLayout.NORTH, panel_2);
		sl_panel.putConstraint(SpringLayout.WEST, panel_10, 17, SpringLayout.EAST, panel_5);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_10, 208, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_10, 166, SpringLayout.EAST, panel_5);
		panel.add(panel_10);
		panel_10.setLayout(new CardLayout(0, 0));
		
		txt_passwd2 = new JPasswordField();
		txt_passwd2.setOpaque(false);
		panel_10.add(txt_passwd2, "name_6902535735890");
		
		JPanel panel_11 = new JPanel();
		panel_11.setOpaque(false);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_11, 17, SpringLayout.SOUTH, panel_9);
		sl_panel.putConstraint(SpringLayout.WEST, panel_11, 18, SpringLayout.EAST, panel_3);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_11, 46, SpringLayout.SOUTH, panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		txt_passwd = new JPasswordField();
		txt_passwd.setOpaque(false);
		panel_9.add(txt_passwd, "name_7498540547785");
		sl_panel.putConstraint(SpringLayout.EAST, panel_11, 155, SpringLayout.EAST, panel_3);
		panel.add(panel_11);
		panel_11.setLayout(new CardLayout(0, 0));
		
		txt_name = new JTextField();
		txt_name.setOpaque(false);
		panel_11.add(txt_name, "name_6803061208959");
		txt_name.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setOpaque(false);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_12, 17, SpringLayout.SOUTH, panel_11);
		sl_panel.putConstraint(SpringLayout.WEST, panel_12, 0, SpringLayout.WEST, panel_7);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_12, 46, SpringLayout.SOUTH, panel_11);
		sl_panel.putConstraint(SpringLayout.EAST, panel_12, 0, SpringLayout.EAST, panel_8);
		
		JLabel lbl_id2 = new JLabel("");
		user.getId();
		lbl_id2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lbl_id2, "name_7503821443707");
		panel.add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));
		
		txt_number = new JTextField();
		txt_number.setOpaque(false);
		panel_12.add(txt_number, "name_6827755750367");
		txt_number.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_13.setOpaque(false);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_15, 0, SpringLayout.SOUTH, panel_13);
		sl_panel.putConstraint(SpringLayout.EAST, panel_15, -66, SpringLayout.WEST, panel_13);
		panel_13.setForeground(new Color(255, 140, 0));
		panel_13.setBackground(new Color(255, 127, 80));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_13, -125, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_13, 642, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_13, -79, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_13, -250, SpringLayout.EAST, panel);
		panel.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setOpaque(false);
		panel_14.setForeground(new Color(105, 105, 105));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_14, 195, SpringLayout.SOUTH, panel_10);
		sl_panel.putConstraint(SpringLayout.WEST, panel_14, 6, SpringLayout.EAST, panel_13);
		panel_13.setLayout(new CardLayout(0, 0));

		
		JButton btn_enter = new JButton("확인");
		btn_enter.addActionListener(new ActionListener() {			
			

			public void actionPerformed(ActionEvent e) {

				//비밀번호
				String pw = String.valueOf(txt_passwd.getPassword());			
				String pw1 = String.valueOf(txt_passwd2.getPassword());
				
				String gender = "";
				
				if(rdbtn_men.isSelected()) {
					gender = "남";
				}else if(rdbtn_woman.isSelected()) {
					gender = "여";
				}
				if(txt_number.getText().equals("") || txt_passwd.equals("")|| txt_passwd2.equals("") || txt_name.getText().equals("")|| txt_number.getText().equals("")) {
					lbl_warning.setText("빈 항목이 있습니다.");
				}else if(!(pw.equals(pw1))) {
					lbl_warning.setText("비밀번호가 일치하지 않습니다.");
				}else {
					user = new UserVO(user.getUserNumber(), "일반" , lbl_id2.getText(), pw, txt_name.getText(), txt_number.getText(), gender);
				}									
			}
		});
		
			
			
		
		
		btn_enter.setBackground(new Color(255, 140, 0));
		btn_enter.setForeground(new Color(255, 255, 255));
		btn_enter.setFont(new Font("굴림", Font.BOLD, 18));
		panel_13.add(btn_enter, "name_9103650849182");
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_14, -79, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_14, -131, SpringLayout.EAST, panel);
		panel.add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));
		
		JButton btn_cancel = new JButton("취소");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_cancel.setForeground(new Color(255, 255, 255));
		btn_cancel.setBackground(new Color(105, 105, 105));
		btn_cancel.setFont(new Font("굴림", Font.BOLD, 18));
		panel_14.add(btn_cancel, "name_9106058731321");
		
		
		
		
		
		
		
	}
}
