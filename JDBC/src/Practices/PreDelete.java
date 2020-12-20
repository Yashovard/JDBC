package Practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreDelete 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		PreparedStatement ps=con.prepareStatement("delete from jdbc where id=?" );
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id want to delete");
		int i=sc.nextInt();
		/*System.out.println("enter name");
		String s=sc.next();*/
		ps.setInt(1, i);
		//ps.setString(2, s);
		ps.execute();
		con.close();
		System.out.println("data delete");
	}
}
