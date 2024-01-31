package sec01.exam01;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		Thread th = new Thread(new BeepTask());
		th.start();

		for (int i=0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
			} catch (InterruptedException e) {

			}  
		}
		System.out.println("main 종료");
	}

}
