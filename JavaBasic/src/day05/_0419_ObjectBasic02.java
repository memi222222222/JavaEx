package day05;

public class _0419_ObjectBasic02 {

	public static void main(String[] args) {
		
		_0419_Calculator cal1 = new _0419_Calculator();
		System.out.println("------- 1번 계산기 -------");
		System.out.println( cal1.add(10) );
		System.out.println( cal1.add(20) );
		System.out.println( cal1.add(30) );
		
		
		_0419_Calculator cal2 = new _0419_Calculator();
		System.out.println("------- 2번 계산기 -------");
		System.out.println( cal2.add(100) );
		System.out.println( cal2.add(200) );
		System.out.println( cal2.add(300) );
		
		
	}
	
}
