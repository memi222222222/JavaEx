package Quiz18;

public class StringQuiz02 {

	private static final String masking = null;


	public static void main(String[] args) {

		/* 주민번호 검증메서드 masking(String)
		 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
		 * 
		 * 조건
		 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
		 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		 * 4. 남, 여에 대한 정보를 출력해줍니다.
		 *  
		 * masking메서드를 만들어주세요 
		 * 검증데이터 950101-1000000 -> 남자
		 * 검증데이터 9501012000000 -> 여자
		 * 검증데이터 950101-5000000 -> 예외
		 * 검증데이터 9501015000000 -> 예외
		 * 검증데이터 950101511111 -> 예외
		 */

		try {
			System.out.println(masking("880629-3111111"));

		} catch (Exception e) {
			String result = e.getMessage();
			System.out.println(result);
		}
	}


	public static String masking(String masking) throws Exception {
		masking = masking.replace("-", "");
		String a = "";


		if(masking.length() == 13) {
			if(masking.charAt(6) == '1') {
				a = masking.substring(0,6)+ "-"+masking.substring(6,7)+ "****** -> 남자";

			} else if(masking.charAt(6) == '2'|| masking.charAt(6) == '4') {
				a = masking.substring(0,6)+ "-"+masking.substring(6,7)+ "****** -> 여자" ;

			} else if (masking.charAt(6) != '1' || masking.charAt(6) != '3') {
				throw new Exception("7번째 숫자는 1또는 2어야 합니다.");
			} else if (masking.charAt(6) != '2'){
				throw new Exception("7번째 숫자는 1또는 2어야 합니다.");

			} 

		} else if (masking.length() != 13) {
			throw new Exception("숫자는 총 13자리입니다");

		} 
		return a;
	}
























}
