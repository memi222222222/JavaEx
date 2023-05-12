package quiz01;

import java.util.Scanner;

public class Quiz03 {

	
	public static void main(String[] args) {
		
		//키와 나이를 입력하세요
		// 키> 173.1
		// 나이> 20
		//놀이기구 탑승이 가능합니다
		//키 140이상, 나이는 8세이상인 경우만 "놀이기구 탑승가능"
		
		Scanner scan = new Scanner(System.in);
			
		
		System.out.println("키와 나이를 입력하세요.");
		double a = scan.nextDouble();
		System.out.println("키>"+ a);
		int b = scan.nextInt();
		System.out.println("나이>"+ b);
		
		if(a >= 140 && b >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다");
		} else{
			System.out.println("놀이기구 탑승이 불가능합니다");
			
		}
		
		
		
		
	}
}
