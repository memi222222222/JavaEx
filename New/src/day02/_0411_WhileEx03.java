package day02;

import java.util.Scanner;

public class _0411_WhileEx03 {

	
	public static void main(String[] args) {
		
		// 어떤 수를 입력받아서 입력받은 수가 '소수'인지 판별.
		// 소수 : 1~자기자신인수와 나누었을때 떨어지는수가 1과 자기자신인 수.
		
		Scanner scan = new Scanner(System.in);
		// num과 i 가 같으면 소수
		System.out.print("판별할 소수를 입력>");
		int num = scan.nextInt();
		
		int i = 2;
		while(num % i != 0) {
			
			
			i++;
		}
		
		System.out.println(num == i ? num+ "은 소수" : num + "은 소수가 아님");
	}
	
	}
