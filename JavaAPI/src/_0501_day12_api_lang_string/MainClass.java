package _0501_day12_api_lang_string;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		char[]arr = {'a', 'b', 'c'};

		String str = "안녕하세여~";
		System.out.println(str);

		// 한글자 자르기
		char a = str.charAt(0);
		System.out.println(a);

		// 찾으면 인덱스번호를 반환, 없다면 -1 반환

		System.out.println( str.indexOf("안녕"));
		System.out.println( str.indexOf("xx"));

		//  if 문자열을포함하면 인덱스번호, 포함하지 않을경우를  -1 로 표시되는것으로 이용
		if (str.indexOf("안녕") != -1) {
			System.out.println("문자에 값이 존재함");
		}

		// 문자열 끝부터 값을 잦는다.
		System.out.println( str.lastIndexOf("녕")); 

		// contains  문자열을 포함하는지
		if (str.contains("여")){
			System.out.println("문지열에 포함되어있다");
		}

		// length 
		System.out.println("문자열의 길이: " + str.length());

		System.out.println("---------------------------------");

		// 문자열 변경 replace
		str = "자바의 기원은, 자바칩프라프치노 커피집에서 시작되었습니다";
		
		System.out.println(str.replace("자바", "Java"));
		System.out.println(str); // 원본이 바뀌지 않는다.\
		
		// 첫 문자만 바뀐다. replaceFirst
		System.out.println(str.replaceFirst("자바", "Java"));
		// 공백 제거
		System.out.println(str.replace(" ", ""));
		
		
		System.out.println("---------------------------------");
		
		
		// 문자열자르기 substring 
		System.out.println( str.substring(9) );  //9 미만 절삭
		System.out.println( str.substring(9 , 17)); // 9이상 17미만 출력
		
		String[] arr2 = str.split(" ");// 특정문자기준으로 잘라 배열로만듬
		System.out.println( Arrays.toString(arr2) );   
		String[] arr3 = str.split(" ", 3);  // 특정문자기준으로 자르지만 배열의 length는 뒤에 숫자로지정
		System.out.println( Arrays.toString(arr3) );   
		
		char[] arr4 = str.toCharArray(); // 한글자씩 잘라서 char 타입 배열로 반환
		System.out.println( Arrays.toString(arr4) );
		
		
		System.out.println("---------------------------------");
		
		// 문자열의 비교 equals 
		str = "홍길동";
		System.out.println( str.equals("홍길동") );// boolean 형태 반환, 
		
		// compareTo 사전등재순의 비교  
		System.out.println( str.compareTo("홍길동")); //  0   = 같은문자 
		System.out.println( str.compareTo("홍길자")); // 음수( - 5047) = str이 홍길자보다 사전등재순 앞에 위치
		System.out.println( str.compareTo("홍길가")); // 양수(2009) = str이 홍길가보다 사전등재순 뒤에 위치함
		
	
		// 특정 구분자로 문쟈열 연결 String.join   (string string .....  나열할 수있다)
		System.out.println(String.join("-", "hello", "world", "안녕","하세요")); 
		
		// 기본타입을 문자열로 변경
		System.out.println(String.valueOf(1) + String.valueOf(2));
		System.out.println("" +1 +2);   // 위에것과 같게 출력됨
		
		
		
		
	
		
		
		
		
		
		
		
	
		
		
		



	}

	private static void reverse() {
		// TODO Auto-generated method stub
		
	}

}
