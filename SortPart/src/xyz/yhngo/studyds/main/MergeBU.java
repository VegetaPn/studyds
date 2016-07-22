package xyz.yhngo.studyds.main;

/**
 * Created by Vegeta on 7/22/16.
 */
public class MergeBU {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz+sz)
            for (int lo = 0; lo < N-sz; lo += sz+sz)
                Merge.merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
    }
}
