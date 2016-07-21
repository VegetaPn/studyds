package xyz.yhngo.studyds.main;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Vegeta on 7/21/16.
 * union-find: quick-find实现
 */
public class UF {
    private int[] id;
    private int count;

    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    /**
     * quick-find
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    /**
     * quick-find
     * @param p
     * @return
     */
    public int find(int p) {
        return id[p];
    }

    /**
     * quick-find 算法
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        if (pID == qID) {
            return;
        }

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) id[i] = qID;
        }

        count--;
    }

    public static void main(String args[]) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            if (uf.connected(p, q)) {
                continue;
            }

//            uf.union(p, q);
            uf.union(p, q);
            StdOut.println(uf.count() + " components");
        }
    }
}
