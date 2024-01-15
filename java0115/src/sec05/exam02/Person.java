package sec05.exam02;

public class Person {
	final static public double PI1 = 3.141592;  // 상수
	public static final double PI = 3.141592;  // 상수 
	final String name;
	static int y;
	
	public Person(String name) {
		this.name = name;
//		PI = 3.14;
	}

	public static void main(String[] args) {
		System.out.println(Person.PI);
		Person.y = 100;
		Person person = new Person("홍길동");
//		person.name = "홍길동";
		
		final int x;  // 한번만
		x = 300;
//		x = 500;

	}

}
