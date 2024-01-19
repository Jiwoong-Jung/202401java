package anonymous;

class Parent {
	void method() {}
}
public class Child extends Parent {
	@Override
	void method() {
		// TODO Auto-generated method stub
		super.method();
	}

	public static void main(String[] args) {
		new Child();  // 익명 객체
		Parent parent1 = new Parent();
		Parent parent = new Parent() {

			@Override
			void method() {
				// TODO Auto-generated method stub
				super.method();
			}
			
		};

	}

}
