public class Q4_PowerOf4 {
    public boolean isPowerOfFour(int n) {
        // check for perfect square && power of 2
        // if(n<=0) return false;
        // int r=(int)Math.sqrt(n);
        // if(r*r == n && (n&(n-1))==0) return true;
        // return false;

        
        // check for perfect square && power of 2
        // any power of 4 leaves remainder 1 when divided by 3
        if(n<=0) return false;
        if(n%3==1 && (n&(n-1))==0) return true;
        return false;
        

        // divinding by 4
        // if(n==1) return true;
        // if(n<=0 || n%4!=0) return false;
        // return isPowerOfFour(n/4);
    }
}
