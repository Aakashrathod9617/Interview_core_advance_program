package in.co.JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

// Below is the procedure we are calling in the program 

/*CREATE DEFINER=`root`@`localhost` PROCEDURE `Test`(inout b varchar(100))
BEGIN
Select name into b from emp where id = b;
END*/

public class StoredProcedureINOUT {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rathod", "root", "root");

		CallableStatement call = conn.prepareCall("{call ainout(?)}");

		call.setInt(1, 1);

		call.registerOutParameter(1, Types.INTEGER);

		call.execute();

		System.out.println(call.getInt(1));
		

		conn.close();

	}

}
