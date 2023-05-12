package Quiz02;

public class TvMain {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		int c =  tv.changChannel(6);
		System.out.println("현재 채널은 "+ c);
		
		tv.power();
		tv.power();
		tv.power();
		
	}

}
