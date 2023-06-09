package _0501_day12_api_lang_wrapper;

import java.util.Arrays;

public class BoxingEx {

	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		
		// boxing: 기본타입을 => 클래스형으로 변환
		Integer v1 = new Integer(a);
		Double v2 = new Double(b);
		Character v3 = new Character(c);
		Boolean v4 = new Boolean(d);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);

		Object[] arr = {v1, v2, v3, v4};
		System.out.println(Arrays.toString(arr));
		
		// unboxing : 클래스형=> 기본형으로 변환
		int result1 = v1.intValue();
		double result2 = v2.doubleValue();
		char result3 = v3.charValue();
		boolean result4 = v4.booleanValue();
		
		
	}
	
	
}
