package Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImage 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		PreparedStatement ps=con.prepareStatement("insert into image values(?,?)");  
		ps.setString(1,"Yash");  
        FileInputStream fin=new FileInputStream("d:\\g.jpg");  
		ps.setBinaryStream(2,fin,fin.available());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		con.close();  
	}

}
