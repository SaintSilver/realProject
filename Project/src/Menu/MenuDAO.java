package Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuDAO {

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "system";
	private String pw = "1234";
	private Connection con = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	public void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// con -�����ּ� : �ּ�, ������, ���
		con = DriverManager.getConnection(url, id, pw);
	}
	
	//�޴� �߰��ϱ�
	public void addMenu(MenuVO menu) {

		try {
			
			int lastMenuNumber = getLastMenuNumber()+1;
			
			getConnection();

			String sql = "Insert into itemInfo values(?,?,?)";
			psmt = con.prepareStatement(sql);
			
			psmt.setInt(1, lastMenuNumber);
			psmt.setString(2, menu.getItemName());
			psmt.setInt(3, menu.getItemPrice());

			psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ���� ���� - ���� ������ �ݴ�
			try {
				if (psmt != null)
					psmt.close();

				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//�����۹�ȣ �������� ��������
	private int getLastMenuNumber() {

		int result = 1; 
		
		try {
			
			String sql = "select itemnumber from iteminfo";
			getConnection();
			psmt = con.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {
				result = rs.getInt("itemnumber");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// ���� ���� - ���� ������ �ݴ�
			try {
				if (psmt != null)
					psmt.close();

				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	//�޴� �����ϱ�
	public void reviseMenu() {
		
		
	}
	
	//�޴� �����ϱ�
	public void deleteMenu(MenuVO menu) {
		try {
			getConnection();

			String sql = "delete iteminfo where itemnumber = ? and itemname = ?";
			psmt = con.prepareStatement(sql);
			// ? ����(1���ͽ���), ���� ��
			psmt.setInt(1, menu.getItemNumber());
			psmt.setString(2, menu.getItemName());

			psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ���� ���� - ���� ������ �ݴ�
			try {
				if (psmt != null)
					psmt.close();

				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
