package advance;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.concurrent.Callable;
public class procdure {
	
	public static void main(String[] args)throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empl","root","root");
	CallableStatement call=conn.prepareCall("{call newIn(?)}");
	call.setInt(1, 1);
	
	//ResultSet rs = call.executeQuery();
	ResultSet rs = call.getResultSet();
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		//System.out.println(rs.getString(3));
	}
		
	}

}
 