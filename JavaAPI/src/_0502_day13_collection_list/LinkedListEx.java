package _0502_day13_collection_list;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		/*
		 * LinkedList  //List기능도 쓸수있다.
		 * => 순서 O. 중복 O
		 * => 노드객체 (양방향 연결리스트)
		 **** 삽입, 삭제는 ArrayList보다 좋으나, 탐색은 느리다.****
		 */
		
		LinkedList<Integer> list = new LinkedList<>();
		
		// List와 기능은 동일하다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
	
		//
		System.out.println( list.toString() );
		
		// 중간에 추가\
		list.add(3, 10); // 3번째 인덱스에 10추가
		System.out.println( list.toString() );
		
		// 값 얻기get()
		int n = list.get(3);
		System.out.println(n);
		
		// 값 삭제 remove()
		list.remove(3);
		System.out.println( list.toString() );
		System.out.println("---------------------------------");
		
		
		// LinkedList는 queue의 기능을 구현. queue기능 사용가능
	
		list.offer(10);
		list.offer(11);
		System.out.println( list.toString() );
		
		int r =list.poll(); // 빠지는값 반환받기
		System.out.println(r);
		System.out.println( list.toString() );
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
