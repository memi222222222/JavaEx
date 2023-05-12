package _0502_day13_api_util_token;

import java.util.StringTokenizer;

public class TokenEx01 {

	public static void main(String[] args) {

		// 빠른 문자열 분리
		// split()  
		// toCharArray()

		String str1 = "오늘은 날씨가 맑고, 매우 시원하지 않습니다";
		StringTokenizer token = new StringTokenizer(str1);


		// 토큰의 개수확인
		int count = token.countTokens();   //
		System.out.println("나눠진 문장열 개수: " + count);

		// 다음토큰의 여부확인
		System.out.println( token.hasMoreTokens());

		while ( token.hasMoreTokens() != false ) {
			// 다음 토큰 확인
			System.out.println( token.nextToken() );
		}
		
		System.out.println("---------------------------------------");
		// 장점 : 다양한 구분자를 한번에 지정하여 토큰화 가능
		
		String str2 = "2002/11/31/홍길동/010-1111-2222/서울시/www.example.com";
		
		
		// 장점 :  "/", "- ", ". "   기준으로 자름.  
		StringTokenizer token2 = new StringTokenizer(str2,"-/.");
		while( token2.hasMoreTokens() != false){
			
			System.out.println( token2.nextToken());
		}

		
		System.out.println("---------------------------------------");
		// 구분자를 토큰에 포함시킴
		
		StringTokenizer token3 = new StringTokenizer(str2, "/", true);
		int count1 = 0;
		for(int i = 1; token3.hasMoreTokens(); i++) {
			count1 ++;
			System.out.println( token3.nextToken() );
		}

		System.out.println(count1);
		System.out.println("---------------------------------------");
	
	
	
	
	
	}

}
