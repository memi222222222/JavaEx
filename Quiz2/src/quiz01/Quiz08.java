package quiz01;


public class Quiz08 {

	public static void main(String[] args) {

		String[] arr = {"안녕", "hello", "니하오", "오하~", "!@$%"};

		/*
		 *  1. 랜덤수를 생성하여 이랜덤수를 이용하여 배열의 랜덤한 값이 출력되게 처리.
		 *  2. 출력된 문자열이 어느나라 언어인지 판별하여 출력시키기.
		 *  
		 */


		int a = (int)(Math.random()*5);


		switch (a) {
		case 1:
			System.out.println("선택된단어: "+ arr[0]);
			System.out.println("한국어입니다.");
			break;
		case 2:
			System.out.println("선택된단어: "+ arr[1]);
			System.out.println("영어입니다.");
			break;
		case 3:
			System.out.println("선택된단어: "+ arr[2]);
			System.out.println("중국어입니다.");
			break;
		case 4:
			System.out.println("선택된단어: "+ arr[3]);
			System.out.println("일본어입니다.");
			break;

		default:
			System.out.println("선택된단어: "+ arr[4]);
			System.out.println("알수 없는 언어 입니다.");
			break;
		}


		//	---------수정씨답안 ------

		/*	String b = arr[a];
		System.out.println("선택된단어 :"+ b);

		switch (b) {
		case "안녕":
				System.out.println("한국어입니다.");
			break;
		case "hello":
				System.out.println("영어입니다.");
			break;
		case "니하오":
			System.out.println("중국어입니다.");
			break;
		case "오하~":
				System.out.println("일본어입니다.");
			break;

		case "!@$%":
				System.out.println("알수 없는 언어 입니다.");
			break;
		}
		 */

		System.out.println("--------강사님 답안----------");
		int index = (int)(Math.random() * arr.length); // 이게더좋돠!!	
		System.out.println("선택된단어: "+ arr[index]);

		switch (arr[index]) {
		case "안녕":
			System.out.println("한국어입니다.");
			break;
		case "hello":
			System.out.println("영어입니다.");
			break;
		case "니하오":
			System.out.println("중국어입니다.");
			break;
		case "오하~":
			System.out.println("일본어입니다.");
			break;
		default:
			System.out.println("알수 없는 언어 입니다.");
			break;
		}


	}

}
