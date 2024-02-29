package Exeptions;

public class TestUnCheckedExe {
	public static void main(String[] args) {
		
		dad();
		
	}
public static void dad() {
	try {
	
	mom();
	
	}catch(UnCheckedExe e) {
		System.out.println(e.getMessage());
	}
}
public static void mom() {
	sun();
}
public static void sun() {
	UnCheckedExe e1= new UnCheckedExe();
	throw e1;
}
}
