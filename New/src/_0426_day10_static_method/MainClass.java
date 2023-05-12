package _0426_day10_static_method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		Count c = new Count(); //객체생성
		c.method01(); // non- static method
		c.method02();  // static method		

		// static method의 사용
		Count.method02();  // 객체를 만들지 않아도 사용이 가능.

		// main 과 연관지어 생각하기 , main은 static 
		
		
		// java 안에 있는 static 메서드의 사용예시
		Math.random();
		Arrays.toString(new int[3]);
		Integer.parseInt("3");
		String.valueOf(3);
		
		
		
	}

	public  void test()	{
		
		
		
	}
	
}
