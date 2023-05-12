package Quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class fileQuiz {

	public static void main(String[] args) {
		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */
		//		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));		


		// 폴더생성
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date); //년 월 일

		Scanner scan= new Scanner(System.in);
		System.out.println("파일명 >");
		String filename = scan.next();

		String filePath = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+now;
		String path = filePath + "\\" + filename + ".txt"; 


		File file = new File(filePath);
		if( file.exists() == false ) {
			file.mkdir();
			System.out.println("폴더생성완료");
		} else {
			System.out.println("이미존재합니다");
		}



		try(BufferedWriter bw = new BufferedWriter( new FileWriter(path)); 
				BufferedReader br = new BufferedReader( new FileReader(path)); ){
			// 쓰는작업
			while(true) {
				System.out.println(" > ");
				String str = scan.nextLine();

				if(str.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}
				bw.write(str + "\n"); // 파일쓰기 		
				bw.flush();
			}
			// 읽는작업
			String result;
			while( ( result = br.readLine() )  != null ) {
				System.out.println(result);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
