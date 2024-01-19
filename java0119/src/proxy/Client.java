package proxy;

public class Client {

	public static void main(String[] args) {
//		ISubject sub1 = new RealSubject();
//		sub1.action();
		
		ISubject sub = new Proxy(new RealSubject());
		sub.action();

	}

}
