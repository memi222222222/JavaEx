package _0503_day13_collection_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		// Map 인터페이스를 구현하는 클래스 HashMap
		// 키(key)에 대한 타입과 Value에 관한타입을 지정.
		// 탐색이 빠르다.


		// HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();

		// 맵에 값을 저장 put(key, 값)

		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");

		// 문자열로 맵의결과 출력
		System.out.println(map.toString());
		System.out.println(map.size());

		// 맵에 동일한 키를 저장하면?  값이 변경됨,
		map.put(4, "강감찬");
		System.out.println(map.toString());

		// 맵의 값 얻기 get(키) : 값을 반환
		String item = map.get(3);
		System.out.println("3번 키에대한 값: " +item);

		// key의 유무 확인 containsKey(키)
		if( map.containsKey(3) ) {
			System.out.println("3번 키가 존재함");
		}

		// 맵의 삭제 remove(키)
		map.remove(4);
		System.out.println(map.toString());

		// 방법 2 맵의 순회 //맵을  => 셋으로 변경
		Set<Entry<Integer, String>> entrySet = map.entrySet();	
		// 엔트리에는 키, 값을 꺼내는 기능
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("----------------------------------------"); 
		
		// 방법 2
		Set<Integer> set = map.keySet();
		for(int key : set) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("-----------------------------------------");

		// 맵에 객체를 담는 모형
		// <Integer, User> map2 = new HashMap<>();
		Map<Integer, Object> map2 = new HashMap<>();
		









	}
}
