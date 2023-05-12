package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		/*
		 * 1 1~9 까지 숫자중에서 절대 중복되지 않는 숫자를 추출
		 * 	arr 를 랜덤하게 10번 섞어줍니다.
		 *  0 ~ 2번째 값을 새로운 배열로 옮겨담아보세요.
		 * 
		 * 
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[3];
		int temp = 0;
		
		
		for(int i =0; i < arr.length; i++) {
			int a = (int)(Math.random()*9);
			int b = (int)(Math.random()*9);
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		for(int j =0; j <3; j++) {
			arr2[j] = arr[j];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		int[] arr2 = new int[3];
//		int temp = 0;
//		
//		
//		for(int i =0; i <3; i++) {
//			int a = (int)(Math.random()*10);
//			arr[i] = a;
//			arr2[i] = arr[i];
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
//		

		
	}

}
