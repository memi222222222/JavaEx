package _0425_day09_poly.basic;

public class MainClass {

	public static void main(String[] args) {

		Child c = new Child();
		c.method01(); // 상속받은
		c.method02(); // 오버라이드 된
		c.method03(); // 내것



		System.out.println(" ---- 다형성 적용 (형변환) ------");

		// 현재 타입이 무엇인지 확인! Parent 처럼 사용됨
		Parent p = c;
		p.method01(); 
		p.method02(); //오버라이딩된 자식메소드가 실행됨
		// p.method03(); 자식메소드의 것이라 사용 불가 

		System.out.println(p); // parent 타입
		System.out.println(c); // child 타입
		System.out.println(p == c); //child 로 생성된 자식은 원래의 객체를 유지함.

		System.out.println("-----클래스 강제 형변환------");
		// 원본이 child로 생성되었다면, 강제 형변환이 가능.

		Parent pp = new Child();

		System.out.println(pp);	// child원본

		Child cc= (Child)pp; // 강제 형변환
		cc.method01(); 
		cc.method02(); 
		cc.method03(); 

		// 주의할 점 => 다형성이 적용되었던 객체만 강제형변환이 가능함.
		Object obj = new Object();
		//	Child ccc = (Child)obj; // runtime exception 문법은 맞지만 실행할수없는 오류가있음


		System.out.println("--------다형성의 또다른 예시---------");
		String str = "홍길동";
		Object o = str;  // Object 기능만사용가능
		
		String result = (String)o; // 강제 형변환됨. String기능사용
		System.out.println(result); 
		
		



	}
}
