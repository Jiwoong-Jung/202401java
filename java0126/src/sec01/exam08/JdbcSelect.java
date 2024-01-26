package sec01.exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		long time3 = System.currentTimeMillis(); // 성능 평가시 활용
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql = "select * from emp";
		
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.print(rs.getInt("empno")+"\t");
			System.out.print(rs.getString("ename")+"\t");
			System.out.println(rs.getDouble("sal"));
		}
		long time4 = System.currentTimeMillis(); // 성능 평가시 활용
		System.out.println("연산시간: " + (time4-time3) + "밀리세컨드");

	}

}
