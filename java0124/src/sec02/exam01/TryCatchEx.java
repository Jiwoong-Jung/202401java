package sec02.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e1) {
			// 예외 처리 코드
			System.out.println("클래스가 존재하지 않음!");
			System.exit(0);
//			e1.printStackTrace();
		} finally {
			System.out.println("반드시 실행");
		}
		
		try {
			Connection conn = DriverManager.getConnection(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
