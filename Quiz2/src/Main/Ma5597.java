package Main;

import java.util.Arrays;
import java.util.Scanner;

public class Ma5597 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[]arr = new int[30];

		for(int z = 0; z < arr.length; z++) {
			arr[z] = z+1;

		}
		for(int i = 0; i < 28; i++) {
			int a = scan.nextInt();
			arr[a-1] = 0;

		}

		for(int b = 0; b < arr.length; b++) {
			if (arr[b] != 0) {
				System.out.println(arr[b]);
			}

		}
		
		scan.close();
	}
}
