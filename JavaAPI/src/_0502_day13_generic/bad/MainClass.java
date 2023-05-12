package _0502_day13_generic.bad;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * Object형으로 선언시 무엇이든 저장가능하나
		 * 그 값을 사용할 때, 알맞은 타입으로 반드시 형변환을 해야함.
		 * 
		 * 형변환을 잘못 한다면, 예외가 발생한다.
		 * 
		 */
		
		
		
		
		ABC abc = new ABC();
		abc.setObj("홍길동");

		String name = (String)abc.getObj();
		System.out.println(name);


		ABC abc2 = new ABC();
		// Person p = new Person();
		abc2.setObj( new Person());   // 객체저장
		
		Person p =(Person)abc2.getObj();





	}

}
