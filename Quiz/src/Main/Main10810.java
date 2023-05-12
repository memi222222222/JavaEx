package Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main10810 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt(); 
		int[] arr = new int[N];
		int M = scan.nextInt();
	
		for(int y = 0; y < M; y++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int k = scan.nextInt();
			for(int z = i-1; z < j; z++) {
				arr[z] = k;
			}
		}
		for(int o =0; o < arr.length; o++) {
			System.out.print(arr[o] + " " );
		}
		scan.close();
	}
}


