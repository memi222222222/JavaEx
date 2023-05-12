package _0428_day11_trycatch;

public class ThrowsEx02 {
	
	public ThrowsEx02() throws Exception{  // 생성자를 호출하는 메인으로 예외처리 넘겨부림,,,
		System.out.println("생성자 시작");
		aaa();
		System.out.println("생성자 종료");
	}
	
	public void aaa()throws Exception 	{ // aaa 호출문장으로 예외처리 떠넘김,,, (생성자루)
		System.out.println("aaa 시작");
		bbb();
		System.out.println("aaa 종료");
	}
	
	public void bbb() throws Exception	{ //bbb 호출문장으로 예외처리를 넘김 (aaa 메서드로)
		System.out.println("bbb 시작");
		System.out.println(10 / 0);
		
//		try {
//			System.out.println(10 / 0);
//			
//		} catch (Exception e) {
//			System.out.println("예외처리 끝");
//		}
		
		System.out.println("bbb 종료");
	}
	
	
	
	// main
	public static void main(String[] args)  {  // throws Exception얘두,,, 넘기면 알아서, ,처리됨,.,,
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
			
		} catch (Exception e) {
			System.out.println("예외처리 끝");
			
		}
		
		
	}
	
	
}
