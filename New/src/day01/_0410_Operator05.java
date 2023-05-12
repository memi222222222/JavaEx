package day01;

public class _0410_Operator05 {

	public static void main(String[] args) {
	
		// 프로그램에서의 랜덤한 값을 발생시키는 기능
		// System.out.println( Math.random() );   // 1미만의 랜덤한 double값이 나옴
		
		// 1~10까지 랜덤한 값
		double d = Math.random() * 10;  // 10미만의 수
		//int a = (int)d; // 0~ 9
		int a = (int)d + 1; // 1~ 10
		System.out.println("1~10까지 랜덤수: " + a);
		
		// 한번에 적기
		int result = (int)(Math.random() * 10) + 1; // 랜덤수*10에 괄호를 해주어야 그값을 인트로 변환한다. 
		System.out.println(result);
		
		// 삼항연산식
		// 조건 ? 연산1 : 연산2
		
		String s = result % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(result + " 는 " + s);
		
	}
}
