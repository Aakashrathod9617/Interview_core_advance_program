package shapArr;

public class Shapreturn {
	

	public double area() {
		return 0;
	}

public static Shapreturn getShape(int i) {
	if (i==1) {
		return new CircalReturn(5);
	}
	if (i==2) {
		return new RectengalReturn(5, 10);
	}
	
	return new Shapreturn();
	
}

}
