package day01;

public class _0407_Casting02 {
	
	public static void main(String[] args) {
	
		// 크기가 큰 타입을 작은타입에 넣을때는 (type)캐스팅을 사용해서 명시하여 변환해준다.
		int i = 70;  // int: 4byte
		char c = (char)i;  // char: 2byte // ()소괄호 속에 변환 할 타입을 적어준다.
		short s =(short)i; 
		
		System.out.println(c); // f
		System.out.println(s); // 70
		
		float f = 3.14f;
		int k = (int)f;
		System.out.println(k);
		
		// 주의할 점 - 타입변환시 값을 받을 수 없는 범위가 들어오면 잘려나간다.
		int a = 1000;
		byte  b = (byte)a;
		System.out.println(b);
		
		// 특이케이스 - 문자와 숫자간에도 명시적 형변환이 들어갑니다.
		char cc = 'A';
		short ss = (short)cc; // 크기는 같지만 명시적 형변환을 해야한다.                                     
		
		
		
	}

}
