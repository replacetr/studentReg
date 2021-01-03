package shaiful;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectData {
	
	public ArrayList<Student> select(Double icno) {
		DbConnection dbcon = new DbConnection();
		Connection con=dbcon.getConnection();
		String sql = "SELECT * FROM student WHERE icno =" + icno ;
		ArrayList<Student> list = new ArrayList<Student>();
		try {
			Statement stmn = con.createStatement();
			ResultSet rs = stmn.executeQuery(sql);


			   while(rs.next()){
				   list.add(new Student(rs.getDouble("icno"),rs.getString("sname"),rs.getString("birthday"),rs.getString("pname"), 
						   rs.getString("phone"),
						   rs.getString("address")
						   ));
				   
				   
//			       Student student = new Student();
//				   student.setIcno(rs.getDouble("icno"));
//				   student.setSname(rs.getString("sname"));
//				   student.setBirthday(rs.getString("birthday"));
//				   student.setPname(rs.getString("pname"));
//				   student.setPhone(rs.getString("phone"));
//				   student.setAddress(rs.getString("address"));
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
