package _0428_day11_trycatch;

import java.util.Scanner;

public class TryCatchEx_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*
		* next, nextInt, nextDouble, nextLine(라인 한줄)
		* System.out.print("정수 >");
		* int num = scan.nextInt();  // 12엔터 -엔터입력시 모든 입력끝이라고 인식.
        *
		* scan.nextLine(); // 엔터를 소비하여 다음 입력값을 받을 수 있게함
		*
		* System.out.print("문자열>"); 
		* String info = scan.nextLine(); //xxx 엔터 - 엔터를포함해서 받음
        *
		* 	System.out.println(num);
		* System.out.println(info);
        */
        
	
		while(true) {
			
			try {
				
				System.out.print(">");
				int num = scan.nextInt(); // 문자 엔터값을 정상적으로 처리못함
				
				System.out.println(num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
				scan.nextLine(); // 문자 + 엔터값을 대신 처리
			} 
			
			
			
		}
	
	}
	

}
