import java.util.Arrays;
public class Q3_FindNoOfWaysToPlacePeople_II {
  class Array implements Comparable<Array> {
    int x;
    int y;

    Array(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Array a) {
        if (a.x == this.x)
            return this.y - a.y;
        return a.x - this.x;
    }
}

class Solution {
    public int numberOfPairs(int[][] brr) {
        int n = brr.length;
        Array[] arr = new Array[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Array(brr[i][0], brr[i][1]);
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x1 = arr[i].x;
            int y1 = arr[i].y;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            for (int j = i + 1; j < n; j++) {
                int x2 = arr[j].x;
                int y2 = arr[j].y;
                if (y2 < y1)
                    continue;
                if (x2 > maxX || y2 < maxY) {
                    ans++;
                    maxX = x2;
                    maxY = y2;
                }
            }
        }
        return ans;
    }
}
}
