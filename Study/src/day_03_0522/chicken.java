package day_03_0522;


public class chicken {
	public static void main(String[] args) {
		//		chicken		   result
		//		 100			 11
		//		 1,081		    120




		int chicken = 1081;   

		int answer = 0;
		while(true) {
			answer += (chicken / 10);
			chicken = (chicken / 10) + (chicken % 10);
			if (chicken < 10) {break;}

		}


		System.out.println(answer );
	}

}

