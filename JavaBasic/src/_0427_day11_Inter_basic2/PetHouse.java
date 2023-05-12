package _0427_day11_Inter_basic2;

public class PetHouse {

	public void carePet(IPet pets) { // 매개변수에 인터페이스타입을 넣을 수 있다.

		if(pets instanceof Dog) {

			Dog g =(Dog)pets;
			g.play();
		} else if(pets instanceof Cat) {
			Cat cat= (Cat)pets;
			cat.play();
		}else if (pets instanceof GoldFish) {
			GoldFish goldfish = (GoldFish)pets;
		goldfish.play();
		}

	}




}
