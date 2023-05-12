package _0502_day13_collection_list;

import java.util.List;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		/*
		 * Stack 
		 *  => Last In First Out (후입선출)
		 *  => push(), pop()
		 * 
		 */


		// 콜렉션프레임워크는 제네릭클레스로 만들어져 있다.
		Stack<String> stack = new Stack<>();

		// 값의 추가
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");

		// 형태를 문자열로 확인
		System.out.println( stack.toString() );

		String m = stack.pop();
		System.out.println("pop: " + m );
		System.out.println( stack.toString() );
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println( stack.toString() );
		
		
		// 없는 상태이기떄문에 err
		System.out.println(stack.pop());


		
		
		
		
	}


}
