package day01;

public class _0410_Operator04 {
	
	public static void main(String[] args) {
		
		int a = 6;
		int b = 5;
		
		a += 3; //  a = a + 3 // 9
		b =+ 3; // b = +3  // b를 3으로 선언함   ** 순서의 유의
 		
		System.out.println(a);
		System.out.println(b);
		
		a -= 4; // 5 
		a *= 10; // 50
		a /= 5; // 10
		a %= 2; // 0
		
		// a ?
		System.out.println(a); // 0
		
	}

}
