package me.yanhaonan.uf;

public class UF {
    private int count;
    private int[] parent;
    private int[] size;

    public UF(int n) {
        this.count = n;
        this.parent = new int[n];
        this.size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);

        if (rootP == rootQ) {
            return;
        }

        if (size[rootP] > size[rootQ]) {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        } else {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;gp
    }

    public boolean isConnect(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public int count() {
        return this.count;
    }
}
