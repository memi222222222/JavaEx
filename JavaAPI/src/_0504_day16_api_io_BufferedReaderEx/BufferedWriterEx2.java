package _0504_day16_api_io_BufferedReaderEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx2 {

	public static void main(String[] args) {
		
		/*
		 * flush() - 중간중간 파일을 즉시쓰고 싶으면 flush() 를 사용한다.
		 * 
		 *  BufferedWrite가 끝나면 자동으로 flush()가 나간다 ( )
		 */
		Scanner scan= new Scanner(System.in);
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test2.txt";
		
		try( BufferedWriter bw = new BufferedWriter( new FileWriter(path, true)) ) {
			System.out.println(">");
			String word1 = scan.next();  
			bw.write(word1);
			bw.flush();  // 버퍼에 있는 내용을 내보난다 . flush 가없으면 종료될때 한번에 써진다.
			
			
			System.out.println(">");
			String word2 = scan.next();
			bw.write(word2);
			bw.flush();  // 버퍼에 있는 내용을 내보난다 . flush 가없으면 종료될때 한번에 써진다.
			
			System.out.println("파일출력 완료");

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		
		
		
	}
	
	
	
	
	
}
