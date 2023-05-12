package _0510_day18_api_thread;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 1. 작업쓰레드로 사용할 개체 생성
		ThreadTest test = new ThreadTest();
		
		// 2. 쓰레드클래스를 사용해서 작업쓰레드를 실행
		Thread thread = new Thread(test, "Thread_A");
		thread.start();
		
		
		
		
		try {
			Thread.sleep(5000); // 5초간 멈춤
		} catch (Exception e) {
			e.printStackTrace();
		}
	
				
		
		System.out.println("메인쓰레드 종료");
		
		
	}
}
