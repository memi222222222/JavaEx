package quiz01;

import java.util.Scanner;

public class MainTest02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int H = scan.nextInt();
		int M = scan.nextInt();

		if(M>=45 && M <60) {

			M -= 45;

			System.out.println(H + " " + M);
		}else {
			M += 15;

			if(H>0) {
				H -= 1;
			}else {
				H = 23;
			}System.out.println(H + " " + M);



		}
	}

}
