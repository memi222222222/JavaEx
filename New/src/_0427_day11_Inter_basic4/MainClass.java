package _0427_day11_Inter_basic4;

public class MainClass {

	public static void main(String[] args) {

		Printed lg = new LG();
		Printed ss = new Samsung();
		LG lg2 = new LG();
		
		
		Samsung s = new Samsung();

		lg.print("Hello World");
		lg.colorPrint("Hello World"," 파란색");
		int result = lg.copy(5);



		//		ss.print("Hello World");
		//		ss.colorPrint("Hello World"," 파란색");
		//		int result2 = ss.copy(5);

	
	
	
	}

}
