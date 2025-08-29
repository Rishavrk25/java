package Maths;

public class Q1_Aice_and_Bob_FlowerGame {
  public long flowerGame(int n, int m) {
        // x -> 1 to n 
        // y -> 1 to m
        // a/c (x+y) must be odd for a valid pair (x,y)
        // for x+y -> odd
        // 1. odd + even = odd -> valid pair(x,y) -> count = xodds * yevens
        // 2. even + odd = odd -> valid pari(x,y) -> count = xevens * yodds

        long xodds = (n+1)/2;
        long xevens = n/2;
        
        long yodds = (m+1)/2;
        long yevens = m/2;
        
        long c = (xodds * yevens) + (xevens * yodds);
        return c;
    }
}
