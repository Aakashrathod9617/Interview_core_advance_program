package JavaBasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
	String s ="27/03/2000";
	
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	String s1=sdf.format(d);
	System.out.println(s1);
	
	SimpleDateFormat sdf1 =new SimpleDateFormat("dd/MM/yyyy");
					Date d1=sdf1.parse(s);
					System.out.println(d1);
	}
}
