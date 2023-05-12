package day04;

import javax.security.auth.Subject;

public class _0418_MethodEx03 {


	public static void main(String[] args) {
		
		/*
		 *  return 이란
		 *  
		 *  1. 메서드에서 리턴은 실행결과를 돌려주는 값에대한 타입.
		 *  2. 리턴이 있는 메서드는 다른메서드의 매개값으로도 사용이 된다.
		 *  
		 *  3. 반환값은 없을 수도 있습니다. void로 선언.
		 *  4. void 메서드에서도 return을 사용할수 있습니다.
		 *    - 값을 돌려주지는 못하고, 종료의 의미로 사용.
		 *  
		 *  
		 */
	
		int result = add(add(1,2), add(3, 5)); // 괄호안에 여러번 쓸수 있다.
		System.out.println("결과: "+ result);
		
		//void 형 메서드는 return이 없기 때문에 단순히 호출만 가능하다
		// System.out.println(Sub()); void 형 매소드
		sub();
		div(6, 2);
		
		noReturn("hello");
		
				
	}  // main
	
	
	
	static int add(int a, int b) {  // 두수의 합을 반환하는 메서드
		
		return a + b;
		
	}
	
	
	//반환이 없고, 매개변수도 없는 모형
	static void sub() {
		System.out.println("5 - 3 = 2");
	}
	// 리턴할수없다.. void 쓰고 버린다
	static void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b));
		
	}
	
	
	//
	static void noReturn(String s){
		
		if(s.equals("hello")) {  //s 문자열이 hello와 같다면 true

			System.out.println("메서드를 종료합니다.");
			
			return;
		}
		System.out.println("hello를 전달해야 할까요?");
		
	}
	
	
	
}
