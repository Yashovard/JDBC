package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update3
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		Statement st=con.createStatement();
		System.out.println("enter id you want to update");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		String query="UPDATE teacher SET tname='"+name+"' WHERE tid="+id;
		st.execute(query);
		st.close();
		con.close();
		System.out.println("data Updated....");
	}
}