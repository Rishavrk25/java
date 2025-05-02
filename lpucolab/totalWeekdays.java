package lpucolab;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;
// You are using Java

class DateUtil {
  public static int calculateWorkingDays(LocalDate s, LocalDate e) {
     // Write your code here
    int c=0;
    while(!s.isAfter(e)){
         DayOfWeek d=s.getDayOfWeek();
         String D=d.toString();
         if(!D.equals("SATURDAY") && !D.equals("SUNDAY")) c++;
         s=s.plusDays(1);
     }
       return c;
  }
}
public class totalWeekdays {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    String startDateStr = scanner.nextLine().trim();
    LocalDate startDate = LocalDate.parse(startDateStr, formatter);
    
    String endDateStr = scanner.nextLine().trim();
    LocalDate endDate = LocalDate.parse(endDateStr, formatter);
    
    int workingDays = DateUtil.calculateWorkingDays(startDate, endDate);
    System.out.println(workingDays);
    
    scanner.close();
}
}
