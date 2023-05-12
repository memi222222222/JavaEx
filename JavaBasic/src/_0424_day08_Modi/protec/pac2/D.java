package _0424_day08_Modi.protec.pac2;

import _0424_day08_Modi.protec.pac1.A;

public class D extends A{

	
	// protected는 상속관계에서 super를 통한접근이 가능함.
	public D() {
		super();
		super.bool = true;
		super.method();
	}
	
	// override 됨
	protected void method() {
		
		
	}
	
}
