package Quiz02;

public class Tv {

	String company = "LG"; //회사
	int changChannel; // 채널
	boolean power; //전원

	/*  메서드
	 *  changeChannel : int - 매개변수 채널X번을 받아서 채널을 변경, 변경된 채널을 리턴
	 *	power : void- 켜져있으면 꺼지고. 꺼져있으면 켜진다.
	 */

	
	
	int changChannel(int x) {
		
		changChannel = x;
		
		return changChannel;
	}
	
	void power() {
		if(power == false) {
			power = true;
			System.out.println("전원이 켜졌습니다.");
		}else {
			power = false;
			System.out.println("전원이 꺼졌습니다.");
		}
		
	}
//강사님 답안 --
	void power1() {
		if(power) {
			power = false;
			System.out.println("TV Off");
		}else {
			power = true;
			System.out.println("TB ON");
		}
	}






}
