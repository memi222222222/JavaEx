package _0510_day18_api_thread.ex2;

public class ThreadTest implements Runnable{

	private int num = 0;
	
	
	@Override
	public	synchronized void run() {
		
		for(int i = 1; i <=10; i++) {
			
			
			num++;
			System.out.println("-----------------------------------------");
			System.out.println( "쓰레드명: " +Thread.currentThread().getName());
			System.out.println(num);
			
			try {
				Thread.sleep(1000); // 1초
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}

}
