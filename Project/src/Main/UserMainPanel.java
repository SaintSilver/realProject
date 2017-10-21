package Main;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SpringLayout;

public class UserMainPanel extends JPanel {

   /**
    * Create the panel.
    */
   public UserMainPanel() {
      SpringLayout springLayout = new SpringLayout();
      setLayout(springLayout);
      
      JLabel lblNewLabel = new JLabel("");
      springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, this);
      springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, this);
      springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 376, SpringLayout.NORTH, this);
      springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 764, SpringLayout.WEST, this);
      lblNewLabel.setIcon(new ImageIcon(UserMainPanel.class.getResource("/image/mainImage.jpg")));
      add(lblNewLabel);

   }

}