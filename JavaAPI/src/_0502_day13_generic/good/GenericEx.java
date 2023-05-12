package _0502_day13_generic.good;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		// Generic <?>  = Generic 에 뭐든 다 들어갈수있다.
		// Generic <? extends String> = String , String의 자식들을 포함
		// Generic <? super String> = String 타입이 될 수 있다면 전달가능

		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();

		add1(list1);	//  가능
		add1(list2);	//  가능	
		add1(list3);	//  가능

		add2(list1);	// String 가능
		//		add2(list2);	// Integer 불가
		//		add2(list3);	// Object 불가

		add3(list1);	// String 가능
		//		add3(list2);	// Integer 불가
		add3(list3);	// Object가능


	}

	// 
	public static void add1(List<?> list) {

	}

	public static void add2(List<? extends String> list) {

	}

	public static void add3(List<? super String> list) {

	}





}
