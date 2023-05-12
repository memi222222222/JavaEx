package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		// 1. 두 정수를 입력 받고, 큰 수를 출력하면 된다.
		// 단, 같은 수 라면 "같은 수 입니다" 출력.

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두개를 입력하시오");
		System.out.print(">");
		int a = scan.nextInt();
		System.out.print(">");
		int b = scan.nextInt();
				
		if (a > b ) {
			System.out.print("더 큰수는 > "+ a);
		} else if (b > a) {
			System.out.print("더 큰수는 > "+ b);
		} else {
			System.out.println("같은 수 입니다.");
		}
		
		scan.close();
		
	}

}
