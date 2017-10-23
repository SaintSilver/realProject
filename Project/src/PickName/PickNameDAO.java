package PickName;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Order.OrderVO;
import Start.LoginGUI;

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

	// pickName에 등록한다 ( 관리자용)
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

	// 추첨된 사람 보기 ( 일반 유저용)
	public PickNameVO pickedName() {

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String today = (sf.format(new Date())).substring(8, 10);
		PickNameVO pickName = null; 
		try {
			getConnection();

			String sql = "select * from pickname";

			psmt = con.prepareStatement(sql);

			// 단순조회 (update는 변경) - resultset 객체로 반환
			rs = psmt.executeQuery();
			// 다음 데이터가 있으면 true 아니면 false
			while (rs.next()) {

				// 오늘날짜만 보여주기.
				if (rs.getString(2).substring(8, 10).equals(today)) {
					String resultName = rs.getString(1);
					String resultTime = rs.getString(2);
					int resultPrice = rs.getInt(3);
					pickName = new PickNameVO(resultName,resultTime, resultPrice);
					// 관리자가 추첨 여러번해도 처음 돌린사람이 당첨자임.
					break;
				}

			} // while

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결 끊기 - 열기 순서의 반대
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // finally

		return pickName;

	}
	
	// 당일 누적금액 계산
		public int todayOrderPrice() {
			int count = 0;
			int price = 0;
			int result = 0;

			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			String today = (sf.format(new Date())).substring(8, 10);

			try {
				getConnection();

				String sql = "select * from orderlist";

				psmt = con.prepareStatement(sql);
				rs = psmt.executeQuery();
				
				while (rs.next()) {

					// 오늘날짜만 보여주기.
					if (rs.getString(6).substring(8, 10).equals(today)) {
						count = rs.getInt(4);
						price = rs.getInt(5);
						result += count*price;
					}

				} // while

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 연결 끊기 - 열기 순서의 반대
				try {
					if (rs != null)
						rs.close();
					if (psmt != null)
						psmt.close();
					if (con != null)
						con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			} // finally

			return result;

		}// todayOrderList
	

}
