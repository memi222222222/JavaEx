package Quiz15;

public class MainClass {
	public static void main(String[] args) {
		
		Item a = new Item();
		a.insert("가");
		a.insert("나");
		a.insert("가");
		a.insert("나");
		a.insert("가");
		a.print();
		a.search("가");
		
	}

}
