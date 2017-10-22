package User;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import Main.Clock;

import javax.swing.JPasswordField;

public class JoinGUI {

	private JFrame frame;
	private BufferedImage icon;
	private JLabel label;
	private JTextField idField;
	private JTextField nameField;
	private JTextField contactField;
	private JLabel timeLabel;
	private UserVO user = new UserVO();
	private UserDAO dao = new UserDAO();
	private boolean checkID = false;
	private JPasswordField pwField;
	private JPasswordField pwConField;
	private String joinID;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinGUI window = new JoinGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JoinGUI() {
		initialize();
	}

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
					File fileInSamePackage = new File(path + "BackGround4.jpg");
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
		sl_panel.putConstraint(SpringLayout.WEST, warning, 259, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, warning, -32, SpringLayout.SOUTH, panel);
		panel.setLayout(sl_panel);

		label = new JLabel("\uD68C\uC6D0\uAC00\uC785");
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
		radioButton_Man.setBackground(new Color(255, 255, 255));
		JRadioButton radioButton_Woman = new JRadioButton("\uC5EC\uC790");
		radioButton_Woman.setBackground(new Color(255, 255, 255));

		ButtonGroup group = new ButtonGroup(); // 라디오버튼 그룹화를 위한 버튼그룹 설정
		group.add(radioButton_Man);
		group.add(radioButton_Woman);

