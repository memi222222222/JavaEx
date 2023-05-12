package _0424_day08_Modi.member.pac1;

public class B {

	// 사용
	A a = new A(); // public  사용가능
	A a2 = new A(1); // default  사용가능
	//	A a3 = new A("홍길동"); // private  사용 X

	public B() {
		a.var1 = 1;
		a.var2 = 2;
		//	a.var3 = 3; // private 접근 x 

		a.method1();
		a.method2(); 
		//	a.method3(); //private 접근 x 

	}


}
