package _0420_day06.import_ex;

//import day06.fruit._0420_Apple; // 패키지명을 포함한 클래스명
//import day06.fruit._0420_Melon;
import day06.fruit.*;  // 해당 패키지것을 전부사용하겠다 -> .*;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		_0420_Apple applet = new _0420_Apple();
		_0420_Melon melon = new _0420_Melon();
		
		int a = 1;
		System.out.println(a);
		System.out.println(melon);  // 주소값 (heap)
		
		
	}
}
