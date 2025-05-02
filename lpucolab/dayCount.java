package lpucolab;
import java.util.Scanner;
interface DaysCalculator {
    int calculateDays(int[] date1, int[] date2);
}

// import java.util.Scanner;
// import java.time.LocalDate;
// import java.time.temporal.ChronoUnit;

class DaysCalculatorImpl implements DaysCalculator {
  public int calculateDays(int[] d1, int[] d2) {
      java.time.LocalDate date1 = java.time.LocalDate.of(d1[0], d1[1], d1[2]);
      java.time.LocalDate date2 = java.time.LocalDate.of(d2[0], d2[1], d2[2]);
      return (int) Math.abs(java.time.temporal.ChronoUnit.DAYS.between(date1, date2));
  }

  // Required for main method
  public static DaysCalculator createCalculator() {
      DaysCalculatorImpl obj= new DaysCalculatorImpl();
      return obj;
  }
}






public class dayCount {
  public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    String[] date1 = scanner.nextLine().split("-");
    String[] date2 = scanner.nextLine().split("-");
    int[] date1Int = {
        Integer.parseInt(date1[0]), 
        Integer.parseInt(date1[1]), 
        Integer.parseInt(date1[2])
    };
    int[] date2Int = {
        Integer.parseInt(date2[0]), 
        Integer.parseInt(date2[1]), 
        Integer.parseInt(date2[2])
    };
    DaysCalculator calculator = DaysCalculatorImpl.createCalculator();
    int days = calculator.calculateDays(date1Int, date2Int);
    System.out.println("Number of days between the two dates is: " + days);
    scanner.close();
}
}
