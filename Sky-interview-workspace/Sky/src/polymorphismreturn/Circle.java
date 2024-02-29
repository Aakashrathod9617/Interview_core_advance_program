package polymorphismreturn;

public class Circle extends Shape {
 
	private double radius;
	
	
	public  Circle(int radius) {
		this.radius=radius;
		
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	
	
}
