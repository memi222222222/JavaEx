package Quiz;

import java.util.Arrays;

public class _0418_MethodQuiz03 {

	public static void main(String[] args) { // 

		char[] ch = {'v','i','c','t','o','r','y'};
		System.out.println( method06(ch));
		
		String arrCh = method06(ch);

		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		int a = method07(arr2);
		System.out.println(a);
		String[] b = method08("볼","링");
		System.out.println(Arrays.toString(b));



	} // main

	static String method06(char[]arr) {
		String str = new String(arr);
			
		return str;
	}



	//-------------------------------------------

	static int method07(int[] arr2) {
		int sum = 0;

		for(int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		return sum;
	}

	//---------------------------------------------------
	static String[] method08(String a, String b) {

		String[] arr3 = {a, b};


		return arr3;
	}

}
