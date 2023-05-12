package _0426_day10_static_filed;

public class MainClass {

	
	public static void main(String[] args) {
		
	Count c1 = new Count();
	c1.a ++;
	c1.b++;
	System.out.println("c1 의 a: " + c1.a);
	System.out.println("c1 의 b: " + c1.b);

	System.out.println("--------------------");
	
	Count c2 = new Count();
	c2.a ++;
	c2.b ++;
	System.out.println("c2 의 a: " + c2.a);
	System.out.println("c2 의 b: " + c2.b);

	System.out.println("--------------------");
	
	Count c3 = new Count();
	c3.a ++;
	c3.b ++;
	System.out.println("c3 의 a: " + c3.a);
	System.out.println("c3 의 b: " + c3.b);

	// 현재 c1.b c2.b c3.b   = 모두 3
	
	
	System.out.println("============================");
	/*
	 * static은 클래스 밖에 1개가 생성이 되기때문에
	 * 
	 * 객체생성없이 클래스이름.변수명 으로 사용됨
	 * 
	 */
	
	Count.b++;
	Count.b = 100;
	System.out.println(Count.b);
	
	
	
	
	
	
	
	
	
	}
}
