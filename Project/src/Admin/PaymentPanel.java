package Admin;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import Order.OrderDAO;
import Order.OrderVO;
import java.awt.Font;

public class PaymentPanel extends JPanel {
	private JTable table;

	
	public PaymentPanel() {
		setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "name_33297705933028");
		
		Vector<Object> columnNames = new Vector<>();
	      columnNames.add("���̵�");
	      columnNames.add("�̸�");
	      columnNames.add("�ֹ���ǰ");
	      columnNames.add("����");
	      columnNames.add("�����ݾ�");
	      columnNames.add("�ð�");
	      
	      Vector<Object> data = new Vector<>();
	      OrderDAO orderDAO = new OrderDAO();
	      ArrayList<OrderVO> list = orderDAO.OrderList();
	      //�ֱ� �������� �����ֵ��� �Ѵ�.
	      for (int i = list.size()-1; i >= 0; i--) {
	         
	         OrderVO o = list.get(i);
	         Vector<Object> row1 = new Vector<>();
	         row1.add(o.getId());
	         row1.add(o.getName());
	         row1.add(o.getItem());
	         row1.add(o.getEa());
	         row1.add(o.getPrice());
	         row1.add(o.getTime());
	         data.add(row1);
	      }
	      
	      table = new JTable(data, columnNames);
	      table.setFont(new Font("�������", Font.PLAIN, 12));

	      scrollPane.setViewportView(table);
		
		
	}
}
