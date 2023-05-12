package Main;

import java.util.Scanner;

public class MainEx {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		int a = 0;
		while(a < arr.length) {
			arr[N] =scan.nextInt();
			a++;
		}
		int max = arr[0];
		int min = arr[0];
		a = 0;
		
		while(a < arr.length) {
			if(min >arr[a]) {
				min = arr[a];
			}
			if(max < arr[a]) {
				max = arr[a];
			}

			a++;

		}
		System.out.println(min+" "+max);
		
	
	}

}
