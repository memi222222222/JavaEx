package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1>");
		
		int a = scan.nextInt();
		System.out.print("연산을 선택하세요[ +, -, *, / ] >");
		String b = scan.next();
		
		System.out.print("정수2>");
		int c = scan.nextInt();
		
		switch (b) {
		case "+" :
			System.out.println("두 수의 합은:" + (a + c));
			break;
		case "-" :
			System.out.println("두 수의 차는:" + (a - c));
			break;
		case "*" :
			System.out.println("두 수의 곱은:" + (a * c));
			break;
		case "/" :
			System.out.println("두 수의 몫은:" + (a / c));
			break;
		
		default:
			System.out.println("잘못 입력하였습니다. 연산을 선택해주세요");
			break;
		}
	
		
		
	}
	
}
