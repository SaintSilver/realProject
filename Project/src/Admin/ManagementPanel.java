package Admin;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import User.UserDAO;
import User.UserVO;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagementPanel extends JPanel {
	
	private JTextField num_textField;
	private JTextField type_textField;
	private JTextField name_textField;
	private JTextField contact_textField;
	private JPanel mainPanel;

	public ManagementPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel, 53, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, -221, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 75, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, -125, SpringLayout.EAST, this);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 28, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, panel);
		add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 28, SpringLayout.SOUTH, panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uC0AC\uC6A9\uC790\uC885\uB958");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1, "name_17739127402485");
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC0AC\uC6A9\uC790\uBC88\uD638");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_17737135704046");
		add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uC0AC\uC6A9\uC790\uC544\uC774\uB514");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2, "name_17741215486808");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, 28, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel);
		add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\uC0AC\uC6A9\uC790\uC774\uB984");
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_3, "name_17954328864902");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_4, 6, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, panel_4, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_4, 28, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.EAST, panel_4, 0, SpringLayout.EAST, panel);
		add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("\uC0AC\uC6A9\uC790\uC5F0\uB77D\uCC98");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_4, "name_17975543473923");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_5, 6, SpringLayout.SOUTH, panel_4);
		springLayout.putConstraint(SpringLayout.WEST, panel_5, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_5, 28, SpringLayout.SOUTH, panel_4);
		springLayout.putConstraint(SpringLayout.EAST, panel_5, 0, SpringLayout.EAST, panel);
		add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("\uC0AC\uC6A9\uC790\uC131\uBCC4");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_5, "name_18050730160033");
		
		JPanel panel_6 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_6, 53, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel_6, 6, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_6, 75, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_6, 115, SpringLayout.EAST, panel);
		add(panel_6);
		
		JPanel panel_7 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_7, 6, SpringLayout.SOUTH, panel_6);
		springLayout.putConstraint(SpringLayout.WEST, panel_7, 6, SpringLayout.EAST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_7, 28, SpringLayout.SOUTH, panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		num_textField = new JTextField();
		panel_6.add(num_textField, "name_18155698929719");
		num_textField.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_7, 115, SpringLayout.EAST, panel_1);
		add(panel_7);
		
		JPanel panel_8 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_8, 6, SpringLayout.SOUTH, panel_7);
		springLayout.putConstraint(SpringLayout.WEST, panel_8, 6, SpringLayout.EAST, panel_2);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_8, 28, SpringLayout.SOUTH, panel_7);
		panel_7.setLayout(new CardLayout(0, 0));
		
		type_textField = new JTextField();
		panel_7.add(type_textField, "name_18161106655526");
		type_textField.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_8, 115, SpringLayout.EAST, panel_2);
		add(panel_8);
		
		JPanel panel_9 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_9, 6, SpringLayout.SOUTH, panel_8);
		springLayout.putConstraint(SpringLayout.WEST, panel_9, 6, SpringLayout.EAST, panel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_9, 28, SpringLayout.SOUTH, panel_8);
		panel_8.setLayout(new CardLayout(0, 0));
		
		JLabel id_Field = new JLabel("");
		panel_8.add(id_Field, "name_16666841095905");
		springLayout.putConstraint(SpringLayout.EAST, panel_9, 115, SpringLayout.EAST, panel_3);
		add(panel_9);
		
		JPanel panel_10 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_10, 6, SpringLayout.SOUTH, panel_9);
		springLayout.putConstraint(SpringLayout.WEST, panel_10, 6, SpringLayout.EAST, panel_4);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_10, 28, SpringLayout.SOUTH, panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		name_textField = new JTextField();
		panel_9.add(name_textField, "name_18164818389849");
		name_textField.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_10, 115, SpringLayout.EAST, panel_4);
		add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_11, 6, SpringLayout.SOUTH, panel_10);
		springLayout.putConstraint(SpringLayout.WEST, panel_11, 6, SpringLayout.EAST, panel_5);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_11, 28, SpringLayout.SOUTH, panel_10);
		panel_10.setLayout(new CardLayout(0, 0));
		
		contact_textField = new JTextField();
		panel_10.add(contact_textField, "name_18166858365146");
		contact_textField.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_11, 115, SpringLayout.EAST, panel_5);
		add(panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));
		
		JRadioButton RadioButton_man = new JRadioButton("\uB0A8\uC790");
		panel_11.add(RadioButton_man);
		
		JRadioButton RadioButton_woman = new JRadioButton("\uC5EC\uC790");
		panel_11.add(RadioButton_woman);
		
		JPanel panel_12 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_12, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel_12, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_12, 39, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_12, 224, SpringLayout.WEST, this);
		add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));
		
		JComboBox comboBox = new JComboBox();
		panel_12.add(comboBox, "name_18263659630876");
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0\uC0AD\uC81C");
	
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 25, SpringLayout.SOUTH, panel_5);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, panel);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC815\uBCF4\uC218\uC815");
		
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, panel_6);
		add(btnNewButton_1);
		UserDAO dao = new UserDAO();
		ArrayList<UserVO> list = dao.getUserList();
		
		//회원리스트
		for (int i = 1; i < list.size(); i++) {
			comboBox.addItem(list.get(i).getId());
		}
		comboBox.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				
				
				//선택되면 아이디에 맞는 회원정보 가져오기
				String id = comboBox.getSelectedItem().toString();
				UserVO user = dao.viewInfo(id);
				
				num_textField.setText(String.valueOf(user.getUserNumber()));
				type_textField.setText(user.getUserType());
				id_Field.setText(user.getId());
				name_textField.setText(user.getName());
				contact_textField.setText(user.getContact());
				RadioButton_man.setEnabled(user.getGender().equals("남"));
				RadioButton_woman.setEnabled(user.getGender().equals("여"));
				
			}
		});
		//삭제
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dao.closeAccount(id_Field.getText());
				JOptionPane.showMessageDialog(null, "삭제완료");
				
			}
		});
		//수정
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String gender = "";
				if (RadioButton_man.isSelected()) {
					gender = "남";
				} else if (RadioButton_woman.isSelected()) {
					gender = "여";
				}
				
				UserVO user = new UserVO(Integer.parseInt(num_textField.getText()), type_textField.getText(), id_Field.getText(),
						name_textField.getText(), contact_textField.getText(),gender);
						
				dao.ChangeInfoAdmin(user);
				JOptionPane.showMessageDialog(null, "수정완료");
			}
		});
		
		
		
		

	}
}
