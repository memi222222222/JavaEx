package _0426_day10_basic;


public class MainClass {

	public static void main(String[] args) {

		//		String[] arr = {"김", "혜", "민"};
		//		int[] arr2 = {1, 2,3,4};
		//		char[] arr3 = {'a','b','c'};
		//		
		System.out.println(MyArrays.printArray(new String [4]));
		System.out.println(MyArrays.printArray(new int [4]));
		System.out.println(MyArrays.printArray(new char [4]));

		System.out.println(MyArrays2.printArray(new String [4]));
		System.out.println(MyArrays2.printArray(new int [4]));
		System.out.println(MyArrays2.printArray(new char [4]));

		// 클래스가 여러번 로드 되더라도 static은 단 1번만 실행됨
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		

	}
}
