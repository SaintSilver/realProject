package Main;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import java.awt.CardLayout;
import javax.swing.JScrollPane;


public class OrderPanel extends JPanel{
	private JTable table;

	public OrderPanel() {
		setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "name_20212705738031");
		
		table = new JTable();
		scrollPane.setViewportView(table);
	
	
	}
}
