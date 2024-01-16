package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	public D() {
		super();  // 부모의 생성자 A()
		this.field = "value";
		super.method();
	}
	public void method() {
		super.field = "value";
		this.method();
	}
}
