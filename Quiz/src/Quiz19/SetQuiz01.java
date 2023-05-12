package Quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {

	public static void main(String[] args) {

		/*
		 *  중복되지 않는 6자리 수 (로또번호)
		 *  
		 *  1. Random객체를 이용해서 1~ 45까지 랜덤한 수 생성
		 *  2. Set에 6개의랜덤한 로또 번호를 저장.
		 */
		Random r = new Random();
		TreeSet<Integer> set= new TreeSet<>();

		while(true) {
			set.add((r.nextInt(45))+1);
			if(set.size() == 6) {
				break;
			}
		}

		System.out.println(set.toString());
		System.out.println("----------------------");



		Set<Integer> set2 = new HashSet<>();
		// 랜덤객체 생성
		Random ran = new Random();
	
		
		while(set2.size() < 6) {
			int a = ran.nextInt(45) + 1;
			set2.add(a);
		}
		
		System.out.println(set2.toString());





















	}

}
