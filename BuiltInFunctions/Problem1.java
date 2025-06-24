import java.util.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class Problem1 {
	public static void main(String[] args) {
		ZoneId gmtZone=ZoneId.of("GMT");
		ZoneId istZone=ZoneId.of("Asia/Kolkata");
		ZoneId pstZone = ZoneId.of("America/Los_Angeles");
	    ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);
	    ZonedDateTime istTime = ZonedDateTime.now(istZone);
	    ZonedDateTime pstTime = ZonedDateTime.now(pstZone);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
	    System.out.println("Current time in GMT: " + gmtTime.format(formatter));
	    System.out.println("Current time in IST: " + istTime.format(formatter));
	    System.out.println("Current time in PST: " + pstTime.format(formatter));
	}
}
