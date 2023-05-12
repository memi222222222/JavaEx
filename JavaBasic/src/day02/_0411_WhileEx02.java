package day02;

import java.util.Scanner;

public class _0411_WhileEx02 {

	public static void main(String[] args) {

		// 반복문과 조건문
		// 짝수의 합을 구하는 반복문
		// 1~100까지 수 중에서 짝수의 합 =>100까지 반복도중 짝수일때만 합을 누적함.

		/* int a = 1;
		int sum = 0;  // 누적할 변수
		while(a <= 100) {

			// 특정조건일때 출력
			if(a % 2 == 0) {

				sum += a;
			}

			a++;

		}
		System.out.println("1~100까지 짝수의 합: "+sum);

		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num = scan.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= num) {  // num 까지 반복
			
			if(i % 2 == 0) {

				sum += i;
			}
			
			i++;
						
		}
		
		System.out.println("1부터 " + num + "까지의 합:" +sum );
		
		
			
	}
}