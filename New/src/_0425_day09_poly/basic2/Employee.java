package _0425_day09_poly.basic2;

public class Employee extends Person{

	
	String department;
 
	Employee(String name, int age, String department){
		super(name, age);
		this.department = department;
	}
	String info() {

		return super.info() + ", 과목: " +  ",부서: " + department;
	}

}
