public class Q4_SetTheRightMostUnsetBit {
     static int setBit(int n) {
        // code here
        n = n | (n+1);
        return n;
        
    }
}
