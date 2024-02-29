package shapArr;

public class CircalArr extends ShapeArr {
	
	private double radius;
	
	
	
	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public double area() {
		
		return 3.14*radius*radius;
	}

}
