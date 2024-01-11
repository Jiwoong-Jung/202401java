package sec01;

class YourClass {
	int x;
}

public class Passing2 {

	public static void main(String[] args) {
//		YourClass yc3 = null;
//		yc3.x = 200;
		
		YourClass yc = new YourClass(); // 객체 생성(기본생성자 실행)
//		System.out.println("main:"+yc);
		System.out.println("main:"+yc.x);
		method1(yc);
		System.out.println("main:"+yc.x);
//		YourClass yc1 = new YourClass(); // 객체 생성(기본생성자 실행)
//		System.out.println("다른 객체:"+yc1);
	}
	
	public static void method1(YourClass yc) {
//		System.out.println("method1:"+yc);
		yc.x = 300;
		return;
	}

}
