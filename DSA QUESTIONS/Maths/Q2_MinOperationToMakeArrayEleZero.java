package Maths;

public class Q2_MinOperationToMakeArrayEleZero {

  long solve(int l,int r){
        long L = 1;
        long S = 1;
        long steps = 0;
        while(L<=r){
            long R = 4*L - 1;
            long start = Math.max(L,(long)l);
            long end = Math.min(R,(long)r);

            if(start<=end){
                steps += ((end - start) + 1) * S;
            }
            S++;
            L*=4;
        }
        return steps;
    }
     public long minOperations(int[][] queries) {
        long res = 0;
        for(int i=0;i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];

            long steps = solve(l,r);

            res += (steps+1)/2;
        }
        return res;
     }



    // BRUTE FORCE -> TLE
    // public long minOperations(int[][] queries) {
    //     long total = 0;

    //     for (int[] q : queries) {
    //         int l = q[0], r = q[1];

    //         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    //         for (int i = l; i <= r; i++) {
    //             maxHeap.add(i);
    //         }

    //         long ops = 0;
    //         while (!maxHeap.isEmpty()) {
    //             int a = maxHeap.poll();

    //             int b = 0;
    //             if (!maxHeap.isEmpty()) {
    //                 b = maxHeap.poll();
    //             }

    //             a /= 4;
    //             b /= 4;

    //             if (a > 0) maxHeap.add(a);
    //             if (b > 0) maxHeap.add(b);

    //             ops++;
    //         }

    //         total += ops;
    //     }

    //     return total;
    // }
}