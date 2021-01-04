package shaiful;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdataData {

	public int updating(String sname, String icno, String birthday, String pname, String phone, String address) {

		DbConnection dbcon = new DbConnection();
		Connection con = dbcon.getConnection();
		int result;
		String sql = "update student set sname = ? , birthday = ? , pname = ? , "
				+ "phone = ? , address =? where icno = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, sname);
//		ps.setDate(3, java.sql.Date.valueOf(birthday));
			ps.setString(2, birthday);
			ps.setString(3, pname);
			ps.setString(4, phone);
			ps.setString(5, address);
			ps.setDouble(6, Double.parseDouble(icno));

			result = ps.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = 0;
		}
		return result;

	}
}
