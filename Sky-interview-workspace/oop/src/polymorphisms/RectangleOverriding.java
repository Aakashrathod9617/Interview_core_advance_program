package polymorphisms;

public class RectangleOverriding extends ShapeOverriding {

	private double length;
	private double width;

	public RectangleOverriding(double length, double width) {
		this.length = length;
		this.width = width;

	}

	public double getLength() {
		return length;
	}
//
//	public void setLength(double length) {
//		this.length = length;
//	}

	public double getWidth() {
		return width;
	}

//	public void setWidth(double width) {
//		this.width = width;
//	}

	public double area() {

		return length * width;

	}
}
