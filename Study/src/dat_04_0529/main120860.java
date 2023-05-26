package dat_04_0529;

public class main120860 {

	public static void main(String[] args) {
		//		2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 
		//		직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 
		//		배열 dots가 매개변수로 주어질 때,
		//		직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
		//
		//				제한사항
		//				dots의 길이 = 4
		//				dots의 원소의 길이 = 2
		//				-256 < dots[i]의 원소 < 256
		//				잘못된 입력은 주어지지 않습니다.
		//				입출력 예
		//						dots						   	result
		//				[[1, 1], [2, 1], [2, 2], [1, 2]]			1
		//				[[-1, -1], [1, 1], [1, -1], [-1, 1]]		4		



//		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
		
		int a = dots[0][0];
		int b = dots[0][1];
		
		int c = dots[1][0];
		int d = dots[1][1];	
		for (int i = 0; i < dots.length; i++) {
			a = Math.max(a,dots[i][1]);
			b = Math.min(b,dots[i][1]);

			
			c = Math.max(c,dots[i][0]);
			d = Math.min(d,dots[i][0]);


		}

		System.out.println((a-b) * (c-d));

		//			System.out.println(a);
		//			System.out.println(b);




	}

}
