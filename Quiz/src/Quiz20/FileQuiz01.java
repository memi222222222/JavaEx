package Quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		
		/*
		 * 1. 스캐너를 통해서 파일명 입력받기.
		 * 2. 입력받은파일을 filecopy로 복사해서 옮겨준다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("copy할 파일이름>");
		String name = scan.next();
		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+name;
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\"+name;
	
		
		
		try(InputStream in = new FileInputStream(readPath);
			OutputStream out = new FileOutputStream(writePath);){
				
			
			byte[] arr = new byte[2048];
			
			int result;
			while( (result = in.read(arr)) != -1) {
				
				out.write(arr, 0 , result);
			}
			System.out.println("파일복사 완료");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("프로그램 정상종료");
		
	}
	
}
