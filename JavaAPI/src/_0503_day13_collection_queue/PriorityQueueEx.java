package _0503_day13_collection_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {


		/*
		 * **-Priority (우선순위 큐)-**
		 *
		 * => 선입선출 First in First out (FIFO)
		 * => 정렬기능 포함
		 * 
		 * 
		 */

		Queue<Integer> que = new PriorityQueue<>();

		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(5);
		que.offer(6);

		System.out.println(que.toString());

		System.out.println(que.poll()); // 1
		System.out.println(que.poll()); // 3 
		System.out.println(que.poll()); // 4
		System.out.println(que.poll()); // 5
		System.out.println(que.poll()); // 6

		System.out.println(que.toString());
		System.out.println("--------------------------------");
		
		
		// User객체를 담을 수 있는 큐
		// 큐 가 순서를 확인할 때 copmpareTo 메서드를 확인한다
		// compareTo에 정의된 순서에 의해 우선순위를 정한다.
		// 객체가 우선순위를 가지게 하려면 !
		// comparable 인터페이스를 상송받아서 compareTo메서드를 오버라이딩해서 가져갸야 한다.
		
		// 우선순위 지정
		System.out.println("홍길동".compareTo("홍길자"));  // 홍길동이 사전적으로 앞에 위치. (음수)
		System.out.println("홍길자".compareTo("홍길동"));  // 홍길동이 사전적으로 뒤에 위치. (양수)
		System.out.println("홍길동".compareTo("홍길동"));  // 위치가 같다면 양수
		
		
		Queue<User> queue = new PriorityQueue<>();
		
		queue.offer( new User("홍길동", 10) );
		queue.offer( new User("홍길자", 20) );
		queue.offer( new User("홍길순", 30) );
		queue.offer( new User("신사임당", 40) );
		
		System.out.println( queue.poll().getName());
		
		
		System.out.println( queue.toString());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
	
}
