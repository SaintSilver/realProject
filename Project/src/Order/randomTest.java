package Order;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class randomTest implements Runnable {
	private JFrame frame;
	private BufferedImage icon;
	private JTable table;
	private JTextField textField_1;
	static JLabel lbl_text;
	private ThreadStart t;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					randomTest window = new randomTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public randomTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JPanel panel_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, 104, SpringLayout.WEST, panel);
		panel_1.setBackground(new Color(254, 194, 15));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, panel);
		panel.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		JButton btnNewButton = new JButton("\uC8FC\uBB38\uD604\uD669");
		btnNewButton.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(new Color(254, 194, 15));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 114, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton, 169, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, 104, SpringLayout.WEST, panel_1);
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uACB0\uC81C\uD655\uC778");
		btnNewButton_1.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(new Color(254, 194, 15));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.SOUTH, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 55, SpringLayout.SOUTH, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, btnNewButton);
		panel_1.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uACB0\uC81C\uC790\uCD94\uCCA8");
		btnNewButton_2.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(254, 194, 15));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_2, 0, SpringLayout.SOUTH, btnNewButton_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 55, SpringLayout.SOUTH, btnNewButton_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton_2, 0, SpringLayout.EAST, btnNewButton);
		panel_1.add(btnNewButton_2);

		JPanel panel_2 = new JPanel();
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel);
		panel_2.setBackground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 92, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, 0, SpringLayout.SOUTH, panel);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton_4 = new JButton("Start");
		btnNewButton_4.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				// textField.setText("TEST");
				t = new ThreadStart();
				t.start();
			}

		});
		btnNewButton_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		btnNewButton_4.setBounds(432, 40, 126, 53);
		panel_2.add(btnNewButton_4);

		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t.stop();
			}
		});
		btnStop.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		btnStop.setBounds(584, 40, 126, 53);
		panel_2.add(btnStop);

		JPanel panel_3 = new JPanel();
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, panel_3);

		textField_1 = new JTextField();
		textField_1.setBounds(45, 286, 665, 33);
		panel_2.add(textField_1);
		textField_1.setColumns(10);

		lbl_text = new JLabel("New label");
		lbl_text.setBounds(45, 149, 513, 91);
		panel_2.add(lbl_text);
		panel_3.setBackground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_3, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.EAST, panel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_3, 92, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_3, 780, SpringLayout.EAST, panel_1);

		JButton btnNewButton_3 = new JButton("\uC8FC\uBB38");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_3.setBackground(new Color(254, 194, 15));
		btnNewButton_3.setFont(new Font("³ª´®°íµñ", Font.BOLD, 15));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_3, -44, SpringLayout.NORTH, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_3, 0, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton_3, 0, SpringLayout.NORTH, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton_3, 0, SpringLayout.EAST, btnNewButton);
		panel_1.add(btnNewButton_3);
		panel.add(panel_3);

	}

	public class ThreadStart extends Thread {

		@Override
		public void run() {
			String[] name = { "À±ÁöÈ£", "È«¼ºÀº", "Àü»óÈ£", "¹éÇü¼±" };
			java.util.Random r = new java.util.Random();
			while (true) {
				try {
					Thread.sleep(1000);
					randomTest.startRandomName(name[r.nextInt(name.length)]);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void startRandomName(String string) {
		System.out.println(1);
		lbl_text.setText(string);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}