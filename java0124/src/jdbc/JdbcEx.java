package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Scanner scan = new Scanner(System.in);
		System.out.print("부서번호:");
		int deptno = Integer.parseInt(scan.nextLine());
		System.out.print("부서이름:");
		String dname = scan.nextLine();
		System.out.print("부서위치:");
		String loc = scan.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql = "insert into dept(deptno, dname, loc) values (60, '영업', '서울')";
		int result = stmt.executeUpdate(sql);
		if (result == 1) {
			System.out.println("입력성공!");
		} else {
			System.out.println("입력실패!");
		}

	}

}
