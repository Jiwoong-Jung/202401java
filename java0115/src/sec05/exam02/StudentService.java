package sec05.exam02;

public class StudentService {
	Student student = new Student();
	private static StudentService studentService 
									= new StudentService();
	private StudentService() {
	}
	public static StudentService getInstance() {
		// 코딩 부분
		return studentService;
	}
}
