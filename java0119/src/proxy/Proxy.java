package proxy;

public class Proxy implements ISubject {
	
	private RealSubject realSubject;

	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public void action() {
		System.out.println("프록시 객체 실행");
		realSubject.action();
	}

}
