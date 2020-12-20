package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Prepare 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
		ps.setInt(1, 106);
		ps.setString(2, "ranjana");
		ps.setString(3, "Kanchana");
		ps.setString(4, "Ramesh");
		ps.setString(5, "Nilesh");
		ps.setString(6, "Hement");
		ps.executeUpdate();
		con.close();
		System.out.println("data successfully inserted");
	}
}
