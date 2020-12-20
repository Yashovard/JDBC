package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareInsert
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		String sql="insert into teacher values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		while (true) 
		{
			System.out.println("enter the id");
			int id=sc.nextInt();
			System.out.println("enter the your name insert");
			String  name=sc.next();
			System.out.println("enter your address");
			String add=sc.next();
			System.out.println("enter emailId");
			String mail=sc.next();
			System.out.println("enter the number");
			String num=sc.next();
			System.out.println("enter the password");
			String pass=sc.next();
			System.out.println("enter the salary");
			String sal=sc.next();
			ps.setLong(1, id);
			ps.setString(2, name);
			ps.setString(3, add);
			ps.setString(4, mail);
			ps.setString(5, num);
			ps.setString(6, pass);
			ps.setString(7, sal);
			ps.executeUpdate();
			System.out.println("Record insert successfully");
			System.out.println("Do you want to add more recoord Yes/No");
			String option=sc.next();
			if(option.equalsIgnoreCase("No"))
			{
				break;
			}
		}
		con.close();
	}
}
