package me.yanhaonan.sort;

/**
 * Desc:
 * ------------------------------------
 *
 * @author yanhaonan@meituan.com
 * @date 2019-04-17 10:25
 */
public class QuickSort extends BaseSort<Integer> implements Sortable<Integer> {
    @Override
    public void sort(Integer[] data) {
        sort(data, 0, data.length-1);
    }

    private void sort(Integer[] data, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int p = partition(data, lo, hi);
        sort(data, lo, p-1);
        sort(data, p, hi);
    }

    private int partition(Integer[] data, int lo, int hi) {
        int pivot = data[hi];
        int i = lo, j = lo;
        for (; j < hi; j++) {
            if (data[j] < pivot) {
                swap(data, i, j);
                i++;
            }
        }
        swap(data, i, hi);
        return i;
    }
}
