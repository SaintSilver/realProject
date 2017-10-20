package User;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class showUserInfoGUI {

	private JFrame frame;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showUserInfoGUI window = new showUserInfoGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public showUserInfoGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		
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

	      scrollPane.setViewportView(table);
	      
	}

}
