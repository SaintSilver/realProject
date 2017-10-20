package Admin;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class az {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					az window = new az();
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
	public az() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon aboutIcon = new ImageIcon(
				"http://bulgogibros.com/wp-content/uploads/2017/02/9%EC%B1%84%EB%81%9D%EB%93%B1%EC%8B%AC%EB%8F%84%EC%8B%9C%EB%9D%BD.jpg");

		
		
		ImageIcon image = new ImageIcon("http://bulgogibros.com/wp-content/uploads/2017/02/9%EC%B1%84%EB%81%9D%EB%93%B1%EC%8B%AC%EB%8F%84%EC%8B%9C%EB%9D%BD.jpg");
		JLabel label = new JLabel("", image, JLabel.CENTER);
		JPanel panel = new JPanel(new BorderLayout());
		panel.add( label, BorderLayout.CENTER );
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
	}

}
