package _0428_day11_trycatch;

public class ThrowEx01 {

	public static void main(String[] args)  {

		try {
			int result = sum(-10);
			System.out.println(result);

		} catch (Exception e) {
			String msg = e.getMessage();  // 예외 메세지를 문쟈열로 변환!
			System.out.println(msg);
		}
	}

	public static int sum(int n) throws Exception {


		// 예외를 직접 생성해서, 메서드를 종료할 때 사용할 수 있습니다.
		if(n < 0) {
			throw new Exception("0 이상의 값이어야 함");  
			// 예외를 생성할 때 - 예외에서 사용되는 메세지를 전달할 수 있다.
			// () 안에 메세지를 넣을수있음 (detailMessage에 저장)
			// 저장이 되었다가 상속받아서 getter message 로 출력
		}

		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;

		}

		return sum;
	}




}
