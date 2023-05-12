package _0420_day08_super_;

public class Child extends Parent {

	String me;
	
	// 부모님의 기본생성자가 없을 때 해결하는 2가지 방안
	// 1. 부모님의 기본생성자를 만든다.
	// 2. 자식에서 super() 통해서 부모님의 생성자와 강제연결한다.

	Child(String me){
		super("홍순자","홍길동"); // 부모생성자 지칭
		this.me = me;
	}
	
	
	
	
}
