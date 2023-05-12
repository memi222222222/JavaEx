package _0425_day09_poly.basic2;

public class Student extends Person{

	String StudentId;

	Student (String name, int age, String StudentId){
		super(name, age);
		this.StudentId = StudentId;
				
	}
	
	
	String info() {

		return super.info() +  ", 학번: " + StudentId;
	}
	

}
