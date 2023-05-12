package day03;

import java.util.Arrays;

public class _0414_ArrayBasic {

	public static void main(String[] args) {
		
		// 배열
		int [] arr;
		
		// 배열 생성
		arr = new int[5];
		
		
		// 배열의 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 50;
	
		// 배열의 모형을 문자열로 출력
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		// 배열의 값의 변성
		arr[2] = 100;
		System.out.println(Arrays.toString(arr));
		
		// 배열의 길이 배열이름.length 랭스!!!!!
		System.out.println("배열의 길이: " + arr.length);
		
		// 배열을 선언하는 다양한 방법.
		// 1st
		int[] arr2 = new int[3];
		
		// 2nd  비추!!
		int[] arr3 = new int[] {1, 2, 3};
		
		// 3nd 추쳔~~!!!! 2번과 같다!!!!! 훠어얼씬간편!
		int[] arr4 = {1, 2, 3};
		
		// 배열은 초기값을 지정하지 않으면 기본값으로 자동초기화
		//  - int는 0으로, double는 = 0.0,  String = null
		
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
	}
	
}