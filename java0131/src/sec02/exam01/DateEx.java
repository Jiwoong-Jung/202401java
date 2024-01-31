package sec02.exam01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf 
		    = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		System.out.println(sdf.format(now));
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		LocalTime date2 = LocalTime.now();
		System.out.println(date2);
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
	}

}
