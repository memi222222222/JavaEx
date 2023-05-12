package _0425_day09_poly.basic2;

public class Teacher extends Person{


	String subjeck;

	Teacher(String name, int age, String subjeck){
		super(name, age);
		this.subjeck = subjeck;
	}
	String info() {
		return super.info() + ", 과목: " + subjeck;    
	}
	
}
