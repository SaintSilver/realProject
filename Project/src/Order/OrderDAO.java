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
		// con -�����ּ� : �ּ�, ������, ���
		con = DriverManager.getConnection(url, id, pw);
	}

	// �ֹ��� ���� �޾ƿ���
	public String whosOrder() {

		String myID = login.getMyID(); 
		String resultName = "";

		try {

			getConnection();

			String sql = "select name from userinfo where id=?";

			psmt = con.prepareStatement(sql);
			psmt.setString(1, myID);

			// �ܼ���ȸ (update�� ����) - resultset ��ü�� ��ȯ
			rs = psmt.executeQuery();
			// ���� �����Ͱ� ������ true �ƴϸ� false
			while (rs.next()) {
				// �ε��������� �÷��̸�������
				resultName = rs.getString("name");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ���� ���� - ���� ������ �ݴ�
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

	// �ֹ��ϱ�
	public void Order(HashMap<String, Integer> hashmap, String id) {
		//�ֹ��� ����� ���������� ������
		//user = dao.viewInfo(id);
		//String name = user.getName();
		OrderDAO orderDAO = new OrderDAO();
		MenuDAO menuDAO = new MenuDAO();
		
		String name = orderDAO.whosOrder(); //�ֹ��� �̸�
		String item = "";//��ǰ�̸�
		int count = 0 ; //��ǰ����
		int price = 0; // ��ǰ����
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String time = sf.format(new Date()); //�ֹ� �ð�
		
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
			
			// �����ö�, �����Ҷ� execute �ΰ���
			// �����Ҷ��� :
			psmt.executeUpdate();
			}



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

	// �����ڿ� : ���� ��ü �ֹ���ȸ
	public ArrayList<OrderVO> OrderList() {
		ArrayList<OrderVO> list = new ArrayList<>();

		try {
			getConnection();

			String sql = "select * from orderlist";

			psmt = con.prepareStatement(sql);

			// �ܼ���ȸ (update�� ����) - resultset ��ü�� ��ȯ
			rs = psmt.executeQuery();
			// ���� �����Ͱ� ������ true �ƴϸ� false
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
			// ���� ���� - ���� ������ �ݴ�
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

	// ���� ��ü �ֹ���ȸ
	public ArrayList<OrderVO> todayOrderList() {
		ArrayList<OrderVO> list = new ArrayList<>();

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String today = (sf.format(new Date())).substring(8, 10);

		try {
			getConnection();

			String sql = "select * from orderlist";

			psmt = con.prepareStatement(sql);

			// �ܼ���ȸ (update�� ����) - resultset ��ü�� ��ȯ
			rs = psmt.executeQuery();
			// ���� �����Ͱ� ������ true �ƴϸ� false
			while (rs.next()) {

				// ���ó�¥�� �����ֱ�.
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
			// ���� ���� - ���� ������ �ݴ�
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

	// ���� �ֹ�����
	public ArrayList<OrderVO> myOrder() {
		//========================id�ޱ�============================
		// String myID = login.getMyID();
		String myID = login.getMyID();
		ArrayList<OrderVO> list = new ArrayList<>();

		try {
			getConnection();

			String sql = "select * from orderlist where id = ?";

			psmt = con.prepareStatement(sql);

			psmt.setString(1, myID);

			// �ܼ���ȸ (update�� ����) - resultset ��ü�� ��ȯ
			rs = psmt.executeQuery();
			// ���� �����Ͱ� ������ true �ƴϸ� false
			while (rs.next()) {
				// �ε��������� �÷��̸�������
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
			// ���� ���� - ���� ������ �ݴ�
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
