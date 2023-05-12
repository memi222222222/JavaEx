package _0424_day08.encap.obj;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Hotel h = new Hotel();

		//		Chef c= h.getChef();  
		//		c.cooking();		
		//		

		// Chef를 생성해서 Hotel에게 전달

		h.setChef(new Chef());   // Chef chef = new Chef(); 같은의미의 표현
		Chef c = h.getChef(); //  Hotel 안에 있는 Chef를 꺼냄
		c.cooking();


		Chef a = new Chef();
		// 사용 . 생성하는곳
		Hotel2 h2 = new Hotel2(a);

		Chef chef = h2.getChef(); // 반환유형확인 , 대입.
		chef.cooking();
		// System.out.println(a == chef);
		//Class<?> h3 = h2.getClass();
		// // 참고 // //		Scanner scan = new Scanner(System.in); // in에 객체가 들어간다.

	}

}
