package _0426_day10_abstract_good;

public abstract class Store {
	
	/*
	 *   규칙
	 *   1. abstract를 붙이면 추상메서드가 된다.(강제오버라이딩을 시키기위해)
	 *   2. 추상메서드는 몸체가 없는 메서드 선언.
	 * 	 3. 추상메서드 사용시 , 추상클래스가 되야한다. 
	 * 
	 * 	 4. 추상클래스도 메서드, 생성자, 변수를 전부다 가질 수 있다.(일반클래스와 같음)
	 *  
	 */

	public abstract void apple();
	public abstract void grape();
	public abstract void orange();
	public abstract void melon();
	
	private String name = "호식이치킨";
	
	public Store()	{
		System.out.println("추상클래스 생성자 호출");
	}
	
	public void newMenu() {
		System.out.println("본점만 가지고있는 신메뉴");
	}
	public String getName() {
		return name;
	}
	
	
}
