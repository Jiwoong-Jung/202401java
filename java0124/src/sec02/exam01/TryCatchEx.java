package sec02.exam01;

public class TryCatchEx {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e1) {
			// 예외 처리 코드
			System.out.println("클래스가 존재하지 않음!");
//			e1.printStackTrace();
		} finally {
			System.out.println("반드시 실행");
		}
		
	}

}
