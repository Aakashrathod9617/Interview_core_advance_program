package basicoop;

public class AbsractExTest extends AbstractExa{
@Override
public int sum(int a, int b) {
	// TODO Auto-generated method stub
	return a+b;
}
public static void main(String[] args) {
	AbsractExTest t =new AbsractExTest();
	System.out.println(t.sum(15,12));
}
}
