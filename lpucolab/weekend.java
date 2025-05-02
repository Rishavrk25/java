package lpucolab;
import java.util.Scanner;
import java.time.LocalDate;
// You are using Java
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
class DateValidator {
   //type your code here
   static String getDayType(String date){
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
      LocalDate parsedDate=LocalDate.parse(date,formatter);
  
      DayOfWeek day=parsedDate.getDayOfWeek();
     
      if(day.toString().equals("SATURDAY") || day.toString().equals("SUNDAY")){
          return "Weekend";
      }
      else return "Weekday";
   }
}

public class weekend {
  public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    String date = scanner.nextLine();
    String dayType = DateValidator.getDayType(date);
    System.out.println(date + " is a " + dayType);
    scanner.close();
}
}
