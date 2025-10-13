package Graph;

import java.util.Arrays;

public class Q23_BellmanFordAlgorithm {
  public int[] bellmanFord(int n, int[][] edges, int src) {
    // code here
    int ans[] = new int[n];
    Arrays.fill(ans, (int) Math.pow(10, 8));
    ans[src] = 0;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < edges.length; j++) {
        int u = edges[j][0];
        int v = edges[j][1];
        int wt = edges[j][2];
        if (ans[u] == Math.pow(10, 8))
          continue;
        int total = ans[u] + wt;
        if (total < ans[v]) {
          ans[v] = total;
        }
      }
    }
    for (int j = 0; j < edges.length; j++) {
      int u = edges[j][0];
      int v = edges[j][1];
      int wt = edges[j][2];
      if (ans[u] == Math.pow(10, 8))
        continue;
      int total = ans[u] + wt;
      if (total < ans[v]) {
        return new int[] { -1 };
      }
    }
    return ans;

  }
}
