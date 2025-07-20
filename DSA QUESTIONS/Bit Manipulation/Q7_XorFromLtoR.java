public class Q7_XorFromLtoR {
     static int xorUpto(int n){
        if(n%4 == 1) return 1;
        else if(n%4 ==2) return n+1;
        else if(n%4 ==3) return 0;
        else return n;
    }
    public static int findXOR(int l, int r) {
        return xorUpto(r) ^ xorUpto(l-1);
    }
}
