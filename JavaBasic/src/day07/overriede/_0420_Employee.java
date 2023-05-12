package day07.overriede;

public class _0420_Employee extends _0420_Person{

	String department;

	String info() {

		return "이름: " + name + ", 나이: " + age + ",부서: " + department;
	}

}
