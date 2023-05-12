package day04;

public class _0418_MethodEx02 {


	public static void main(String[] args) {

		/*
		 * 매개변스 (parameter)
		 * 메서드가 전달받는 매개값
		 * 여러개를 받을수도 있고, 받지 않을 수도 있습니다.
		 * 
		 * 
		 */

		int result = calSum(10);
		System.out.println("결과: "+ result);

		int result2 = calSum(100);
		System.out.println(result2);

		int result3= calSum2(1 ,2);
		System.out.println("결과는: "+result3 );

		String result4 =calSum3(5, "가");
		System.out.println(result4);

	}  // 메인 끝  ** 중괄호에 주의!!!




	// 1~ 매개변수 까지의 합계	
	static int calSum(int a) {  // () 안에 변수선언 타입, 변수이름
		int sum = 0;
		for(int i = 1; 1 <= a; i++) {
			sum += i;

		}
		return sum;
	}

	// 매개변수를 2개 받음
	static int calSum2(int a, int b) {


		// int result = a + b;

		// return result; 가능
		return a + b ;  // 가능
	}

	// 간단할 실습 - 정수, 문자열으 전달받는 calSum3() 생성
	//  실습 - 문자, 숫자를 받아서 반복시켜서 합치기
	static String calSum3(int a, String s) {
		String str = "";
		for(int i = 1; i <= a; i++ ) {
			str+= s;
		}

		return str;
	}


}
