package Practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		Statement st=con.createStatement();
		System.out.println("enter id you want to delete");
		int id=sc.nextInt();
		String Query="delete from yash where id="+id;
		st.execute(Query);
		st.close();
		con.close();
		System.out.println("row delete");
	}
}
