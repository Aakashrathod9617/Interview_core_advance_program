package polymorphisms;

public class TestOverriding {

	public static void main(String[] args) {

		
		ShapeOverriding s = new CircleOverriding(5);
		ShapeOverriding s1 = new RectangleOverriding(10, 10);

		System.out.println("Circle area = " + s.area());
		System.out.println("Rectangle area = " + s1.area());
	}
}
