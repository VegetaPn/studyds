package xyz.yhngo.studyds.main;

/**
 * Created by Vegeta on 7/21/16.
 */
public class Shell {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3) h = 3*h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && Example.less(a[j], a[j-h]); j -= h)
                    Example.exch(a, j, j-h);
            }
            h = h / 3;
        }
    }
}
