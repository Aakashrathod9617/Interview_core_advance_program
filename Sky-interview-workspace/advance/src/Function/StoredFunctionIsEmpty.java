package Function;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredFunctionIsEmpty {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/newemp","root","root");
		CallableStatement stmt = conn.prepareCall("{?=call func()}");
		
		stmt.registerOutParameter(1, Types.INTEGER);
		stmt.execute();
		System.out.println(stmt.getInt(1));
	}

}