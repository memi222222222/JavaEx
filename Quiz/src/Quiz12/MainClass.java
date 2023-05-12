package Quiz12;

public class MainClass {


	public static void main(String[] args) {
		MyCart ca = new MyCart(10000);

		Radio radio = new Radio();
		Tv tv = new Tv();
		Computer com = new Computer();

		ca.buy(radio);
		ca.buy(com);
		ca.buy(tv);
		ca.buy(com);
		ca.buy(tv);

		ca.info();
		
	
	}

	}

