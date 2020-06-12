package L_IntroductionToTimeAndDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class a1_Intro_localDate_localTime_localDateTime {

	//LocalDate
	//localTime
	//LocalDateTime
	
	public static void main(String args[]) {
		
		//LocalDate
		LocalDate date = LocalDate.now();
		System.out.println("LocalDate ===>"+date);
		
		//LocalTime
		LocalTime time = LocalTime.now();
		System.out.println("LocalTime ===>"+time);
		
		//LocalDateTime
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("LocalDateTime ===>"+dateTime);
		
	}
}
