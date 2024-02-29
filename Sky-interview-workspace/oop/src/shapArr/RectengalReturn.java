package shapArr;

public class RectengalReturn extends Shapreturn{

	private int length;
	private int width;

	public RectengalReturn() {
		// TODO Auto-generated constructor stub
	}
	public RectengalReturn(int length,int width) {
	this.length=length;
	this.width=width;
	}
@Override
public double area() {
	// TODO Auto-generated method stub
	return length*width;
}
}
