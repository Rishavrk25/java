import java.util.Scanner;

class ternary {
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int product=a*b;
        System.out.print((product%sum==0)?"Sum is Multiple of Product":"Sum is not Multiple of Product");
        
    }
}