package me.yanhaonan.sort;

/**
 * Created on 4/16/19.
 *
 * @author Vegeta
 */
public class MergeSort extends BaseSort implements Sortable<Integer> {
    public void sort(Integer[] data) {
        sort(data, 0, data.length-1);
    }

    private void sort(Integer[] data, int i, int j) {
        if (i >= j) {
            return;
        }
        sort(data, i, (i + j) / 2);
        sort(data, (i + j) / 2 + 1, j);
        merge(data, i, (i + j) / 2 + 1, j);
    }

    private void merge(Integer[] data, int f, int s, int end) {
        Integer[] tmp = new Integer[end-f+1];
        int i = 0, lo = f, mid = s;
        while (i < tmp.length && f < mid && s <= end) {
            if (data[f] < data[s]) {
                tmp[i] = data[f];
                f++;
            } else {
                tmp[i] = data[s];
                s++;
            }
            i++;
        }

        if (f < mid) {
            while (i < tmp.length) {
                tmp[i] = data[f];
                f++;
                i++;
            }
        }

        if (s <= end) {
            while (i < tmp.length) {
                tmp[i] = data[s];
                s++;
                i++;
            }
        }

        System.arraycopy(tmp, 0, data, lo, tmp.length);
    }
}
