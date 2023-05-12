package day03;

import java.util.Arrays;

public class _0414_ArraySort {

	public static void main(String[] args) {

		/* 배열정렬 - 대락 6개 (알고리즘 ..........)
		 *  1) 선택정렬 ( 각각배열의 요소를 비교해서 작은값을 앞으로 보낸다.(큰값을 뒤로 보낸다.))
		 *    - 모든 경우의 수를 다 따진다.
		 */

		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		/* 1회전 1, 23, 5, 43, 200, 100, 40
		 * 2회전 1, 5, 23, 43, 200, 100, 40 
		 * 3회전 1, 5, 23, 43, 200, 100, 40 
		 * 4회전 1, 5, 23, 40, 200, 100, 43 
		 * 5회전 1, 5, 23, 40, 100, 43, 200 
		 * 6회전 1, 5, 23, 40, 43, 100, 200 
		 * 
		 * 바깥반복문은 회전수
		 * 안쪽 반복문은 비교할 값
		 *
		 * 
		 */
		
	
		for(int i = 0; i < arr.length-1; i++) { // 0 ~ 5까지(랭스끝까지 돌지않는다)

			for(int j = i+1;  j < arr.length; j++) {  //i+1부터 끝까지
						
				if(arr[i] < arr[j]) { // 비교대상이 작다면 바꾼다.
									int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}

		System.out.println(Arrays.toString(arr));
	}

}
