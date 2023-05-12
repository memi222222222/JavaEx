package day02;

public class _0411_SwitchEx01 {
	public static void main(String[] args) {

		int a = 0;

		// switch()안에는 변수나 변수의 연산식이 들어간다.
		// 타입은- 정수, 문자, 문자열 이어야한다. 실수는 불가.
		switch(a) {
		//case  값 :
		case 0:
		case 1:
			System.out.println("1입니다");
			break; //switch문을 바로 탈출시킨다.
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		case 4:
			System.out.println("4입니다");
			break;
		default:
			System.out.println("1~4가 아닙니다");
			break;
		}

	}

}
