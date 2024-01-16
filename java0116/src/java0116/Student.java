package java0116;

public class Student extends People {
	String hakbun;

	public Student(String name, String hakbun) {
		//System.out.println();
		//super(name);  // 부모의 생성자 호출 (여기서는 부모의 기본생성자 호출?)
		this.hakbun = hakbun;
	}

	void method3() {
		super.method1();
	}
	@Override
	void method1() {
		System.out.println();
		super.method1();  // 부모의 메소드 실행 (생략 가능)
		//
	}
	
	
}
