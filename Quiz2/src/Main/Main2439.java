package Main;

import java.util.Scanner;

public class Main2439 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int n = scan.nextInt();
		
		for(int a = 1; a <= n; a++) {
				
			for(int b = 1; b <= n-a;  b++) {
				System.out.print(" ");
			}
			
			for(int c = 1; c <= a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
