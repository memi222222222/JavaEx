package Quiz12;

public class main2 {
	public static void main(String[] args) {
		
		
		Radio r = new Radio();
		Tv t = new Tv();
		Computer c = new Computer();
		
		// 카트
		MyCart2 ca = new MyCart2(2000);
		
		ca.buy(t);
		ca.buy(t);
		ca.buy(c);
		ca.buy(t);
		ca.buy(r);
		ca.buy(c);
		ca.buy(t);
		 
		
		
	}


}
