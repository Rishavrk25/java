import java.util.Scanner;
public class Varargs {
    public int sumN(int ... args){
        System.out.println("argument length: "+args.length);
        int sum=0;
        for(int x: args){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
       Varargs v=new Varargs();
        int Sum=v.sumN(1,2,3,4);
        System.out.print(Sum);
    }
}
