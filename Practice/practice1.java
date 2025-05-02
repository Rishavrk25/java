import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class practice1 {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);

    LocalTime timeNow = LocalTime.now();
    System.out.println(timeNow);

    LocalDateTime dateTimeNow = LocalDateTime.now();
    System.out.println(dateTimeNow);

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println(zonedDateTime);

    // date-time to string
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.println(LocalDate.now().format(formatter));

    // string to date-time
    LocalDate parsedDate=LocalDate.parse("01-08-2025",formatter);
    System.out.println(parsedDate);

     int day=parsedDate.getMonthValue();
     System.out.println(day);
    

  }
}
