package _0504_day14_api_io_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamEx {

	public static void main(String[] args) {
		
		/*
		 *  1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream 이다
		 *  2. 생성자 매개값으로 파일을 쓸 경로가 들어간다.
		 *  3. io패키지 거의 모든 클래스들은 생성자에 throws 가 았기 대문에
		 * 	 반드시 예외처리 문장안에서 사용한다 
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		
		 // FileOutputStream ou = new FileOutputStream(path);
		
		
		try {
			OutputStream out =new FileOutputStream(path);
			
			// 1st
			// out.write(65);  // 한 글자씩 씀
			// out.write(66);
			// out.write(67);
			
			
			// 2nd     // 배열에 들어가는 데이터를 한번에 씀
			// byte[] arr = { 65, 66, 67, 68, 69 };
			// out.write(arr);
		
			
			// 3nd
			String str = "한글";  // 한글은 1 byte 기반으로 쓰기엔 적합하지 않습니다.
			System.out.println();
			byte[] arr = str.getBytes();
			
			out.write(arr);
			out.close();  // 자원해제
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
