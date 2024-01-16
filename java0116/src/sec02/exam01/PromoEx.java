package sec02.exam01;

class A {}
class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromoEx {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E(); 
	}

}
