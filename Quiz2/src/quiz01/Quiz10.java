package quiz01;

import java.util.Scanner;

public class Quiz10 {

	
	public static void main(String[] args) {
		
		/*
		 *  1. 정수를 입력받습니다.
		 *  2. 입력받은 정수까지 수 중에서 3의배수이거나, 4의배수일 경우에는
		 *    공백으로 구분해서 가로로 출력
		 * 예시
		 *  입력수 10
		 *  출력수 3 4 6 8 9 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력수>");
		int a = scan.nextInt();
		int i = 1;
		while(i <= a) {
			if(i % 3 == 0 || i % 4 == 0) {
				System.out.print(i+" ");
		}
			
			i++;
		}
		
	}
}
