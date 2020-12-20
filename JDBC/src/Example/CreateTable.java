package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/opendox", "root", "root");
		Statement statement = connection.createStatement();
		String query = "create table Bhupendra(eid int, ename varchar(25), address varchar(50), emailid varchar(30), number varchar(15),password varchar(30), salary varchar(50))";
		statement.execute(query);
		statement.close();
		connection.close();
		System.out.println("table crated successsfully");
	}
}