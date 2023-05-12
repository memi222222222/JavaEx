package Quiz08;
// 강사님 답안
public class MyCart_ex extends Cart{
	// 1. 생성자는 money를 전달받고 money값 초기화, tv = 300, com =400, radio = 500 초기화

	MyCart_ex(int money){
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}
	// 2. buy() , add(), info() 메서드 오버라이드
	/*
	 * 상품명 "tv", "com", "radio"
	 * buy(상품명)기능
	 * 매개변수가 tv, com, radio라면 금액에서 상품가격을 차감하고 ,add()메서드 실행
	 * 단 , 올바른 상품이 아니거나, 금액이 부족할 경우 적절한 처리.
	 */

	void buy(String product) {

		switch (product) {
		case"tv":
			if (this.money < 300) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= 300;
			}
			break;
		case "com":
			if (this.money < 400) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= 400;
			}
			break;
		case "radio":
			if (this.money < 500) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= 500;
			}
			break;

		default:
			// 올바른 상품이 아닌경우.
			System.out.println("올바른 상품이 아닙니다.");
			return;
		}

		add(product);

	}

	/*
	 * add(상품명) 기능
	 * 매개변수로 넘어온상품을 cart배열에 순서대로 담는다
	 * 단,cart배열이 꽉 찼다면, 2배크기의 카트배열로 옮겨주세요.
	 */

	void add(String product) {
		if(i >= cart.length) {  // 기존배열이 꽉찬경우.
			// 2배인 배열 생성
			String[] newCart = new String[cart.length*2];
			for(int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i]; 
			}
			// 기존배열을 변경
			cart = newCart;
			newCart = null;
		}
		cart[i] = product;
		i++;
	}

	/* 마지막에는 info()메서드를 호출함
	 * info() 는 
	 * cart 배열에 담긴 물건목록만 (null)제외 출력
	 */

	void info() {
		String str = "[ ";
		for(int j = 0; j < i;  j++){
			str += cart[j] + " "; 
		}
		str +=" ]";
		System.out.println(str);
	}

}
