package Quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>(); // 배열대체


		while(true) {

			System.out.println("[ 1. 등록 | 2.회원정보확인 | 3.회원정보검색 | 4.회원정보수정 | 5.프로그램종료 ]" );
			System.out.print("메뉴 (번호) >");

			int menu = scan.nextInt();
			String name ="";
			int age = 0;
			User u = new User(name, age);
			switch (menu) {

			case 1:

				// 이름, 나이를 입력받아서 user 객체에 저장, 리스트에 순서대로 추가
				System.out.println("이름 >");
				name = scan.next();
				System.out.println("나이 >");
				age = scan.nextInt();
				list.add(new User(name, age));


				break;
			case 2:
				// 리스트에담긴 모든 회원, 이름, 나이를 출력


				for(int i = 0; i <list.size(); i++) {
					u = list.get(i);

					System.out.println("회원이름: " + u.getName());
					System.out.println("회원나이:  "+ u.getAge());
				}

				break;
			case 3:
				// 찾을 이름을 새롭게 입력받아서, 이름이 있다면, 이름과 나이를 출력.
				// 조건 - 찾는 이름이 없다면 "~~~ 는 목록에 없습니다" 출력.

				System.out.print("찾을 이름을 입력해주세요 >");
				String serchName = scan.next();
				for(int i = 0; i <list.size(); i++) {
					u = list.get(i);
					if(u.getName().equals(serchName)){
						System.out.println( u.getName() +" " + u.getAge());
						break;
					} else {
						System.out.println( serchName +"은 목록에 없습니다" );
						
					}

				}
				break;
			case 4:
				// 삭제할 이름을 입력받아서, 동일한 이름과 동일한 User객체 첫번쨰만 1개만 삭제
				System.out.print("삭제할 이름을 입력해주세요 >");
				String delName = scan.next();

				for(int i = 0; i <list.size(); i++) {
					u = list.get(i);
					if(u.getName().equals(delName)){
						list.remove(i);
						System.out.println("삭제되었습니다.");
						break;
					} 

				}


				break;

			case 5:
				System.out.println("프로그램종료");
				System.exit(5);
				break;

			default:

				System.out.println("잘못입력하였습니다");
				break;
			}



		}






	}


}
