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
      setLayout(new CardLayout(0, 0));
      
      JLabel lblNewLabel = new JLabel("");
      lblNewLabel.setIcon(new ImageIcon(SystemPanel.class.getResource("/image/admin1.jpg")));
      add(lblNewLabel, "name_21456473539416");
   }
   
}