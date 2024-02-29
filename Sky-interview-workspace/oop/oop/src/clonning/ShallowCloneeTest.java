package clonning;



public class ShallowCloneeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowClonee s=new ShallowClonee();
		s.rollNo=101;
		
		ShallowClonee s1=(ShallowClonee)s;
		s1.rollNo=102;
		
		System.out.println(s.rollNo);
		System.out.println(s1.rollNo);
		
	}
}
