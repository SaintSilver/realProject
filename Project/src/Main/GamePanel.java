package Main;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import PickName.PickNameDAO;
import PickName.PickNameVO;

import javax.swing.ImageIcon;
import java.awt.Font;

public class GamePanel extends JPanel{

   
   public GamePanel() {
      setLayout(new CardLayout(0, 0));
      
      JLabel nameLabel = new JLabel("");
      nameLabel.setFont(new Font("�� B", Font.PLAIN, 12));
      nameLabel.setIcon(new ImageIcon(GamePanel.class.getResource("/image/BokBulBok1.jpg")));
      nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
      add(nameLabel, "name_36506576172679");
         
      PickNameDAO dao = new PickNameDAO();
      
      PickNameVO pickName = dao.pickedName();
      
      
      
      if(pickName != null) {
    	  String date = pickName.getTime().substring(5, 10);
      nameLabel.setText(date+"��: "+pickName.getName()+" ��÷! �����ݾ��� "+pickName.getPrice()+"���Դϴ�.");
      }else {
         nameLabel.setText("���� ��÷ ���Դϴ�.");
      }
      
   }
}