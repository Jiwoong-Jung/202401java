package page425;

public class Parent {
	void parentMethod() {};
}
class Child extends Parent {

	@Override
	void parentMethod() {
		// TODO Auto-generated method stub
		super.parentMethod();
	}
	
}

class  A {
	void method1(Parent p) {

	}
	
	void method2() {
		method1(new Parent() {

			int x;
			@Override
			void parentMethod() {
				System.out.println(this.x);
				super.parentMethod();
			}
			
		});
	}
	
	Parent field = new Parent() {

		@Override
		void parentMethod() {
			// TODO Auto-generated method stub
			super.parentMethod();
		}
		
	};
	
	void method() {
		Parent var = new Parent() {

			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}
			
		};
	}
}
