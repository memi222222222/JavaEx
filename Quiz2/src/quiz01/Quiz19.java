package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {

		// 금액의 동전 - 나머지, 몫을 활용
		// 어떤금액 x가 주어졌을 떄, 큰 금액부터 거슬러서 몇개가 나와야 하는지 출력

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		int[] arr = {1000, 500, 100, 50, 10};
	
//		int b = 0;
//		for(int a = 0; a < arr.length; a++) {
//			System.out.println(arr[a]+"원:"+(x / arr[a]) +"개" );
//
//			
//			
//		}
//	
		int i = 0;
		while(i < arr.length) {
			System.out.println(arr[i]+"원:"+(x / arr[i]) +"개" );
			x = x % arr[i]; // 나머지 저장 
			i++;
		}
		


	}

}
