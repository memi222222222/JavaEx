package _0501_day12_api_lang_math;

public class MathEx {

	public static void main(String[] args) {
		
		// random
		int a = (int)(Math.random()*10) +1; // 1부터 10까지 랜덤값
		System.out.println(a);
		
		// abs // 절대값
		double b = Math.abs(-3.14);
		System.out.println(b);
		
		// ceil  //올림값
		double c =Math.ceil(3.14);
		System.out.println(c);
		
		// floor //내림값
		double d = Math.floor(3.14);
		System.out.println(d);
		
		// round // 반올림
		double e = Math.round(5.3);
		System.out.println(e);
		
		// Max. Min  최대값, 최소값
		
		int f = Math.max(3, 5);  // 큰수 반환
		System.out.println(f);
		
		int f2 = Math.min(3,5);
		System.out.println(f2); // 작은수 반환
		
		
	}
	
}
