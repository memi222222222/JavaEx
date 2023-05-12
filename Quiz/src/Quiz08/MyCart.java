package Quiz08;

public class MyCart extends Cart{

	// 1. 생성자는 money를 전달받고 money값 초기화, tv = 300, com =400, radio = 500 초기화

	// 2. buy() , add(), info() 메서드 오버라이드
	/*
	 * 상품명 "tv", "com", "radio"
	 * buy(상품명)기능
	 * 매개변수가 tv, com, radio라면 금액에서 상품가격을 차감하고 ,add()메서드 실행
	 * 단 , 올바른 상품이 아니거나, 금액이 부족할 경우 적절한 처리.
	 */

	/*
	 * add(상품명) 기능
	 * 매개변수로 넘어온상품을 cart배열에 순서대로 담는다
	 * 단,cart배열이 꽉 찼다면, 2배크기의 카트배열로 옮겨주세요.
	 * 
	 * 마지막에는 info()메서드를 호출함
	 */

	/*
	 * info() 는 
	 * cart 배열에 담긴 물건목록만 (null)제외 출력
	 */
	
	MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}

	void buy(String product) {
		if(product.equals("tv")){
			if(money >= tv) {
				money -= 300;
				add(product);				
				System.out.println("Tv구매");
			}else {
				System.out.println("금액이 부족하여 구매할수 없습니다.");
			}
		}else if(product.equals("com")){
			if(money >= com) {
				money -= 400;
				add(product);
				System.out.println("Comouter구매");

			}else {
				System.out.println("금액이 부족하여 구매할수 없습니다.");
			}
		}else if(product.equals("radio")&& money >= 500){
			if(money >= radio) {
				money -= 500;
				add(product);
				System.out.println("Radio구매");
			}
		}else {
			System.out.println("금액이 부족하여 구매할수 없습니다.");


		}
	}

	void add(String product) {
		if(i == cart.length) {
			String[] cart2 = new String[cart.length*2];
			for(int y = 0; y <cart.length; y++) {
				cart2[y]= cart[y];

			}
			cart = cart2;
			cart2 = null;
		}
		cart[i] = product;
		i++;

	}


	void info() {
		System.out.println("-------- 구 매 내 역 ----------");
		for(int j = 0; j < cart.length; j++) {
			if(cart[j] != null) {
				System.out.println(cart[j]);
			}	

			//출력
		}
		System.out.println("잔액은: " + money);
		System.out.println("----------------------------");

	}
}

