package Bit Manipulation;

public class Q3_MinBitFlips {
    public int minBitFlips(int start, int goal) {
        // m-1 -> xor then count 1
        int n=start^goal;
        int c=0;
        while(n>0){
            n = n & (n-1);
            c++;
        }
        return c;

        // m-1 -> Brute force
        // int c=0;
        // while(start>0 || goal>0){
        //     if((start & 1) != (goal & 1)) c++;
        //     start = start >> 1;
        //     goal = goal >> 1;
        // }
        // return c;
    }
}
