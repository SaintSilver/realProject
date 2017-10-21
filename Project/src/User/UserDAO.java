package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.plaf.ListUI;

public class UserDAO {

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "system";
	private String pw = "1234";
	private Connection con = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	UserVO user = new UserVO();
	ArrayList<UserVO> list = new ArrayList<>();

	public void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// con -연결주소 : 주소, 계정명, 비번
		con = DriverManager.getConnection(url, id, pw);
	}

	public void join(UserVO user) {

		try {

			int lastUserNumber = getLastUserNumber() + 1;

			getConnection();

			String sql = "Insert into UserInfo values(?,?,?,?,?,?,?)";
			psmt = con.prepareStatement(sql);

			psmt.setInt(1, lastUserNumber);
			psmt.setString(2, user.getUserType());
			psmt.setString(3, user.getId());
			psmt.setString(4, user.getPassword());
			psmt.setString(5, user.getName());
			psmt.setString(6, user.getContact());
			psmt.setString(7, user.getGender());

			// 꺼내올때, 변경할때 execute 두가지
			// 변경할때는 :
			psmt.executeUpdate();

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

	private int getLastUserNumber() {

		int result = 1;
		int temp = 0;

		try {

			String sql = "select usernumber from userinfo";
			getConnection();
			psmt = con.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {
				temp = rs.getInt("usernumber");
				if(temp > result) {
					result = temp;
				}
			}

		} catch (ClassNotFoundException | SQLException e) {
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
		return result;
	}

	public boolean login(String id, String password) {

		try {

			String sql = "select id, password from userinfo where id= ?";
			getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			if (rs.next()) {
				if (password.equals(rs.getString("password"))) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}

		} catch (ClassNotFoundException | SQLException e) {
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
		return false;
	}

	public void closeAccount(String id) {
		try {
			getConnection();

			String sql = "delete userinfo where id = ?";
			psmt = con.prepareStatement(sql);
			// ? 순번(1부터시작), 넣을 값
			psmt.setString(1, id);
			
			psmt.executeUpdate();

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

	public UserVO viewInfo(String id) {

		UserVO userInfo = null;

		try {
			getConnection();

			String sql = "select * from userinfo where id=?";

			psmt = con.prepareStatement(sql);

			psmt.setString(1, id);

			// 단순조회 (update는 변경) - resultset 객체로 반환
			rs = psmt.executeQuery();
			// 다음 데이터가 있으면 true 아니면 false
			while (rs.next()) {
				// 인덱스도가능 컬럼이름도가능
				int resultUserNumber = rs.getInt(1);
				String resultUserType = rs.getString(2);
				String resultID = rs.getString(3);
				String resultPW = rs.getString(4);
				String resultName = rs.getString(5);
				String resultContact = rs.getString(6);
				String resultGender = rs.getString(7);
				userInfo = new UserVO(resultUserNumber, resultUserType, resultID, resultPW, resultName, resultContact,
						resultGender);
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

		return userInfo;

	}

	// 회원정보수정
	public void ChangeInfo(UserVO user) {

		try {
			getConnection();

			String sql = "update userinfo set password =? , name = ? , contact = ? where id = ?";
			psmt = con.prepareStatement(sql);

			psmt.setString(1, user.getPassword());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getContact());
			psmt.setString(4, user.getId());

			// 꺼내올때, 변경할때 execute 두가지
			// 변경할때는 :
			psmt.executeUpdate();

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
	
	//관리자용 수정
	public void ChangeInfoAdmin(UserVO user) {
		try {
			getConnection();

			String sql = "update userinfo set usernumber =?, usertype=?, name = ? , contact = ? where id = ?";
			psmt = con.prepareStatement(sql);

			psmt.setInt(1, user.getUserNumber());
			psmt.setString(2, user.getUserType());
			psmt.setString(3, user.getName());
			psmt.setString(4, user.getContact());
			psmt.setString(5, user.getId());

			// 꺼내올때, 변경할때 execute 두가지
			// 변경할때는 :
			psmt.executeUpdate();

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

	// 관리자용
	public ArrayList<UserVO> getUserList() {

		ArrayList<UserVO> list = new ArrayList<>();

		try {
			getConnection();

			String sql = "select * from userinfo";

			psmt = con.prepareStatement(sql);

			// 단순조회 (update는 변경) - resultset 객체로 반환
			rs = psmt.executeQuery();
			// 다음 데이터가 있으면 true 아니면 false
			while (rs.next()) {
				// 인덱스도가능 컬럼이름도가능
				int resultUserNumber = rs.getInt("usernumber");
				String resultUserType = rs.getString(2);
				String resultID = rs.getString(3);
				String resultName = rs.getString(5);
				String resultContact = rs.getString(6);
				String resultGender = rs.getString(7);

				list.add(new UserVO(resultUserNumber, resultUserType, resultID, resultName, resultContact,
						resultGender));
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
		}

		return list;

	}

	public boolean isPossibleJoin(String id) {

		try {
			list = getUserList();

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId().equals(id)) {
					return false;
				}
			}
			return true;

		} catch (Exception e) {
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
		return false;
	}

	public boolean checkInputOnlyNumberAndAlphabet(String textInput) {

		char chrInput;

		for (int i = 0; i < textInput.length(); i++) {

			chrInput = textInput.charAt(i);

			if (chrInput >= 0x61 && chrInput <= 0x7A) {
				// 영문(소문자)
			} else if (chrInput >= 0x30 && chrInput <= 0x39) {
				// 숫자
			} else {
				return false; // 영문자도 아니고 숫자도 아님!
			}
		}

		return true;
	}
	
	public boolean checkInputOnlyNumber(String textInput) {

		char chrInput;

		for (int i = 0; i < textInput.length(); i++) {

			chrInput = textInput.charAt(i);

			if (chrInput >= 0x30 && chrInput <= 0x39) {
				// 숫자
			} else {
				return false; // 영문자도 아니고 숫자도 아님!
			}
		}

		return true;
	}
	
	

}
