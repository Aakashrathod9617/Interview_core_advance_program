package Function;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredFunctionInput {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/empl","root","root");
		CallableStatement stmt = conn.prepareCall("{?=call new(?)}");
		stmt.setInt(2, 1);
		stmt.registerOutParameter(1, Types.INTEGER);
		stmt.execute();
		System.out.println(stmt.getInt(1));
	}

}
