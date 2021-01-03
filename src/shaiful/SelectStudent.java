package shaiful;
import java.sql.*;
import java.util.ArrayList;


public class SelectStudent {
	
	public ArrayList<Student> select() {
	DbConnection dbcon = new DbConnection();
	Connection con=dbcon.getConnection();
	String sql = "SELECT * FROM student";
	ArrayList<Student> list = new ArrayList<Student>();
	try {
		Statement stmn = con.createStatement();
		ResultSet rs = stmn.executeQuery(sql);


		   while(rs.next()){
			   list.add(new Student(rs.getDouble("icno"),rs.getString("sname"),rs.getString("birthday"),rs.getString("pname"), 
					   rs.getString("phone"),
					   rs.getString("address")
					   ));
			   
			   
//		       Student student = new Student();
//			   student.setIcno(rs.getDouble("icno"));
//			   student.setSname(rs.getString("sname"));
//			   student.setBirthday(rs.getString("birthday"));
//			   student.setPname(rs.getString("pname"));
//			   student.setPhone(rs.getString("phone"));
//			   student.setAddress(rs.getString("address"));
//		 
		      }
		 
		      rs.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}
	return list;
	}
	
}
