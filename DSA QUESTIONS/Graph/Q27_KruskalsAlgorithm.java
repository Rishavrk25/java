import java.util.PriorityQueue;

import Heap.Q6_kClosestPointsToOrigin.Triplet;

public class Q27_KruskalsAlgorithm {
  class Triplet implements Comparable<Triplet> {
    int u;
    int v;
    int wt;

    Triplet(int u, int v, int wt) {
      this.u = u;
      this.v = v;
      this.wt = wt;
    }

    public int compareTo(Triplet t) {
      return Integer.compare(this.wt, t.wt);
    }
  }

  class Solution {
    int parent[];
    int size[];

    int find(int a) {
      if (parent[a] == a)
        return a;
      return parent[a] = find(parent[a]);
    }

    void union(int a, int b) {
      int leaderA = find(a);
      int leaderB = find(b);
      if (leaderA != leaderB) {
        if (size[leaderA] > size[leaderB]) {
          parent[leaderB] = leaderA;
          size[leaderA] += size[leaderB];
        } else {
          parent[leaderA] = leaderB;
          size[leaderB] += size[leaderB];
        }
      }
    }

    public int minCostConnectPoints(int[][] arr) {
      int n = arr.length;
      // Kruskal's Algorithm
      PriorityQueue<Triplet> pq = new PriorityQueue<>(); // min heap
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          int x1 = arr[i][0], y1 = arr[i][1];
          int x2 = arr[j][0], y2 = arr[j][1];
          int dist = Math.abs(x1 - x2) + Math.abs(y1 - y2);
          pq.add(new Triplet(i, j, dist));
        }
      }

      parent = new int[n];
      size = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = i;
        size[i] = 1;
      }
      int ans = 0;
      while (pq.size() > 0) {
        Triplet top = pq.remove();
        int u = top.u;
        int v = top.v;
        int wt = top.wt;
        if (find(u) != find(v)) {
          ans += wt;
          union(u, v);
        }
      }
      return ans;

    }
  }
}
