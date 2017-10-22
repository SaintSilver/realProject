package Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import Menu.MenuDAO;
import Menu.MenuVO;
import Start.LoginGUI;
import User.UserDAO;
import User.UserVO;

public class OrderDAO {

	private LoginGUI login = new LoginGUI();
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "system";
	private String pw = "1234";
	private Connection con = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	private UserDAO dao ;
	private UserVO user ;
	private MenuVO menu ;

	public void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// con -연결주소 : 주소, 계정명, 비번
		con = DriverManager.getConnection(url, id, pw);
	}

	// 주문자 정보 받아오기
	public String whosOrder() {

		String myID = login.getMyID(); 
		String resultName = "";

		try {

			getConnection();

			String sql = "select name from userinfo where id=?";

			psmt = con.prepareStatement(sql);
			psmt.setString(1, myID);

			// 단순조회 (update는 변경) - resultset 객체로 반환
			rs = psmt.executeQuery();
			// 다음 데이터가 있으면 true 아니면 false
			while (rs.next()) {
				// 인덱스도가능 컬럼이름도가능
				resultName = rs.getString("name");
			}

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
		}
		return resultName;

	}

	// 주문하기
	public void Order(HashMap<String, Integer> hashmap, String id) {
		//주문한 사람의 유저정보를 가져옴
		//user = dao.viewInfo(id);
		//String name = user.getName();
		OrderDAO orderDAO = new OrderDAO();
		MenuDAO menuDAO = new MenuDAO();
		
		String name = orderDAO.whosOrder(); //주문자 이름
		String item = "";//상품이름
		int count = 0 ; //상품개수
		int price = 0; // 상품가격
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String time = sf.format(new Date()); //주문 시간
		
		try {

			getConnection();

			String sql = "Insert into orderlist values(?,?,?,?,?,?)";
			psmt = con.prepareStatement(sql);
			
			for (String key : hashmap.keySet()) {
			item = key;
			count = hashmap.get(key);
			
			price = menuDAO.menuPrice(item);
			
			psmt.setString(1, id);
			psmt.setString(2, name);
			psmt.setString(3, item);
			psmt.setInt(4, count);
			psmt.setInt(5, count*price);
			psmt.setString(6, time);
			
			// 꺼내올때, 변경할때 execute 두가지
			// 변경할때는 :
			psmt.executeUpdate();
			}



		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 연결 끊기 - 열기 순서의 반대
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

	// 관리자용 : 누적 전체 주문조회
	public ArrayList<OrderVO> OrderList() {
		ArrayList<OrderVO> list = new ArrayList<>();

		try {
			getConnection();

			String sql = "select * from orderlist";

			psmt = con.prepareStatement(sql);

			// 단순조회 (update는 변경) - resultset 객체로 반환
			rs = psmt.executeQuery();
			// 다음 데이터가 있으면 true 아니면 false
			while (rs.next()) {
				
				String resultID = rs.getString(1);
				String resultName = rs.getString(2);
				String resultItem = rs.getString(3);
				int resultCount = rs.getInt(4);
				int resultPrice = rs.getInt(5);
				String resultTime = rs.getString(6);
				list.add(new OrderVO(resultID, resultName, resultItem, resultCount, resultPrice, resultTime));

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

		return list;

	}// OrderList

	// 당일 전체 주문조회
	public ArrayList<OrderVO> todayOrderList() {
		ArrayList<OrderVO> list = new ArrayList<>();

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String today = (sf.format(new Date())).substring(8, 10);

		try {
			getConnection();

			String sql = "select * from orderlist";

			psmt = con.prepareStatement(sql);

			// 단순조회 (update는 변경) - resultset 객체로 반환
			rs = psmt.executeQuery();
			// 다음 데이터가 있으면 true 아니면 false
			while (rs.next()) {

				// 오늘날짜만 보여주기.
				if (rs.getString(6).substring(8, 10).equals(today)) {
					String resultID = rs.getString(1);
					String resultName = rs.getString(2);
					String resultItem = rs.getString(3);
					int resultCount = rs.getInt(4);
					int resultPrice = rs.getInt(5);
					String resultTime = rs.getString(6);
					list.add(new OrderVO(resultID, resultName, resultItem, resultCount, resultPrice, resultTime));
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

		return list;

	}// todayOrderList

	// 나의 주문내역
	public ArrayList<OrderVO> myOrder() {
		//========================id받기============================
		// String myID = login.getMyID();
		String myID = login.getMyID();
		ArrayList<OrderVO> list = new ArrayList<>();

		try {
			getConnection();

			String sql = "select * from orderlist where id = ?";

			psmt = con.prepareStatement(sql);

			psmt.setString(1, myID);

			// 단순조회 (update는 변경) - resultset 객체로 반환
			rs = psmt.executeQuery();
			// 다음 데이터가 있으면 true 아니면 false
			while (rs.next()) {
				// 인덱스도가능 컬럼이름도가능
				String resultID = rs.getString(1);
				String resultName = rs.getString(2);
				String resultItem = rs.getString(3);
				int resultCount = rs.getInt(4);
				int resultPrice = rs.getInt(5);
				String resultTime = rs.getString(6);

				list.add(new OrderVO(resultID, resultName, resultItem, resultCount, resultPrice, resultTime));

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

		return list;

	}// myOrder

}
