package Main;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;


public class OrderPanel extends JPanel{

	public OrderPanel() {
		setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, "name_7088929820960");
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
		panel.add(lblNewLabel, "name_7096025282227");
	
	
	}
}
