package proxy;

public class Client {

	public static void main(String[] args) {
		ISubject sub = new Proxy(new RealSubject());
		sub.action();

	}

}
