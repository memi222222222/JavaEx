package _0424_day08.encap.good;

import java.util.Set;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn; 
	/*
	 * 은닉된 변수에 접근할 때, 미리생성 해놓은
	 * getter/ setter 를 사용합니다.
	 * 
	 *  setter메서드
	 *  1. 값을 저장하는 용도의 메서드
	 *  2.접근제어자는 public으로 선언. 이름은(set+멤버변수명)을 반드시'대문자로'시작하여 지정
	 */

	public void setYear(int year) {
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		} else {
			this.year = year;
		}

	}
	/*
	 * 1. month, day, ssm. getter/ setter생성
	 * 
	 * month - 1~12월까지 저장
	 * day - 1~31일 까지 저장
	 * ssn - 하이픈은 제거하고 13자리 까지만 저장가능
	 */

	public void setMonth(int month) {   // set month
		if(month < 1 || month > 12) {
			System.out.println("잘못된 월 입니다.");
			return;
		} else {
			this.month = month;
		}
	}

	public void setDay(int day) {  // set day
		if(day < 1 || day >31) {
			System.out.println("잘못된 날짜 입니다.");
			return;
		} else {
			this.day = day;
		}
	}

	public void setSsn(String ssn) {
		ssn = ssn.replace("-", "");
		
		if(ssn.length() != 13) {
			System.out.println("주민번호는 13자리 입니담");
			return;
		} else {
			this.ssn = ssn;
		}
	}


	/*
	 * getter 메서드 
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어는 public, 반환유형이 있고, 이름이(get+멤버변수명)을 반드시'대문자로'시작하여 지정
	 * 
	 */

	public int getYear() {
		return year;
	} 

	public int getDay()	{
		return day;
	}

	public int getMonth() {
		return month;
	}

	public String getSsn() {

		return ssn;
	}





}
