package quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {


		/*
		 * 1. 가로, 세로길이를 입력 받습니다.
		 * 2. 가로, 세로길이만큼 사각형을 출력합니다.
		 * 3. 단, 윤곽만 나오도록 출력합니다.
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("가로>");
		int a = scan.nextInt();
		System.out.println();
		System.out.print("세로>");
		int b = scan.nextInt();
		System.out.println();


		for(int i = 1; i <= b; i++) {

			for(int j =1; j <=a; j++) {

				if(i == 1 || j ==1 || i == b || j == a) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		// 강사님 답안 //

		//		Scanner sc = new Scanner(System.in);
		//
		//		System.out.print("가로>");
		//		int w = sc.nextInt();
		//		System.out.println();
		//		System.out.print("세로>");
		//		int h = sc.nextInt();
		//
		//
		//		for(int o = 1; o <= h; o++) {
		//			for(int p = 1; p <= w; p++) {
		//
		//				if(o == 1 || o == h ) {  // 첫행, 마지막행일때를 생각
		//					System.out.print("*");
		//				}else {
		//					if( p == 1 || p == w) {
		//					System.out.print("*");
		//					}else {
		//						System.out.print(" ");
		//					}
		//				}
		//			}
		//
		//			System.out.println();


	}






}




