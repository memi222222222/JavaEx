package _0426_day10_static_method;

public class Count {


	public int a;
	public static int b;

	// 일반메서드 - 일반멤버와(non- static), 정적멤버(static) 모두 사용가능.
	public int method01() {
		a = 10;
		b++;
		return b;
	}	


	// 정적static 메서드 - 일반멤버를 사용할 수 없지만, 같은 static인 정적멤버는 사용가능.
	public static int method02() {
		//	a = 10;  // 사용 불가 : static이 생성될 당시에 a변수가 없다. 
		Count c = new Count();
		c.a = 10;  //  객체를 메서드안에서 생성 한 후에는 일반멤버 사용가능
		
		
		b++;
		return b;
	}




}
