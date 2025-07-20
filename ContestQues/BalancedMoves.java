/*Imagine you're managing two coin stacks in a strategy game. One stack has a coins and the other has b coins.
You’re allowed two types of moves:
Remove 1 coin from the first stack and 2 coins from the second stack
Remove 2 coins from the first stack and 1 coin from the second stack
Your goal is to completely empty both stacks using any combination of these two moves — with no coins left behind.
You need to determine whether it's possible to achieve this for a number of test cases.
Input Format
The first line contains an integer t — the number of test cases.
The next t lines each contain two integers a and b — the number of coins in the two stacks.
Constraints
1 ≤ t ≤ 10^5
0 ≤ a, b ≤ 10^9
Output Format
For each test case, print "YES" if it’s possible to empty both stacks, or "NO" if it’s not.
Sample Input 0
3
2 1
2 2
3 3
Sample Output 0
YES
NO
YES */
package ContestQues;
import java.util.*;

public class BalancedMoves {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            int q = sum/3;
            if(sum%3==0 && (a>=q && b>=q)){
                 System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}