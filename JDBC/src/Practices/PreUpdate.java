package Practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreUpdate 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		System.out.println("connection successed");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id");
		int i=sc.nextInt();
		System.out.println("enter name");
		String s=sc.next();
		String sql="update jdbc set name=+'"+s+"' where id ="+i;
		PreparedStatement ps=con.prepareStatement(sql);
		ps.execute();
		con.close();
		System.out.println("data Update");
	}
}
