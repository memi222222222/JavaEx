package Main;

import java.util.Scanner;

public class Main3052 {


	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);

		int count = 0; 

		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for(int j = 0; j < arr.length-1; j++) {
			if(arr[j] % 42 != arr[j+1] % 42) {
				count++;

			}
		} System.out.println(count);



	}
}
