package jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoUpdate01 {

	public static void main(String[] args) {
		
		// 부서아이디, 부서이름을 입력받아서, 해당부서의 이름을 변경하닌 update구문

		Scanner scan =new Scanner(System.in);
		
		System.out.println("부서이름 > ");
		String department_name = scan.next();
		System.out.println("부서아이디 > ");
		int department_id = scan.nextInt();
		

		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String uid = "HR";  
		String upw = "HR";  
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String spl ="UPDATE DEPTS SET DEPARTMENT_NAME = ? WHERE DEPARTMENT_ID = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(spl);
			pstmt.setString(1, department_name);
			pstmt.setInt(2,department_id); 
			
				
		
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
