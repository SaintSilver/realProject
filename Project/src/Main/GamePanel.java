package Main;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;

public class GamePanel extends JPanel{

	
	public GamePanel() {
		
	
			SpringLayout sl_gamePanel = new SpringLayout();
			setLayout(sl_gamePanel);
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("게임");
			sl_gamePanel.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 152, SpringLayout.NORTH, this);
			add(chckbxNewCheckBox);
			
			JRadioButton rdbtnNewRadioButton2 = new JRadioButton("New radio 패널");
			sl_gamePanel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton2, 83, SpringLayout.NORTH, this);
			sl_gamePanel.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton2, -215, SpringLayout.EAST, this);
			add(rdbtnNewRadioButton2);
			
		
	}
}
