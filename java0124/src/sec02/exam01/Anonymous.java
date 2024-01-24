package sec02.exam01;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근");
		}

		@Override
		void wake() {
			System.out.println("6시 기상");
			work();
		}
		
	};
	
	
	void method1() {
		
	}
	void method2(Person person) {
		
	}
}
