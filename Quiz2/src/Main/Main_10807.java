package Main;

import java.util.Scanner;

public class Main_10807 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
				
		int[] arr = new int[n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		} int v = scan.nextInt();
		for(int j : arr) {
			if(j != v) {
				continue;
			}else {
				count ++;
			}
		} 
		
		System.out.println(count);	
	}

}

