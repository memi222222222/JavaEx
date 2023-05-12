package _0425_day09_poly.basic2;

public class House {

	//	private Student[] student = new Student[100];
	//	private Employee[] employee = new Employee[100];
	//	private Teacher[] teacher = new Teacher[100];
	//	private int index1;
	//	private int index2;
	//	private int index3;
	//	
	//	public void inHaouse(Student s) {
	//		student[index1] = s;
	//		index1++;
	//	}
	//	public void inHouse(Teacher t) {
	//		teacher[index2] = t;
	//		index2++;
	//	}
	//	public void inHouse(Employee e) {
	//		employee[index3] = e;
	//		index3++;
	//	}
	//	
	//


	private Person[] person = new Person[100];
	private int index;
	public void inHouse(Person p) {
		person[index] = p;
		index++;
	}

	// 추가 -> 배열안에 들어있는 객체의 타입에 맞추어 출력.
	//	public void printHouse() {
	//
	//
	//		for(int i = 0; i < index; i++) {
	//			if(person[i] instanceof Student) {
	//				
	//			}
	//			System.out.println(person[i].info());
	//		}
	//
	//


	public void whoAreYou(Person p) {
		
		if(p instanceof Student) {     //student  ->true
			System.out.println("학생입니다.");
		} else if(p instanceof Teacher) {
			System.out.println("선생님입니다.");
		} else if (p instanceof Employee){
			System.out.println("직원입니다.");
		}else {
			System.out.println("사람입니다.");
		
		}

	}






}
