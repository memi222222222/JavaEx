package Quiz;

import java.util.Scanner;

public class _0418_MethodQuiz02 {


	public static void main(String[] args) {

//
//		/*
//		 *  정수 2개를 받아서 합을 출력하는 문장을 만들기.
//		 *  
//		 */
//
//		//1. (반환x 매개변수x 메서드 show()
//				System.out.println("[   두 수의 합을 구합니다   ]");
//		
//				// 2.반환은 있고. 매개변수는 없는 메서드 input() (두번호출하게끔)
//				Scanner scan = new Scanner(System.in);
//				System.out.println("정수입력>");
//				int num1 = scan.nextInt();
//		
//				System.out.println("정수입력>");
//				int num2 = scan.nextInt();
//				//3. 두수의 합을 리턴하는 메서드 add()
//				int result = num1 + num2;
//		
//				// 매개변수로 result를 받아서 단순히 출력 print();
//				System.out.println("두 수의 합: "+ result);

		System.out.println("-------------------------------------------");

		show();
		int num1 = input();
		int num2 = input();
		int result = add( num1, num2);
		
		print(result);


	}  // main



                             

	static void show() {
		System.out.println("[   두 수의 합을 구합니다   ]");

	} 
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력>");
		int num1 = scan.nextInt();

		return num1;
	} 

	static int add(int num1, int num2){
		int result = num1 + num2;
		return result;
	}
	static void print(int result) {
		System.out.println("두 수의 합: "+ result);
	}




}
