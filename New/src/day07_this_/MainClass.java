package day07_this_;

public class MainClass {

	
	public static void main(String[] args) {
	
		_0420_Person p1 = new _0420_Person("홍길동", 20);
		
		_0420_Person p2 = new _0420_Person("이순신");
		
		_0420_Person p3 = new _0420_Person();
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		
	}
}
