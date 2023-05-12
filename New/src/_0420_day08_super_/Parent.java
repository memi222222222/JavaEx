package _0420_day08_super_;

public class Parent {

	String mother;
	String father;
	
	//	Parent(){
	//		super();
	//	}

	Parent(String mother, String father){
		this.mother = mother;
		this.father = father;
	}

	
	String info() {
		return "name: " + mother + ", name: " + father;
		
	}


}
