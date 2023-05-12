package Quiz16;

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
		 *-----------------------------------------------
		 * err 발생시 시도횟수는 증가 다시입력받을 수 있도록 코드변경
		 *
		 */

		Scanner sc = new Scanner(System.in);

		int num = (int)(Math.random() * 100)+1;

		int count2 = 0;
		while(true) {

			try {

				System.out.println("정답입력>");
				int answer = sc.nextInt();
				count2 ++;
				if(num == answer) {
					System.out.println("정답!");
					System.out.println("시도횟수:" + count2);
					break;
					
				} else if(num > answer) {
					System.out.println("더 큰수를 입력하세요");
				} else {
					System.out.println("더 작은수를 입력하세요");
				}


			} catch (Exception e) {
				count2 ++;
				System.out.println("숫자만 입력 가능합니다.");
				sc.nextLine();
			}

		}


	}

}
