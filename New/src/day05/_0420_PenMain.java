package day05;


public class _0420_PenMain {
	
	public static void main(String[] args) {
		
		// 펜을 사용하려면 객체로 생성해야 합니다.
		_0420_Pen red = new _0420_Pen();
		
		red.ink = "빨강색";
		red.price = 2000;
		red.company = "빨간펜";
		
		red.write();
		
		_0420_Pen black = new _0420_Pen();
		black.ink = "검정색";
		black.price = 1000;
		black.company = "모나미";
		
		black.write();
		
		red.info();
		black.info();
		
		
	}

}
