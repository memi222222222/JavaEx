package _0504_day16_api_io_BufferedReaderEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferdReader {

	public static void main(String[] args) {



		/*
		 * BufferdReader는 입력에 대한 성능향상 보조스트림입니다.
		 * 
		 * Reader 클래스와 같이 사용됨.
		 * 
		 */
		String path ="C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt";
		


		try ( 	BufferedReader br = new BufferedReader(new FileReader(path)) ){

			// String result = br.readLine(); // 한줄씩 읽음
			// System.out.println( result );

			String result;
			while( (result = br.readLine()) != null ) {
				System.out.println(result);
			}


		} catch (Exception e) {
			e.printStackTrace();

		}

















	}


}
