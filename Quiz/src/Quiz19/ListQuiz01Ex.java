package Quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01Ex {

	public static void main(String[] args) {
		/*
		 *  List 1번
		 *	1. list에  1~ 20까지 값을 순서대로 저장
		 *	2. list의 값을 순서대로 출력.
		 * 	
		 */

		List<Integer> list = new ArrayList<>();

		for(int i = 1; i <= 20; i++) {
			list.add(i);
		}
		for(int i = 0; i <list.size(); i++) {
			System.out.print( list.get(i)+ " ");
		}

		System.out.println();
		/*
		 *  List 2번
		 *  1. User를 저장하는 list생성
		 *  2. 3개의 각각 다른 User객체를 만들고 순서대로 저장
		 *  3. User객체 안에 홍길동이 있으면 해당객체의 name, age를 출력하는 코드
		 *  4. User객체 안에 홍길자가 있으면 해당객체를 삭제하는 코드
		 */


		List<User> lists = new ArrayList<>();

		User u1 = new User("홍길동", 10);
		User u2 = new User("이순신", 20);
		User u3 = new User("홍길자", 30);
		lists.add(u1);
		lists.add(u2);
		lists.add(u1);

		System.out.println( lists.toString() );


		for(int i = 0; i <lists.size(); i++) {

			//			User u = lists.get(i);			
			//			String name = u.getName();
			//			
			//			if(name.equals("홍길동")) {
			//				 System.out.print(u.getName()+ ", "+ u.getAge());
			//			
			//		}
			User u = lists.get(i);
			if(u.getName().equals("홍길동")){
				System.out.println( u.getName() +" " + u.getAge());


			}
		}
		System.out.println("-------------------------");

		for(int i = 0; i < lists.size(); i++) {
			User u = lists.get(i);
			if(u.getName().equals("홍길자")) {
				lists.remove(i);

			}

		}
		System.out.println(lists.toString());


	}
}
