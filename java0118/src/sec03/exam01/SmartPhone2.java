package sec03.exam01;

public class SmartPhone2 extends Phone {
	int y;
//	System.out.println(x);
	
	public SmartPhone2(int x, int y) {  // 생성자
		super(x);  // 부모의 생성자 호출
		this.y = y;
	}
	
	public void printX() {
		System.out.println(x);
	}
}
