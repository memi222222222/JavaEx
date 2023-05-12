package Quiz06;

public class MainClass {
	public static void main(String[] args) {
		
		MyAccount ac = new MyAccount("혜민", "123", 10000);
		ac.info();
		ac.deposit(10000);
		ac.withDraw(100);
	}

}
