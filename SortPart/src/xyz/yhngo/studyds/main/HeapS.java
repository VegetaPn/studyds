package xyz.yhngo.studyds.main;

/**
 * Created by Vegeta on 7/22/16.
 */
public class HeapS {
    public static void sort(Comparable[] a) {
        int N = a.length;
        Comparable[] aux = new Comparable[N+1];
        for (int i = 0; i < N; i++) {
            aux[i+1] = a[i];
        }

        for (int k = N/2; k >= 1; k--)
            sink(aux, k, N);
        while (N > 1) {
            Example.exch(aux, 1, N--);
            sink(aux, 1, N);
        }

        for (int i = 0; i < a.length; i++)
            a[i] = aux[i+1];
    }

    private static void sink(Comparable[]a, int k, int N) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && Example.less(a[j], a[j+1]))
                j++;
            if (!Example.less(a[k], a[j]))
                break;
            Example.exch(a, k, j);
            k = j;
        }
    }
}
