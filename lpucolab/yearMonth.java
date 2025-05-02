package lpucolab;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.YearMonth;
import java.util.Scanner;
// You are using Java
import java.time.DayOfWeek;
class DateUtil {
   //type your code here
   static String processDate(LocalDate date){
       int month=date.getMonthValue();
       int year=date.getYear();
       
       YearMonth yearMonth=YearMonth.of(year,month);
       int daysInMonth=yearMonth.lengthOfMonth();
      
    if(year%2==0){
        return ("The month "+date.getMonth()+" in the year "+year+" has "+daysInMonth+" days");
    }
    if(year%5==0){
        LocalDate next=date.plusMonths(1);
        // System.out.println(next);
        int nextM=next.getMonthValue();
        int nextY=next.getYear();
        YearMonth nextYearMonth=YearMonth.of(nextY,nextM);
       int daysInNextMonth=nextYearMonth.lengthOfMonth();
        return ("The next month "+next.getMonth()+" in the year "+next.getYear()+" has "+daysInNextMonth+" days");
        
    }
    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return (date.format(formatter)+" is invalid");

   }
}
public class yearMonth {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    String dateStr = scanner.nextLine().trim();
    LocalDate date = LocalDate.parse(dateStr, formatter);
    
    String result = DateUtil.processDate(date);
    System.out.println(result);
    
    scanner.close();
}
}
