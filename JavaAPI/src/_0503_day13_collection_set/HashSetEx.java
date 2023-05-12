package _0503_day13_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		/*
		 * 리스트와 반대(순서 x 중복 x)
		 *  => 인덱스기준 조회하는메서드가없다
		 *  => 동일한값 저장시, 들어가지 않는다
		 *  set계열 순회시 향상된for문, 반복자개념을 사용해야함
		 *  
		 *  HashSet클래스
		 *  TreeSet클래스 (Set + 정렬)
		 * 
		 */
		
		// HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		// add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java");   // 중복허용 x

		// 
		System.out.println( set.toString());
		// 크기
		System.out.println("크기: "+set.size());
		// 삭제 .remove(값) // 인덱스값입력하지않고 직접값을 입력해야 삭제됨.
		set.remove("python"); 
		System.out.println( set.toString());
		
		// 순회 => 내부적으로 반복자(Iterator) 의 개념을 사용해서 회전
		//  향상도니 for 문 .인덱스구조가없는것에 사용 
		for(String s  : set ) {   // String 값을 받는것
			System.out.println(s);
		}
		
		System.out.println("-------------------------------");
		// set => iterator(반복자) 타입으로 변경
		Iterator<String> iter =set.iterator();

//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		
		while(iter.hasNext()) { // 다음이있다면 true.
			System.out.println(iter.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
