package _0501_day12_api_lang_sb;

public class StringBuilderEx2 {

	public static void main(String[] args) {

		// 문자열과 향상된문자열의 차이
				
				long start = System.currentTimeMillis()	;
		//		
		//		String str = "A";
		//		for(int i = 1; i <= 300_000; i++) {
		//			str += "A";
		//			
		//		}
		//		

		StringBuilder sb = new StringBuilder("A");
		for(int i = 1; i <= 300_000; i++) {
			sb.append("A");
		}
		
				
		
		long end = System.currentTimeMillis()	;
		System.out.println( "수행시간: " + (end - start) *  0.001 );







	}

}
