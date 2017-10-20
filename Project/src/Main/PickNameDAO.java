package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import User.LoginGUI;

public class PickNameDAO {

	private LoginGUI login = new LoginGUI();
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "system";
	private String pw = "1234";
	private Connection con = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// con -연결주소 : 주소, 계정명, 비번
		con = DriverManager.getConnection(url, id, pw);
	}

	//pickName에 등록한다 ( 관리자용)
	public void insertName(PickNameVO pickName) {
		try {

			getConnection();

			String sql = "Insert into pickname values(?,?,?)";
			psmt = con.prepareStatement(sql);

			psmt.setString(1, pickName.getName());
			psmt.setString(2, pickName.getTime());
			psmt.setInt(3, pickName.getPrice());

			psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
