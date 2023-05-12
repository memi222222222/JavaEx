package day01;

public class _0410_Operator03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		// if뒤에 소괄호가 true 이면 if 중괄호 실행, false라면 else문 실행
		if( x != 10 & ++y == 21) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
			
		}
		
		System.out.println("x값: " + x);
		System.out.println("y값: " + y);
		
		
		
		if(x == 10 | ++y == 21) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값: " + x);
		System.out.println("y값: " + y);
		
		System.out.println("---------------------------");
		
		
		x = 10;
		y = 20;
		
		if( x != 10 && ++y == 21) {  // & -> && (앞의 경우가 거짓. 뒤에경우는 생략됨. 앞의 결과만 도출)
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
			
		}
		
		System.out.println("x값: " + x); // 10
		System.out.println("y값: " + y); // 20
		
	
		
		if(x == 10 || ++y == 21) { // | -> ||  (앞의 경우가 참. 뒤에경우는 생략됨. 앞의 결과만 도출)
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x값: " + x); // 10
		System.out.println("y값: " + y); // 20
		
		
		
	}
}
