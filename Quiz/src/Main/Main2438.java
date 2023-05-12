package Main;

import java.util.Scanner;

public class Main2438 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	for(int a = 0; a <= n-1; a++) {
		
		System.out.print("*");
		for(int b = 1; b <=a; b++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	

}
}
