package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.struts2.ServletActionContext;

import action.RegisterAccountAction;

import com.sun.jndi.cosnaming.CNCtx;

import dto.AccountDTO;

public class DBOperators {
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";
	static Connection cn = null;
	static PreparedStatement stm = null;
	static ResultSet rs = null;

	public static boolean checkLogin(String username, String password) {
		Context ctx;
		try {
			ctx = new InitialContext();
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
		} catch (Exception e) {
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

	public static List<AccountDTO> searchByLastName(String nameSearch) {
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/poolDS");

			cn = ds.getConnection();

			String sql = "select * from registration where lastname like ?";
			stm = cn.prepareStatement(sql);
			stm.setString(1, "%" + nameSearch + "%");
			rs = stm.executeQuery();
			List<AccountDTO> list = new ArrayList<AccountDTO>();
			while (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String lastname = rs.getString("lastname");
				String rolesResult = rs.getString("isadmin");
				boolean roles = false;
				if (rolesResult.equals("1")) {
					roles = true;
				}

				AccountDTO acc = new AccountDTO(username, password, lastname,
						roles);
				list.add(acc);
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
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
				// TODO: handle exception
			}
		}

		return null;
	}

	public static boolean deleteAccount(String username) {
		Context ctx;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/poolDS");

			cn = ds.getConnection();

			String sql = "delete from registration where username = ?";
			stm = cn.prepareStatement(sql);
			stm.setString(1, username);

			int result = stm.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
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

	public static boolean updateAccount(String username, String password,
			boolean roles) {
		Context ctx;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/poolDS");

			cn = ds.getConnection();

			String sql = "update registration set password = ?, isadmin = ? where username = ?";
			stm = cn.prepareStatement(sql);
			stm.setString(1, password);
			String rolesString = "0";
			if (roles) {
				rolesString = "1";
			}
			stm.setString(2, rolesString);
			stm.setString(3, username);

			int result = stm.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
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

	public static boolean registerAccount(RegisterAccountAction reg) {
		Context ctx;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/poolDS");

			cn = ds.getConnection();

			String sql = "insert into registration(username,password,lastname,isadmin) values(?, ?, ?, 0)";
			stm = cn.prepareStatement(sql);
			stm.setString(1, reg.getUsername());
			stm.setString(2, reg.getPassword());
			stm.setString(3, reg.getLastname());

			int result = stm.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("Exception", e.getMessage());
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
				HttpServletRequest request = ServletActionContext.getRequest();
				request.setAttribute("Exception", e2.getMessage());
			}
		}

		return false;

	}
}
