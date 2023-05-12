package _0428_day12_api_lang_object;

import java.io.PrintStream;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		
		Person p2 = new Person("홍길동");
		
		// equals
		// 객체의 name변수가 같다면 true반환 하도록 overriding
		boolean result = p.equals(p2);
		System.out.println(result);
		
		
		
		// toString - 주소값을 문자열로 반환
		// toString 메서드는 멤버변수값을 출력하도록 오버라이딩으로 많이사용
		System.out.println( p.toString() );
		
		try {
			// 새로운 Person객체를 복사해서 반환
			Person clonePeople = (Person)p.clone();
			
			System.out.println(clonePeople.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 객체의 주소를 해시알고리즘을 통해변경한 값을 반환
		int x = p.hashCode();
		System.out.println(x);
		
		PrintStream ps = System.out;
		ps.println("출력");
		
		
	}
	
}
