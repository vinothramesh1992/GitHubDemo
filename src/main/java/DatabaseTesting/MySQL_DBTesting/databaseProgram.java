package DatabaseTesting.MySQL_DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseProgram {

	public static void main(String[] args) throws SQLException {
		
		String host = "localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/testdatabase","root","root");
		
		Statement s = con.createStatement();
		
		ResultSet rs =s.executeQuery("SELECT Name FROM testdatabase.employeedetails where Age = 28");
		
		while(rs.next())
		{
		String Name = rs.getString("Name");
		System.out.println(Name);
		}
		
		rs.close();
		s.close();
		con.close();
	}
 
}
