package day05;

public class _0420_Variable {
	
	// 클래스에서는 선언만가능하고 초기화 할수 없다. 
	// 초기화는 메서드안으로 들어가야 한다. ex) a = 10;
	
	int a = 1;  // 선언과동시에 초기값이 들어가는건 가능하다.
	String b;
	
	void printNum(int d) { //매개변수도 지역변수에 속한다.
		
		int c = 1; // 지역변수
		
		System.out.println("멤버변수: " + a);
		System.out.println("멤버변수: " + b);
		System.out.println("지역변수: " + c);
		System.out.println("지역변수(매개변수): " + d);
	}
	
	
}
