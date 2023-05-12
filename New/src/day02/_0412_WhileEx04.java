package day02;

import java.util.Scanner;

public class _0412_WhileEx04 {

	public static void main(String[] args) {

		/*
		 *  입력받을 횟수를 지정
		 *  ex) 처음 5를 입력받을시
		 * 		5번 입력받을 수 있도록 처리
		 * 
		 *  입력받은 갑들의 합을 구하시오
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("반복수>");
		int size = scan.nextInt();
		int a = 1;
		int sum = 0; // 누적합계
		while(a <= size) {

			System.out.print(">");
			int x = scan.nextInt();
			sum += x;

			a++;	
		}
		System.out.println("입력받은 수의 합계: " + sum);

	}

}
