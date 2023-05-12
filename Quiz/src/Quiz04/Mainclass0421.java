package Quiz04;

public class Mainclass0421 {
	
	public static void main(String[] args) {
		
		Wizard wizard = new Wizard("간달프");
		
		System.out.println(wizard.mp);
		
		wizard.iceArrow();
		wizard.info();
		
		Warrior warrior = new Warrior("도끼맨");
		warrior.bash();
		warrior.info();
}
}