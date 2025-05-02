package lpucolab;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;
// You are using Java
import java.time.temporal.ChronoUnit;
class DateUtil {
   public static String calculateDuration(LocalDate s, LocalDate e) {
      // Write your code here
      int month=(int)ChronoUnit.MONTHS.between(s,e);
      LocalDate temp=s.plusMonths(month);
      int days=(int)ChronoUnit.DAYS.between(temp,e);
      
      return (month+" months and "+days+" days");
      

   }
}
public class month_days {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    String startDateStr = scanner.nextLine().trim();
    LocalDate startDate = LocalDate.parse(startDateStr, formatter);
    
    String endDateStr = scanner.nextLine().trim();
    LocalDate endDate = LocalDate.parse(endDateStr, formatter);
    
    String duration = DateUtil.calculateDuration(startDate, endDate);
    System.out.println(duration);
    
    scanner.close();
}
}