		JButton idCheck = new JButton("\uC911\uBCF5\uAC80\uC0AC");
		idCheck.setBackground(Color.WHITE);
		idCheck.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		idCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idField.getText().length()<=0) {
					warning.setText("아이디를 입력해주세요.");
				}else {
					char ch = idField.getText().charAt(0);
					char[] array = idField.getText().toCharArray();
					// 아이디 중복검사 실행
					checkID = dao.isPossibleJoin(idField.getText());
					// 아이디 영문/숫자검사 
					boolean checkID2 = dao.checkInputOnlyNumberAndAlphabet(idField.getText());
					
					if(idField.getText().equals("")) {
						warning.setText("아이디를 입력해주세요.");
						checkID=false;
					}else if (!(Character.isLowerCase(ch))) {
						warning.setText("ID는 영어 소문자로 시작해야 합니다.");
						checkID=false;
					}else if(array.length>10 || array.length<4) {
						warning.setText("4자 이상, 10자 이하로 설정해주세요.");
						checkID=false;
					}else if(!checkID2) {
						warning.setText("ID는 영소문자와 숫자로만 가능합니다.");
						checkID=false;
					}else if(!checkID) {
						warning.setText("이미 존재하는 아이디입니다.");
						checkID=false;
					}else {
						warning.setText("사용가능한 아이디입니다.");
						checkID =true;
						joinID = idField.getText();
					}
				}
				
				
				
				
			}
		});

		JButton confirmButton = new JButton("");
		sl_panel.putConstraint(SpringLayout.EAST, warning, -30, SpringLayout.WEST, confirmButton);
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String pw = String.valueOf(pwField.getPassword());
				String pw1 = String.valueOf(pwConField.getPassword());
				
				//전화번호 유효검사
				boolean contactCheck = dao.checkInputOnlyNumber(contactField.getText());
				//이름 유효검사
				boolean nameCheck = dao.isHangulSyllables(nameField.getText());
				
				// 성별
				String gender = "";
				if (radioButton_Man.isSelected()) {
					gender = "남";
				} else if (radioButton_Woman.isSelected()) {
					gender = "여";

				}
				if (idField.getText().equals("") || contactField.getText().equals("") || pw.equals("") || pw1.equals("")
						|| nameField.getText().equals("") || contactField.getText().equals("")) {
					warning.setText("빈 항목이 있습니다.");
				} else if (!checkID) {
					warning.setText("아이디 중복검사를 해주세요.");
				} else if (!(pw.equals(pw1))) {
					warning.setText("비밀번호가 일치하지 않습니다.");
				} else if(pw.length()<4){
					warning.setText("비밀번호를 4자리 이상 설정해주세요.");
				}else if(!contactCheck){
						warning.setText("전화번호를 확인하세요.");
				}else if((!radioButton_Man.isSelected()) && (!radioButton_Woman.isSelected())){
					warning.setText("성별을 선택하세요.");
				}else if(!nameCheck){
					warning.setText("잘못된 이름입니다.");
				}else if(!joinID.equals(idField.getText())){
					warning.setText("아이디 중복검사를 다시 하세요.");
				}else {

					user = new UserVO(user.getUserNumber(), "일반", idField.getText(), pw, nameField.getText(),
							contactField.getText(), gender);
					dao.join(user);
					JOptionPane.showMessageDialog(frame, "가입완료, 로그인 해주세요.");
					frame.dispose();
				}
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, confirmButton, 395, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, confirmButton, 562, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, confirmButton, 0, SpringLayout.SOUTH, cancelButton);
		sl_panel.putConstraint(SpringLayout.EAST, confirmButton, -23, SpringLayout.WEST, cancelButton);
		confirmButton.setIcon(new ImageIcon(JoinGUI.class.getResource("/User/cnfrimBt.png")));
		panel.add(confirmButton);

		JPanel panel_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, warning, 30, SpringLayout.SOUTH, panel_1);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, warning);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 126, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, -30, SpringLayout.NORTH, cancelButton);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, cancelButton);
		panel_1.setBackground(new Color(255, 0, 0, 0));
		panel.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		sl_panel_1.putConstraint(SpringLayout.EAST, idCheck, -225, SpringLayout.EAST, panel_1);
		panel_1.setLayout(sl_panel_1);

		JLabel label_2 = new JLabel("\uC544\uC774\uB514");
		sl_panel_1.putConstraint(SpringLayout.NORTH, idCheck, -2, SpringLayout.NORTH, label_2);
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_2, 10, SpringLayout.NORTH, panel_1);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("나눔고딕", Font.BOLD, 14));
		panel_1.add(label_2);

		idField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, idField, -2, SpringLayout.NORTH, label_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, idField, 34, SpringLayout.EAST, label_2);
		idField.setHorizontalAlignment(SwingConstants.CENTER);
		idField.setColumns(10);
		panel_1.add(idField);

		JLabel label_3 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_3, 30, SpringLayout.SOUTH, label_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, label_3, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, label_2, 0, SpringLayout.EAST, label_3);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("나눔고딕", Font.BOLD, 14));
		panel_1.add(label_3);

		JLabel label_4 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		sl_panel_1.putConstraint(SpringLayout.WEST, idCheck, 0, SpringLayout.WEST, label_4);
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_4, 0, SpringLayout.NORTH, label_3);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("나눔고딕", Font.BOLD, 14));
		panel_1.add(label_4);

		pwField = new JPasswordField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, pwField, -2, SpringLayout.NORTH, label_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, pwField, 34, SpringLayout.EAST, label_3);
		sl_panel_1.putConstraint(SpringLayout.EAST, pwField, -31, SpringLayout.WEST, label_4);
		panel_1.add(pwField);

		pwConField = new JPasswordField();
		sl_panel_1.putConstraint(SpringLayout.EAST, label_4, -23, SpringLayout.WEST, pwConField);
		sl_panel_1.putConstraint(SpringLayout.NORTH, pwConField, -2, SpringLayout.NORTH, label_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, pwConField, 348, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, pwConField, -92, SpringLayout.EAST, panel_1);
		panel_1.add(pwConField);

		JLabel label_5 = new JLabel("\uC774\uB984");
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_5, 28, SpringLayout.SOUTH, label_3);
		sl_panel_1.putConstraint(SpringLayout.EAST, label_5, 0, SpringLayout.EAST, label_2);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("나눔고딕", Font.BOLD, 14));
		panel_1.add(label_5);

		nameField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, nameField, -2, SpringLayout.NORTH, label_5);
		sl_panel_1.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, idField);
		nameField.setColumns(10);
		panel_1.add(nameField);

		JLabel label_6 = new JLabel("\uC5F0\uB77D\uCC98");
		sl_panel_1.putConstraint(SpringLayout.EAST, label_6, 0, SpringLayout.EAST, label_2);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("나눔고딕", Font.BOLD, 14));
		panel_1.add(label_6);

		contactField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, contactField, -2, SpringLayout.NORTH, label_6);
		sl_panel_1.putConstraint(SpringLayout.WEST, contactField, 0, SpringLayout.WEST, idField);
		sl_panel_1.putConstraint(SpringLayout.EAST, contactField, 0, SpringLayout.EAST, idField);
		contactField.setColumns(10);
		panel_1.add(contactField);

		JLabel label_1 = new JLabel("\uC131\uBCC4");
		sl_panel_1.putConstraint(SpringLayout.NORTH, label_1, 181, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, label_6, -13, SpringLayout.NORTH, label_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, label_1, -30, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, label_1, 0, SpringLayout.EAST, label_2);
		label_1.setFont(new Font("나눔고딕", Font.BOLD, 14));
		panel_1.add(label_1);

		JPanel panel_3 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 181, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, idField);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_3, 0, SpringLayout.SOUTH, label_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, idField);
		panel_3.setOpaque(false);
		panel_3.setBackground(new Color(255, 255, 255));
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
		panel_1.add(idCheck);
		panel.add(warning);
		



	}
}
