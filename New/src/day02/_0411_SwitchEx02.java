package day02;

import java.util.Scanner;

public class _0411_SwitchEx02 {


	public static void main(String[] args) {

		// switch  문장의 else if 문과 상당히 유사함

		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력> ");
		int point = scan.nextInt();

		switch (point /10) { //() 안에 연산식 입력가능하나 실수는 불가.
		case 9:
			if(point >=95) {
			System.out.println("A+학점");
			}else {
		System.out.println("A학점");
			}
			System.out.println("상위 10프로네요!");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;

		default:
			System.out.println("재수강 입니다.");
			break;
		}

	}
}
