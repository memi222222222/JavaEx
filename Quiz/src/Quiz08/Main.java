package Quiz08;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		MyCart ca = new MyCart(10000);
	
		ca.buy("tv");
		ca.buy("radio");
		ca.buy("com");
		ca.buy("tv");
		ca.buy("com");
	
		ca.info();
		
		MyCart_ex ca2 = new MyCart_ex(10000);
		ca2.buy("tv");
		ca2.buy("radio");
		ca2.buy("com");
		ca2.buy("tv");
		ca2.buy("com");
	
		ca2.info();
	}

}
