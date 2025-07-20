
public class Q1_PowerOf2 {
    public boolean isPowerOfTwo(long n) {
        // m-1 -> turn off rightmost bit
        if(n<=0) return false;
        return (n & (n-1)) == 0;

        // m-2 -> dividing continuously by 2 , if any odd found => return false
        // if(n==1) return true;
        // if(n%2==1 || n<=0) return false;
        // while(n>1){
        //     if(n%2!=0) return false;
        //     n/=2;
        // }
        // return true;

        // m-3 -> left shift
        // if(n==1) return true;
        // for(long i=0;i<=Math.sqrt(n)+1;i++){
        //     if((long)(1<<i)==n) return true;
        // }
        // return false;
    }
}
