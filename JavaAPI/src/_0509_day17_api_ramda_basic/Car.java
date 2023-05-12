package _0509_day17_api_ramda_basic;

// 구현해야할 추상메서드가 1개인 인터페이스 = 함수적인터페이스 (람다에사용)
public interface Car {

	void run();
	
}

class MyCar implements Car{

	@Override
	public void run() {
		System.out.println("기능고정");
	}
	
}