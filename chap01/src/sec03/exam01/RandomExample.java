package sec03.exam01;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args)  {

        Random rd = new Random();//랜덤 객체 생성
    
        for(int i=0;i<6;i++) {
            System.out.print("["+(rd.nextInt(45)+1)+"]"); //로또번호 출력
        }
    }
}