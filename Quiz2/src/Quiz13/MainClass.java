package Quiz13;

public class MainClass {

	public static void main(String[] args) {

		Shape r = new Rect("정사각형", 4);
		Shape c = new Circle("원",4);

		//		Circle circle = new Circle("원", 4);
		//		Rect rect = new Rect("정사각형", 3);

		System.out.println(c.getArea());
		System.out.println(r.getArea());
		System.out.println(c.getName());
		System.out.println(r.getName());

		//		System.out.println(circle.getName());
		//		System.out.println(rect.getName());
		//		System.out.println(rect.getArea());
		//		System.out.println(circle.getArea());

	}
}
