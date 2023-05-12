package _0427_day11_Inter_basic2;

public class MainClass {

	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();

		Animal[] animals = {dog, cat, tiger};

		for(Animal ani : animals) {
			ani.eat();  // Animal의 기능. ( Animal타입으로 배열을 만들었기떄문)
		}

	
		System.out.println("---------------------------");
		
		// dog, cat은 인터페이스 타입으로 형변환이 된다.
		// dog, cat, goldfish 를 저장하고, 반복문

		IPet[] pets = new IPet[3];
		//		IPet dog2 = new Dog();
		//		IPet cat2 = new Cat();
		//		IPet goldfish = new GoldFish();
		//		
		//		pets[0] = dog2;
		//		pets[1] = cat2;
		//		pets[2] = goldfish;
		
		pets[0] = (IPet)dog;
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish();

		for(IPet p2 : pets) {
			p2.play();
		}

		System.out.println("----------------------------");
		
		
		
	}

}
