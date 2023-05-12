package day01;

public class _0407_Bye {

	public static void main(String[] args) {
		
		// main이라고 쓰고 ctrl + space를 누르면 실행함수가 만들어집니다. (자동완성기능)
		/*
		 * ctrl + s 저장
		 * ctrl + f11 실행
		 * sysout적은 후  ctrl + space 출력문 자동완성
		 * 
		 * 코드이동: alt + 방향키 (드래그후 커서이동)
		 * 코드복사: alt + ctrl + 방향키 (행 복사)
		 * 되돌리기: ctrl + z
		 * 전체선택 + 정렬: ctrl + a , ctrl + i
		 * 한줄삭제: ctrl + d
		 * 
		 */
		System.out.println("출력문 자동완성");
		System.out.println(1);  // 숫자 1
		System.out.println("1"); // "" (쌍따옴표)안에 쓰면 문자표기
		System.out.println("안녕하세요");
		
		// 자바의 출력문의 종류 - 3가지 제공
		// 개행문자 \n 가 없는 출력
		System.out.print("hi");
		System.out.print("hi");
		System.out.print("hi\n");   // ** 커서와 비슷한 위치에 사용.
		
		/* 위와 같은 출력
		*System.out.print("hi");
		*System.out.print("hi"); 
		*System.out.print("hi");
		*System.out.print("\n");
		*/
		
		// 개행문자를 마지막에 포함해주는 println
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		 
		// 형식 지정 출력문 printf (c언어 스타일의 출력형식, 많이사용하지 않음)
		// 내가 출력하고싶은 문자열에 구멍을 뚫어 사용하는 방식
		/*
		 *  %d - 정수를 대입할 수 있음 
		 *  %f - 실수를 대입할 수 있움
		 *  %s - 문자열을 대입할 수 있음
		 *  
		 *  \n - 줄바꿈
		 *  \t - 8칸 공백을 잡고 정렬 (tap정렬)
		 */
		
		System.out.printf("제 이름은 %s 입니다\n", "coding404");
		System.out.printf("원주율은 %.2f 입니다\n", 3.14);  // 소수점 아래길이를 제한할 수 있다. %.2 < 두자리까지만 나타냄. 지정하지 않을시 3.140000 으로 표시됨
		System.out.printf("오늘은 %d일 입니다\n", 7);
		
		//제 생일은 XXXX년 XX월 XX일 입니다 - 출력하기
		System.out.printf("제 생일은 \t%d년 %d월 %d일 입니다.", 1988, 8, 11);
	}
}
