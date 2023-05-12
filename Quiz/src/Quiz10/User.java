package Quiz10;

import javax.naming.StringRefAddr;

public class User {
	/* 문제1
	 * 1. 클래스 User를 생성하세요
	 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
	 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
	 * 4. main에서 User객체를  생성 후  
	 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
	 */
	
	private String name;
	private int rrn;
	private int age;
	
	User(){
		
	}
	private User(String a, int b, int c){
		this.name = a;
		this.rrn = b;
		this.age = c;
	}
	
	public void setName(String a) {
		name = a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRrn(int b) {
		rrn = b;
	}
	public int getRrn() {
		return rrn;
	}
	
	public void setAge(int c) {
		age = c;
	}
	public int getAge() {
		return age;
	}
	
	public void info()	{
		System.out.println("name: " + name+", rrn: " + rrn + ", age: "+age);
	
		}

}
