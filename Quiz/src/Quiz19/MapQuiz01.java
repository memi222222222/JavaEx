package Quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		y :while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			
			if(menu == 1) {
				System.out.println(" < 신규 메뉴등록 >");
				System.out.println("메뉴 이름>");
				String name = scan.next();

				if(!( map.containsKey(name) )) {
					System.out.println("메뉴 가격>");
					int price = scan.nextInt();
					map.put(name, price);
					System.out.println(name+ " 등록완료");
				} else if ( map.containsKey(name) ){
					System.out.println("이미 등록된 메뉴입니다");
				}

				
				
			} else if(menu == 2) { // 메뉴판 전체 보기
				System.out.println(map.toString());

				
				
			} else if(menu == 3) {// 메뉴판 수정
				System.out.println("변경할메뉴>");
				String name3 = scan.next();

				if(( map.containsKey(name3) )) {

					System.out.println("변경할 가격>");
					int price2 = scan.nextInt();
					map.put(name3, price2);
					System.out.println(name3 +"의 가격이 수정되었습니다.");

				} else {
					System.out.println("등록된 메뉴가 없습니다.");

				}


				
				
			} else if(menu == 4) { // 삭제
				System.out.println("삭제할메뉴>");
				String name4 = scan.next();
				if(( map.containsKey(name4) )) {
					map.remove(name4);
					System.out.println(name4+"메뉴가 삭제되었습니다.");
				} else {
					System.out.println("존재하지않는메뉴입니다.");
				}


				
				
			} else if(menu == 5) { // 프로그램종료
				System.out.println("프로그램종료");
				break y;

			}

		}


	}
}
