package _0504_day16_api_io_bufferd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class 빠른입력 {

	public static void main(String[] args) {
		/*
		 * InputStreanReader 은
		 * 
		 * 1바이트데이터 => 2바이트기반으로 변경
		 * 
		 */

		// Reader  rd = new InputStreamReader( System.in );
		//BufferedReader bw = new BufferedReader(rd);
		
		
		
		try {

			BufferedReader bw = new BufferedReader( new InputStreamReader (System.in));
			System.out.println(">");
			String name = bw.readLine();

			System.out.println(name); //입력받은 결과


			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		














	}



}
