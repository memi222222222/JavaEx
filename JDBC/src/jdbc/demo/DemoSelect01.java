package jdbc.demo;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoSelect01 {

	public static void main(String[] args) {

		// jdbc:oracle:thin:호스트이름:포트번호:DB이름“
		// 데이터베이스 연결정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String uid = "HR";  // ID
		String upw = "HR";  // password


		//		String sql= "SELECT * FROM EMPLOYEES WHERE SALARY > 5000";   // SQL문
		String sql= "SELECT * FROM EMPLOYEES WHERE SALARY > ? ";   // 전달값을 ? 로 나타내보기

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;


		//모든 데이터베이스 연결은 try~ catch작성이 되어야 한다.
		try {
			// 1. 드라이버클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 커넥션 객체 생성
			conn =DriverManager.getConnection(url, uid, upw);

			// 3. 커넥션 객체에서 state 객체 생성
			pstmt = conn.prepareStatement(sql);

			// 3-2 SQL문에 전달할 값이 있다면 ?로 처리하고 순서대로 1번부터 시작한다.
			// ? 에 전달될 값은 set 메서드를 이용해서 채운다.
			// setString, setInt, setDouble, setDate, setTimestamp
			pstmt.setInt(1, 20000);  // 첫번째 물음표에 5000원



			// 4. sql문의 실행
			// select는 executeQuery()
			// update, insert, delete 문장은 executeUpdate()
			rs = pstmt.executeQuery();

			// 5. rs.next() 다음행이 있으면, 다음행으로 접근.

			while(rs.next()) {    //  한 행에서 처리할 작업을 while문 안에 넣는다.

				String first_name = rs.getString("first_name");   //getStting, getInt,getDouble, getDate, getTime
				int salary = rs.getInt("salary");
				double cpt = rs.getDouble("commission_pct");
				Date date = rs.getDate("hire_date");
				Timestamp date2 = rs.getTimestamp("hire_date");


				System.out.println(first_name);
				System.out.println(salary);
				System.out.println(cpt);
				System.out.println(date);
				System.out.println(date2);
				System.out.println("-------------------------------------------------");
			}



		} catch (Exception e) {
			e.printStackTrace();
		} finally {


			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}






	}
}
