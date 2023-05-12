package _0427_day11_Inter_basic4;

public class Samsung implements Printed{

	
	public void print(String document) {
	
		System.out.println("SAMSUNG: " + document);
		
	}

	public void colorPrint(String document, String color) {
		System.out.println("SAMSUNG: "+ color + ", "+ document);
		
	}

	public int copy(int n) {
		System.out.println("SAMSUNG: " + n + "장 복사");
		return 0;
	}

	
}
