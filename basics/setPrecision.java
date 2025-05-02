import java.util.Scanner;

public class setPrecision {
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double sum=a+b+c;
        System.out.printf("Rs. %.2f",sum);
    }
}