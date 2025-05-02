package lpucolab;
import java.util.Scanner;
// You are using Java

import lpucolab.NumberProcessorLogic.NegativeNumberException;

class NumberProcessorLogic {
  //Type your code here
  static class NegativeNumberException extends Exception{
      public  NegativeNumberException(String msg){
          super(msg);
      }
  }
   public static int processInput(int n) throws NegativeNumberException{
      if(n>0) return 2*n;
      else{
          throw new NegativeNumberException(n+" is negative") ;
      }
  }
}
public class Exception {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            int result = NumberProcessorLogic.processInput(num);
            System.out.print("Value is Doubled: " + result);
        } catch (NumberProcessorLogic.NegativeNumberException ex) {
            System.out.print("Exception occurred: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
