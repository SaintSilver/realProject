package Admin;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.SpringLayout;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import java.awt.Color;

public class test2 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public test2() {
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
		
		textField = new JTextField();
		panel_6.add(textField, "name_18155698929719");
		textField.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_7, 115, SpringLayout.EAST, panel_1);
		add(panel_7);
		
		JPanel panel_8 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_8, 6, SpringLayout.SOUTH, panel_7);
		springLayout.putConstraint(SpringLayout.WEST, panel_8, 6, SpringLayout.EAST, panel_2);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_8, 28, SpringLayout.SOUTH, panel_7);
		panel_7.setLayout(new CardLayout(0, 0));
		
		textField_1 = new JTextField();
		panel_7.add(textField_1, "name_18161106655526");
		textField_1.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_8, 115, SpringLayout.EAST, panel_2);
		add(panel_8);
		
		JPanel panel_9 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_9, 6, SpringLayout.SOUTH, panel_8);
		springLayout.putConstraint(SpringLayout.WEST, panel_9, 6, SpringLayout.EAST, panel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_9, 28, SpringLayout.SOUTH, panel_8);
		panel_8.setLayout(new CardLayout(0, 0));
		
		textField_2 = new JTextField();
		panel_8.add(textField_2, "name_18163202536108");
		textField_2.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_9, 115, SpringLayout.EAST, panel_3);
		add(panel_9);
		
		JPanel panel_10 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_10, 6, SpringLayout.SOUTH, panel_9);
		springLayout.putConstraint(SpringLayout.WEST, panel_10, 6, SpringLayout.EAST, panel_4);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_10, 28, SpringLayout.SOUTH, panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		textField_3 = new JTextField();
		panel_9.add(textField_3, "name_18164818389849");
		textField_3.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_10, 115, SpringLayout.EAST, panel_4);
		add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_11, 6, SpringLayout.SOUTH, panel_10);
		springLayout.putConstraint(SpringLayout.WEST, panel_11, 6, SpringLayout.EAST, panel_5);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_11, 28, SpringLayout.SOUTH, panel_10);
		panel_10.setLayout(new CardLayout(0, 0));
		
		textField_4 = new JTextField();
		panel_10.add(textField_4, "name_18166858365146");
		textField_4.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_11, 115, SpringLayout.EAST, panel_5);
		add(panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uB0A8\uC790");
		panel_11.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC5EC\uC790");
		panel_11.add(rdbtnNewRadioButton);
		
		JPanel panel_12 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_12, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel_12, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_12, 39, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_12, 224, SpringLayout.WEST, this);
		add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));
		
		JComboBox comboBox = new JComboBox();
		panel_12.add(comboBox, "name_18263659630876");

	}
}
