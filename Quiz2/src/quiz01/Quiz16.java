package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {

		/*
		 *	up/down 게임
		 *	1~ 100 까지 랜덤한 수 를 1번 생성.
		 *	스캐너를 통해서 값을 입력받는다.
		 *	랜덤수가 입력값보다 작으면 " 더 작은수를 입력하세요"
		 *	랜덤수가 입력값보다 크면 "더 큰수를 입력하세요"
		 *	정답을 맞추면 시도횟수 : x 회를 출력하고 종료.
		 *
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("1~ 100까지의 수를 입력하세요");
		System.out.print("정답입력>");
		int i = (int)(Math.random()*100)+1;
		int count = 0;
		while(true) {

			int a = scan.nextInt();
			if(a > i) {
				System.out.println("더 작은 수를 입력하세요");
				count ++;
			}
			if(a < i) {
				System.out.println("더 큰 수를 입력하세요");
				count ++;
			}
			if(a == i) {
				count ++;
				System.out.println("정답입니다");
				System.out.println("시도횟수: "+ count);
				break;
			}
		}


		// 강사님 답안  // 나와다른점: else if 사용, count 위치,( 훠어얼씬더 효율적)
		//
		//		Scanner sc = new Scanner(System.in);
		//
		//		int num = (int)(Math.random() * 100)+1;
		//
		//		int count2 = 0;
		//		while(true) {
		//			System.out.println("정답입력>");
		//			int answer = scan.nextInt();
		//			count2 ++;
		//			if(num == answer) {
		//				System.out.println("정답!");
		//				System.out.println("시도횟수:" + count2);
		//
		//
		//				break;
		//			} else if(num > answer) {
		//				System.out.println("더 큰수를 입력하세요");
		//			} else {
		//				System.out.println("더 작은수를 입력하세요");
		//			}
		//
		//
		//		}


	}

}
