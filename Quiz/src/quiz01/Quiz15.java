package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {

		/*
		 * 	1. 입력받은 수까지의 소수들의 합 (소수: 약수가 2개임)
		 * 	 입력 7 
		 *  -> 바깥 반복문은 7까지 회전
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력>");
		int num = scan.nextInt();

		int count = 0;  // 약수의 갯수를 셀 변수
		int sum = 0; // 소수의 합을 누적할 변수

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {

				if(i % j == 0 ) {
					count ++;
				} 
			} // end for
			if (count == 2) {
				sum += i;
			}
			count = 0;	
		}

		System.out.println("입력한 수 중에서 소수의 합: " +sum);
		// System.out.println(i +"%"+j);
		// 각각의 i 값이 소수인지를 판별해서 소수라면. sum에 누적하는코드
		// 적절한 시점에 초기화

//		int count = 0;
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			for(int j = 1; j <= i; j++) {
//				if(i % j == 0) {
//					count ++;
//				}
//			}
//			for(count == 2) {
//				sum += i;
//			}
//			count = 0;
//		}
//		System.out.println(sum);

	}

}








