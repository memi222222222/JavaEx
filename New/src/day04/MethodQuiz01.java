package day04;

public class MethodQuiz01 {

	public static void main(String[] args) {

		method01();
		String r1 = method02("가"); 
		System.out.println(r1);

		double r2 = method03(1, 2, 3.0);
		System.out.println(r2);

		String r3 = method04(3);
		System.out.println(r3);

		method05("나", 3);

		int r4 = maxNum(1, 2);
		System.out.println(r4);

		int r5 = abs(-5);
		System.out.println(r5);
	} //main


	static void method01() {
		System.out.println("안녕하세요");
	}

	static String method02(String s) {
		return s;
	}

	static double method03(int a, int b, double c) {
		return a + b + c;
	}

	static String method04(int a) {
		/*
		String str = "";
		if(a % 2 == 0) { //짝
			str = "짝수";
		} else { //홀
			str = "홀수";
		}
		return str;
		 */

		/*
		if(a % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
		 */
		return a % 2 == 0 ? "짝수" : "홀수"; 
	}

	static void method05(String a, int b) {
		for(int i = 1; i <= b; i++) {
			System.out.print(a);
		}
		System.out.println();
	}

	static int maxNum(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}

	static int abs(int a) {
		return a > 0 ? a : -a;
	}


}
