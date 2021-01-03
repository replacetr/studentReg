package shaiful;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {

	
	private String dburl = "jdbc:mysql://localhost:3306/studentdb?useTimezone=true&serverTimezone=UTC";
	private String dbuname = "root";
	private String dbpassword ="1234";
	private String dbdriver="com.mysql.cj.jdbc.Driver";

	
	public Connection getConnection()
	{
		
		Connection con=null;
		
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("driver error");
		}
		
		try {
			con=DriverManager.getConnection(dburl, dbuname, dbpassword);
			
		}	catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("connection to database fail");
		}
		return con;
	}


}
