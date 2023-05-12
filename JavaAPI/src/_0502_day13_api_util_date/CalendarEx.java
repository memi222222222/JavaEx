package _0502_day13_api_util_date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		// Calendar cal = new Calendar();
		// static메서드를 사용하여 객체를 반환하는 모형.
		Calendar cal = Calendar.getInstance();

		System.out.println( Calendar.YEAR ); // 1
		System.out.println( Calendar.MONTH ); // 2
		System.out.println( Calendar.DATE ); // 5
		
		int year = cal.get( Calendar.YEAR ); 
		System.out.println(year);  // 년도
			
		int month = cal.get( Calendar.MONTH );
		System.out.println(month + 1); // 월  = 1작게 나옴/
		
		int day = cal.get( Calendar.DATE );  
		System.out.println(day); // 일
		
		int hour = cal.get( Calendar.HOUR );
		System.out.println( hour );  // 시간
		
		int min = cal.get( Calendar.MINUTE );
		System.out.println( min ); // 분
		
		int second = cal.get( Calendar.SECOND );
		System.out.println( second ); // 초
		
		
		
	}

}
