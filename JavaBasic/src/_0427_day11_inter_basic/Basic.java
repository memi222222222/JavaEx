package _0427_day11_inter_basic;

public class Basic implements Inter1, Inter2 {
	// 인터페이스 상속받을 시 class 이름뒤에implements 키워드를 사용
	// 인터페이스에 있는 추상메서드는 반드시 오버라이딩 되야함
	// 인터페이스는 다중상속이 된다.
	
	public void method01() {	
		System.out.println(" 재정의된 1번 메서드 사용 ");
	}

	public void method02() {
		System.out.println(" 재정의된 2번 메서드 사용 ");
	}
	
	public void method03() {
		System.out.println(" 나의 2번 메서드 사용 ");
	}
	
	
	
	
	
	
	
	
	
}
