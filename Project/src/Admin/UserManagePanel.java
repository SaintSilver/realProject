package Admin;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;


public class UserManagePanel extends JPanel  {
	
	public UserManagePanel() {
		SpringLayout sl_userManagePanel = new SpringLayout();
		setLayout(sl_userManagePanel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("order");
		sl_userManagePanel.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 152, SpringLayout.NORTH, this);
		add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton2 = new JRadioButton("°áÁ¦ÀÚ");
		sl_userManagePanel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton2, 83, SpringLayout.NORTH, this);
		sl_userManagePanel.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton2, -215, SpringLayout.EAST, this);
		add(rdbtnNewRadioButton2);
		
		
	}
}
