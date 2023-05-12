package Quiz10;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */

		User us = new User();
		us.setName("홍길동");
		us.setRrn(123123);
		us.setAge(20);
		System.out.println(us.getName()+" "+ us.getRrn()+" "+us.getAge());


		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
		 * ex) User[] arr = new User[2];
		 */
		User[]arr= new User[2];
		User us2 = new User();
		us2.setName("김길동");
		us2.setRrn(456456);
		us2.setAge(30);
		arr[0] = us;
		arr[1] = us2;

		//		for(int i = 0; i < arr.length; i++) {
		//			System.out.println(arr[i].getName()+" "+ arr[i].getRrn()+" "+arr[i].getAge());
		//		}


		for(User j : arr) {
			
			j.info();

		}


		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		Scanner scan = new Scanner(System.in);
		
		User[] arr2 = new User[5];
		int z = 0;
		while (z < arr2.length) {
			System.out.print("이름을 입력하세요>");
			String a = scan.next();
			System.out.print("rrn을 입력하세요>");
			int b = scan.nextInt();
			System.out.print("나이를 입력하세요>");
			int c = scan.nextInt();

			User user = new User();  // user 객체를 while문 밖에 만들시 같은객체가 생성,변동됨
			user.setName(a);
			user.setRrn(b);
			user.setAge(c);

			arr2[z]= user;


			z++;
		}

		System.out.println(Arrays.toString(arr2));




	}
}
