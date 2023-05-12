package Quiz18;

import java.util.Scanner;

public class StringQuiz01 {
	
	public static void main(String[] args) {

		/*
		 *  스캐너사용, id 입력받기
		 *  id는 공백을포함해서 받을 수 있다. nextLine() 사용
		 *  
		 *  단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받습니다.
		 *  	5글자 이상이면 " id가 등록 되었습니다" 출력후 종료
		 *  
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		String id ="";
		
		while(true) {
			System.out.print("id 입력>");
			id = scan.nextLine();
			id= id.replace(" ", "");
			
			if(id.length() >= 5) {
				System.out.println("id가 등록되었습니다.");
				break;
			} else {
			 System.out.println(id +" 는 5글자 미만입니다. 다시 입력해주세요");	
			}
			
			
			 
		}
		
		
		
		
		
		
		
		
		
		
	}

}
