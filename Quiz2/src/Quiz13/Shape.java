package Quiz13;

public abstract class Shape {  
	
	public static final double PI = 3.14;
	private String name;
	
	//생성자
	public Shape(String name) {
		this.name = name;
	}

	// 오버라이딩 필요함
	public abstract double getArea();
	
	// name의 getter
	public String getName() {
		return "도형이름: " + name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
