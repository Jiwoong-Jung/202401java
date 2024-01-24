package page425;

public class Parent {
	void parentMethod() {};
}

class  A {
	void method1(Parent p) {}
	
	void method2() {
		method1(new Parent());
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
