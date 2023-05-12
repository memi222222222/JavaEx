package Quiz19;

import java.util.LinkedList;

public class ListQuiz01 {

	public static void main(String[] args) {

		/*
		 *  List 1번
		 *	1. list에  1~ 20까지 값을 순서대로 저장
		 *	2. list의 값을 순서대로 출력.
		 * 	
		 */


		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 1; i <= 20; i++) {
			list.add(i);
		}
		System.out.println( list.toString() );


		/*
		 *  List 2번
		 *  1. User를 저장하는 list생성
		 *  2. 3개의 각각 다른 User객체를 만들고 순서대로 저장
		 *  3. User객체 안에 홍길동이 있으면 해당객체의 name, age를 출력하는 코드
		 *  4. User객체 안에 홍길자가 있으면 해당객체를 삭제하는 코드
		 */

		LinkedList<User> list2 = new LinkedList<>();

		list2.add(new User("홍길동",10));
		list2.add(new User("홍길자",30));
		list2.add(new User("이순신",40));
		list2.add(new User("신사임당",40));

		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i).getName().equals("홍길동")) {
				
				System.out.println(list2.get(i).getName()+", " + list2.get(i).getAge());
			} else if(list2.get(i).getName().equals("홍길자")) {
				list2.remove(i);

			} 

		}


	}


}

