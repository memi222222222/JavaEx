package quiz01;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();		
		int B = scan.nextInt();		
		int C = scan.nextInt();		
		
		int x = B + C;
		int a = 0;
		if(x < 60) {
			System.out.println(A + " " + x);
		}else {
			int y = x / 60;
			int z = x % 60;
		
			a = A + y;
			if(a <24) {
				System.out.println(a+ " "+z);
			}else {
				int a1 = a - 24; 
				System.out.println(a1 + " "+ z);
			}
		}
		
	}

}
