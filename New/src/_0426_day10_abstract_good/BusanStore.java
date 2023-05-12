package _0426_day10_abstract_good;

public class BusanStore extends Store{

	@Override
	public void apple() {
		System.out.println("부산 지점 사과: 200원");
	}

	@Override
	public void grape() {
		System.out.println("부산 지점 포도: 300원");
	}

	@Override
	public void orange() {
		System.out.println("부산 지점 오렌지: 400원");
	}

	@Override
	public void melon() {
		System.out.println("부산 지점 멜론: 500원");
	}

}
