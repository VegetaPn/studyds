package xyz.yhngo.studyds.main;

/**
 * Created by Vegeta on 7/21/16.
 */
public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (Example.less(a[j], a[min])) min = j;
            }
            Example.exch(a, i, min);
        }
    }
}
