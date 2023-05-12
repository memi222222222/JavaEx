package _0427_day11_Inter_basic4;

public class LG implements Printed {

	private String logo = "Life is good";
	
	public void print(String document) {
		System.out.println(logo);
		System.out.println(document);
	}
	

	public void colorPrint(String document, String color) {
		System.out.println(logo);
		System.out.println("color:" + color);
		System.out.println( color + "색상: " + document);
		
	}

	public int copy(int n) {
		
		for(int i = 0; i < n; i++) {
			System.out.println(i + "장 복사 중");
		}
		
		return 1; //완료시 1 반환
		
	}
	
}
