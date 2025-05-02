package lpucolab;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
// You are using Java
class DateValidator {
  //type your code here
  static boolean isValidFormat(String c){
     if(c.length()!=10) return false;
      
     for(int i=0;i<c.length();i++){
         char ch=c.charAt(i);
           if(ch!='/' && !Character.isDigit(ch)) return false;
     }
     return true;

      
  }
  static String validateDate(String c,String s,String e){
      DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate C = LocalDate.parse(c,formatter);
      LocalDate S = LocalDate.parse(s,formatter);
      LocalDate E = LocalDate.parse(e,formatter);
      
      String checkin=C.format(formatter);
      if((C.isAfter(S) && C.isBefore(E)) || C.equals(S) || C.equals(E) ){
          return (checkin+" is a valid booking date");
      }
      return (checkin+" is outside the valid booking range");
  }
}
public class date_bw_twodates {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String checkInDate = scanner.nextLine();
    String startDate = scanner.nextLine();
    String endDate = scanner.nextLine();
    

    if (!DateValidator.isValidFormat(checkInDate)) {
        System.out.println(checkInDate + " is not in the correct format");
        return;
    }
    
    String result = DateValidator.validateDate(checkInDate, startDate, endDate);
    System.out.println(result);
    
    scanner.close();
}
}
