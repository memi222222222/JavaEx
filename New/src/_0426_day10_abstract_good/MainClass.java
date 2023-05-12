package _0426_day10_abstract_good;

public class MainClass {
	public static void main(String[] args) {

		/*
		 *  1. 추상메서드사용시 메서드오버라이딩 강제화 되어 프로그래머의 오버라이딩실수를 줄일 수있다.
		 *  
		 *  2. 객체의 추상화 == 다형성의 사용 
		 *   =>추상클래스는 객체로 생성이 안된다. 자식으로 생성해서 부모타입으로 구체화하여 사용
		 */
		
		
		// Store s = new Store(); (X) 불가 자식으로만 구체화 시킬수 있다.
		
		Store s1 = new SeoulStore(); // 오버라이딩된 메서드는 먼저실행됨.
		s1.apple();
		s1.melon();
		s1.grape();
		s1.orange();
		s1.newMenu();
		System.out.println(s1.getName());

		System.out.println("--------------------");
		
		BusanStore s2 = new BusanStore();
		s2.apple();
		s2.melon();
		s2.grape();
		s2.orange();
		s2.newMenu();
		System.out.println(s2.getName());
		
		
		
		
		
	}

}
