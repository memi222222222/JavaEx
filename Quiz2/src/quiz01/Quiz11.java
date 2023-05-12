package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		/*
		 *  1. 정수를 입력받습니다.
		 *  2. 입력받은 수 까지 약수의 합
		 * 	
		 * 예시
		 * 입력수 10
		 * 약수의 합 18
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >");
		int a = scan.nextInt();
		int i = 1;
		int sum =0;
		
		while(i <= a) {
			if(a % i ==0) {
				sum += i;
			}
			
			i++;
		}
		System.out.println("1부터 " + a + "까지의 약수의 합:" + sum );
		
	}
	
}
