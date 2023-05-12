package Quiz05;

public class Calculator {


	/* 요구사항
	 * Calculator를 부모클래스로 선언하세요.
	 * Calculator를 상속받는 Computer클래스 생성 합니다.
	 * 
	 * Calculator의 멤버변수 result, pi를 선언하세요
	 * Calculator의 메서드
	 * add(int) : void - result에 값을 누적시키는 기능
	 * sub(int) : void - result에 값을 차감시키는 기능
	 * circle(int) :double - pi를 이용해서 원의 넓이를 구하는 기능
	 */

	int result;
	double pi = 3.14;

	void add(int a) {
		result += a;
		System.out.println(a + " 누적 됨");
	}
	void sub(int b) {
		result -= b;
		System.out.println(b + " 감소 됨");
	}
	double circle(int c) {
		return c * c * pi;
	}	


}
