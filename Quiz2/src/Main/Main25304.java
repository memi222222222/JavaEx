package Main;

import java.util.Scanner;
public class Main25304 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int N = scan.nextInt();
		int i = 0;

		while(i < N) {
			int a = scan.nextInt();
			int b = scan.nextInt();		
			x = x -(a * b);


			i++;
		}
		if(x == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		//----------------- e다른답안
		/*
		 * 
		 * 	int x = scan.nextInt();
		int N = scan.nextInt();
		int i = 1;
		int sum = 0;

		while(i < N) {
			int a = scan.nextInt();
			int b = scan.nextInt();		

			sum += (a * b);
			i++;

		} if(x == sum) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

		 */

	}

}
