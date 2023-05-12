package day01;

import java.util.Scanner;

public class _0410_ScannerEX {

public static void main(String[] args) {
	
	// 자바의 입력
	// 1. 스캐너 객체 필요
	Scanner scan = new Scanner(System.in);
	
	// 2. 스캐너가 가지고 있는 입력기능을 사용해서 데이터를 입력받음.
	System.out.print("이름을 입력하세요>");  // 문자열
	String name = scan.next(); // 입력을 받을 수 있는 상태
	
	System.out.print("나이는?>");  // 정수
	int age = scan.nextInt();
	
	System.out.print("신장은?>"); // 실수
	double cm = scan.nextDouble();
	
	System.out.println("입력받은이름: " + name + ", 나이: " + age + ", 신장 " + cm );


	// 3 스캐너 자원 해제
	scan.close();
	
	
	
	
}
}
