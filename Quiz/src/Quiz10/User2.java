package Quiz10;

public class User2 {

	/* 문제1
	 * 1. 클래스 User를 생성하세요
	 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
	 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
	 * 4. main에서 User객체를  생성 후  
	 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
	 */

	
	private String name;
	private int age;
	private int rrn;
	
	public User2() {
		
	}
	
	public User2(String a, int i, int j) {
		this.name = a;
		this.rrn = i;
		this.age = j;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRrn() {
		return rrn;
	}
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	
	
	
	
}
