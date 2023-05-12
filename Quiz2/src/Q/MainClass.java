package Q;


public class MainClass {

	public static void main(String[] args) {

		Computer com = new Computer();

		Monitor mon = com.getMon();
		mon.info();
		
		KeyBoard key = new KeyBoard();
		Mouse mouse = new Mouse();
		Monitor monitor = new Monitor();
		
		Computer com2 = new Computer(key, mouse, monitor);
		
		com2.computerInfo();
		Monitor m = com2.getMon();
		
		
		
		
		
	}
}
