package me.yanhaonan.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Desc:
 *
 * ------------------------------------
 *
 * @author yanhaonan@meituan.com
 * @date 2019-07-09 21:12
 */
public class Graph {
  private Integer v;
  private LinkedList<Integer>[] adj;

  private boolean found = false;


  public Graph(Integer v) {
    this.v = v;
    this.adj = new LinkedList[v];
    for (LinkedList list : this.adj) {
      list = new LinkedList();
    }
  }

  public void addEdge(int from, int to) {
    this.adj[from].add(to);
    this.adj[to].add(from);
  }

  public void bfsSearch(int from, int to) {
    if (from == to) {
      return;
    }

    boolean[] visited = new boolean[v];
    visited[from] = true;
    Queue<Integer> queue = new LinkedList<>();
    queue.add(from);
    int[] prev = new int[v];
    for (int i = 0; i < prev.length; i++) {
      prev[i] = -1;
    }

    while (!queue.isEmpty()) {
      Integer cur = queue.poll();
      for (Integer n : adj[cur]) {
        if (visited[n]) {
          continue;
        }

        prev[n] = cur;
        if (n == to) {
          print(prev, from, to);
          return;
        }
        visited[n] = true;
        queue.add(n);
      }
    }
  }

  public void dfsSearch(int from, int to) {
    if (from == to) {
      return;
    }

    boolean[] visited = new boolean[v];
    int[] prev = new int[v];
    for (int i = 0; i < prev.length; i++) {
      prev[i] = -1;
    }

    dfsSearch(from, to, visited, prev);
    print(prev, from, to);
  }

  private void dfsSearch(int from, int to, boolean[] visited, int[] prev) {
    if (found) {
      return;
    }

    if (from == to) {
      found = true;
      return;
    }

    visited[from] = true;
    for (Integer v : adj[from]) {
      if (visited[v]) {
        continue;
      }

      prev[v] = from;
      dfsSearch(v, to, visited, prev);
    }
  }

  private void print(int[] prev, int from, int to) {
    if (prev[to] != -1 && from != to) {
      print(prev, from, prev[to]);
    }
    System.out.println(to + " ");
  }

  public Integer getV() {
    return v;
  }

  public LinkedList<Integer>[] getAdj() {
    return adj;
  }
}
