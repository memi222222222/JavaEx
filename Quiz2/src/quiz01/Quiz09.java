package quiz01;

import java.util.Scanner;

public class Quiz09 {
	
	public static void main(String[] args) {
	
		/*
		 * 어떤 정수를 입력받습니다.
		 * 입력받은 정수에 해당하는 구구단을 세로로 출력해보세요
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		int a = scan.nextInt();
		System.out.println("구구단:"+ a +"단");
		int b = 1;
		while(b < 10) {
			System.out.println(a +" X "+ b +" = " + (a*b));
			
			b++;
		}
		
		
		
	}

}
