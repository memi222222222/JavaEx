package day_03_0522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TEST {

	public static void main(String[] args) {

		//				rank			attendance												result
		//		[3, 7, 2, 5, 4, 6, 1]	[false, true, true, true, true, false, false]			20403
		//		[1, 2, 3]				[true, true, true]										102
		//		[6, 1, 5, 2, 3, 4]		[true, false, true, false, false, true]					50200
		//		등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return

		//		제한사항
		//		3 ≤ rank의 길이 = attendance의 길이 ≤ 100
		//		rank[i]는 i번 학생의 선발 고사 등수를 의미합니다.
		//		rank의 원소는 1부터 n까지의 정수로 모두 서로 다릅니다.
		//		attendance[i]는 i번 학생의 전국 대회 참석 가능 여부를 나타냅니다.
		//		attendance[i]가 true라면 참석 가능, false면 참석 불가능을 의미합니다.
		//		attendance의 원소 중 적어도 3개는 true입니다.
		//		
                                          
		////         0  1  2   3  4  5  6 
 		int[] rank = {3, 7, 2, 5, 4, 6, 1};
		boolean[] attendance = {false, true, true, true, true, false, false};
		
		
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int answer = 0;
		for(int i = 0; i < rank.length; i++) {
			map.put(rank[i],i);		
		}
		for(int i = 0; i < attendance.length; i++) {
			if(attendance[i] == true) {
				list.add(rank[i]);
			}
		}
		Collections.sort(list);
		int a = map.get(list.get(0));
		int b = map.get(list.get(1));
		int c= map.get(list.get(2));
		answer = 10000 * a + 100 * b + c;
		
		
		
		
		System.out.println(answer);

	}
}
