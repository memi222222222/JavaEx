package Quiz;


import java.util.function.BiConsumer;

public class _0418_MethodQuiz01 {

	public static void main(String[] args) {


		//		method1();
		//		System.out.println(method2("안뇽"));
		//		method3(5, 5, 5);
		//		System.out.println(method4(7));
		//		method5("바보", 4);
		//		maxNum(20, 60);
		//		System.out.println(20);
		////		//--------r강사님 답안 출력
		////		method01();
		////		String r1 = method02("가");
		////		System.out.println(r1);
		////		double r2 = method03(1,2,3.0);
		//		System.out.println(r2);
		//		String r3 = method04(3);
		//		System.out.println(r3);
		//		int r4 =maxNum2(1, 2);
		//		System.out.println(r4);

		//		int r5 = abs(-5);
		//		System.out.println(r5);

		System.out.println("--------------------------");
		String str =java(5);
		System.out.println(str);

		//
		//
		//	}  // main
		//	// method1 반환유형x 매개번수x 기능: "안녕"출력
		//	static void method1() {
		//
		//		System.out.println("안녕");
		//	}
		//
		//	//---------------- 강사님 답안 1번----------------
		//	static void method01() {
		//		System.out.println("안녕하세요");
		//	}
		//
		//
		//
		//
		//	// method2 반환유형 Str, 매개변수 str. "덪
		//
		//	static String method2(String a2) {
		//
		//		return a2;
		//	}
		//
		//	//	
		//	//	//------------2번 강사님답안 ----------------
		//
		//	static String method02(String s) {
		//		return s;
		//	}
		//
		//	static double method3(int a, int b, double c) {
		//		// 반환? 매개int, int , double 세 매개변수 합 리턴
		//
		//
		//		return a + b + c;
		//	}
		//
		//	// ----------------3 번문제 강사님 답안 ---------------------
		//
		//	static double method03(int a1, int b1, double c1){
		//		return a1 + b1 + c1;
		//	}
		//
		//
		//	static String method4(int z) {
		//		// 반환 string 매개int,매개변수가 짝수면 짝수, 홀수면 홀수리턴
		//		String srt = "";
		//		if(z % 2!= 0) {
		//
		//			System.out.println(z + ": 홀수");
		//
		//
		//		}else{
		//			System.out.println(z + ": 짝수");
		//
		//		}
		//		return srt;
		//
		//	}
		//
		//	// ------------ 4번문제 강사님 답안 ---------------------
		//
		//	//	static String method04(int h) {
		//	//		
		//	//		
		//	//		if(h % 2== 0) {
		//	//			return "짝수";	
		//	//		}else{
		//	//			return "홀수";
		//	//			}
		//	//		
		//	//	}
		//	//	삼항연산식!!
		//	//	return a % 2 == 0 ? "짝수" : "홀수";
		//
		//
		//	static int method5(String x, int y) {
		//		for(int z =0; z < y; z++) {
		//			System.out.println(x);
		//		}
		//		return y;
		//	}
		////	// -------------- 강사님 답안 5번문제 -----
		////	static void method15(String n, int m) {
		////		for(int g = g; g <= m; g++) {
		////			System.out.print(n);
		////		}
		////		System.out.println();
		////	}
		//
		//	static int maxNum(int o, int p) {
		//		// 반환 ? 매개 ? 매개변수 2개중 큰수 리턴
		//		if( o < p) {
		//			System.out.println("큰수는 " + p);
		//		} else {
		//			System.out.println("큰수는 " + o);
		//		}
		//
		//		return 0;
		//	}
		//	//------ 6번문제 강사님 답안 ------------------
		//
		//	static int maxNum2(int o1, int p1) {
		//		if(o1 > p1) {
		//			return o1;
		//		}else {
		//			return p1;
		//		}
		//	}
		//
		//	//-------7 번문제 강사님 답안 ---------------------
		//	//	static int abs(int q) {
		//	//		return q;
		//	//	}
		//	//
		//	//	static int absd(int e) {
		//	//		return0;
		//	//	}	
		//	//	
		//	//	
		//	//	
	}
	static String java(int z1) {

		String str2 = "";
		for(int z2 = 1; z2 <= z1; z2++) {
			if(z2 % 2 != 0) {
				str2 += "자";
			}else {
				str2 += "바";
			}
		}
		return str2;

	}

}




