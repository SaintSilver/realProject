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

import Order.OrderDAO;
import Order.OrderVO;
import PickName.PickNameDAO;
import PickName.PickNameVO;

import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class GamePanel extends JPanel {

	static JLabel lbl_pickName;
	private ThreadStart t;
	private boolean check = false; //쓰레드 제어용 

	public GamePanel() {

		setBackground(SystemColor.inactiveCaption);
		SpringLayout sl_GamePanel = new SpringLayout();
		setLayout(sl_GamePanel);

		JButton btnStart = new JButton("\uC2DC\uC791!!!");
		btnStart.setBackground(SystemColor.activeCaption);
		sl_GamePanel.putConstraint(SpringLayout.NORTH, btnStart, 30, SpringLayout.NORTH, this);
		sl_GamePanel.putConstraint(SpringLayout.WEST, btnStart, 74, SpringLayout.WEST, this);
		sl_GamePanel.putConstraint(SpringLayout.SOUTH, btnStart, 105, SpringLayout.NORTH, this);
		sl_GamePanel.putConstraint(SpringLayout.EAST, btnStart, 191, SpringLayout.WEST, this);
		btnStart.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				//start를 두번 누르면 아무일 없게.
				if(check == false) {
					t = new ThreadStart();
					t.start();
					check =  true;
				}
			}

		});
		btnStart.setFont(new Font("고도 M", Font.PLAIN, 25));
		btnStart.setBounds(432, 40, 126, 53);
		add(btnStart);

		lbl_pickName = new JLabel("\uB2F9\uCCA8\uC790\uB294?");
		lbl_pickName.setBackground(Color.WHITE);
		lbl_pickName.setForeground(Color.BLACK);
		sl_GamePanel.putConstraint(SpringLayout.WEST, lbl_pickName, 86, SpringLayout.WEST, this);
		sl_GamePanel.putConstraint(SpringLayout.EAST, lbl_pickName, -77, SpringLayout.EAST, this);
		lbl_pickName.setFont(new Font("고도 M", Font.BOLD, 80));
		lbl_pickName.setHorizontalAlignment(SwingConstants.CENTER);
		sl_GamePanel.putConstraint(SpringLayout.NORTH, lbl_pickName, 137, SpringLayout.NORTH, this);
		sl_GamePanel.putConstraint(SpringLayout.SOUTH, lbl_pickName, 229, SpringLayout.NORTH, this);
		lbl_pickName.setBounds(223, 156, 513, 91);

		JButton btnStop = new JButton("\uC2A4\uD1B1!!!");
		btnStop.setBackground(SystemColor.activeCaption);
		sl_GamePanel.putConstraint(SpringLayout.NORTH, btnStop, 30, SpringLayout.NORTH, this);
		sl_GamePanel.putConstraint(SpringLayout.WEST, btnStop, -117, SpringLayout.EAST, lbl_pickName);
		sl_GamePanel.putConstraint(SpringLayout.SOUTH, btnStop, -32, SpringLayout.NORTH, lbl_pickName);
		sl_GamePanel.putConstraint(SpringLayout.EAST, btnStop, 0, SpringLayout.EAST, lbl_pickName);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//start가 돌고있을때만 됨
				if(check == true) {
				t.stop();
				
				PickNameDAO dao = new PickNameDAO();
				int resultPrice = dao.todayOrderPrice();
				
				SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm");
				String timeNow = sf.format(new Date());

				PickNameVO pickName = new PickNameVO(lbl_pickName.getText(), timeNow, resultPrice);

				dao.insertName(pickName);
				check = false;
				}
			}
		});
		btnStop.setFont(new Font("고도 M", Font.PLAIN, 25));
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
