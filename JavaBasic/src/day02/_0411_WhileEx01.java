package day02;

public class _0411_WhileEx01 {
	
	public static void main(String[] args) {
		
		
		int a = 1; // 제어변수 : 반복문의 조건을 제어할 변수
		int sum = 0; // 값을 누적시킬 변수. while문 밖에 선언해야한다.
		
		while(a <= 10 ) {// 제어변수로 조건을 생성
		
		
			sum += a;  // sum = sum + a;
			
			// System.out.println("헛");
			// System.out.println(a);
			
			a++;  // 제어변수를 증가해서 언젠가는 조건이 false 가 되도록 처리
			}
		
		System.out.println("1-10까지의합: " + sum);
		
	}

}
