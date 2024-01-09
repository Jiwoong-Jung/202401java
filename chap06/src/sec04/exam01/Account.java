package sec04.exam01;

public class Account {
	String nation = "대한민국";
	String name;  // 이름 필드 (아이디로 사용)
	String ssn;   // 생년월일 필드 (패스워드로 사용)
	String tel;
	int age;
	
	public Account() {
		System.out.println("내가 만든 Account()");
	}
	
	public Account(String name) {
		this.name = name;
	}
	
	public Account(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public Account(String name, String ssn, String tel) {
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
	}

	public Account(String name, String ssn, String tel, int age) {
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", age=" + age + "]";
	}
	
	
	
}
