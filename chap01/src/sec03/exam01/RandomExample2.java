package sec03.exam01;

import java.util.Random;

public class RandomExample2 {
	public static void main(String[] args)  {

		// 로또 번호를 저장할 변수 6개
        int num1, num2, num3, num4, num5, num6;

        // Random 객체 생성
        Random random = new Random();

        // 중복을 피하면서 각 변수에 로또 번호 할당
        num1 = random.nextInt(45) + 1;

        do {
            num2 = random.nextInt(45) + 1;
        } while (num2 == num1);

        do {
            num3 = random.nextInt(45) + 1;
        } while (num3 == num1 || num3 == num2);

        do {
            num4 = random.nextInt(45) + 1;
        } while (num4 == num1 || num4 == num2 || num4 == num3);

        do {
            num5 = random.nextInt(45) + 1;
        } while (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4);

        do {
            num6 = random.nextInt(45) + 1;
        } while (num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5);

        // 생성된 로또 번호 출력
        System.out.println("로또 번호: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6);
        System.out.printf("로또번호: %d, %d, %d, %d, %d, %d\n", num1, num2, num3, num4, num5, num6);
    }
}