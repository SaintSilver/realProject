package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import User.UserDAO;
import User.UserVO;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class UserManagementGUI {

   private JFrame frame;
   private JTextField num_textField;
   private JTextField type_textField;
   private JTextField name_textField;
   private JTextField contact_textField;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               UserManagementGUI window = new UserManagementGUI();
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
   public UserManagementGUI() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 260, 381);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SpringLayout springLayout = new SpringLayout();
      frame.getContentPane().setLayout(springLayout);
      
      JComboBox comboBox = new JComboBox();
      springLayout.putConstraint(SpringLayout.NORTH, comboBox, 10, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.WEST, comboBox, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, comboBox, 36, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, comboBox, 220, SpringLayout.WEST, frame.getContentPane());
      frame.getContentPane().add(comboBox);
      
      JPanel panel = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel, 6, SpringLayout.SOUTH, comboBox);
      springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, comboBox);
      springLayout.putConstraint(SpringLayout.SOUTH, panel, 32, SpringLayout.SOUTH, comboBox);
      springLayout.putConstraint(SpringLayout.EAST, panel, 116, SpringLayout.WEST, frame.getContentPane());
      frame.getContentPane().add(panel);
      
      JPanel panel_1 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, comboBox);
      springLayout.putConstraint(SpringLayout.WEST, panel_1, 6, SpringLayout.EAST, panel);
      springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -275, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
      frame.getContentPane().add(panel_1);
      
      JPanel panel_2 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel);
      springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, comboBox);
      springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -238, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, panel_2, 116, SpringLayout.WEST, frame.getContentPane());
      panel.setLayout(new CardLayout(0, 0));
      
      JLabel lblNewLabel = new JLabel("\uC0AC\uC6A9\uC790\uBC88\uD638");
      lblNewLabel.setFont(new Font("함초롬돋움", Font.BOLD, 13));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      panel.add(lblNewLabel, "name_30161581559921");
      frame.getContentPane().add(panel_2);
      
      JPanel panel_3 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, panel_1);
      springLayout.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel_1);
      springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -238, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, panel_3, -10, SpringLayout.EAST, frame.getContentPane());
      panel_1.setLayout(new CardLayout(0, 0));
      
      num_textField = new JTextField();
      panel_1.add(num_textField, "name_30285221012529");
      num_textField.setColumns(10);
      frame.getContentPane().add(panel_3);
      
      JPanel panel_4 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_4, 6, SpringLayout.SOUTH, panel_2);
      springLayout.putConstraint(SpringLayout.WEST, panel_4, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, panel_4, -201, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, panel_4, 0, SpringLayout.EAST, panel);
      panel_2.setLayout(new CardLayout(0, 0));
      
      JLabel lblNewLabel_1 = new JLabel("\uC0AC\uC6A9\uC790\uD0C0\uC785");
      lblNewLabel_1.setFont(new Font("함초롬돋움", Font.BOLD, 13));
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2.add(lblNewLabel_1, "name_30163389442269");
      frame.getContentPane().add(panel_4);
      
      JPanel panel_5 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_5, 6, SpringLayout.SOUTH, panel_3);
      springLayout.putConstraint(SpringLayout.WEST, panel_5, 122, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, panel_5, -201, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, panel_5, 0, SpringLayout.EAST, panel_1);
      panel_3.setLayout(new CardLayout(0, 0));
      
      type_textField = new JTextField();
      panel_3.add(type_textField, "name_30287396917658");
      type_textField.setColumns(10);
      frame.getContentPane().add(panel_5);
      
      JPanel panel_6 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_6, 6, SpringLayout.SOUTH, panel_4);
      springLayout.putConstraint(SpringLayout.WEST, panel_6, 0, SpringLayout.WEST, comboBox);
      springLayout.putConstraint(SpringLayout.SOUTH, panel_6, -164, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, panel_6, 116, SpringLayout.WEST, frame.getContentPane());
      panel_4.setLayout(new CardLayout(0, 0));
      
      JLabel lblNewLabel_2 = new JLabel("\uC0AC\uC6A9\uC790\uC544\uC774\uB514");
      lblNewLabel_2.setFont(new Font("함초롬돋움", Font.BOLD, 13));
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      panel_4.add(lblNewLabel_2, "name_30164597388186");
      frame.getContentPane().add(panel_6);
      
      JPanel panel_7 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_7, 6, SpringLayout.SOUTH, panel_5);
      springLayout.putConstraint(SpringLayout.WEST, panel_7, 122, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, panel_7, -164, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, panel_7, 0, SpringLayout.EAST, panel_1);
      panel_5.setLayout(new CardLayout(0, 0));
      
      JLabel id_Field = new JLabel("");
      panel_5.add(id_Field, "name_30601856045405");
      frame.getContentPane().add(panel_7);
      
      JPanel panel_8 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_8, 6, SpringLayout.SOUTH, panel_6);
      springLayout.putConstraint(SpringLayout.WEST, panel_8, 0, SpringLayout.WEST, comboBox);
      springLayout.putConstraint(SpringLayout.SOUTH, panel_8, -127, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, panel_8, 116, SpringLayout.WEST, frame.getContentPane());
      panel_6.setLayout(new CardLayout(0, 0));
      
      JLabel lblNewLabel_3 = new JLabel("\uC0AC\uC6A9\uC790\uC774\uB984");
      lblNewLabel_3.setFont(new Font("함초롬돋움", Font.BOLD, 13));
      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
      panel_6.add(lblNewLabel_3, "name_30165861675869");
      frame.getContentPane().add(panel_8);
      
      JPanel panel_9 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_9, 6, SpringLayout.SOUTH, panel_7);
      springLayout.putConstraint(SpringLayout.WEST, panel_9, 0, SpringLayout.WEST, panel_1);
      springLayout.putConstraint(SpringLayout.EAST, panel_9, -10, SpringLayout.EAST, frame.getContentPane());
      panel_7.setLayout(new CardLayout(0, 0));
      
      name_textField = new JTextField();
      panel_7.add(name_textField, "name_30292724560962");
      name_textField.setColumns(10);
      frame.getContentPane().add(panel_9);
      panel_9.setLayout(new CardLayout(0, 0));
      
      contact_textField = new JTextField();
      panel_9.add(contact_textField, "name_30294532492813");
      contact_textField.setColumns(10);
      
      JPanel panel_10 = new JPanel();
      springLayout.putConstraint(SpringLayout.SOUTH, panel_9, -46, SpringLayout.NORTH, panel_10);
      springLayout.putConstraint(SpringLayout.NORTH, panel_10, 262, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, panel_10, -10, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.WEST, panel_10, 10, SpringLayout.WEST, frame.getContentPane());
      panel_8.setLayout(new CardLayout(0, 0));
      
      JLabel lblNewLabel_4 = new JLabel("\uC0AC\uC6A9\uC790\uC5F0\uB77D\uCC98");
      lblNewLabel_4.setFont(new Font("함초롬돋움", Font.BOLD, 13));
      lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
      panel_8.add(lblNewLabel_4, "name_30169053020778");
      springLayout.putConstraint(SpringLayout.EAST, panel_10, 234, SpringLayout.WEST, frame.getContentPane());
      frame.getContentPane().add(panel_10);
      panel_10.setLayout(new GridLayout(0, 2, 0, 0));
      
      JButton btnNewButton = new JButton("\uD68C\uC6D0\uC0AD\uC81C");
      
      btnNewButton.setFont(new Font("함초롬돋움", Font.BOLD, 17));
      panel_10.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("\uC815\uBCF4\uC218\uC815");
     
      btnNewButton_1.setFont(new Font("함초롬돋움", Font.BOLD, 17));
      panel_10.add(btnNewButton_1);
      
      JPanel panel_11 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_11, 6, SpringLayout.SOUTH, panel_8);
      springLayout.putConstraint(SpringLayout.WEST, panel_11, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, panel_11, 37, SpringLayout.SOUTH, panel_8);
      springLayout.putConstraint(SpringLayout.EAST, panel_11, 234, SpringLayout.WEST, frame.getContentPane());
      frame.getContentPane().add(panel_11);
      panel_11.setLayout(new GridLayout(0, 2, 0, 0));
      
      JRadioButton RadioButton_man = new JRadioButton("\uB0A8\uC790");
      RadioButton_man.setHorizontalAlignment(SwingConstants.CENTER);
      panel_11.add(RadioButton_man);
      
      JRadioButton RadioButton_woman = new JRadioButton("\uC5EC\uC790");
      RadioButton_woman.setHorizontalAlignment(SwingConstants.CENTER);
      panel_11.add(RadioButton_woman);
      
      ButtonGroup group = new ButtonGroup(); // 라디오버튼 그룹화를 위한 버튼그룹 설정
		group.add(RadioButton_man);
		group.add(RadioButton_woman);
      
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
				frame.dispose();
				Admin_MainGUI admin_MainGUI = new Admin_MainGUI();
				admin_MainGUI.main(null);
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
					frame.dispose();
					Admin_MainGUI admin_MainGUI = new Admin_MainGUI();
					admin_MainGUI.main(null);
		      	}
		      });
      
      
      
      
      
      
      
      
      
      
   }
}