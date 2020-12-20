package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DSN 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Driver");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Employee");
		while(rs.next())
		{
			int id=rs.getInt("Id");	
			String name=rs.getString("name");
			int number=rs.getInt("number");
			String Address=rs.getString("Address");
			System.out.println(id+"   "+name+"    "+number+"   "+ Address);
		}
		con.close();
	}
}
