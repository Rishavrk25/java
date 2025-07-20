package BST;

public class Q5_RightMostDifferentBit {
    public static int posOfRightMostDiffBit(int m, int n) {
        // code here
        if(m == n){
            return -1;
        }
        int a=(m^n);
        int k=1;
        while((a&1)==0){
            k++;
            a=a>>1;
        }
        return k;
    }
}
