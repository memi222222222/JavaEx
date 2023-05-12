package _0504_day16_api_io_bufferd;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.channels.FileLockInterruptionException;

public class BufferReaderUTF8 {

	public static void main(String[] args) {

		
		/*  *******  기본 개념 ************
		 *  인코딩 =  파일 or 텍스트문서가 저장될 때 => 컴퓨터가 아는 이진수 형태로 저장하는 형식
		 *  디코딩 = 컴퓨터가 아는 이진수 형태의 데이터 => 인간이 알고있는 문자형식으로 변경
		 *  
		 *  인코딩 대표형식
		 *  -문자인코딩 : 보통 UTF-8(유니코드기반) vs EUC-KR
		 *  -파일인코딩 : Base64 (아스키코드기반)
		 * 		
		 * 
		 * 
		 * InputStreamReader = 1byte기반파일 => 2byte기반으로 변경.
		 * 파일을 읽을때 인코딩 형식을 같이 지할 수있다.
		 * 
		 * 2갖;빙밥
		 *  1. 원본파일의 인코딩을 UTF-8로 변경
		 *  2. 파일의 인코딩형식이 다르면 (한글)이 깨지게 되는데, 인코딩을 동일한 형태로 맞춰서 가지고오면 된다. 
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
	
		
//		InputStream fis = new FileInputStream(path); // 1바이트기반
//		Reader rd = new InputStreamReader( fis, "UTF-8" ) ; //1바이트기반 => 2바이트형식으로 변경
//		BufferedReader br2 = new BufferedReader( rd );  //2바이트기반 빠른읽기.
		
		
		try ( BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream(path), "EUC-KR") ); ){

			String str;
			while( (str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();

		}





	}

}
