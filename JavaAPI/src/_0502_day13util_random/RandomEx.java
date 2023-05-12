package _0502_day13util_random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {

		// double d = Math.random();
		Random r = new Random();

		double d = r.nextDouble(); // 0 이상 ~ 1 미만
		System.out.println(d);
		
		int i = r.nextInt();
		System.out.println(i); // 정수범위의 랜덤값 
	
		int i2 = r.nextInt(10);  // 0이상~ 10미만으로 지정함/
		System.out.println(i2);
		
		
		
		
	}
}
