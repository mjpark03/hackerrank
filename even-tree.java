import java.io.*;
import java.util.*;

public class Solution {
  static int result = 0;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] nm = in.nextLine().split(" ");
    int n = Integer.parseInt(nm[0]), m = Integer.parseInt(nm[1]);

    List<Integer>[] edges = new List[n+1];
    int[] visited = new int[n+1];

    for (int i=1; i<=n; i++) {
      edges[i] = new ArrayList<Integer>();
    }

    for (int i=0; i<m; i++) {
      String[] xy = in.nextLine().split(" ");
      int x = Integer.parseInt(xy[0]);
      int y = Integer.parseInt(xy[1]);

      edges[x].add(y);
      edges[y].add(x);
    }

    dfs(edges, visited, 1);
    System.out.println(result - 1);
  }

  public static int dfs(List<Integer>[] edges, int[] visited, int index) {
    visited[index] = 1;
    int count = 1;

    for (int edge: edges[index]) {
      if (visited[edge] == 0)
        count += dfs(edges, visited, edge);
    }

    if (count % 2 == 0) result++;

    return count;
  }
}
