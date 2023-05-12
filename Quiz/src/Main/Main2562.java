package Main;

import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int max = 0;
		int[] arr = new int[9];
		int z = 0;
		for(int i = 0; i < 9; i++) {
			arr[i] = scan.nextInt();
		}
		for(int j = 0; j < arr.length; j++) {
			if(max < arr[j]) {
				max = arr[j];
				z = j + 1;
			
			}
		}
		System.out.println(max);
		System.out.println(z);
	}

}
