package in.co.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


/*CREATE DEFINER=`root`@`localhost` PROCEDURE `Test1`(IN i int  )
BEGIN
update emp set salary = 30000 where id = i;
END*/

public class StoredProcedureIN {

	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rathod", "root", "root");

		CallableStatement callStmt = conn.prepareCall("{CALL ain(?)}");

		callStmt.setInt(1, 1);

		callStmt.execute();

		ResultSet rs = callStmt.getResultSet();

		while (rs.next()) {

			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));

		}

	}

}
