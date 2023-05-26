package day_03_0522;

public class password {

	public static void main(String[] args) {

		//			입출력 예
		//			cipher				       code		 result
		//		"dfjardstddetckdaccccdegk"		4		"attack"
		//		"pfqallllabwaoclk"				2		"fallback"
		//		
		//		
		//		
		String cipher = "dfjardstddetckdaccccdegk";

		int code = 4;
		String answer ="";
		for(int i = code-1; i < cipher.length(); i+=code) {
			answer += cipher.charAt(i);
			System.out.println(i);
		}
		System.out.println(answer);
	}

}
