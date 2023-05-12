package _0504_day15_spi_io_readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {

	public static void main(String[] args) {
		
		/*
		 *  문자기반 파일을 읽어서 사용할 때는 FileReader클래스 사용
		 *  2 바이트 기반
		 */
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text.txt";
		
		try(Reader fr= new FileReader(path)) {
			
			int result;
			while ( (result = fr.read()) != -1) {  // 더이상 읽을값이 없다면 -1반환
				System.out.print((char) result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
