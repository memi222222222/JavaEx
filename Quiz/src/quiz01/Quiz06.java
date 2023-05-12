package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {


		/*
		 * if구문 밖에 선언된 변수를 잘 활용하기
		 *  
		 * 정수 3개를 입력받기.
		 * 
		 * 가장 큰값, 중간값, 작은값을 구분해서 출력 (조건- 같은수는 없다)
		 * 
		 *  <입력  15. 30. 7> 
		 *  max : 30, mid :15, min :7
		 *  
		 */


		int max = 0;
		int mid = 0;
		int min = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>");

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		
		if(a>b && a>c) {
			max = a;
			if(b>c) {
				mid = b; min = c;
		}else {
			mid = c; min = b;
		}
		}
		if(b>a && b>c) {
			max = b;
			if(a>c) {
				mid = a; min =c;
		}else {
			mid =c; min = a;
		}
		}
		if(c>a && c>b) {
			max = c;
			if(a>b) {
				mid = a; min =b;
		}else {
			mid =b; min = a;
		}
		}
		
		System.out.print("max:"+max+", mid" + mid + ", min:" +min);	
		
	}
}

					



								
			

		