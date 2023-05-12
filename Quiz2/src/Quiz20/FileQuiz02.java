package Quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Flushable;
import java.io.InputStreamReader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */

		//1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+now;
		File file = new File(path);
		if( file.exists() == false ) {
			file.mkdir();
			System.out.println("폴더생성완료");
		} else {
			System.out.println("이미존재합니다");
		}
		//------------------------------------------------------
		String name = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("파일이름 입력> ");
		name = scan.next();
		String path2 = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+now+"\\"+name+".txt";

		String str = "";
		try ( BufferedWriter bw = new BufferedWriter( new FileWriter(path2, true)) ){
			while(true) {

				str = scan.nextLine();
				if(str.equals("그만")) {

					break;
				}
				bw.write(str+"\n");			
				bw.flush(); 


			}
			try ( 	BufferedReader br = new BufferedReader(new FileReader(path2)) ){
				String result;
				while( (result = br.readLine()) != null ) {
					System.out.println(result);
				}


			} 

		}catch (Exception e) {
			e.printStackTrace();
		}



	}

}

