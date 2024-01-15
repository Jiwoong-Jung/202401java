package sec05.exam02;

public class StudentEx {

	public static void main(String[] args) {
		StudentService ss = StudentService.getInstance();
		ss.student.name = "홍길동";
		ss.student.hakbun = "241010";
		ss.student.kor = 92;
		ss.student.eng = 86;
		ss.student.math = 95;

		StudentService ss1 = StudentService.getInstance();
		System.out.println(ss.student.name);
		System.out.println(ss1.student.name);
		if (ss.student == ss1.student) {
			System.out.println("같다");
		}
		if (ss.student.equals(ss1.student)) {
			System.out.println("같다");
		}
	}

}
