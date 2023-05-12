package day03;

import java.util.Arrays;

public class _0417_ArrayDelete {

	public static void main(String[] args) {

		/*  
		 * 삭제의 개념 - 배열은 삭제가 없다.
		 *  값이 고정이라 수동으로 해야한다.
		 *
		 */
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] newArr = new int[arr.length-1];  //  삭제한 후 복사할 새로운 배열

		int index = 5; // 삭제할 위치
		for(int i = index; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		// 새로운 배열에, 기존배열을 옮겨담기

		for(int i =0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		// 기존 arr 은 삭제
			arr = null;
				
		System.out.println(Arrays.toString(newArr));

	}

}
