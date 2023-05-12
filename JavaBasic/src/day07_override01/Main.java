package day07_override01;

public class Main {
	public static void main(String[] args) {

		
		Parent p = new Parent();
		p.method1(); // 본인의 메서드
		p.method2(); // 본인의 메서드
		
		Child c = new Child();
		c.method1(); // 상속받은 메서드
		c.method2(); // 오버라이드 된 메서드
		
		
		
		
	}
}
