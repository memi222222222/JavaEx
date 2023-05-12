package _0426_day10_basic;

public class MyArrays {

	/*
	 * Arrays 클래스의 toStrig메서드 똑같이 만들기
	 * 
	 * 1. 외부에서 객체생성하지 못하도록 생성에 접근제어자를 붙입니다.
	 * 2. printArray() 생성, 배열을 매개변수로받아서 toString처럼 리턴되도록
	 * 	 메서드 오버로딩 (String) (int) (char)
	 *  
	 */

	private MyArrays(String[] arr) {

	}
	private MyArrays(int[] arr) {

	}
	private MyArrays(char[] arr) {

	}

	public static String printArray(String[] arr) {
		String a ="";
		for(int i = 0; i < arr.length; i++) {
			a += arr[i]+" ";

		}
		return a;
	}

	
	public static String printArray(int[] arr) {
		String a ="";
		for(int i = 0; i < arr.length; i++) {
			a += arr[i]+" ";
		}
		return a;
	}

	
	public static String printArray(char[] arr) {
		String a ="";
		for(int i = 0; i < arr.length; i++) {
			a += arr[i]+" ";
		}
		return a;
	}



}
