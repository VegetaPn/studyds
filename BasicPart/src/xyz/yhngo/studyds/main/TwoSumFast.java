package xyz.yhngo.studyds.main;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import xyz.yhngo.studyds.main.BinarySearch;

/**
 * Created by Vegeta on 7/20/16.
 */
public class TwoSumFast {

    public static int count(int[] a) {
        int counter = 0;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            int pos = BinarySearch.rank((0 - a[i]), a);
            if (pos > i) counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
