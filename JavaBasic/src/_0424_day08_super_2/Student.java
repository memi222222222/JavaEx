package _0424_day08_super_2;

public class Student extends Person{

	String StudentId;

	Student (String name, int age, String StudentId){
		super(name, age);
		this.StudentId = StudentId;
				
	}
	
	
	String info() {

		return super.info() + ", 과목: " +  ", 학번: " + StudentId;
	}


}
