package Practices;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveImage
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox","root","root");
		PreparedStatement ps=con.prepareStatement("select * from imgtable");
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			Blob b=rs.getBlob(2);
			byte barr[]=b.getBytes(1,(int)b.length()); 
			FileOutputStream fout=new FileOutputStream("J:\\\\Wallpapers\\\\new wp\\\\Nature.jpg");  
			fout.write(barr); 
			fout.close();  
			con.close();
			System.out.println("ok");
		}
	}
}