package sec01.exam08;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		long time3 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		long time4 = System.currentTimeMillis();
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("연산시간: " + (time2-time1) + "나노초");
		System.out.println("연산시간: " + (time4-time3) + "밀리세컨드");
	}
}
