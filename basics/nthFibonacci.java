// import java.util.Scanner;
public class nthFibonacci {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int prev=0,curr=1,next;
        for(int i=0;i<10;i++){
            // System.out.print(prev+" ");
            next=curr+prev;
            prev=curr;
            curr=next;
        }
        System.out.print(prev+" ");
    }
}
