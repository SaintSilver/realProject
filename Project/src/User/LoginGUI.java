package User;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import Main.Clock;
import Main.MainGUI;

import javax.swing.JPasswordField;

public class LoginGUI {
	
	private JFrame frame;
	private BufferedImage icon;
	private JTextField idField;
	private JLabel lblLogin;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private UserDAO dao = new UserDAO();
	private JLabel lblNewLabel_3;
	private JLabel timeLabel;
	private static String myID;
	private JPasswordField pwField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//로그인한 아이디
	public String getMyID() {
		return myID;
	}

	public LoginGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
	            try {
	                String path = A.class.getResource("").getPath();//a클래스 위치 가지고오기
	                File fileInSamePackage = new File(path + "BackGround.jpg");
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
		
	
		JPanel panel_2 = new JPanel() {
			

			public void paintComponent(Graphics g) {
	            try {
	                String path = A.class.getResource("").getPath();//a클래스 위치 가지고오기
	                File fileInSamePackage = new File(path + "loginbutton.png");
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
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 149, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 38, SpringLayout.WEST, panel);
		panel.add(panel_2);
		
		JButton LoginButton = new JButton("");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pw = String.valueOf(pwField.getPassword());
				//로그인
				boolean login = dao.login(idField.getText().trim(), pw);
				
				if(login) {
					JOptionPane.showMessageDialog(frame, idField.getText().trim()+"님, 환영합니다.");
					//새창 띄우고, 로그인 창 닫기
					myID = idField.getText();
					MainGUI main = new MainGUI();
					main.main(null);
					
					frame.dispose();
					
				}else {
					lblNewLabel_3.setText("아이디 또는 비밀번호를 확인해주세요.");
				}
			}
		});
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, 0, SpringLayout.SOUTH, LoginButton);
		sl_panel.putConstraint(SpringLayout.NORTH, LoginButton, 149, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, LoginButton, -115, SpringLayout.EAST, panel);
		LoginButton.setIcon(new ImageIcon(LoginGUI.class.getResource("/User/loginbt.png")));
		panel.add(LoginButton);
		
		JButton JoinButton = new JButton("");
		JoinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//회원가입 새창 띄우기
				JoinGUI join = new JoinGUI();
				join.main(null);
				
				
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, JoinButton, 274, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, LoginButton, -16, SpringLayout.NORTH, JoinButton);
		sl_panel.putConstraint(SpringLayout.WEST, JoinButton, 644, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, JoinButton, -155, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, JoinButton, -115, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, LoginButton, 0, SpringLayout.WEST, JoinButton);
		JoinButton.setIcon(new ImageIcon(LoginGUI.class.getResource("/User/joinbt.png")));
		panel.add(JoinButton);
		
		idField = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, idField, 497, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, idField, 151, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, idField, -289, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, idField, -20, SpringLayout.WEST, LoginButton);
		panel.add(idField);
		idField.setColumns(10);
		
		pwField = new JPasswordField();
		sl_panel.putConstraint(SpringLayout.WEST, pwField, 0, SpringLayout.WEST, idField);
		sl_panel.putConstraint(SpringLayout.EAST, pwField, 0, SpringLayout.EAST, idField);
		panel.add(pwField);
		
		lblLogin = new JLabel("\uD55C\uC1A5 \uB85C\uADF8\uC778");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, -34, SpringLayout.WEST, lblLogin);
		sl_panel.putConstraint(SpringLayout.WEST, lblLogin, 175, SpringLayout.WEST, panel);
		lblLogin.setFont(new Font("굴림", Font.BOLD, 24));
		lblLogin.setForeground(new Color(227, 108, 9));
		panel.add(lblLogin);
		
		lblNewLabel = new JLabel("\uC6B0\uB9AC\uB294 \uD55C\uC1A5\uBC25\uBA39\uB294 \uC0AC\uC774!");
		sl_panel.putConstraint(SpringLayout.NORTH, pwField, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 218, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 34, SpringLayout.EAST, panel_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblLogin, -26, SpringLayout.NORTH, lblNewLabel);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 171, SpringLayout.NORTH, panel);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -47, SpringLayout.WEST, idField);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -66, SpringLayout.WEST, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		sl_panel.putConstraint(SpringLayout.SOUTH, pwField, -16, SpringLayout.NORTH, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 37, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -166, SpringLayout.SOUTH, panel);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("고도 M", Font.PLAIN, 20));
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblLogin);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, idField);
		panel.add(lblNewLabel_3);
		
		timeLabel = new JLabel("\"\"");
		sl_panel.putConstraint(SpringLayout.WEST, timeLabel, -270, SpringLayout.EAST, panel);
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("나눔바른고딕 Light", Font.ITALIC, 14));
		sl_panel.putConstraint(SpringLayout.NORTH, timeLabel, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, timeLabel, 39, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, timeLabel, -10, SpringLayout.EAST, panel);
		panel.add(timeLabel);
		
		Clock clock = new Clock(timeLabel);
		
	}
}
