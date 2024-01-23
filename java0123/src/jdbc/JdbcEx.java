package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql = "insert into emp values (7777, '김하나', '사원', 7839, '2024-01-23', 3000, null, 10)";
		int result = stmt.executeUpdate(sql);
		if (result == 1) {
			System.out.println("입력성공!");
		} else {
			System.out.println("입력실패!");
		}

	}

}
