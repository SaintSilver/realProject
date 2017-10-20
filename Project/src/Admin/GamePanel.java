package Admin;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javax.swing.JButton;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;



public class GamePanel extends JPanel{
	
	static JLabel lbl_pickName;
	private ThreadStart t;
	
	public GamePanel() {
		setBackground(Color.PINK);
		SpringLayout sl_GamePanel = new SpringLayout();
		setLayout(sl_GamePanel);
		
		JButton btnStart = new JButton("Start");
		sl_GamePanel.putConstraint(SpringLayout.NORTH, btnStart, 51, SpringLayout.NORTH, this);
		sl_GamePanel.putConstraint(SpringLayout.WEST, btnStart, 172, SpringLayout.WEST, this);
	      btnStart.addActionListener(new ActionListener() {
	         
	         public void actionPerformed(ActionEvent arg0) {
	            // textField.setText("TEST");
	            t = new ThreadStart();
	            t.start();
	         }

	      
	      });
	      btnStart.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
	      btnStart.setBounds(432, 40, 126, 53);
	      add(btnStart);

	      JButton btnStop = new JButton("Stop");
	      sl_GamePanel.putConstraint(SpringLayout.NORTH, btnStop, 0, SpringLayout.NORTH, btnStart);
	      sl_GamePanel.putConstraint(SpringLayout.WEST, btnStop, 20, SpringLayout.EAST, btnStart);
	      btnStop.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	            t.stop();
	            
	         }
	      });
	      btnStop.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
	      btnStop.setBounds(584, 40, 126, 53);
	      add(btnStop);

	      lbl_pickName = new JLabel("\uB2F9\uCCA8\uC790\uB294 \uB204\uAD6C\uC77C\uAE4C?");
	      sl_GamePanel.putConstraint(SpringLayout.NORTH, lbl_pickName, 51, SpringLayout.SOUTH, btnStart);
	      sl_GamePanel.putConstraint(SpringLayout.EAST, lbl_pickName, -169, SpringLayout.EAST, this);
	      lbl_pickName.setBounds(223, 156, 513, 91);
	      add(lbl_pickName);

	   }

	   public class ThreadStart extends Thread {

	      @Override
	      public void run() {
	         String[] names = { "À±ÁöÈ£", "È«¼ºÀº", "Àü»óÈ£", "¹éÇü¼±" };
	         java.util.Random r = new java.util.Random();
	         while (true) {
	            try {
	               Thread.sleep(10);
	               GamePanel.startRandomName(names[r.nextInt(names.length)]);
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
