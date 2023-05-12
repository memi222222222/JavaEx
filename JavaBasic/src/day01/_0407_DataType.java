package day01;

public class _0407_DataType {
	
	public static void main(String[] args) {
	
		//정수형타입 * 최대 저장가능한 숫자표시했음
		byte a = 127;  
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647; 
		int c1 = -2147483648;
		
		long d = 123123123123123123L;  //long 타입을 나타내는 L을 붙여준다.
		
		// 2진수, 8진수, 16진수 
		int bin = 010; // 8진수는 앞에 0을 붙임.
		System.out.println("8진수 010은 : " + bin + "입니당!"); // +를 이용해여 문장을 연결하여 출력시킴.
		
		int bin2 = 0b111; // 2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은 : " + bin2);
		
		int hexa = 0xA9; // 16진수는 앞에 0x 또는 )X로 시작
		System.out.println("16진수 A9는 : " + hexa);
		
		System.out.println("-------------------------------------------");
		
		// 실수형 타입
		float f1 = 3.14f; // float임을 나타내는 f를 꼭 붙여준다.  
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.14159277777f;
		double d2 = 3.14159277777;
		
		System.out.println(f2); // 7자리까지 유효함
		System.out.println(d2); // 15자리까지 유효함
		
		System.out.println("-------------------------------------");
		
		// true, false 만 저장 가능함.
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
		

		
		
	}

}
