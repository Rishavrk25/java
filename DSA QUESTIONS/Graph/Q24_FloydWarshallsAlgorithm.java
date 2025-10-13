package Graph;

public class Q24_FloydWarshallsAlgorithm {
  public void floydWarshall(int[][] dist) {
    // Code here
    int inf = (int) Math.pow(10, 8);
    int n = dist.length;
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (dist[i][k] != inf && dist[k][j] != inf)
            dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
        }
      }
    }
  }
}