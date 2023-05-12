package _0428_day11_trycatch;

public class ThrowsEx01 {
	
	public static void main(String[] args) {
		
		
		/*
		 *  메서드나 생성자에서 발생되는 예외를 호출문장으로 넘기는 키워드 throws이다.
		 *  throws구문이 붙는 생성자 or 메서드는 예외처리를 대신 진행해야한다.
		 *	
		 * 즉, 에외처리를 강요할 때 사용된다.
		 */
		
		try {
			greeting(10);
			
		} catch (Exception e) {
		System.out.println("에러가 발생했습니다.");
		e.printStackTrace();  // 에러가 발생했을때 에러로그를 확인하기 위해 많이 사용됨.
		}
		
		// throws의 예시
		
		try {
			Class.forName("!@$!$!@@%@$");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// new FileInputStream("%#%");
		
		
		
		
		
		
		
		System.out.println("프로그램 정상종료");
	}

	private static String[] arr = {"hello", "bye", "say good bye"};
	public static void greeting(int index) throws Exception {
		
		
		System.out.println(arr[index]);
		
		
	}
	
	
}
