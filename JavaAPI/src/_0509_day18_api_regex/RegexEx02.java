package _0509_day18_api_regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		/*
		 *  [0-9]{2, 4}  숫자중 2~ 4개 연속된 형태 
		 *  [0-9]{3} 0~9숫자중 3개 연속된 형태
		 *  [A-Z]+ 대문자한개이상
		 *  [a-zA-Z]? 알파벳 0~ 1개 나오는 경우
		 *  [가-힣]* 한글이 0회이상 나오는경우
		 *  
		 *  정규표현식에 속하지 않는 문자는 그냥 사용할 수 있다. 
		 *  [0-9]{3}-[0-9]{4} 숫자3개 - 숫자4개 가 나오는 형태.
		 *  정규표현식에 포함되는 문자를 쓰고싶다면 \\역슬래시 2번
		 *  \\+  \가 한개이상 
		 *  \?+ ? 가 한개이상
		 *  
		 *  
		 *  정확히 일치하는 문자
		 *	\?. 정확히 ? 에 일치하는
		 *  [0-9]{3}원 000원 이 나오는 형식을 찾음 
		 *  
		 *  \\d [0-9]와 같은 의미
		 *  \\w [a-zA-Z] 와 같은의미
		 *  \\s 공백을 나타냄
		 *  
		 */

		String info = "홍길동/주소/02-123-4567/aaa123@naver.com";
		String info2 = "이순신/주소/02-1234-4567/bbb123@gmail.com";

		// 전화번호 형식
		String pattern1 = "\\d{2,3}-\\d{3,4}-\\d{4}";
		// 이메일형식 (숫자문자 @문자.숫자)
		String pattern2 = "[a-zA-Z0-9]+@[a-z]+.[a-z]+";

		// 패턴을 컴파일
		Pattern p = Pattern.compile(pattern1);
		Pattern p2 = Pattern.compile(pattern2);

		// 찾는작업
		Matcher m = p.matcher(info);
		Matcher m2 = p2.matcher(info);

		// find() - 일치하는부분이 있다면 true.
		// start() - 일치하는부분의 첫번째 인덱스
		// end() - 일치하는부분의 마지막 인덱스
		// group() - 일치하는부분의 추출

		while(m.find()) { // 패턴이 여러번나오면 순서대로 찾는다.
			System.out.println("첫번째인덱스: " + m.start());
			System.out.println("마지막인덱스: " + m.end());
			System.out.println( m.group());
		}

		while(m2.find()) {
			System.out.println("첫번째인덱스: "+ m2.start());
			System.out.println("마지막인덱스: "+ m2.end());
			System.out.println(m2.group());
		}

		System.out.println("----------------------------------");

		// 리스트안에 요소들에서 순서대로 값을 찾는 형태
		List<String> list = Arrays.asList(info, info2);
		//System.out.println(list.toString());



		for(int i =0; i < list.size(); i++) {

			String str = list.get(i);
			// 패턴생성
			// Pattern x = Pattern.compile(pattern1);
			// Matcher y= x.matcher(str);

			Matcher x = Pattern.compile(pattern1).matcher(str); // 1번째 패턴
			Matcher y = Pattern.compile(pattern2).matcher(str); // 2번째 패턴

			if( x.find()&& y.find() )	{
				System.out.println( x.group() );
				System.out.println( y.group() );			
			}


		}




	}
}
