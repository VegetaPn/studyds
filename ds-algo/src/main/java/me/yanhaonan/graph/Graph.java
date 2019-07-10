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
    for (Integer i = 0; i < v; i++) {
      prev[i] = -1;
    }

    while (queue.size() != 0) {
      Integer w = queue.poll();
      for (int i = 0; i < adj[w].size(); i++) {
        Integer q = adj[w].get(i);
        if (!visited[q]) {
          prev[q] = w;
          if (q == to) {
            print(prev, from, to);
            return;
          }
          visited[q] = true;
          queue.add(q);
        }
      }
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
