package day04;

import java.util.Arrays;

public class _0418_MethodEx04 {

	public static void main(String[] args) {

		/*
		 * 배열을 매개변수로 전달 할 수 있을까요 ? yes
		 */
		char[] arr = {'a','b','c','d','e'};

		method(arr);  // 변수명으로 준다.

		// 배열을 반환유형으로 전달 받을 수 있습니다.
		int[] arr2 = method02();
		System.out.println(Arrays.toString(arr2));
		
	}

	static void method(char[]arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return;
	}
		static int[] method02() {
			int[] arr = new int [3];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			
			
			
			return arr;
			
		}

}