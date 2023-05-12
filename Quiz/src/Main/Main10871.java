package Main;

import java.util.Scanner;

public class Main10871 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();

		int[] arr = new int[n];

		for(int i =0; i < n; i++) {
			arr[i] = scan.nextInt();
		}for(int j : arr) {
			if(j < x) {
				System.out.print(j+" ");
			}
		}
	}

}