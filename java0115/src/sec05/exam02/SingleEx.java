package sec05.exam02;

public class SingleEx {

	public static void main(String[] args) {
//		Singleton sing1 = new Singleton();
		Singleton sing2 = Singleton.getInstance();
		Singleton sing3 = Singleton.getInstance();
		
		if (sing2 == sing3) { // 객체의 메모리 주소 비교
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다");
		}

		if (sing2.equals(sing3)) { // 객체 자체가 같은지 (여기서는 무의미)
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다");
		}
	}

}
