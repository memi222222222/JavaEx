package Quiz12;

public class Main22 {
	
	public static void main(String[] args) {
		
		MyCart2 c = new MyCart2(10000);
		Tv tv = new Tv();
		Radio radio = new Radio();
		Computer com = new Computer();
		
		
		
		c.buy(radio);
		c.buy(tv);
		c.buy(com);
		c.buy(radio);
		c.buy(tv);
		c.buy(tv);
		c.buy(radio);
		
		c.info();
		
		
	}

}
