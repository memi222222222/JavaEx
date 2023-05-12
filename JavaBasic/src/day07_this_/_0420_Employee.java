package day07_this_;

public class _0420_Employee extends _0420_Person{

	
	String department;

	_0420_Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}
	String info() {

		return "이름: " + name + ", 나이: " + age + ",부서: " + department;
	}

}
