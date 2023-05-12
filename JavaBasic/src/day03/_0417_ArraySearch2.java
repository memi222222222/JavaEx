package day03;

import java.util.Arrays;
import java.util.Scanner;

public class _0417_ArraySearch2 {

	public static void main(String[] args) {

		/*
		 * 이진 탐색 - 반을 분할해서 찾아가는 방법.
		 * 조건 - 순서대로 정렬이 되어 있어야 한다.
		 * 
		 * 1. 포인터를(start, end) 처음과 끝에 2개를 배치
		 * 2. 중간값을 구함
		 * 3. 중간이 찾는값인지 확인
		 * 4. 중간값이 찾는값보다 크다면, end를 중간값 -1 로 내림  
		 * 5. 중간값이 찾는값보다 작다면, start 를 중간값 +1로 올림 
		 * 
		 */

		int[] arr = {1,3,5,10,20,30,50,80,100};

		Scanner scan = new Scanner(System.in);
		System.out.print("찾을값 > ");
		int find = scan.nextInt();

		int start = 0;
		int end = arr.length -1; // 8



		while(start <= end) {
			// 중간값 구하기
			int mid = (start + end) / 2; // (괄호 주의!!!)

			if(arr[mid] == find) {

				
				System.out.println("찾은 값은:" + mid + "번째 존재함");
				break;
			}

			if(arr[mid] < find) {
				start = mid +1;
			} else {
				end = mid -1;
			}

			if(start > end) {
				//두 지점이 교차했다면 찾는값은 없음
				System.out.println("찾는값은 없습니다");
				
			}
		}
		
		// 이진탐색  - 찾은 위치를 알려줌 . 찾을값이 없다면 음수( - )값으로 나온다.
		System.out.println(Arrays.binarySearch(arr, 24));

		
		


	}	

}
