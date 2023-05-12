package _0501_day12_api_lang_sb;

public class StringBuilderEx {

	public static void main(String[] args) {


		// StringBuilder - 단일쓰레드환경에서 사용
		// StringBuffer - 멀티쓰레드환경에서 사용

		String str = new String("Java");
		StringBuilder sb = new StringBuilder("Java");

		// 차이 
		str = str + "program";
		sb.append(" program");


		System.out.println(str);
		System.out.println(sb);

		// 빌더의 메서드
		// append() - 문자열 끝에 바로추가.원본도같이 변함
		sb.append("ming");
		System.out.println(sb);


		// insert() - 중간에 추가
		sb.insert(5, " study ");
		System.out.println(sb);


		// replace(start, end , string) start 부터 end미만까지 string으로 바꾼다
		sb.replace(4, 11, " book");
		System.out.println(sb);

		// delete(a ,b)-  범위지정 삭제 a이상 b미만까지
		sb.delete(5, 9);
		System.out.println(sb);

		// deleteCharAt() 해당인덱스위치 문자삭제
		sb.deleteCharAt(0);
		System.out.println(sb);

		// reverse() - 거꾸로뒤집기
		sb.reverse();
		System.out.println(sb);

		// toString() 문자열로 형 변환

		//		if(sb.equals("gnimmargorp  ava")) {
		//			System.out.println("같음");
		//		}

		String result = sb.toString();
		System.out.println(result);


	}

}
