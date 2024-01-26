package sec01.exam08;

class Car { }

public class ClassEx {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Car.class;  // 1
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		
		// 2
		Class clazz2 =Class.forName("sec01.exam08.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
		
		//3
		Car car = new Car();
		Class clazz3 = car.getClass();
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackageName());
	}

}
