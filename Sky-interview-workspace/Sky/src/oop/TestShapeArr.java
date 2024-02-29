package oop;

public class TestShapeArr {
public static void main(String[] args) {
	
	ShapeArray[] s= new ShapeArray[2];
	
	s[0]=new CircleArray();
	s[1]=new RectangleArray();
	
	CircleArray c=(CircleArray)s[0];
	c.setRadius(5);
	System.out.println(c.area());
	
	RectangleArray r=(RectangleArray) s[1];
	r.setLength(2);
	r.setWidth(5);
	
	System.out.println(r.area());
	
	double a =area(s);
	System.out.println(a);
	
	
}

private static double area(ShapeArray[] s) {
	double totalArrya=0;
	
	for (int i = 0; i < s.length; i++) {
		totalArrya += s[i].area();
	}
	return totalArrya;
}
}
