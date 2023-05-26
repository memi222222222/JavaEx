package day_03_0522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class openchat {
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234",
				"Enter uid1234 Prodo","Change uid4567 Ryan" };
		
		Map<String, String> map = new HashMap<>();	
		ArrayList<String> list = new ArrayList<>();  
		String[] answer = {};
		for(int i = 0; i < record.length; i++){
			answer = record[i].split(" "); 				
			if(answer.length > 2){						
				map.put(answer[1],answer[2]);
			} 
		}

		for(int i = 0; i < record.length; i++) {
			answer = record[i].split(" ");

			if(answer[0].equals("Enter")) {
				list.add(map.get(answer[1])+"님이 들어왔습니다.");
			}
			if(answer[0].equals("Leave")) {
				list.add(map.get(answer[1])+"님이 나갔습니다.");            
			}
			else {
				map.get(answer[1]).replace(answer[1],answer[2]);
			}
		}
		

	}


}
