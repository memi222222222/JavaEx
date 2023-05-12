package _0427_day11_inter_basic;

public interface Inter1 {
	// public static final 이 자동으로 붙어서 상수취급됨
	int A = 10;
	
	// 메서드선언시 자동으로 추상메서드가 된다. ( {}중 괄호X )
	void method01();

	// 인터페이스는 static, default 메서드 선언가능
	public static void method03() {
		System.out.println("스테틱메서드");
	}
	
	public default void method4() {
		System.out.println("디폴트 메서드");
	}
	
	
}
