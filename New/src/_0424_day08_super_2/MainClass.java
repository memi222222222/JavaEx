package _0424_day08_super_2;

public class MainClass {

	
	public static void main(String[] args) {
	
		Person p1 = new Person("홍길동", 20);
		
		Person p2 = new Person("이순신");
		
		Person p3 = new Person();
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		
	}
}
