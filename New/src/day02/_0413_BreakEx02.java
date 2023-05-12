package day02;

import java.util.Scanner;

public class _0413_BreakEx02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// 반복문 밖에 생성

		while(true) {

			System.out.println("4 x 3 = ? >");
			System.out.print("정답> ");
			int answer = scan.nextInt();

			if (answer == 12) {
				System.out.println("정답입니다!");	
				break;
			} else {
				System.out.println("오답...");
			}




		}


	}

}
