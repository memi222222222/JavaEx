package Main;

import java.util.Scanner;

public class InflearnQuiz02 {

	public static void main(String[] args) {
		
		// 어린이 키에따른 놀이기구 탑승가능여부 확인
		/*
		 * 조건 1.키가 120cm 이상인 경우에만  탑승가능
		 * 조건 2. 삼항 연산자 이용
		 * 
		 * 실행결과 : 키가 115cm 이므로 탑승 불가능합니다  /115인경우
		 *         키가 120cm 이므로 탑승 가능합니다    /120인경우
		 */
		
		
		Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      
      System.out.println((a >= 120)?"키가 "+a +"이므로 탑승이 가능합니다":"키가 "+a +"이므로 탑승이 불가능합니다" );
	
      scan.close();
      
      
	}
}


