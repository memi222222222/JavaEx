package Main;

import java.util.Scanner;

public class Quiz1111 {
public static void main(String[] args) {
// 		1. 7~ 100까지 정수 중에 7의 배수만 가로로 출력
	for(int i = 7; i <= 100; i +=7) {
		System.out.print(i +" ");
	}
	
//		2. 1~200까지 정수 중에 9의 배수의 개수를 출력.
	System.out.println();
	System.out.println();
	System.out.println();
	int count = 0;
	for(int z = 1; z <= 200; z++) {
		if(z % 9 == 0) {
			count++;
		}
	}
	System.out.println("9의배수는 총:" + count);
	
	
//		3. 50~ 100사이의 합계
	System.out.println();

	int sum = 0;
	for(int x = 50; x <= 100; x++) {
		sum += x;
	}
	
	System.out.println("합계는 총: " + sum);
	
	

//		4. A~Z까지 가로로 붙여서 출력, A =65, z=90
	System.out.println();
	
	for(char a ='A'; a <= 90; a++) {
		System.out.print(a+" ");
	}
	System.out.println();
	System.out.println();
		
	
//		5. 입력받은 정수까지 팩토리얼  5팩토리얼= 5 * 4 * 3 * 2 * 1
	
	System.out.println();
	System.out.print("정수입력>");
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	for(int b = a; b >= 1; b--) {
		a *= b;
		
	}
	System.out.print(a);
	
	
	
}
}
