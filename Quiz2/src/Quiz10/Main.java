package Quiz10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args, int rrn) {

		// 방법 1.
		//		User2 u1 = new User2();
		//		u1.setAge(20);
		//		u1.setName("홍길동");
		//		u1.setRrn(123123);
		//		



		//방법 2.
		User2 u1 = new User2("홍길동", 123123, 20);
		System.out.println("NAME: "+u1.getName());
		System.out.println("RRN: "+u1.getRrn());
		System.out.println("AGE: "+u1.getAge());

		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
		 * ex) User[] arr = new User[2];
		 */
		User2[] arr = new User2[2]; //유저객체 - 주소값
		User2 u2 = new User2("김길동", 456456, 30);
		arr[0] = u1;
		arr[1] = u2;

		// 향상된 for 문
		for(User2 u : arr) {  // for (배열과같은타입 변수 : 배열) { }

			System.out.println(u.getName());
			System.out.println(u.getRrn());
			System.out.println(u.getAge());
		}
		// 일반 for문
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+" "+ arr[i].getRrn()+" "+arr[i].getAge());
		}


		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		Scanner scan = new Scanner(System.in);
		User2[] u3 = new User2[5];

		int y = 0;
		while(y < u3.length)	{

			System.out.print("NAME >");
			String a = scan.next();
			System.out.print("RRN >");
			int b = scan.nextInt();
			System.out.print("AGE >");
			int c = scan.nextInt();

			User2 u4 = new User2(a,b,c); // u4 객체를 while문 밖에 만들시 같은객체가 생성,변동됨
			u3[y] = u4;

			y++;

		}
		System.out.println(Arrays.toString(u3));
	}

}
