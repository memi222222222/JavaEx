package _0428_day12_api_lang_system;

public class MainClass {

	public static void main(String[] args) {

		// System 클래스는 전보  static 메서드로 선언되어있다.

		// System.exit(0); // 시스템 강제종료
		
		// 1970년 1월 1일 기준~ 현재까지 시간을 밀리초로 반환 
		// 간단한 프로그램 시간체크에 사용( UTC )
		long start = System.currentTimeMillis();		

		long sum = 0;
		for(long i = 0; i < 1_000_000; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println( (end - start) * 0.001);
	}

}
