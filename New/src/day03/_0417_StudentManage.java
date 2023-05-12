package day03;

import java.util.Arrays;
import java.util.Scanner;

public class _0417_StudentManage {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		/* 학생정보를 등록할 배열을 while문 바깥에 선언.
		 *  
		 *  
		 */
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		String[] infoList = new String[100];

		// 고객수  
		int count = 0;

		// 조회할 위치 (배열의 위치(인덱스값))
		int index = -1;


		int a = 1;
		arr :while(true) {
			System.out.println(Arrays.toString(nameList));
			System.out.println(Arrays.toString(ageList));
			System.out.println(Arrays.toString(infoList));
			

			System.out.println("[정보]고객수: " + count + ", 조회위치: " + index);
			System.out.println("[메뉴]1. 추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6. 정보삭제, 7.종료");
			System.out.println("====================================================================");
			System.out.println("메뉴입력>");
			String menu = scan.next();

			switch (menu) {
			case "추가":
			case "1":

				/*
				 * 이름, 성별, 간단한정보를 입력받아서 순서대로 저장될수 있게 처리합니다.
				 * count를 증가합니다.
				 * 
				 */

				System.out.println("고객번호: " + a);
				System.out.print("이름>");
				nameList[count] = scan.next();
				System.out.print("나이>");
				ageList[count] = scan.nextInt();
				System.out.print("정보>");
				infoList[count] = scan.next();

				a++;
				index ++;
				count++;
				break;

			case "2":

				/*
				 * 이전정보 출력: 
				 * 정보출력은 index위치로 출력합니다.
				 * 이전정보 출력을 누르면 index를 -1 시키고 해당위치에 정보를 출력.
				 * 조건 *
				 * index가 0보다 작다면, 출력하지 않도록 처리.
				 *  
				 *  
				 */

				if (index <= 0) {

					System.out.println("이전정보가 없습니다.");
					System.out.println();
					System.out.println("---------------------------------------------------------");
					System.out.println();

				}
				else {
					index --;
					System.out.println("-------------이 전 정 보 ---------------------");
					System.out.println("이름: "+ nameList[index]);
					System.out.println("나이: " + ageList[index]);
					System.out.println("정보: " + infoList[index]);
					System.out.println();
					System.out.println("---------------------------------------------------------");
					System.out.println();

				}
				break;



			case "3":
				/*
				 * 다음정보 출력:
				 * 다음출력은 index위치로 출력합니다.
				 * 다음정보출력을 누르면 index를 +1 시키고 해당위치에 정보를 출력.
				 * 
				 * 조건*
				 * count-1보다 index가 같거나 크다면, 출력하지 않도록 처리.
				 *  
				 */


				if(index >=count-1 ) {

					System.out.println("다음정보가 없습니다.");
					System.out.println();
					System.out.println("---------------------------------------------------------");
					System.out.println();

				} else {
					index ++;
					System.out.println("--------------- 다 음 정 보 -----------------");
					System.out.println("이름: "+ nameList[index]);
					System.out.println("나이: " + ageList[index]);
					System.out.println("정보: " + infoList[index]);

					System.out.println();
					System.out.println("---------------------------------------------------------");
					System.out.println();


				}

				break;

			case "4":
				/*
				 *  현재정보 출력
				 *  index가 가르키고 있는 위치정보를 출력.
				 *  
				 *  조건*
				 *  출력할 수 있는 조건(인덱스값)을 생각해서 처리.
				 *  
				 */

				if(index > 0 && index <= count -1) {

					System.out.println("----현재정보----");
					System.out.println();
					System.out.println("이름: "+ nameList[index]);
					System.out.println("나이: " + ageList[index]);
					System.out.println("정보: " + infoList[index]);
					System.out.println();
					System.out.println("---------------------------------------------------------");
					System.out.println();

				} else {

					System.out.println("현재정보가 없습니다.");
					System.out.println();
					System.out.println("---------------------------------------------------------");
					System.out.println();

				}
				break;

			case "5":
				/*
				 * 정보 수정
				 * 새로운 이름, 나이, 정보를 입력받아서
				 * 현재위치의 정보를 수정해주면 됩니다. 
				 * 
				 * 조건*
				 * 출력할 수 있는 조건(인덱스값)을 생각해서 처리.
				 * 
				 */

				if(index >= 0 && index <= count-1) {
					System.out.println("------------현재정보 수정------------");
					System.out.println(index + " 번째 위치를 수정합니다.");

					System.out.print("새로운 이름> ");
					nameList[index] = scan.next();
					System.out.print("새로운 나이> ");
					ageList[index] = scan.nextInt();
					System.out.print("새로운 정보> ");
					infoList[index] = scan.next();
					break;

				} else {
					System.out.println("현재 위치에 수정할 정보가 없습니다.");
					System.out.println();
					System.out.println("---------------------------------------------------------");

				}
				break;


			case "6":

				/*
				 * 현재정보 삭제.
				 * 현재삭제하려는 index부터 뒤에있는 배열요소를 당겨와서
				 * 덮어씌워줍니다.
				 *  
				 * 사람수를 감소시킨다.
				 * 
				 * 조건 *
				 * 출력할 수 있는 조건(인덱스값)을 생각해서 처리.
				 */

				if(index >= 0 && index <= count -1) {   // 삭제가능 조건
					System.out.println("------------------ 정보 삭제-------------------");
					System.out.println(nameList[index] + "정보가 삭제되었습니다.");
					for(int del = index; del < count-1; del++) {
						nameList[del] = nameList[del+1];
						ageList[del] = ageList[del+1];
						infoList[del] = infoList[del+1];
					}
					
					count --;
					
				} else {
					System.out.println("현재 위치에 삭제할 정보가 없습니다.");
					System.out.println();
					System.out.println("---------------------------------------------------------");

				}

				
		 

				break;


			case "7":
				/*
				 * while문의 탈출
				 */

				System.out.println("종료되었습니다");
				break arr;

			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println();
				break;
			}

		}
	}
}




