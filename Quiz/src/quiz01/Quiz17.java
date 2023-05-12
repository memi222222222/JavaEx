package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {

		//		Scanner scan = new Scanner(System.in);
		//
		//
		//		int tCount = 0;
		//		int fCount = 0;
		//		int z = 0;
		//		String[] x = {"+","-"};
		//
		//		while(true) { 
		//			int a = (int)(Math.random()*100)+1;
		//			int b = (int)(Math.random()*100)+1;
		//			int c = (int)(Math.random()*2);
		//			System.out.println("-----------");
		//			System.out.println(a + " " + x[c] + " " + b +" = " + " ? ");
		//			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
		//			System.out.print("> ");
		//			int i = scan.nextInt();
		//			System.out.print("> ");
		//			if(c == 0) {
		//				z =  a + b;
		//			}else {
		//				z = a - b;
		//			}
		//			if(i == z) {
		//				System.out.println("정답입니다!");
		//				tCount++;
		//			}else if (i == 0) {
		//				System.out.println("프로그램 정상종료");
		//				System.out.println("정답:" + tCount);
		//				System.out.println("오답:" + fCount);
		//				break;
		//			}else{
		//				System.out.println("틀렸습니다");
		//				fCount++ ;
		//			}
		//
		//		}

		// ---------------------강사님 답안 ---------------

		Scanner sc = new Scanner(System.in);

		int okCount = 0;
		int noCount = 0;

		while(true) {
			int num1 = (int)(Math.random() * 100) + 1;
			int num2 = (int)(Math.random() * 100) + 1;
			int oper = (int)(Math.random() * 2); // + 1 을 할경우 1,2 만 나온다.


			System.out.println("--------------------");	
			System.out.println(num1 +(oper == 0 ? " + " :" - ")  + num2 +" = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");	
			System.out.print(">");

			int answer = sc.nextInt();
			int correct = oper == 0? num1 + num2 :num1 -num2;


			if(answer == 0) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답횟수:"+ okCount);
				System.out.println("오답횟수:"+ noCount);
				break;

			}
			if(answer == correct) {  // 정답
				System.out.println("정답입니다");
				okCount++;
			}else{ // 오답
				System.out.println("오답입니다");
				noCount++;

			}
		}

	}

}
