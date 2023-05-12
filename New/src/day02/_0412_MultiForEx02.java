package day02;

import java.util.Scanner;

public class _0412_MultiForEx02 {

	
	public static void main(String[] args) {
		
		// 회전수가 변경되는 중첩반복문
		/*
		 * i값에 따라서 j의값을 변경
		 * 
		 *  1-1
		 *  2-2
		 *  2-2
		 *  3-1
		 *  3-2
		 *  3-3
		 *  
		 */
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.println(i+ "-" + j);
			}
			
		}
		
		// 별찍기
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 * 
		 */
	
		for(int a = 1; a <= 5; a++) {
			
			for(int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/* 응용
		 * 
		     * 
		    *** 
		   ***** 
		  ******* 
		 ********* 
		 
		 * 
		 */
		
		int star = 10;
		
		for(int c = 1; c <=star; c++) {
			// 공백
			for(int j = 1; j <= star-c; j++) {
				System.out.print(" ");
			}
			// 별출력
			for(int k =1; k <= 2*c-1; k++) {
				System.out.print("*");
			}
			
			
			System.out.println();  //줄바꿈
		}
		
		
		/* 응용 2
		 * 
		 * 
		 * 
		 *          *
		 *         **
		 *        ***
		 *       ****
		 *      *****
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i = 0; i <= N; i++) {
			
			for(int a =1; a <= N-i; a++) {
				System.out.print(" ");
				for(int b =1; b <= i; b++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
}
