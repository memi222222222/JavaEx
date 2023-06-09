package _0509_day17_api_ramda_basic;

public class MainClass {


	public static void main(String[] args) {



		// car run 을 사용할 때마다 매번 다른기능으로 사용해야한다면 => 익명클래스를사용 할 수 있다.
//
//		Car car = new Car() {
//
//			@Override
//			public void run() {
//				System.out.println("익명객체로 생성된 car");
//			}
//
//
//		};
//		car.run();
//		
//		Car car2 = new Car() {
//
//			@Override
//			public void run() {
//				
//				System.out.println("다른내용의 익명 객체로 car 생성");
//			}
//			
//		};
//		 car2.run();
//	
		// 익명객체 표현 문법 => 람다표현형식으로 사용 가능
	Person p = new Person();
	p.greeting(new Say01(){
		
		public void hello() {
			System.out.println("헬로우 기능!");
		}
		
	});
	
	
	
	// Say01이 가지고 있는 hello()를 전달하는 모형
	p.greeting( ( )-> { System.out.println( "람다 헬로우!");} ); 
	// 1문법- 사용할 문장이 1줄이라면 {} 생략가능
	p.greeting( () -> System.out.println("람다 헬로우!!!!!"));
	
//	p.greeting( new Say02() {
//		
//		@Override
//		public String hello(String a, int b) {
//			// 프로그래머가 작성한 내용
//			return a + b;  // 문자열로 반환
//		}
//	});
	
		// 2문법 - 람다의 매개변수는 타입이 생략
		// 		- 프로그램코드가 한줄이라면 return 생락 가능. 	
		p.greeting( (a,  b)-> a + b);
	
		
		// greeting의 3번째 메서드에 전달되는 값이 짝수 인지 홀수인지 판별
//		p.greeting((a) -> {
//			boolean result = false;
//			if(a % 2 ==0 ) {
//				result = true;
//			}else {
//				result = false;
//				
//			}
//			
//			return result;
//		});
//		
		
		p.greeting((a)-> a % 2 == 0 ? true: false);	
		
		
		
	
	}
}
