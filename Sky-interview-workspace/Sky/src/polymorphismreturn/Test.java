package polymorphismreturn;

public class Test {
public static void main(String[] args) {
	Shape s = Shape.getShape(1);
	System.out.println(s.area());
	
	
}
}
