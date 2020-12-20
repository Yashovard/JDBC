package Practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Fetch
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		Statement st=con.createStatement();
		System.out.println("enter id you want to fetch");
		int id=sc.nextInt();
		ResultSet rs=st.executeQuery("select * from employee where eid="+id);
		while(rs.next())
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		con.close();
	}
}