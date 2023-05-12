package day05;


// 틀, 설계도로 사용할 클래스는 메인이 없다.
public class _0420_Pen {

	//클래스의 속성(값저장)을 나타낼때 멤버변수(field)
	int price;
	String ink;
	String company;
	
	// 클래스안에 기능을 나타낼때. 메서드라고 부릅니다.
	
	void write() { //반환유형, 이름, 매개변수 x 메서드
		System.out.println(ink + " 색상 글씨를 씁니다");
	}
	
	void info() {
		System.out.println("-------펜의 정보-------");
		System.out.println("가격: " + price);
		System.out.println("색상: " + ink);
		System.out.println("제조사: " + company);
	}
	
}
