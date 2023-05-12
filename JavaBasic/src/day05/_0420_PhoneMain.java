package day05;

public class _0420_PhoneMain {

	
	public static void main(String[] args) {
		
		_0420_Phone black = new _0420_Phone();
		black.info();
		
		_0420_Phone pink = new _0420_Phone("아이폰14");
		pink.info();
			
		_0420_Phone red = new _0420_Phone("TTL", "빨강");
		red.info();
	
		_0420_Phone white = new _0420_Phone("가로본능", 4000);
		white.info();
	
		_0420_Phone gold = new _0420_Phone("MOTOROLA", "GOLD" , 1_000_000);
		gold.info();
	
	
	
	}
	
	
	
	
	
}
