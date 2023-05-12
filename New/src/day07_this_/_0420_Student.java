package day07_this_;

public class _0420_Student extends _0420_Person{

	String StudentId;

	_0420_Student (String name, int age, String StudentId){
		this.name = name;
		this.age = age;
		this.StudentId = StudentId;
		
		
	}
	String info() {

		return "이름: " + name + ", 나이: " + age + ", 학번: " + StudentId;
	}


}
