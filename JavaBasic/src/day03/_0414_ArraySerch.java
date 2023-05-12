package day03;

public class _0414_ArraySerch {

	public static void main(String[] args) {
		// 큰 값 구하기
		int[] arr = {54, 23, 12, 76, 99, 1, 2, 3};
		
		//큰값을 저장하는 변수를 활용!
		
		int max = 0; // 큰값을 저장할변수
		int i =0;
		
		while(i < arr.length) {
			if(max < arr[i]) {
				max = arr[i];
			} 
			i++;
		}
		System.out.println(max);
	}
	
}
