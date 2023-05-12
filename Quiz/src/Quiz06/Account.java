package Quiz06;

public class Account {  //0420

	// 한 사람의 은행 계좌
	/*
	 * 1. accountNumber변수 - 식별 아이디
	 * 2. password변수 - 비번
	 * 3. balance변수에 - 잔고
	 * 
	 * 생성자 
	 * 3가지를 모두 받아서 초기화하는 생성자.
	 *
	 * 메서드
	 * deposit : void - 잔고에 매개변수를 누적하는기능
	 * withDraw  : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int - 잔고를 리턴하는 기능 
	 * 
	 * 
	 * 메인클래스에서는 각각의 기능을 확인
	 */


	String accountNumber;
	String password;
	int balance;

	// 생성자
	Account(String a, String b, int c){
		accountNumber = a;
		password = b;
		balance = c;
	}

	void deposit(int a) {
		if( a < 0) {
			System.out.println("마이너스 입금은 불가합니다");
		}else {
			balance += a;
			System.out.println("현재 잔고: "+ balance);
		}
	}
	void withDraw(int a) {
		if(balance >= a) {
			balance -= a;
			System.out.println("현재 잔고: "+ balance);	
		}else{
			System.out.println("잔고가 부족합니다. 현재잔고: "+ balance);
		}
	}

	int getBalance() {
		return balance;
	}


	void info() {
		System.out.println("--------계좌 정보----------");
		System.out.println("ID: "+ accountNumber);
		System.out.println("비번: "+ password);
		System.out.println("잔고: "+ balance);

	}


}
