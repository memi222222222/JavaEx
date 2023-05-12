package Quiz02;

public class Account2 {

	public static void main(String[] args) {
		
		Account hyem = new Account("escape", 1233, 200);
		hyem.info();
	
		hyem.deposit(1000);		hyem.deposit(-100);
		hyem.withDraw(30000);
		
		hyem.getBalance();
		
		int balance = hyem.getBalance();
		System.out.println(balance);
	}
}
