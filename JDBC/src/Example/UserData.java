package Example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class UserData 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc =new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		System.out.println("enter the id you want to insert");
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
		PreparedStatement ps=con.prepareStatement("insert into teacher values(?,?,?,?,?,?,?)");
		ps.setLong(0, id);
		ps.setString(1, name);
		ps.setString(2, add);
		ps.setString(3, mail);
		ps.setString(4, num);
		ps.setString(5, pass);
		ps.setString(6, sal);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
}