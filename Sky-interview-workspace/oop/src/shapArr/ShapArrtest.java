package shapArr;

public class ShapArrtest {
	public static void main(String[] args) {
	
		ShapeArr[] s=new ShapeArr[2];
		
		s[0]=new CircalArr();
		s[1]=new RactengalArr();
		
		CircalArr c=(CircalArr)s[0];
		c.setRadius(5);
		
		System.out.println(c.area());
		
		RactengalArr r=(RactengalArr)s[1];
		r.setLength(5);
		r.setWidth(10);
	
		System.out.println(r.area());
		
	double a=area(s);
	System.out.println(a);
	}

	private static double area(ShapeArr[] s) {
		double totalArea=0;
		
		for (int i = 0; i < s.length; i++) {
		totalArea=+s[i].area();	
		}
		return totalArea;
	}

}
