package Main;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GamePanel extends JPanel{

	
	public GamePanel() {
		setLayout(new CardLayout(0, 0));
		
		JLabel nameLabel = new JLabel("New label");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(nameLabel, "name_36506576172679");
			
		PickNameDAO dao = new PickNameDAO();
		
		PickNameVO pickName = dao.pickedName();
		
		nameLabel.setText(pickName.getName()+"¥‘¿Ã "+pickName.getTime()+"ø° "+pickName.getPrice()+"¥Á√∑!!!!");
		
		
	}
}
