package day06Ingerit.good;

public class _0420_MainClass {
	
	
	public static void main(String[] args) {
		
		 
		_0420_Student s = new _0420_Student();
		
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "12345";
		System.out.println(s.info());
		
		
		_0420_Teacher t = new _0420_Teacher();
		t.age = 30;
		t.name = "이순신";
		t.subjeck = "수학";
		System.out.println(t.info());
		
		
	}

}
