package quiz01;

public class Quiz12 {

	public static void main(String[] args) {
		
		// 1000까지 정수중에서 4의 배수이면서, 8의 배수가 아닌수의 count(개수)
		// 50 ~100 까지의 합계
		
		int i = 1;
		int z = 0;
		while(i <= 1000) {
			if(i % 4 == 0 && i % 8 != 0) {
				z++; // 1씩증가
			}
			
			i++;
	
		}
		
		System.out.println("개수: " + z);
		
		
		int y = 50;  
		int sum = 0;   // 합계누적 변수
		while(y <= 100) {

			sum += y;			
			y++;
		}
		System.out.println("50~100까지 합계: " + sum);
		
		
	}
	
}
