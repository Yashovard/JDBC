package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete2 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		System.out.println("enter id you want to delete");
		int id=sc.nextInt();
		Statement st=con.createStatement();
		String query="delete from teacher where tid="+id ;
		st.execute(query);
		st.close();
		con.close();
		System.out.println("data deleted....");
	}
}