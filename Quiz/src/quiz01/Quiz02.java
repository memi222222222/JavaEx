package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 1~100 사이의 랜덤한 정수를 생성
		
		int result = (int)(Math.random() * 100 + 1); 
		
		// 랜덤하게 나온수가 3의 배수인지, 3의배수가ㅣ 아닌지 3항연산식으로 결과 출력.
		
		String s = result % 3 == 0 ? "맞다" : "아니다";
		System.out.println(result + "는 3의 배수가 " +  s);
		
		

		System.out.println("------------- 강사님 답안 --------------------");
		
		
		int a = (int) (Math.random() * 100) +1;
		// 랜덤하게 나온수가 3의배수인지, 3의배수가 아닌지 3항연산자로 출력
		System.out.println(a %3 ==0 ?a + "는 3의 배수이다" : a + "는 3의배수가 아님" );
		
		
		
	}
}
