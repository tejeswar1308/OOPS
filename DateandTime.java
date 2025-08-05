package Lab2;
import java.time.LocalDateTime;
public class DateandTime {
	public static void main(String[] args) {
	LocalDateTime now = LocalDateTime.now();
	
	 System.out.println("Current Date and Time: " + now);
	 System.out.println("Year: " + now.getYear());
	 System.out.println("Month: " + now.getMonth());
	 System.out.println("Day of Month: " + now.getDayOfMonth());
	 System.out.println("Hour: " + now.getHour());
	 System.out.println("Minute: " + now.getMinute());
	 System.out.println("Second: " + now.getSecond());
	}
}
