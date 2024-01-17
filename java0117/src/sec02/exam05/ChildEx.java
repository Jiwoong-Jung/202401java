package sec02.exam05;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data";

		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data";
		parent.method3();
		*/
		
		Child child = (Child) parent; // 문법상 오류 없음
		child.field2 = "yyy";
		child.method3();
	}

}
