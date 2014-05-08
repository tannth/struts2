package struts2basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DBOperation {

	public static boolean checkLogin(String username, String password) {
		Connection cn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/poolDS");
			cn = ds.getConnection();
			String sql = "select * from registration where username = ? and password = ?";
			stm = cn.prepareStatement(sql);
			stm.setString(1, username);
			stm.setString(2, password);

			rs = stm.executeQuery();

			if (rs.next()) {

				return true;
			}

		} catch (NamingException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		return false;
	}

	public static List<AccountDTO> searchLikeLastName(String nameSearch) {

		Connection cn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/poolDS");
			cn = ds.getConnection();
			String sql = "select * from registration where lastname like ?";

			stm = cn.prepareStatement(sql);

			stm.setString(1, "%" + nameSearch + "%");
			rs = stm.executeQuery();
			List<AccountDTO> result = new ArrayList<AccountDTO>();
			if (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String lastname = rs.getString("lastname");
				String isadmin = rs.getString("isAdmin");

				AccountDTO acc = new AccountDTO(username, password, lastname,
						isadmin);

				result.add(acc);
			}
			return result;

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		return null;
	}
}
