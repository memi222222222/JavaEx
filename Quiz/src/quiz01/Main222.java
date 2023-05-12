package quiz01;

import java.util.Scanner;

public class Main222 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] arr = new int[n];
		int max = -1_000_000;
		int min =  1_000_000;
		for(int i = 0; i < arr.length; i++) {

			arr[i]=scan.nextInt();
		}	
		for(int j = 0; j < arr.length; j++) {
			if(max < arr[j]) {
				max = arr[j];
			}
			if(min >= arr[j]) {
				min = arr[j];
			}
		}


		System.out.println(min+" "+max);
		
//		----------강사님 답안 --------------------
//		
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int[] arr1 = new int[A]; //크기가 a 인 배열생성
//
//		int B = 0;
//		while(B  < arr1.length) {
//			arr1[B] = scan.nextInt();
//			B++;
//		}
//
//		// 최대. 최소 결정
//		int min2 = arr1[0];
//		int max2 = arr1[0];
//
//		int J = 0;
//		while(J < arr1.length) {
//			if(min2 >arr1[J]) {
//				min2 = arr1[J];
//			}
//			if(max2 < arr1[J]) {
//				max2 = arr1[J];
//			}
//
//			J++;
//
//		}
//		System.out.println(min2+" "+max2);
	}


}

