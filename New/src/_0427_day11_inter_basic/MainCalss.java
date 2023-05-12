package _0427_day11_inter_basic;

public class MainCalss {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method01();  // override
		b.method02();  // override
		b.method03();  // 나의 메서드
		
		
		System.out.println("-----------------------------");
		
		//  인터페이스도 데이터타입이 될 수있다.
		// Inter1 처럼'만' 사용됨
		Inter1 i1 = new Basic();  // 데이터타입 + 타입변수이름 = new 인스턴스클래스이름();
		i1.method01();
		
		System.out.println("------------------------------");
		
		// Inter2 처럼'만' 사용됨.
		Inter2 i2 = new Basic();
		i2.method02();
		
		System.out.println("------------------------------");
		
		// 인터페이스에서도 클래스 캐스팅을 사용할 수 있당.
		Basic bb = (Basic)i2;
		bb.method01(); 
		bb.method02(); 
		bb.method03(); 

		// static 메서드의 이용
		//Inter1.method4(); 

		//default 메서드의 이용(상속이 내려온다) - 인터페이스에 미리 만들어진 몸체를 갖춘 메서드
		bb.method4(); 
		
		
		
	}
	
}
