package _0501_day12_api_lang_wrapper;

public class AutoBoxingEx {

	public static void main(String[] args) {

		// AutoBoxing: 기본타입 ~ 클래스형 간의 자동형변환.
		Integer val1 = 100;
		int b = val1;

		Double val2 = 3.14;
		double c = val2;
		
		Character val3 = 'C';
		char a = val3;

		// 래퍼클래스의 특별한 기능
		// 문자열 => 기본형을 변환
		int result1 = Integer.parseInt("10");
		double result2 = Double.parseDouble("3.14");
		long result3 = Long.parseLong("10");
		System.out.println(result1 + result2 + result3);
		
		// Integer. compare (a,b)  a가 b보다 크면 양수. b가 크면 작음수 ,같다면 0 
		System.out.println( Integer.compare(5, 3) );  // 앞이크면 양수
		System.out.println( Integer.compare(3, 5) );  // 뒤가크면 음수
		System.out.println( Integer.compare(6, 6) );  // 같으면 0
		


	}

}
