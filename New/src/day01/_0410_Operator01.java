package day01;

public class _0410_Operator01 {
	
	public static void main(String[] args) {
		
		// 부호연산자 +, -
		int i = -3; 
		int j = -i; // j = 3
		
		// 증감연산자 ++, --
		int k = 1;
		int h = ++k; // 전위연산 : 값을 먼저 증가시키고. 마지막에 대입.
		
		System.out.println(h); // 2
		System.out.println(k); // 2
		
		int x = 1;
		int y= x++; // 후위연산 : 대입을 먼저하고, 자신을 증가
		
		System.out.println("x는:" + x);
		System.out.println("y는:" + y);
		
		// 일반적인 표현
		x = 1;
		x++;
		++x;
		
		x = 1 ;
		System.out.println(++x); //2
		System.out.println(x++); //2
		
		// 현재 x는 3
		
		// ------------4/10------------
		
		// ~ 연산자 -2진수를 반대로
		byte b = 10; // 0000 1010
		System.out.println(~b);  // 1111 0101
		System.out.println(~b + 1); // 10의 보수 (-10)  
		
		System.out.println("---------------------------------");
		
		// ! 논리연산자 - 부정의 의미
		boolean bool = !true;
		System.out.println(bool);
		System.out.println(!bool);  // 단독으로 사용되는 경우는 거의없다. (조건에 대한 반대를 구할때 사용)
		
		
		
		
		
		
	}

}
