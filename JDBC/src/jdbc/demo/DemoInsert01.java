package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoInsert01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("부서이름 > ");
		String name = scan.nextLine();
		System.out.println("매니져아이디 > ");
		String manager_id = scan.nextLine();
		System.out.println("로케이션아이디> ");
		String location_id = scan.nextLine();


		// jdbc:oracle:thin:호스트이름:포트번호:DB이름“
		// 데이터베이스 연결정보

		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String uid = "HR";  // ID
		String upw = "HR";  // password

		// insert, update, delete는 ResultSet객체가 필요없음
		Connection conn = null;
		PreparedStatement pstmt = null;

		String spl = "INSERT INTO DEPTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)\r\n"
				+ "VALUES( DEPTS3_SEQ.NEXTVAL, ? , ?, ? )";

		try {
			// 1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 
			conn = DriverManager.getConnection(url, uid, upw);
			
			// 3. pstmt
			pstmt = conn.prepareStatement(spl);
			pstmt.setString(1, name);  // 첫번째 물음표, name
			pstmt.setInt(2, Integer.parseInt(manager_id));
			pstmt.setInt(3, Integer.parseInt(location_id));
			
			
			// 4. sql 실행
			int result = pstmt.executeUpdate();
			System.out.println("성공실패?:" + result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {


			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}


		}
		
	}
}

	
