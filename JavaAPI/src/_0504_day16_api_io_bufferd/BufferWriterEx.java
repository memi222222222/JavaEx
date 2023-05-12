package _0504_day16_api_io_bufferd;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 *  Bufferd가 붙으면 입출력을 빠르게 하는 성능향상 스트림
		 *  
		 *  보조스트림이라 부르고. Reader, Writer, InputStream, OutStream 과 같이사용
		 *  
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt";
		
		// Writer fw = new FileWriter(path);
		// BufferedWriter bw = new BufferedWriter(null);
		
		// Writer 객체에 두번째 매개변수에 true를 주면, 기존파일에 추가하는 형태가 된다.
		
		try ( BufferedWriter bw = new BufferedWriter( new FileWriter(path, true)) ){
			
			String str = "오늘은 날씨가 맑습니다\n내일은 쉽니당.\n";
			bw.write(str);
			
			System.out.println("파일 쓰기 완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
