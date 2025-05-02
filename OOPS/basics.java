package OOPS;
import java.util.Scanner;
// You are using Java
class NumberClassifier {
    //type your code here
    int n;
    void classifyNumbers(int arr[]){
        
    }
    void printEvenNumbers(int arr[]){
        System.out.print("Even numbers: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void printOddNumbers(int arr[]){
        System.out.print("Odd numbers: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) System.out.print(arr[i]+" ");
        }
    }
}
public class basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        NumberClassifier obj = new NumberClassifier();
        obj.n = scanner.nextInt();
        int[] arr = new int[obj.n];
        
        for (int i = 0; i < obj.n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        obj.classifyNumbers(arr);
        obj.printEvenNumbers(arr);
        obj.printOddNumbers(arr);

        scanner.close();
    }
}