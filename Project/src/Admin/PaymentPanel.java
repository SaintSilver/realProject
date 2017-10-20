package Admin;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;

public class PaymentPanel extends JPanel {

	
	public PaymentPanel() {
		SpringLayout sl_paymentPanel = new SpringLayout();
		setLayout(sl_paymentPanel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("order");
		sl_paymentPanel.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 152, SpringLayout.NORTH, this);
		add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton2 = new JRadioButton("°áÁ¦ÀÚ");
		sl_paymentPanel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton2, 83, SpringLayout.NORTH, this);
		sl_paymentPanel.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton2, -215, SpringLayout.EAST, this);
		add(rdbtnNewRadioButton2);
		
		
	}
}
