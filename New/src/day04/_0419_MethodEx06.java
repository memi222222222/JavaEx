package day04;

import java.util.Arrays;

public class _0419_MethodEx06 {

	public static void main(String[] args) {

		// Queue - First in First oun FIFO -선입선출
	
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i <= 5; i++) {
			pop();
			System.out.println(Arrays.toString(arr));
		}

		


	} // main


	static int[] arr = {};
	static void push(int data) {
		int[] temp = new int[arr.length+1];
		for(int i =0; i < arr.length; i++) {
			temp[i]= arr[i]; 
		}
		temp[temp.length-1] = data;

		arr = temp;
		temp = null; 
	}	



	static int pop() {

		if(arr.length >0) {

			// 1. 삭제할 데이터를 백업
			int del = arr[0];

			// 2. arr보다 length -1 인 사본배열을 생성
			int[] temp = new int[arr.length-1];

			// 3. 원본배열을 사본으로 복사 (맨 마지막데이터만 제외)
			for(int i = 0; i < temp.length; i++) {
				temp[i]= arr[i+1]; 
			}

			// 4. 사본배열을 원본배열로 변경
			arr = temp;
			temp = null;

			return del; // 삭제된 데이터 반환

		}	
		return 0;

	}
	// -------------- 강사님 답안 ---------------


	static int pop1() {

		if(arr.length >0){
			// 1. 삭제할 데이터백업
			int del = arr[0];
			// 2. arr - 1인 사본배열 생성
			int[] temp = new int[arr.length-1];
			// 3. 배열의 1번째 요소~ 마지막까지 옮겨 담는다.

			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1];
				
			}
			// 4. 원본 배열을 temp로 변겅
			arr = temp;
			temp = null;
			return del; // 삭제된 데이터 반환
		}
		return 0;
	}


}
