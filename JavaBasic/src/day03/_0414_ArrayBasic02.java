package day03;

public class _0414_ArrayBasic02 {

	public static void main(String[] args) {

		// 배열의 순회
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; // 인덱스 9 . 길이 10

		//		int a = 0; 
		//		while(a < arr.length) {
		//
		//			System.err.println("배열의 " + a + " 인덱스: " + arr[a]);
		//			
		//			a++;
		//
		//		}


		// 배열값들의 합
//		int sum = 0;
//		for(int a : arr) {
//		sum += arr[a];
//		}
//		System.out.println("배열 값들의 합:" + sum);
//		
		int b = 0;
		int sum = 0;
		while(b < arr.length) {
			
			sum += arr[b];   
			
			b++;
		}
		System.out.println("배열요소들의 합:" + sum);
	}

}
