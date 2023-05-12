package day03;

import java.util.Arrays;

public class _0414_ArraySort2 {

	public static void main(String[] args) {

		// 버블정렬 - 가장느린정렬 (큰 값을 뒤로 보낸다)
		
		
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		/* 1회전 5, 1, 23, 43, 100, 40, 200
		/* 2회전 1, 5, 23, 43, 40, 100, 200
		/* 3회전 1, 1, 23, 43, 40, 100, 200
		/* 4회전 1, 1, 23, 4-, 43, 100, 200
		 * 
		 * 바깥 반복문은 회전수  
		 * 
		 */
		
//		
//		for(int i = 0; i < arr.length-1; i++) {
//			for(int j = 0; j < arr.length-i-1; j++) {  // j 5번과6번이 마지막 비교값이 되어야한다.
//				System.out.println(i+"-"+j);
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1]  = temp;
//				}
//				
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));

		
		// 아주 유용한 기능
		Arrays.sort(arr); // 가장빠른 퀵정렬!!!!시간초과 안함!!!!
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
	}

}
