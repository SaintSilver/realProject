package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.ImageIcon;

public class SystemPanel extends JPanel {

   public SystemPanel() {
      SpringLayout springLayout = new SpringLayout();
      setLayout(springLayout);
      
      JLabel lblNewLabel = new JLabel("");
      springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, this);
      springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, this);
      lblNewLabel.setIcon(new ImageIcon(SystemPanel.class.getResource("/image/admin1.jpg")));
      add(lblNewLabel);
   }
   
}