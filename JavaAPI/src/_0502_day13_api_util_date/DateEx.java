package _0502_day13_api_util_date;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateEx {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		int a =date.getYear();
		System.out.println(a);

		// 현재 날짜를 1970/ 1/ 1 0시 기준잡아 밀리초로 나타낸다. (날짜연산)
		long millis = date.getTime();   
		System.out.println(millis);

		// 현재시간 + 1초차이나는 연산
		Date date2 = new Date(System.currentTimeMillis() + 1_000);  
		System.out.println(date2);

		long millis2  = date2.getTime();
		System.out.println( millis2 - millis );  // 시간차

		System.out.println("--------------------------------------");

		//사람이 보기편한 날짜로 변환. (년 월 일 시:분:초)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		String now = sdf.format(date);
		System.out.println(now);
		
		
		
		

	}



}
