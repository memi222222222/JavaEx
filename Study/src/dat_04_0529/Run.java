package dat_04_0529;

import java.util.*;

public class Run {

	public static void main(String[] args) {


		//			players										callings								result
		//	{"mumu", "soe", "poe", "kai", "mine"}	{"kai", "kai", "mine", "mine"}	["mumu", "kai", "mine", "soe", "poe"]	
		//	



		
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = 	{"kai", "kai", "mine", "mine"};
			
		
		Map<String,Integer> map = new HashMap<>();
		
		for(int i = 0; i < players.length; i++) {
			map.put(players[i],i);
						
		}
//		for(int i = 0; i < callings.length; i++) {
//			map.get(i).replace(0, 0)
//			
//			
//			
//		}
		System.out.println(map.toString());
			












	}

}
