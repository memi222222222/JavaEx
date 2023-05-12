package _0424_day08.encap.obj;

public class Hotel2 {

	//	private String name = " 호텔";
	//	private Chef chef = new Chef();

	private Chef chef;

	// 호텔은 생성될 때 외부에서 chef 객체를 받는다.

	public Hotel2(Chef chef) {
		//		this.chef = new Chef();
		this.chef = chef;
	}

	// setter
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
	
}
