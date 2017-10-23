package Admin;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import User.UserDAO;
import User.UserVO;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class UserManagePanel extends JPanel  {
	private JTable table;
	
	public UserManagePanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 548, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 751, SpringLayout.WEST, this);
		add(scrollPane);
		
		Vector<String> columnNames = new Vector<>();
	      columnNames.add("No.");
	      columnNames.add("Type");
	      columnNames.add("ID");
	      columnNames.add("Name");
	      columnNames.add("Contract");
	      columnNames.add("Gender");
	      
	      Vector<Object> data = new Vector<>();
	      UserDAO dao = new UserDAO();
	      ArrayList<UserVO> list = dao.getUserList();
	      
	      for (int i = 0; i < list.size(); i++) {
	         
	         UserVO m = list.get(i);
	         Vector<Object> row1 = new Vector<>();
	         row1.add(m.getUserNumber());
	         row1.add(m.getUserType());
	         row1.add(m.getId());
	         row1.add(m.getName());
	         row1.add(m.getContact());
	         row1.add(m.getGender());
	         data.add(row1);
	      }
	      
	      table = new JTable(data, columnNames);
	      table.setBackground(Color.WHITE);
	      table.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 12));

	      scrollPane.setViewportView(table);
		
		
	}
}
