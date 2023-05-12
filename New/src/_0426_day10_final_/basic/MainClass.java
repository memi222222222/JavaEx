package _0426_day10_final_.basic;

public class MainClass {

	public static void main(String[] args) {

		Person p1 = new Person("123123", "홍길동");
		//		p1.nation = "미국";
		System.out.println(p1.ssn);

		Person p2 = new Person("456456", "이순신");
		System.out.println(p2.ssn);

		
		
		System.out.println(Contant.DOMAIN);
	}

}
