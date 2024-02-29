package polymorphisms;

public class CircleOverriding extends ShapeOverriding {

	private double radius;
	public final double PI=3.14;
	
	
	public CircleOverriding(double radius) {
	this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}
	
	
	public double area() {
		return PI*radius*radius;
	}
	
}
