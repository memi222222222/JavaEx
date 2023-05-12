package day07_this_;

public class _0420_Teacher extends _0420_Person{


	String subjeck;

	_0420_Teacher(String name, int age, String subjeck){

		this.name = name;
		this.age = age;
		this.subjeck = subjeck;
	}
	String info() {
		return "이름: " + name + ", 나이: " + age + ", 과목: " + subjeck;    
	}
}
