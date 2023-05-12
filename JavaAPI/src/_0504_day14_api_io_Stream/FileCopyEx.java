package _0504_day14_api_io_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {

	public static void main(String[] args) {

		/*
		 * FileInputStream, FileOutputStream은
		 * 동영상, 이미지파일을 읽거나 쓸때 사용합니다.
		 * 
		 */

		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\메서드1.mp4";
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\메서드1_copy2.mp4";

		// 향상된 try ~ catch 문
		// Closeable 인터페이스를 상속받은 클래스만 사용가능
		// close 작업을 대신함
		
		
		try(InputStream is = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath);) {

			// 읽음 
			byte[] arr = new byte[2048];  // 2kb

			int result;
			while( (result = is.read(arr) ) != -1 ) { //읽은값이 -1이 아닐때까지

				// 쓰기
				out.write(arr, 0 , result); // arr 데이터를 0에서 바이트배열의 result까지만 씀
			}


		} catch (Exception e) {
			e.printStackTrace();


		} /*
		 * finally {
		 * 
		 * 
		 * try { is.close(); out.close(); } catch (Exception e2) {
		 * System.out.println("파일 close 에러"); }
		 * 
		 * }
		 */

		System.out.println("프로그램 정상종료");






	}
}
