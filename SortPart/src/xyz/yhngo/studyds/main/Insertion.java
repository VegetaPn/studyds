package xyz.yhngo.studyds.main;

/**
 * Created by Vegeta on 7/21/16.
 */
public class Insertion {
    public static void sort(Comparable a[]) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && Example.less(a[j], a[j-1]); j--) Example.exch(a, j, j-1);
        }
    }
}