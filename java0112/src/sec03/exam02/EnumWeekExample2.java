package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample2 {
	public static void main(String[] args) {
		Week2 today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week2.일; break;
			case 2:
				today = Week2.월; break;
			case 3:
				today = Week2.화; break;
			case 4:
				today = Week2.수; break;
			case 5:
				today = Week2.목; break;
			case 6:
				today = Week2.금; break;				
			case 7:
				today = Week2.토; break;		
		}
		
		System.out.println("오늘 요일: "+ today);
		
		if(today == Week2.일) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부 합니다.");
		}
	}
}

