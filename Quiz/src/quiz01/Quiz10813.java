package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz10813 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int temp = 0;
		int[] arr = new int[N];
		for(int j = 0; j < N; j++) {
			arr[j] = j+1;
		}
		for(int i = 1; i <= M ; i++ ) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			temp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;	
			
		}
		for(int o =0; o < arr.length; o++) {
			System.out.print(arr[o]+" ");
		}


	}

}
