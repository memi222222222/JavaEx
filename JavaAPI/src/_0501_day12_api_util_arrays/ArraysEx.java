package _0501_day12_api_util_arrays;

import java.util.Arrays;

public class ArraysEx {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 1, 2, 5, 6, 7};
		
		// 정렬
		Arrays.sort(arr);
		// 문자열로 확인
		System.out.println(Arrays.toString(arr));
	
		// 탐색- 선행조건 :정렬 // 찾을값이 있다면 양수 없다면 음수반환
		int result = Arrays.binarySearch(arr, 4); // 배열명, 찾을값
		System.out.println(result); 
		
		int result2 = Arrays.binarySearch(arr, 1);
		System.out.println(result2); // 찾은 값에대한 위치반환
		
		// 배열복사
		int[] newArr = Arrays.copyOf(arr, arr.length); // 복사할배열, 새로운배열의 길이
		System.out.println(Arrays.toString(newArr));
		System.out.println(arr == newArr);
		
		int[] newArr2 = Arrays.copyOf(arr,  arr.length * 2 );
		System.out.println(Arrays.toString(newArr2));
		
		// 배열 크기지정복사 (배열이름, 이상부터, 미만까지)
		int[] newArr3 = Arrays.copyOfRange(arr,1 ,3 );
		System.out.println(Arrays.toString(newArr3) );
	
		// 배열의 원소비교 (문자열의 equals와 다르다).
		if(Arrays.equals(newArr, arr)) {
			System.out.println("배열의 원소가 정확히 일치함");
		} else {
			System.out.println("배열의 원소가 일치하지 않음");
		}
		
	
	
	
	
	
	}
	

}
