package shaiful;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class InsertData {

	public int insert(String sname, String icno, String birthday, String pname, String phone, String address) {
//		return	birthday; testing method

		DbConnection dbcon = new DbConnection();
		Connection con = dbcon.getConnection();
		int result = 0;
		String sql = "insert into studentdb.student value(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setDouble(1, Double.parseDouble(icno));
			ps.setString(2, sname);
//			ps.setDate(3, java.sql.Date.valueOf(birthday));
			ps.setString(3, birthday);
			ps.setString(4, pname);
			ps.setString(5, phone);
			ps.setString(6, address);

			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return result;
	}

}
