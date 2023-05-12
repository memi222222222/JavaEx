package quiz01;

import java.util.Scanner;

public class Quiz20 {

		public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		int max = 0;
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			
			arr[i]=scan.nextInt();
			
		for(int j = 0; j < arr.length; j++) {
			if(max < arr[j]) {
				max = arr[j];
			} else if(min <= max) {
				min = arr[j];
			}
		}
			
		}
		System.out.println(min+" "+max);
		
}

}
