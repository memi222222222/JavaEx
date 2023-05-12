package day04;

import java.util.Arrays;

public class _0419_MethodEx05 {

	public static void main(String[] args) {
		// 배열의 한계점 ->
		//Stack - Last In First Out (LIFO)


		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));

		pop();
		pop();
		pop();
		int r = pop();
		System.out.println(r);
		System.out.println(Arrays.toString(arr));

	}

	static int[] arr = {1,2,3,}; // main 밖에 생성가능.(어느 메서드안에서든 사용 가능하다)


	// push  -> 특정 요소를 마지막에 추가

	static void push(int data) {

		// 1. 배열의 크기를 +1 한 새로운 배열을 만듦
		int[] temp = new int[arr.length+1];

		// 2. arr 배열의 요소를 복사
		for(int i =0; i < arr.length; i++) {
			temp[i]= arr[i]; 

		}

		// 3. 마지막에 추가
		temp[temp.length-1] = data;

		// 4. 원본배열을 temp로 변경!
		arr = temp;
		temp = null; // temp는 지움...
	}	


	// pop -> 특정요소를 마지막에서 삭제(반환 - 삭제된데이터)
	//---------------0보다클떄실행---------------------

	static int pop() {

		if(arr.length >0) {

			// 1. 삭제할 데이터를 백업
			int del = arr[arr.length-1];

			// 2. arr보다 length -1 인 사본배열을 생성
			int[] temp = new int[arr.length-1];

			// 3. 원본배열을 사본으로 복사 (맨 마지막데이터만 제외)
			for(int i = 0; i < temp.length; i++) {
				temp[i]= arr[i]; 
			}

			// 4. 사본배열을 원본배열로 변경
			arr = temp;
			temp = null;

			return del; // 삭제된 데이터 반환

		}	
		return 0;

	}


}
