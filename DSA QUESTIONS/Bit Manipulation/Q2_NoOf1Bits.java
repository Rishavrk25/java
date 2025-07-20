
public class Q2_NoOf1Bits {
    public int hammingWeight(int n) {
        // m-1 -> turn off rightmost 1 bit
        int c=0;
        while(n>0){
            n = n & (n-1);
            c++;
        }
        return c;

        // m-2 -> check for odd , then right shift
        // int c=0;
        // while(n>0){
        //     if((n & 1)==1) c++;
        //     n=n>>1;
        // }
        // return c;
    }
}
