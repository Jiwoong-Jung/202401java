package proxy;

public class RealSubject implements ISubject {

	@Override
	public void action() {
		System.out.println("실제 객체 실행");
		
	}

}
