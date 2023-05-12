package day04;

import java.util.Arrays;


public interface _0419_StringManipulation {

	public static void main(String[] args) {

		// 문자열 다루기
		// 문자열은 사실 배열이다. 문자열은 인덱스가 있다

		String str = "안녕하세요~ 영어로하면 하이!";

		// System.out.println( str[0] ); //안됨//
		// 문자열을 다루는 다양한 메서드를 제공
		// 문자열을 한글자 자르기 charAt
		char c = str.charAt(5);
		System.out.println(c);


		// 문자열의 위치확인 indexOf-앞애서  , lastIndexOf - 뒤에서부터
		int idx = str.indexOf("하");  // 찾는문자열이 없을경우 음수로표현됨
		System.out.println("문자의 위치: " + idx);
		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은 위치: "+ idx2);


		// 문자열 변환 toUpperCase(대문자로변환), toLowerCase(소문자로변환).
		String s ="abcDEF";
		String result = s.toUpperCase(); // 대문자로!
		System.out.println(result); //★★★ 원본문자열은 그대로 유지★★★	

		String result2 = s.toLowerCase(); //소문자로 !
		System.out.println(result2); //★★★ 원본문자열은 그대로 유지★★★	

		System.out.println("----------------------------------------");

		// 문자열 변경 replace
		s = "abcdefaaa";
		String result3 = s.replace("a","x");
		System.out.println(result3); // a 를 x 로 전부변경!

		String result4 = s.replaceFirst("a", "x");
		System.out.println(result4);

		System.out.println("-----------------------------------------------");

		// 공백제거
		str = "      010-1111-2222     "; 


		String result5 = str.trim();   //앞뒤 공백을 제거해서 반환

		System.out.println(result5);

		str = " 안녕 하세요? 오늘은 4월 19일 입니다 ";
		str = str.replace(" ","");
		System.out.println(str);

		System.out.println("--------------------------------------------------");
		// 문자열 자르기.⭐⭐⭐⭐⭐ 중요!!!!!!!!

		// 특정 위치에서 자르기 substring  (인덱스 기준)
		str = "010-1111-2222";
		String result6 = str.substring(9);  // 인덱스위치 미만 절삭
		System.out.println(result6);

		String result7 = str.substring(4, 8); // 4부터 8 전까지. 4이상 8미만의 인덱스위치를 추출
		System.out.println(result7);

		System.out.println(str);  //원본 문자열은 변함 없다

		// split - 특정 문자를 기준으로 자름 (제대로 사용하려면 정규표현식)

		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));

		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr2));

		// to CharArray - 한글자씩 char 형으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));

		System.out.println("----------------------------------------");
		// 문자열의 길이.
		str = "안녕하세용";
		int len = str.length();
		System.out.println("문자열 길이: "+ len);

		// 문자열의 비교

		if(str.equals("안녕하세용")){
			System.out.println(" 두 문자가 같음.");
		}else {
			System.out.println(" 두 문자가 다름.");
		}

		// 문자열의 포함여부 contains()
		if(str.contains("녕")) {
			System.out.println("녕이 포함되어있음");
		}else {
			System.out.println("포함되지 않음");
		}
	}


}	


