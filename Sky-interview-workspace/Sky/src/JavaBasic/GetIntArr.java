package JavaBasic;

public class GetIntArr {
	public static void main(String[] args) {
		
	
	int[] d= {10, 20, 30, 40, 70,50,60,90};
	int e= 4;
	
	System.out.println(getInt(d, e));

}

	private static int getInt(int[] a, int b) {
			int c=0;
			if (b >a.length) {
				return -1;
			}
			for (int i = 0; i < a.length; i++) {
			if(i == b) {
				c = a[i];
			}	
			}
		return c;
	}
}