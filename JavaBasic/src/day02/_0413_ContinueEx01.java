package day02;

public class _0413_ContinueEx01 {

	public static void main(String[] args) {

		// continue는 반복문을 건너뜀
		// for문에서는 증/감식으로 이동됩니다.
		for(int i = 1; i <= 10; i++) {

			if(i == 5) {
				continue;
			}

			System.out.println(i);
			System.out.println("----------------------");			


			// while문에서 continue는 조건식으로 갑니다.
			int ii = 1;
			while(ii <=10) {

				if(ii ==5) {
					ii++;
					continue;
				}
				System.out.println(ii);
				ii++;
				
			}





		}
	}

}
