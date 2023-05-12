package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {

		/// Quiz 13 복습!!!!!!!!! 안보고다시 해보기!!
//	 1. 7~ 100까지 정수 중에 7의 배수만 가로로 출력

		System.out.println("---1. 7~ 100까지 정수 중에 7의 배수만 가로로 출력---- "); //줄바꿈
		/*  --- 강사님 답안 -----
		 *  for(int i =7; i <= 100; i +=7){
		 *  System.out.print(i+" ");
		 *
		 */
		for(int i = 1; i <=100; i++) {
			if(i % 7 ==0) {
				System.out.print(i+" ");
			}
		}
		//--------------------------------------------------------------------------		
//		 2. 1~200까지 정수 중에 9의 배수의 개수를 출력.
		System.out.println();
		System.out.println();
		System.out.println("---2. 1~200까지 정수 중에 9의 배수의 개수를 출력---- ");		
		//  --- 강사님 답안 -----
		
//		int count = 0;
//		for(int i =1; i <= 200; i++) {
//			if(i % 9 == 0) {
//				count++;
//			}
//		}
//		System.out.println(count);
//		
	
		

		int sum = 0;
		for(int a =1; a <= 200; a++) {
			if(a % 9 ==0) {
				sum++;
			}
			
		}
		System.out.println("9의 배수는 "+ sum +"개");
		
			
		
		//--------------------------------------------------------------------------		
//		 3. 50~ 100사이의 합계
		// ---강사님 답안----
//		int sum = 0;
//		for(int i = 50; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("50 - 100까지의 합: " + sum);
//		
		System.out.println();
		System.out.println("---3. 50~ 100사이의 합계--- ");
		
		int sum3 =0;
		for(int b =50; b <= 100; b++) {
			
			sum += b;
		}
		System.out.println("50~100 사이의 합: " + sum);
		
				
//--------------------------------------------------------------------------		
//		 4. A~Z까지 가로로 붙여서 출력, A =65, z=90
//		
//		
//		
//		for(char c= 'A'; c <= 'Z'; c++) {
//			System.out.print(c+" ");
//		}
//		
		System.out.println();
		System.out.println("---4. A~Z까지 가로로 붙여서 출력, A =65, z=90--- ");
//		String str = "";
		
		for(char c = 'A'; c <=90; c++) {
			
			System.out.print(c+" ");
		}
		
		
//--------------------------------------------------------------------------	
//		 5. 입력받은 정수까지 팩토리얼  5팩토리얼= 5 * 4 * 3 * 2 * 1

		System.out.println();
		System.out.println();
		System.out.println("--- 5.입력받은 정수까지 팩토리얼  5팩토리얼= 5 * 4 * 3 * 2 * 1--- ");
		Scanner scan2 = new Scanner(System.in);
		System.out.print("정수입력>");
		
		int d = scan2.nextInt();
		int sum2 = 1;
		for(int e = d; e >= 1; e--) {
		 sum2 *= e;
	
		}
//	System.out.println(sum2);
//		
//	
//	Scanner scan = new Scanner(System.in);
//	System.out.println(">");
//	int num = scan.nextInt();
//	
//	
//	int su3 =1;
//	for(int q = 1; q <= num; q++) {
//		su3 *= q;
//		
//	}
//		System.out.println(num + "!은" + su3);
	
	
	
	}
	
}
