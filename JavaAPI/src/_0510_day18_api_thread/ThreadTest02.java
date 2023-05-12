package _0510_day18_api_thread;

public class ThreadTest02 extends Thread {

	@Override
	public void run() {

		for(int i = 0; i <= 10; i++ ) {
			
			System.out.println("쓰레드를 상속받는 클래스 실행: "+ i);
			System.out.println("쓰레드의 이름: " + getName());
			
			try {
				sleep(1000); // 상속받은 sleep
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	
	
	}

	
	
}
