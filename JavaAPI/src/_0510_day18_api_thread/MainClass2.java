package _0510_day18_api_thread;

public class MainClass2 {

	public static void main(String[] args) {

		// 쓰레드를 상속받는 클래스는 직접사용
		ThreadTest02 thresd = new ThreadTest02();
		thresd.setName("Thread__B"); //쓰레드명
		thresd.start();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
