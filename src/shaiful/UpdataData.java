package shaiful;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdataData {

	public Boolean updating(String sname, String icno, String birthday, String pname, String phone, String address) {

		DbConnection dbcon = new DbConnection();
		Connection con = dbcon.getConnection();
		boolean result = false;
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

			ps.executeUpdate();

			result = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;

	}
}
