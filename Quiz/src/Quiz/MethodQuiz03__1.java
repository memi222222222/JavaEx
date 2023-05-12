package Quiz;

import java.util.Arrays;

public class MethodQuiz03__1 {
	// ---- 강사님 답안 ----
	public static void main(String[] args) {

		char[] arr = {'a', 'b','c',	'd'};
		String result = method06(arr);
		System.out.println(result);
		
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(method07(arr2));
		
		
		String[] arr3 = method08("가", "나");
		System.out.println(Arrays.toString(arr3));

	} // main

	// ---6번 --
	static String method06(char[]arr) {


		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}

		return str;

	}
	//---- 7번---

	static int method07(int[]arr) {
	// 향상된 포문
		int sum = 0;
		for(int a: arr) {
			sum += a;
		}

		return sum;
	}
	//--------8번 -------
	static String[] method08(String a, String b) {

		String[] arr3 = {a, b};

		return arr3;
	}




}
