package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class forcrud {
	
	
		public void create() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/newemp", "root", "root");
		Statement stmt=conn.createStatement();
		stmt.executeUpdate("create table emp1(id int primary key not null,name varchar(100),salary int)");
		System.out.println("ho gyi");
		}
		
		public void delete() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/newemp", "root", "root");
			PreparedStatement ptsm=conn.prepareStatement("delete from emp where id =3");
			
			ptsm.executeUpdate();
		}
		
		
		public int add() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/newemp", "root", "root");
		PreparedStatement ptsm=conn.prepareStatement("insert into emp1 values(3,'shailendra',2000)");
		
		int i=ptsm.executeUpdate();
		//System.out.println(i);
		return i;
		}
		
		public void getdata() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/newemp", "root", "root");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp1");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
		}
	
	}


