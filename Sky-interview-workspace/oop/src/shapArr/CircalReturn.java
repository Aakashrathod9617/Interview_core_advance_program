package shapArr;

public class CircalReturn extends Shapreturn{
	private double radius;
	
	public CircalReturn() {
		// TODO Auto-generated constructor stub
	}
	public CircalReturn(double radius) {
		
		this.radius=radius;
		
	}
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	

}
