package Main;

import java.util.Scanner;

public class Quiz17_1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String S = "";
		int T = 0;
		int count1 = 0;
		int count2 = 0;

		while(true) {
			int A = (int)(Math.random()*100+1);
			int B = (int)(Math.random()*100+1);
			int C = (int)(Math.random()*2);
			if(C == 0) {
				S = " + ";
			}else {
				S = " - ";
			}
			System.out.println("--------------------");
			System.out.println(A+ S + B +" = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int a = sc.nextInt();
			System.out.println();

			if(C == 0) {
				T = A + B;
			}else {
				T = A - B;
			}
			if(a == T) {
				System.out.println("정답입니다!");
				count1 ++;
			}else if(a == 0){
				System.out.println("프로그램 정상 종료");
				System.out.println("정답:"+ count1);
				System.out.println("정답:"+ count2);
				break;
			}else{
				System.out.println("오답입니다");
				count2 ++;
			}

		}



	}
}
