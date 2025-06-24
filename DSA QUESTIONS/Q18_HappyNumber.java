import java.util.HashSet;

public class Q18_HappyNumber {
    class Solution {
        // USING HASHSET -> TC= O(logN)  SC= O(k)
        // int sum(int n) {
        //     int s = 0;
        //     while (n != 0) {
        //         int rem = n % 10;
        //         s += rem * rem;
        //         n /= 10;
        //     }
        //     return s;
        // }
        // public boolean isHappy(int n) {
        //     HashSet<Integer> set = new HashSet<>();
        //     while (n != 1 && !set.contains(n)) {
        //         set.add(n);
        //         n = sum(n);
        //     }
        //     return n == 1;
        // }

        
        // FLOYD'S ALGORITHM -> TC= O(logN)  SC= O(1)
        int sum(int n) {
            int s = 0;
            while (n != 0) {
                int rem = n % 10;
                s += rem * rem;
                n /= 10;
            }
            return s;
        }
        public boolean isHappy(int n) {
            int slow = n;
            int fast = sum(n);
            while (fast != 1 && slow != fast) {
                slow = sum(slow);
                fast = sum(sum(fast));
            }
            return fast == 1;
        }
    }
}
