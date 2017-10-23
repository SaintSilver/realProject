package Main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import Order.OrderDAO;
import Order.OrderVO;
import Start.LoginGUI;
import User.UserDAO;
import User.UserVO;

public class ReorderGUI {

	private JFrame frame;
	private JTextField count_textField;
	private MainGUI main = new MainGUI();
	private LoginGUI login = new LoginGUI();
	private OrderDAO dao = new OrderDAO();
	private String myID = login.getMyID();
	private ArrayList<OrderVO> list = dao.TodayMyOrder();
	private UserDAO userDAO = new UserDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReorderGUI window = new ReorderGUI();
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
	public ReorderGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 260, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("고도 M", Font.PLAIN, 12));
		comboBox.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox, 36, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(comboBox);

		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 6, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel);

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 122, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);

		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 74, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, panel_2);
		panel_2.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -238, SpringLayout.SOUTH, frame.getContentPane());
		panel.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("고도 M", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_30161581559921");
		frame.getContentPane().add(panel_2);

		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 74, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -6, SpringLayout.WEST, panel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -6, SpringLayout.NORTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -238, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, -10, SpringLayout.EAST, frame.getContentPane());
		panel_1.setLayout(new CardLayout(0, 0));
		frame.getContentPane().add(panel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_4, 6, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.WEST, panel_4, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_4, -201, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_4, 0, SpringLayout.EAST, panel);
		panel_2.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("고도 M", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1, "name_30163389442269");
		frame.getContentPane().add(panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel_5, 6, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, panel_5, 122, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_5, -201, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_5, 0, SpringLayout.EAST, panel_1);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLabel name_Field = new JLabel("");
		name_Field.setFont(new Font("고도 M", Font.PLAIN, 13));
		name_Field.setForeground(Color.LIGHT_GRAY);
		panel_3.add(name_Field, "name_777899755573363");
		frame.getContentPane().add(panel_5);

		JPanel panel_6 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_6, 10, SpringLayout.WEST, frame.getContentPane());
		panel_6.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_6, 6, SpringLayout.SOUTH, panel_4);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_6, -164, SpringLayout.SOUTH, frame.getContentPane());
		panel_4.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_2 = new JLabel("\uBA54\uB274");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("고도 M", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2, "name_30164597388186");
		frame.getContentPane().add(panel_6);

		JPanel panel_7 = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel_6, -6, SpringLayout.WEST, panel_7);
		springLayout.putConstraint(SpringLayout.NORTH, panel_7, 6, SpringLayout.SOUTH, panel_5);
		springLayout.putConstraint(SpringLayout.WEST, panel_7, 122, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_7, -164, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_7, 0, SpringLayout.EAST, panel_1);
		panel_5.setLayout(new CardLayout(0, 0));

		JLabel menu_Field = new JLabel("");
		menu_Field.setFont(new Font("고도 M", Font.PLAIN, 13));
		menu_Field.setForeground(Color.LIGHT_GRAY);
		menu_Field.setBackground(Color.WHITE);
		panel_5.add(menu_Field, "name_30601856045405");
		frame.getContentPane().add(panel_7);

		JPanel panel_8 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_8, 10, SpringLayout.WEST, frame.getContentPane());
		panel_8.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_8, 6, SpringLayout.SOUTH, panel_6);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_8, -127, SpringLayout.SOUTH, frame.getContentPane());
		panel_6.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_3 = new JLabel("\uAC1C\uC218");
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("고도 M", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_3, "name_30165861675869");
		frame.getContentPane().add(panel_8);

		JPanel panel_9 = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel_8, -6, SpringLayout.WEST, panel_9);
		springLayout.putConstraint(SpringLayout.NORTH, panel_9, 6, SpringLayout.SOUTH, panel_7);
		springLayout.putConstraint(SpringLayout.WEST, panel_9, 0, SpringLayout.WEST, panel_1);
		
		JLabel id_Field = new JLabel("");
		id_Field.setFont(new Font("고도 M", Font.PLAIN, 13));
		id_Field.setForeground(Color.LIGHT_GRAY);
		panel_1.add(id_Field, "name_777894700755212");
		springLayout.putConstraint(SpringLayout.EAST, panel_9, -10, SpringLayout.EAST, frame.getContentPane());
		panel_7.setLayout(new CardLayout(0, 0));

		count_textField = new JTextField();
		count_textField.setFont(new Font("고도 M", Font.PLAIN, 13));
		panel_7.add(count_textField, "name_30292724560962");
		count_textField.setColumns(10);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new CardLayout(0, 0));

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.SOUTH, panel_9, -46, SpringLayout.NORTH, panel_10);
		
		JLabel time_Field = new JLabel("");
		time_Field.setFont(new Font("고도 M", Font.PLAIN, 13));
		time_Field.setBackground(Color.LIGHT_GRAY);
		panel_9.add(time_Field, "name_777922482405068");
		springLayout.putConstraint(SpringLayout.NORTH, panel_10, 262, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_10, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_10, 10, SpringLayout.WEST, frame.getContentPane());
		panel_8.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_4 = new JLabel("\uC8FC\uBB38\uC2DC\uAC01");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("고도 M", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_4, "name_30169053020778");
		springLayout.putConstraint(SpringLayout.EAST, panel_10, 234, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new GridLayout(0, 3, 0, 0));

		JButton btnNewButton = new JButton("\uC0AD\uC81C");

		btnNewButton.setFont(new Font("고도 M", Font.PLAIN, 18));
		panel_10.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uC218\uC815");

		btnNewButton_1.setFont(new Font("고도 M", Font.PLAIN, 18));
		panel_10.add(btnNewButton_1);

		JButton button = new JButton("\uC885\uB8CC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				main.main(null);
				
				
			}
		});
		button.setFont(new Font("고도 M", Font.PLAIN, 18));
		panel_10.add(button);
		
		
		// 주문리스트
		for (int i = 0; i < list.size(); i++) {
			comboBox.addItem(list.get(i).getItem());
		}
		
		String item = comboBox.getSelectedItem().toString();
		UserVO user = userDAO.viewInfo(myID);
		int count = 0;
		String time= "";

		// 주문리스트
		for (int i = 0; i < list.size(); i++) {
			if(item.equals(list.get(i).getItem())) {
				count = list.get(i).getEa();
				time = list.get(i).getTime();
			}
		}

		id_Field.setText(myID);
		name_Field.setText(user.getName());
		menu_Field.setText(item);
		count_textField.setText(String.valueOf(count));
		time_Field.setText(time.substring(5));

		comboBox.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				// 선택되면 아이디에 맞는 회원정보 가져오기
				String item = comboBox.getSelectedItem().toString();
				UserVO user = userDAO.viewInfo(myID);
				int count = 0;
				String time= "";

				// 주문리스트
				for (int i = 0; i < list.size(); i++) {
					if(item.equals(list.get(i).getItem())) {
						count = list.get(i).getEa();
						time = list.get(i).getTime();
					}
				}

				id_Field.setText(myID);
				name_Field.setText(user.getName());
				menu_Field.setText(item);
				count_textField.setText(String.valueOf(count));
				time_Field.setText(time.substring(5));

			}
		});
		// 삭제
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String item = menu_Field.getText();
				String time= "";

				// 주문리스트
				for (int i = 0; i < list.size(); i++) {
					if(item.equals(list.get(i).getItem())) {
						time = list.get(i).getTime();
					}
				}
				// yes option
				if (JOptionPane.showConfirmDialog(null, "정말 삭제하시나요?", "ㅠ_ㅠ",
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					dao.deleteOrder(myID, item, time);
					JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다.");
					frame.dispose();
					main.main(null);
					
				} else {
				    // no option
				}
				
			}
		});

		// 수정
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (!userDAO.checkInputOnlyNumber(count_textField.getText())) {
					JOptionPane.showMessageDialog(null, "숫자를 입력하세요.");
				} else if(Integer.parseInt(count_textField.getText())<=0){
					JOptionPane.showMessageDialog(null, "정확한 개수를 입력하세요.");
				}else {

					String item = menu_Field.getText();
					String time= "";

					// 주문리스트
					for (int i = 0; i < list.size(); i++) {
						if(item.equals(list.get(i).getItem())) {
							time = list.get(i).getTime();
						}
					}
					
					// yes option
					if (JOptionPane.showConfirmDialog(null, item+" "+Integer.parseInt(count_textField.getText())+
							"개로 수정하시겠습니까?", "확인",
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						
						dao.deleteOrder(myID, item, time);
						
						HashMap<String, Integer> map = new HashMap<>();
						map.put(menu_Field.getText(), Integer.parseInt(count_textField.getText()));
						
						dao.Order(map, myID);
						JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");
						frame.dispose();
						main.main(null);
						
					} else {
					    // no option
					}
					
					
				}
			}
		});

	}
}
