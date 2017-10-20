package Admin;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class TableIcon extends JFrame
{
    public TableIcon()
    {
        ImageIcon aboutIcon = new ImageIcon("http://bulgogibros.com/wp-content/uploads/2017/02/9%EC%B1%84%EB%81%9D%EB%93%B1%EC%8B%AC%EB%8F%84%EC%8B%9C%EB%9D%BD.jpg");
        ImageIcon addIcon = new ImageIcon("http://bulgogibros.com/wp-content/uploads/2017/02/9%EC%B1%84%EB%81%9D%EB%93%B1%EC%8B%AC%EB%8F%84%EC%8B%9C%EB%9D%BD.jpg");
        ImageIcon copyIcon = new ImageIcon("http://bulgogibros.com/wp-content/uploads/2017/02/9%EC%B1%84%EB%81%9D%EB%93%B1%EC%8B%AC%EB%8F%84%EC%8B%9C%EB%9D%BD.jpg");
        String[] columnNames = {"Picture"};
        Object[][] data =
        {
            {aboutIcon},
            {addIcon},
            {copyIcon},
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable( model )
        {
            //  Returning the Class of each column will allow different
            //  renderers to be used based on Class
            public Class getColumnClass(int column)
            {
                return getValueAt(0, column).getClass();
            }
        };
        table.setPreferredScrollableViewportSize(table.getPreferredSize());

        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );
    }

    public static void main(String[] args)
    {
        TableIcon frame = new TableIcon();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);
    }

}