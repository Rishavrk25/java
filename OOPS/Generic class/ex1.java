import java.util.Scanner;
// You are using Java
class EfficiencyCalculator<T extends Number> {
  //type your code here
  Object arr[];
  
 public EfficiencyCalculator(Object arr[]){
      this.arr=arr;
  }
  String computeEfficiency(){
      String ans="";
      int n=arr.length;
      double p=1;
      double nums[]=new double[n];
      for(int i=0;i<n;i++){
          String s=arr[i].toString();
          double d=Double.parseDouble(s);
          nums[i]=d;
      }
      for(int i=0;i<n;i++){
          
          p*=nums[i];
      }
      for(int i=0;i<n;i++){
          double val=p/nums[i];
          ans+=(int)val;
          if(i!=n-1) ans+=" ";
      }
      return ans;
  }
}
public class ex1 {
  public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Object[] inputArray = new Object[size];
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.next();
        }
        EfficiencyCalculator<?> calculator = new EfficiencyCalculator<>(inputArray);
        String result = calculator.computeEfficiency();
        System.out.println(result);
        scanner.close();
    }
}
}
