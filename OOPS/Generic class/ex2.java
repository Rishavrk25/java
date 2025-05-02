package OOPS.Generic class;
import java.util.*;
// You are using Java
class ISBNFinder<T>{
  Object arr[];
  public ISBNFinder(Object arr[]){
      this.arr=arr;
  }
  int[] findFirstAndLastPosition(Object t){
      double target=Double.parseDouble(t.toString());
      int ans[]=new int[2];
      int n=arr.length;
      double nums[]=new double[n];
      for(int i=0;i<n;i++){
          double d=Double.parseDouble(arr[i].toString());
          nums[i]=d;
      }
      int f=-1;
      int l=-1;
      for(int i=0;i<n;i++){
          if(nums[i]==target){
              f=(int)i;
              break;
          }
      }
      for(int i=n-1;i>=0;i--){
          if(nums[i]==target){
              l=(int)i;
              break;
          }
      }
      ans[0]=f;
      ans[1]=l;
      return ans;
  }
}
public class ex2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    Object[] isbnArray = new Object[N];
    for (int i = 0; i < N; i++) {
        if (scanner.hasNextInt()) {
            isbnArray[i] = scanner.nextInt();
        } else {
            isbnArray[i] = scanner.nextDouble();
        }
    }
    Object target;
    if (scanner.hasNextInt()) {
        target = scanner.nextInt();
    } else {
        target = scanner.nextDouble();
    }
    ISBNFinder<Object> finder = new ISBNFinder<>(isbnArray);
    int[] result = finder.findFirstAndLastPosition(target);
    System.out.println(result[0] + " " + result[1]);

    scanner.close();
}
}
