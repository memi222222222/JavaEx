package jdbc.demo.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptsDAO {

	// 멤버변수 선언  // 데이터베이스 연결정보
	// jdbc:oracle:thin:호스트이름:포트번호:DB이름“
	private String url = DBProperties.URL; 
	private String uid = DBProperties.uid;  // ID
	private String upw = DBProperties.upw;  // password

	public DeptsDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();			

		}

	}

	// 필요한문장 메서드로 만들기 
	// ( 데이터베이스 결과: 1행=> VO를 반환
	// 	 데이터베이스 결과: 여러행=> List<VO> 반환)

	public List<DeptsVO>  getDepts(String name) {


		// 값을 반환할 리스트 생성
		List<DeptsVO> list = new ArrayList<>();


		String sql = "SELECT * FROM DEPTS WHERE DEPARTMENT_NAME = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;




		try {
			conn = DriverManager.getConnection(url,uid, upw);  
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);

			rs = pstmt.executeQuery();


			while( rs.next() ) {

				// 가져올타입 + 이름 = rs. get 변수타입(컬럼명); 
				int department_id = rs.getInt("department_id");
				String department_name = rs.getString("department_name");
				int manager_id = rs.getInt("manager_id");
				int location_id = rs.getInt("location_id");

				// 1행에 대한 값을 저장
				DeptsVO  vo = new DeptsVO(department_id, department_name, 
						manager_id, location_id);
				// 리스트에 vo를 추가
				list.add(vo);


			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();

			} catch (Exception e2) {}
		}

		return list;
	}


	// 인서트메서드
	public int /*void*/ insertDepts(DeptsVO vo) {

		int result = 0;  //0반환시 실패, 1반환시 성공
		// insert, update, delete는 ResultSet객체가 필요없음
		Connection conn = null;
		PreparedStatement pstmt = null;

		String spl = "INSERT INTO DEPTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)\r\n"
				+ "VALUES( DEPTS3_SEQ.NEXTVAL, ? , ?, ? )";

		try {
			// 2. conn
			conn = DriverManager.getConnection(url, uid, upw);

			// 3. pstmt
			pstmt = conn.prepareStatement(spl);
			pstmt.setString(1, vo.getDepartment_name());  // 첫번째 물음표, name
			pstmt.setInt(	2, vo.getManager_id());
			pstmt.setInt(	3, vo.getLocation_id());


			// 4. sql 실행
			result = pstmt.executeUpdate();   // 성공시 1반환, 실패시 0반환

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
			}

			return result;
		}



	}
}	
