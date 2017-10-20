package Main;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;

public class Order_current extends JPanel {
	
	public Order_current() {
	SpringLayout sl_order_current = new SpringLayout();
	setLayout(sl_order_current);
	
	JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
	sl_order_current.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 152, SpringLayout.NORTH, this);
	add(chckbxNewCheckBox);
	
	JRadioButton rdbtnNewRadioButton2 = new JRadioButton("New radio button");
	sl_order_current.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton2, 83, SpringLayout.NORTH, this);
	sl_order_current.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton2, -215, SpringLayout.EAST, this);
	add(rdbtnNewRadioButton2);
	}
	
}
