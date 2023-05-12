package quiz01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int H= scan.nextInt();
		int M = scan.nextInt();
	
	if(M > 45) {
		M -= 45;
	}else if(M == 45) {
		M = 0;
	}else if(M < 45) {
		if(H == 0) {
			H = 23;
			M = 60 +(M-45);
		} else {
			H -= 1;
			M = 60 + (M - 45);
		}
	}
	
	System.out.print(H+ " " + M);	

	
	// ----------- 고양이 --------------------------
	
	System.out.println("\\    /\\");
	System.out.println(" )  ( \')");
	System.out.println("(  /  )");
	System.out.println(" \\(__)|");
	
	// ----------- 강얼쥐 --------------------------
	
	System.out.println("|\\_/|");
	System.out.println("|q p|   /}");
	System.out.println("( 0 )\"\"\"\\");
	System.out.println("|\"^\"`    |");
	System.out.println("||_/=\\\\__|");
	
	
	
	
	
	
	
	
	
	}
}