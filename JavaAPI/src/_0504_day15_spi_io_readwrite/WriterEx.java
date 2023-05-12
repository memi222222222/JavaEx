package _0504_day15_spi_io_readwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {

	public static void main(String[] args) {

		/*
		 * 문자를 써서 저장할 때는 2바이트 기반 클래스 FileWriter() 를 사용한다.
		 *  
		 *  
		 */


		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text.txt";

		try ( Writer fw = new FileWriter(path) ) {

			// \n 줄바꿈 
			// \r carriage return
			String str = "그만좀 자세요. \n\r 그만 일어나.\n\r 집에가야디";  
			fw.write(str);
			
			
			
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}




	}
}
