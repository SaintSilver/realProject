package Main;

import javax.swing.JPanel;

import Order.OrderDAO;
import Order.OrderVO;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyOrderPanel extends JPanel {
	private JTable table;

	
	public MyOrderPanel() {
		setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "name_21044171286389");
		
		Vector<Object> columnNames = new Vector<>();
	      columnNames.add("아이디");
	      columnNames.add("이름");
	      columnNames.add("주문상품");
	      columnNames.add("개수");
	      columnNames.add("결제금액");
	      columnNames.add("시간");
	      
	      Vector<Object> data = new Vector<>();
	      OrderDAO orderDAO = new OrderDAO();
	      ArrayList<OrderVO> list = orderDAO.myOrder();
	      
	      //최근 내역부터 보여주도록 한다.
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

	      scrollPane.setViewportView(table);
		
	}
}
