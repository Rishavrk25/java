public class Q6_ReverseBits {
    public int reverseBits(int n) {
        int i=0;
        int j=31;
        while(i<j){
            int iMask=1<<i;
            int jMask=1<<j;
            boolean iOn=((n & iMask) != 0);
            boolean jOn=((n & jMask) != 0);
            if((iOn != jOn)){
                 n = n^iMask;
                n= n^jMask;
            }
            i++;
            j--;
        }
        return n;
    }
}
