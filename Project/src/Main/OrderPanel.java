package Main;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;


public class OrderPanel extends JPanel{

	public OrderPanel() {
	
		SpringLayout sl_order_panel = new SpringLayout();
		setLayout(sl_order_panel);
		
		JButton btnNewButton_4 = new JButton("New button");
		sl_order_panel.putConstraint(SpringLayout.NORTH, btnNewButton_4, 62, SpringLayout.NORTH, this);
		sl_order_panel.putConstraint(SpringLayout.WEST, btnNewButton_4, 35, SpringLayout.WEST, this);
		sl_order_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_4, 95, SpringLayout.NORTH, this);
		sl_order_panel.putConstraint(SpringLayout.EAST, btnNewButton_4, 151, SpringLayout.WEST, this);
		add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		sl_order_panel.putConstraint(SpringLayout.WEST, btnNewButton_5, 207, SpringLayout.WEST, this);
		sl_order_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_5, -139, SpringLayout.SOUTH, this);
		add(btnNewButton_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		sl_order_panel.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 266, SpringLayout.WEST, this);
		sl_order_panel.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton, -87, SpringLayout.NORTH, btnNewButton_5);
		add(rdbtnNewRadioButton);
	
	
	}
	
}
