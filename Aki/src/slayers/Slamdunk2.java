package slayers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Slamdunk2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql = "insert into emp(ename, empno, hiredate, job , sal) values ('김세나', 4000, '20020909', '과장', 7000)";
		
		int value = stmt.executeUpdate(sql);
		System.out.println(value);
	}

}
