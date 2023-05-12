package day01;

public class _0407_DataType2 {

	public static void main(String[] args) {

		// char : 단일문자를 저장 (2byte)
		char c1 = 'A';
		char c2 = 65;  // 아스키코드 :1963년 미국 ANSI에서 표준화한 정보교환용 7비트 부호체계

		// 아스키코드 - 1963년 미국 ANSI에서 표준화한 정보교환용 7비트 부호체계 (1byte)
		// 유니코드 - 전세계 문자에 숫자값을 붙임(2byte - 부호없는 비트체계) 자바는 유니코드체계를 사용
		System.out.println(c1);
		System.out.println(c2);

		char c3 = '가';
		char c4 = 44032;  // 16진수 
		char c5 = '\uAC00'; // 유니코드로 나타냄 AC00  ??? ?? ? ??  뭥미

		System.out.println(c3 + "-" + c4 + "-" + c5);

		// 문자열을 저장할 수 있는 String  // 소문자로 쓰지 않도록 주의 !!
		String s1= "가가가가가 ";
		String s2= "나나나나나 ";

		// 문자열을 연결할때 + 를 사용하면 된다.
		System.out.println(s1 + s2);

		// 문자와 다른값에 + 연산
		System.out.println(100 +100); // 200
		System.out.println("100" + 100); // 100100 문자열 + 다른값 = 문자열
		System.out.println(100 + 100 + "100"); // 200100 
		String s = "100" + 100;

		System.out.println("A"+ 10); // A10
		System.out.println('A'+ 10); // 75  (char + int = int)

	}
}
