package shaiful;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	
	public int result;
	
	public int deleting(Double icno) {
		
		DbConnection dbcon = new DbConnection();
		Connection con = dbcon.getConnection();
				String sql = "delete from student where icno = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setDouble(1, icno);
						
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = 0;
		}
		return result;

	}

}
