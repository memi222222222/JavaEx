package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {


		/*
		 * 1. 하나의 정수를 입력받습니다.
		 * 2. 이 정수가 짝수인지, 홀수인지, 음수인지, 0인지 판별하난
		 * 	  프로그램 코드 작성을 해봅시다.
		 * ex)	3 -> 홀수
		 * 		0 -> 0입니다
		 * 	   -1 -> 음수
		 * 	    2 -> 짝수
		 */	

		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력해주세요 >");
		int a = scan.nextInt();

		if(a<0) {  
			System.out.println("음수 입니다.");
		} else if (a % 2 != 0){
			System.out.println("홀수 입니다.");
		} else if (a == 0) {
			System.out.println("0 입니다.");
		} else {
			System.out.println("짝수 입니다.");	
		}
		
		
		System.out.println("--강사님 답안--");


		System.out.print(" >");
		int a1 = scan.nextInt();

		if(a1 == 0) {  
			System.out.println("0 입니다.");
		} else if (a1<0){
			System.out.println("음수 입니다.");
		} else if (a1 % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else if (a1 % 2 ==1){
			System.out.println("홀수 입니다.");	
		}

	}
}


