package _0424_day08_super_2;

public class MainClass_2 {
	
	
	public static void main(String[] args) {
		
			 
		Student s = new Student("홍길둥",20,"12345");
		
		System.out.println( s.info() );  // 오버라이딩
		
		
		Teacher t = new Teacher("이순신", 30, "수학");
		
		System.out.println( t.info() ); //오버라이딩
		
		
		Employee e = new Employee("미자",40,"회계부");
		
		System.out.println( e.info() ); //오버라이딩
		
		System.out.println(s.equals(s)); // Object의 상속받은 기능
		
		
	}

}
