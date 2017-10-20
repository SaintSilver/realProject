package Admin;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import Main.PickNameDAO;
import Main.PickNameVO;
import Order.OrderDAO;
import Order.OrderVO;



public class GamePanel extends JPanel{
	
	static JLabel lbl_pickName;
	private ThreadStart t;
	
	public GamePanel() {
		
		setBackground(Color.WHITE);
		SpringLayout sl_GamePanel = new SpringLayout();
		setLayout(sl_GamePanel);
		
		JButton btnStart = new JButton("Start");
	      btnStart.addActionListener(new ActionListener() {
	         
	         public void actionPerformed(ActionEvent arg0) {
	            // textField.setText("TEST");
	            t = new ThreadStart();
	            t.start();
	         }

	      
	      });
	      btnStart.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 20));
	      btnStart.setBounds(432, 40, 126, 53);
	      add(btnStart);
	      
	      lbl_pickName = new JLabel("\uB2F9\uCCA8\uC790\uB294 \uB204\uAD6C\uC77C\uAE4C?");
	      sl_GamePanel.putConstraint(SpringLayout.NORTH, lbl_pickName, 51, SpringLayout.SOUTH, btnStart);
	      sl_GamePanel.putConstraint(SpringLayout.WEST, btnStart, 0, SpringLayout.WEST, lbl_pickName);
	      sl_GamePanel.putConstraint(SpringLayout.EAST, lbl_pickName, -169, SpringLayout.EAST, this);
	      lbl_pickName.setBounds(223, 156, 513, 91);

	      JButton btnStop = new JButton("Stop");
	      sl_GamePanel.putConstraint(SpringLayout.NORTH, btnStart, 0, SpringLayout.NORTH, btnStop);
	      sl_GamePanel.putConstraint(SpringLayout.NORTH, btnStop, 51, SpringLayout.NORTH, this);
	      sl_GamePanel.putConstraint(SpringLayout.WEST, btnStop, 271, SpringLayout.WEST, this);
	      btnStop.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            t.stop();
	           
	            SimpleDateFormat sf = new SimpleDateFormat("yyyy≥‚MMø˘dd¿œ a hh:mm");
	    		String timeNow = sf.format(new Date());
	            
	    		PickNameVO pickName = new PickNameVO(lbl_pickName.getText(), timeNow, 10000);
	            PickNameDAO dao = new PickNameDAO();
	            
	            dao.insertName(pickName);
	            
	         }
	      });
	      btnStop.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 20));
	      btnStop.setBounds(584, 40, 126, 53);
	      add(btnStop);

	      add(lbl_pickName);

	   }

	   public class ThreadStart extends Thread {

	      @Override
	      public void run() {
	         OrderDAO dao = new OrderDAO();
	         ArrayList<OrderVO> list = dao.todayOrderList();
	         ArrayList<String> nameList = new ArrayList<>();
	         for (OrderVO orderVO : list) {
				nameList.add(orderVO.getName());
			}
	         
	         java.util.Random r = new java.util.Random();
	         while (true) {
	            try {
	               Thread.sleep(10);
	               GamePanel.startRandomName(nameList.get(r.nextInt(nameList.size())));
	            } catch (InterruptedException e) {
	               // TODO Auto-generated catch block
	               e.printStackTrace();
	            }
	         }
	      }

	   }

	   public static void startRandomName(String name) {
	      lbl_pickName.setText(name);
	   }
}
