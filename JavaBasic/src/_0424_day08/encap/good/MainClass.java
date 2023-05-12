package _0424_day08.encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		// me.day = 2022;
		me.setYear(2023);
		int year = me.getYear();
		System.out.println(year);
		
		
		me.setDay(11);
		int day = me.getDay();
		System.out.println(day);
		
		
		me.setMonth(8);
		int month = me.getMonth();
		System.out.println(month);
		
		
		me.setSsn("880629-2951313");
		String ssn= me.getSsn();
		System.out.println(ssn);
		
	}

}
