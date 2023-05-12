package _0502_day13_generic.good;

import _0502_day13_generic.bad.Person;

public class MainClass {


	public static void main(String[] args) {

		// ABC abc = new ABC();

		ABC<String> abc = new ABC<String>(); 

		abc.setT("홍길동");
		String name = abc.getT();


		ABC<Person> abc2 = new ABC<>();   // 생성자의 "< > "는 생략가능 

		abc2.setT( new Person());
		Person p = abc2.getT();


		ABC<Object> abc3 = new ABC<>();

		// 제네릭타입은 원시타입을 허용하지 않는다  . 다양한값을 저장할수 있게 사용한다
		// Integer로 써야한다
		// ABC<int> abc4 = new ABC<>();     // X  
		// ABC<Integer> abc4 = new ABC<>(); // O
		
		/////////////////////////////////////
		// multie ganeric
		DEF<Integer, String> def = new DEF<>();
		
		
		
		
		
		





	}


}

