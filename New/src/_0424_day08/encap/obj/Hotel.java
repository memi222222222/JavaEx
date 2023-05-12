package _0424_day08.encap.obj;

public class Hotel {

	// private Chef chef = new Chef();

	private Chef chef;

	public 	Hotel(){
	this.chef = new Chef();  // 초기값 지정
	}

	// chef의 getter setter
	// 객체를 매개변수로 받는 모형
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	// 객체를 반환하는 모형
	public Chef getChef() {
		return chef;
	}	








}
