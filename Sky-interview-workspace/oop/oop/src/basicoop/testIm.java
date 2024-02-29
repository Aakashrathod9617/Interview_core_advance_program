package basicoop;

public final class testIm {

	private final int count; 
	private final double value;
	public testIm(int count ,double value) {
		this.count=count;
		this.value=value;
	}
	public int getCount() {
		return count;
	}
	public double getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		 testIm i= new testIm(5, 7);
		System.out.println(i.getCount());
		 System.out.println(i.getValue());
	}
}
