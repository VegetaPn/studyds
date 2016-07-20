package xyz.yhngo.studyds.main;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by Vegeta on 7/20/16.
 */
public class ThreeSumFast {
    public static int count(int[] a) {
        int counter = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int pos = BinarySearch.rank((0 - (a[i] + a[j])), a);
                if (pos > j) counter++;
            }
        }
        return counter;
    }

    public static void main(String args[]) {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
