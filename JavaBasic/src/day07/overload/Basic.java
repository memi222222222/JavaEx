package day07.overload;

public class Basic {

	/*
	 *  오버로딩 - 같은이름의 메서드를 여러개 생성하는 것.
	 *  
	 *  규칙 
	 *  1. 이름이 똑같다.
	 *  2. 매개변수를 다르게해서 모형을 다르게 햐야함.
	 *  3. 반환유형은 오버로딩에 영향을 미치지 않음.
	 */


	void input(int a) {
		System.out.println("정수 1개 입력받음");

	}
	//	void input(int x) {   중복불가한 메서드
	//		return 0;
	//	}

	void input(String a) {
		System.out.println("문자열 1개입력받음");
	}
	void input(int a, double b) {
		System.out.println("정수 1개 , 실수1개 입력받음");

	}
	void input(Double a, int b) {
		System.out.println("실수 1개 정수 1개 입력받음");

	}

	void input(int a, char b, double c) {
		System.out.println("정수 1개, 문자 1개, 실수 1개 입력받음");
			
	}
}
