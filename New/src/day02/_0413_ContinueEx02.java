package day02;

import java.util.Scanner;

public class _0413_ContinueEx02 {


	public static void main(String[] args) {

		// continue 의 활용
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력>");

		int num = scan.nextInt();
		int count = 0;  // 약수의 갯수를 셀 변수
		int sum = 0; // 소수의 합을 누적할 변수

		x: for(int i = 1; i <= num; i++) {
			count = 0;	
			for(int j = 1; j <= i; j++) {

				if(i % j == 0 ) {
					count ++;
				} 

				if(count > 2) continue x;
			} // end for
			if (count == 2) {
				sum += i;
			}

		}

		System.out.println("입력한 수 중에서 소수의 합: " +sum);
		// System.out.println(i +"%"+j);

	}
}
