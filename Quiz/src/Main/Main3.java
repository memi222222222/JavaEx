package Main;

public class Main3 {

	public static void main(String[] args) {
		String answer = "";
		String str = "hello";
		char[] arr = str.toCharArray();
		int n = 3;

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < n; j++) {
				answer += arr[i];
			}

		}



		System.out.println(answer);




	}
}
