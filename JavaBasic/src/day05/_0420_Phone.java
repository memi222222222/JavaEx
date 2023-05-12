package day05;

public class _0420_Phone {

	String model;
	String color;
	int price;

	
	
	// 생성자를 직접생성하게 되면, JVM이 기본생성자를 자동생성하지 않는다.
	// 생성자는 반환유형이 없다. 메서드와 헤깔리지않게 주의해야한다.!!!!
	// 역할 - 보통 멤버변수를 초기화하는용도로 사용됨
	
	
	_0420_Phone(){

		System.out.println("생성자 호출!!!");

		model = "갤럭시";
		color = "검정색";
		price = 1_000_000;
	}
	// 생성자는 여러개 선언할수 있다
	// !! 단!!! 매개변수의 종류 or 개수가 달라야 함.

	_0420_Phone(String a){

		model = a;
		color = "핑크색";
		price = 200_000;
	}

	_0420_Phone(String a, String b){

		model = a;
		color = b;
		price = 300_000;
	}

	_0420_Phone(String a, int b){

		model = a;
		color = "하양";
		price = b;
	}


	// model, color, price를 매개변수로 받아서 초기화하는 생성자 만들기

	_0420_Phone(String a, String b, int c){

		model = a;
		color = b;
		price = c;
	}

	void info() {

		System.out.println("--------폰의 정보----------");
		System.out.println("모델: "+ model);
		System.out.println("색상: "+ color);
		System.out.println("가격: "+ price);
	}

}
