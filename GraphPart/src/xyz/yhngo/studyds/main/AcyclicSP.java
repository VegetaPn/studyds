package xyz.yhngo.studyds.main;

import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.DirectedEdge;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;
import edu.princeton.cs.algs4.Topological;

/**
 * 无环加权有向图的最短路径算法
 * Created by Vegeta on 7/27/16.
 */
public class AcyclicSP {
    private edu.princeton.cs.algs4.DirectedEdge[] edgeTo;
    private double[] distTo;

    public AcyclicSP(EdgeWeightedDigraph G, int s) {
        edgeTo = new edu.princeton.cs.algs4.DirectedEdge[G.V()];
        distTo = new double[G.V()];

        for (int v = 0; v < G.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0.0;

        edu.princeton.cs.algs4.Topological top = new Topological(G);
        for (int v : top.order()) {
            relax(G, v);
        }
    }

    private void relax(EdgeWeightedDigraph G, int v) {
        for (edu.princeton.cs.algs4.DirectedEdge e : G.adj(v)) {
            int w = e.to();
            if (distTo[w] > distTo[v] + e.weight()) {
                distTo[w] = distTo[v] + e.weight();
                edgeTo[w] = e;
            }
        }
    }

    public boolean hasPathTo(int v) {
        return distTo[v] < Double.POSITIVE_INFINITY;
    }

    public Iterable<DirectedEdge> pathTo(int v) {
        if (!hasPathTo(v))
            return null;
        Stack<edu.princeton.cs.algs4.DirectedEdge> path = new Stack<edu.princeton.cs.algs4.DirectedEdge>();
        for (edu.princeton.cs.algs4.DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
            path.push(e);
        }

        return path;
    }
}
