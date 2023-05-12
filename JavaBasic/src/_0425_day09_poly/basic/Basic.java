package _0425_day09_poly.basic;

/*
 * 하나의 자바파일에는 여러 클래스 선언이 됨.
 * 단, 파일명과 동일한 클래스가 있어야하고, 해당클래스만 public으로만들기.  
 *  
 */
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}


public class Basic {

	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b;
	A a5 = new B(); // B-> A 변환
	
	//기본타입변수
	int x = 1;
	double y =  x; // int-> double 변환
	
		
	// Object 타입은 모든 클래스가 저장 됨.
	Object o1 = a;
	Object o2 = "문자열";
	Object o3 = 1;
	Object o4 = new B();
	
	
}