package _0509_day17_api_ramda_basic;

public class Person /*Stream*/{

	// 일반클래스 - 고차함수를 가지고있는 클래스
	
		public void greeting(Say01 say01) { // map (Function)
			say01.hello(); // 대신실행 (이미만들어져 있음.
		}
		
		
		public void greeting(Say02 say02) {
			
			String result = say02.hello("greeting이 번달한 문자열", 1);
		System.out.println("greeting return: "+ result);
		}
		
		
		public void greeting(Say03 say03) {
			
			boolean result =say03.bye(3);
			System.out.println(result);
			
		}
		
		
		
		
		
		


}
