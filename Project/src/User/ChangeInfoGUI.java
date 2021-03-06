package User;

import java.awt.EventQueue;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import Clock.Clock;
import Start.LoginGUI;

public class ChangeInfoGUI {

	private BufferedImage icon;
	private JLabel label;
	private JTextField nameField;
	private JTextField contactField;
	private JLabel timeLabel;
	private UserVO user;
	private UserDAO dao = new UserDAO();
	private JPasswordField pwField;
	private JPasswordField pwConField;
	private JFrame frame;
	private LoginGUI login = new LoginGUI();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeInfoGUI window = new ChangeInfoGUI();
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
	public ChangeInfoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 522);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JLabel warning = new JLabel("");
		warning.setForeground(Color.RED);

		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				try {
					String path = A.class.getResource("").getPath();// a클래스 위치 가지고오기
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

		String myID = login.getMyID();

		user = dao.viewInfo(myID);

		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		label = new JLabel("\uD68C\uC6D0\uC815\uBCF4\uC218\uC815");
		sl_panel.putConstraint(SpringLayout.NORTH, label, 30, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, label, 44, SpringLayout.WEST, panel);
		label.setFont(new Font("굴림", Font.BOLD, 24));
		label.setForeground(new Color(227, 108, 9));
		panel.add(label);

		JButton cancelButton = new JButton("");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, cancelButton, 395, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, cancelButton, 700, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, cancelButton, -32, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, cancelButton, -69, SpringLayout.EAST, panel);
		cancelButton.setIcon(new ImageIcon(JoinGUI.class.getResource("/User/cancelBt.png")));
		panel.add(cancelButton);

		JRadioButton radioButton_Man = new JRadioButton("\uB0A8\uC790");
		radioButton_Man.setOpaque(false);
		JRadioButton radioButton_Woman = new JRadioButton("\uC5EC\uC790");
		radioButton_Woman.setOpaque(false);

		ButtonGroup group = new ButtonGroup(); // 라디오버튼 그룹화를 위한 버튼그룹 설정
		group.add(radioButton_Man);
		group.add(radioButton_Woman);

		JButton confirmButton = new JButton("");

		sl_panel.putConstraint(SpringLayout.NORTH, confirmButton, 395, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, confirmButton, 562, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, confirmButton, 0, SpringLayout.SOUTH, cancelButton);
		sl_panel.putConstraint(SpringLayout.EAST, confirmButton, -23, SpringLayout.WEST, cancelButton);
		confirmButton.setIcon(new ImageIcon(JoinGUI.class.getResource("/User/cnfrimBt.png")));
		panel.add(confirmButton);

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(new Color(255, 0, 0, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 124, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 259, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, -32, SpringLayout.NORTH, cancelButton);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, -99, SpringLayout.EAST, panel);
		panel.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		JLabel label_2 = new JLabel("\uC544\uC774\uB514");
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_2, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, label_2, 25, SpringLayout.WEST, panel_1);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_3, 26, SpringLayout.SOUTH, label_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, label_3, 0, SpringLayout.WEST, label_2);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		panel_1.add(label_3);

		JLabel label_4 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_4, 58, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, label_4, 169, SpringLayout.EAST, label_3);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(label_4);

		pwField = new JPasswordField();
		pwField.setOpaque(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, pwField, 55, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, pwField, -19, SpringLayout.WEST, label_4);
		panel_1.add(pwField);

		pwConField = new JPasswordField();
		pwConField.setOpaque(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, pwConField, 55, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, pwConField, 26, SpringLayout.EAST, label_4);
		sl_panel_1.putConstraint(SpringLayout.EAST, pwConField, 142, SpringLayout.EAST, label_4);
		panel_1.add(pwConField);

		JLabel label_5 = new JLabel("\uC774\uB984");
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_5, 32, SpringLayout.SOUTH, label_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, label_5, 0, SpringLayout.WEST, label_2);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(label_5);

		nameField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, pwField, 0, SpringLayout.WEST, nameField);
		nameField.setOpaque(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, nameField, -3, SpringLayout.NORTH, label_5);
		sl_panel_1.putConstraint(SpringLayout.WEST, nameField, 60, SpringLayout.EAST, label_5);
		nameField.setColumns(10);
		panel_1.add(nameField);

		JLabel label_6 = new JLabel("\uC5F0\uB77D\uCC98");
		sl_panel_1.putConstraint(SpringLayout.WEST, label_6, 0, SpringLayout.WEST, label_2);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, label_6, -71, SpringLayout.SOUTH, panel_1);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(label_6);

		contactField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, contactField, 0, SpringLayout.WEST, pwField);
		sl_panel_1.putConstraint(SpringLayout.EAST, contactField, 116, SpringLayout.WEST, pwField);
		contactField.setOpaque(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, contactField, 150, SpringLayout.NORTH, panel_1);
		contactField.setColumns(10);
		panel_1.add(contactField);

		JLabel label_1 = new JLabel("\uC131\uBCC4");
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_1, 13, SpringLayout.SOUTH, label_6);
		sl_panel_1.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, label_2);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, label_1, -30, SpringLayout.SOUTH, panel_1);
		label_1.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(label_1);

		JPanel panel_3 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 0, SpringLayout.NORTH, label_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, 60, SpringLayout.EAST, label_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_3, 0, SpringLayout.SOUTH, label_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, -293, SpringLayout.EAST, panel_1);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));

		panel_3.add(radioButton_Man);
		panel_3.add(radioButton_Woman);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 7, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, label);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, 10, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, -55, SpringLayout.EAST, panel);
		panel.add(panel_2);

		timeLabel = new JLabel("");
		sl_panel.putConstraint(SpringLayout.WEST, timeLabel, -270, SpringLayout.EAST, panel);
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("나눔바른고딕 Light", Font.ITALIC, 14));
		sl_panel.putConstraint(SpringLayout.NORTH, timeLabel, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, timeLabel, 39, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, timeLabel, -10, SpringLayout.EAST, panel);
		panel.add(timeLabel);

		Clock clock = new Clock(timeLabel);

		warning.setHorizontalAlignment(SwingConstants.CENTER);
		warning.setFont(new Font("고도 M", Font.PLAIN, 16));
		sl_panel.putConstraint(SpringLayout.NORTH, warning, 32, SpringLayout.SOUTH, panel_1);
		sl_panel.putConstraint(SpringLayout.WEST, warning, 0, SpringLayout.WEST, panel_1);

		JLabel idLabel = new JLabel("");
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel_1.putConstraint(SpringLayout.NORTH, idLabel, 14, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, idLabel, 48, SpringLayout.EAST, label_2);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, idLabel, 35, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, idLabel, 164, SpringLayout.EAST, label_2);
		panel_1.add(idLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, warning, 0, SpringLayout.SOUTH, cancelButton);
		sl_panel.putConstraint(SpringLayout.EAST, warning, -30, SpringLayout.WEST, confirmButton);
		panel.add(warning);

		idLabel.setText(login.getMyID());
		nameField.setText(user.getName());
		contactField.setText(user.getContact());
		radioButton_Man.setEnabled(user.getGender().equals("남"));
		radioButton_Woman.setEnabled(user.getGender().equals("여"));

		passwordField = new JPasswordField();
		passwordField.setOpaque(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, passwordField, 14, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, passwordField, 35, SpringLayout.NORTH, panel_1);
		panel_1.add(passwordField);

		JLabel label_7 = new JLabel("\uAE30\uC874 \uBE44\uBC00\uBC88\uD638");
		sl_panel_1.putConstraint(SpringLayout.WEST, passwordField, 26, SpringLayout.EAST, label_7);
		sl_panel_1.putConstraint(SpringLayout.EAST, passwordField, 142, SpringLayout.EAST, label_7);
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_7, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, label_7, 0, SpringLayout.WEST, label_4);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, label_7, 38, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, label_7, 0, SpringLayout.EAST, label_4);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(label_7);
		
		JPanel panel_4 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_4, -61, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_4, 44, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_4, -32, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_4, 125, SpringLayout.WEST, panel);
		panel.add(panel_4);
		
		JButton closeAccountButton = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		closeAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pw = String.valueOf(passwordField.getPassword());
				String pw1 = String.valueOf(pwField.getPassword());
				String pw2 = String.valueOf(pwConField.getPassword());
				if (!(pw.equals(user.getPassword()))) {
					warning.setText("비밀번호가 틀립니다.");
				}else {
					// yes option
					if (JOptionPane.showConfirmDialog(null, "정말 탈퇴하실건가요?", "ㅠ_ㅠ",
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						
						dao.closeAccount(myID);
						
						JOptionPane.showMessageDialog(frame, "탈퇴가 완료되었습니다.");
						System.exit(0);
						
					} else {
					    // no option
					}

				}
				
			}
		});
		closeAccountButton.setFont(new Font("고도 M", Font.PLAIN, 12));
		panel_4.add(closeAccountButton);

		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pw = String.valueOf(passwordField.getPassword());
				String pw1 = String.valueOf(pwField.getPassword());
				String pw2 = String.valueOf(pwConField.getPassword());
				
				//전화번호 유효검사
				boolean contactCheck = dao.checkInputOnlyNumber(contactField.getText());
				//이름 유효검사
				boolean nameCheck = dao.isHangulSyllables(nameField.getText());
				
				if (contactField.getText().equals("") || pw.equals("") || pw1.equals("") || pw2.equals("")
						|| nameField.getText().equals("") || contactField.getText().equals("")) {
					warning.setText("빈 항목이 있습니다.");
				} else if(!(contactField.getText().length()>=9 && contactField.getText().length()<=11)){
					warning.setText("전화번호를 확인하세요.");
				}else if((!radioButton_Man.isSelected()) && (!radioButton_Woman.isSelected())){
					warning.setText("성별을 선택하세요.");
				}else if(!nameCheck){
					warning.setText("잘못된 이름입니다.");
				}else if (!(pw.equals(user.getPassword()))) {
					warning.setText("비밀번호가 틀립니다.");
				} else if (!(pw1.equals(pw2))) {
					warning.setText("변경할 비밀번호가 일치하지 않습니다.");
				} else if(pw.equals(pw1)){
					warning.setText("기존 비밀번호와 같습니다.");
				}else if(pw1.length()<4){
					warning.setText("비밀번호는 최소 4자리 이상입니다.");
				}else if(!contactCheck) {
					warning.setText("전화번호는 '-'없는 숫자입니다.");
				}else {

					user = new UserVO(user.getUserNumber(), user.getUserType(), user.getId(), pw1, nameField.getText(),
							contactField.getText(), user.getGender());

					dao.ChangeInfo(user);

					JOptionPane.showMessageDialog(frame, "수정이 완료되었습니다.");
					frame.dispose();
				}
			}

		});

	}
}
