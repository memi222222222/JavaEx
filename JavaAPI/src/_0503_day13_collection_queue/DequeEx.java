package _0503_day13_collection_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {

		//	같은 뜻 ArrayDeque<Integer> que = new ArrayDeque<>();
		Deque<Integer> que = new ArrayDeque<>();
		
		// 뒤에서 추가
		que.offerLast(1);
		que.offerLast(2);
		que.offerLast(3);
		que.offerLast(4);
		
		System.out.println( que.toString() );

		// 앞에서 꺼내기  poll 빠짐과동시에 삭제함.
		int n = que.pollFirst();
		System.out.println("반환된 원소: " + n);
		que.pollFirst();
		que.pollFirst();
		que.pollFirst();
		System.out.println( que.toString() );
		
		System.out.println("------------------------------------");
		
		// 앞에서 추가
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		System.out.println( que.toString() );
		
		// 뒤에서꺼내기
		int a = que.pollLast();
		System.out.println("반환된 원소: "+ a);
		System.out.println( que.toString() );
		
		
		// [4 , 3, 2] 
		// list의 get과 같이 앞 or 뒤에서 값 확인
		System.out.println( que.peekFirst() );
		System.out.println( que.peekFirst() );
		System.out.println( que.peekFirst() );
		// 변하지 않는다.
		System.out.println( que.toString() ); 
		

		
		
		
		
		
		
	}

}
