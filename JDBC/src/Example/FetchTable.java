package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FetchTable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from teacher");
		while(rs.next())
		System.out.println(rs.getInt(1)+" ! "+rs.getString(2)+" ! "+rs.getString(3)+" ! "+rs.getString(4)+" ! "+rs.getString(5)+" ! "+rs.getString(6)+" ! "+rs.getString(7));
		con.close();
	}
}