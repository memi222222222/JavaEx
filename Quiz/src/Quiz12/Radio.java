package Quiz12;

public class Radio extends Products{
	// 생성자가 1개 있고, 가격은 300원, 이름은 자유


	public Radio() {
		super(300, "SONY-RADIO");   
	}

	int price(){
		return super.getPrice();
	}



}
