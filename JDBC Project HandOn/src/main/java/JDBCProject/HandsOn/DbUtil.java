package JDBCProject.HandsOn;

import java.sql.*;

public class DbUtil {
	private static String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
	private static String USERNAME = "root";
	private static String PASSWORD = "Password";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (Exception e) {

		}
	}
}
