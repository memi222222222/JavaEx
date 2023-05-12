package Quiz17;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {

		/*
		 * 1. 스캐너로 정수 2개를 입력받아서 두 수의 합을 반환하는 기능
		 * 2. 입력된 값이 정수라면 합계를 반환.
		 * 3. 예외가 발생하면, 직접 예외를 생성하고 예외 메세지를 외부로 전달.
		 * 4. scan.close() 은 finally 에서 처리.
		 *  
		 */
		Scanner scan = new Scanner(System.in);



		try {

			// 예외 발생시 가장 가까운 catch문으로 이동된다.
			System.out.println(" >");
			int a = scan.nextInt();
			System.out.println(" >");
			int b = scan.nextInt();

			return a + b; 

		} catch (Exception e) {
			throw new Exception("숫자로 입력하세요");  // 예외생성
		} finally {
			scan.close();
		}







	}


}
