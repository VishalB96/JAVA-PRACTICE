package test1;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time1 {
	
	
	public static void main(String[] args) {
		  ZoneId zoneId = ZoneId.of("Asia/Calcutta"); 
		  
	        // create Clock with system(zoneId) method 
	        Clock clock = Clock.system(zoneId); 
	  
	        // get instant of class 
	        Instant instant = clock.instant(); 
	  
	        // get ZonedDateTime object from instantObj to get date time 
	        ZonedDateTime time = instant.atZone(clock.getZone()); 
	  
	        // print details of time 
	        System.out.println("Instant for class is " + time.toString()); 
	}

}
