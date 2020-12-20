package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		Statement st=con.createStatement();
		String query="delete from teacher where tid=103";
		st.execute(query);
		st.close();
		con.close();
		System.out.println("data deleted....");


	}
}
