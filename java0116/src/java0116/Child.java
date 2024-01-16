package java0116;

class Parent2 {}
class Parent {  // 부모 클래스
	int money = 100;
	
	void disp() {
		System.out.println(money);
	}
}

public class Child extends Parent { // 자식 클래스
	public Child() {  // 생성자
		this.money += 300;
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.disp(); // 부모의 메소드 실행
		//System.out.println(ch.money);

	}

}
