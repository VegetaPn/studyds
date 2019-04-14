package me.yanhaonan.sort;

/**
 * Created on 4/15/19.
 *
 * @author Vegeta
 */
public class InsertSort extends BaseSort<Integer> implements Sortable<Integer> {
    public void sort(Integer[] data) {
        if (data.length <= 1) {
            return;
        }

        for (int i = 1; i < data.length; i++) {
            int val = data[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (data[j] > val) {
                    data[j+1] = data[j];
                } else {
                    break;
                }
            }
            data[j+1] = val;
        }
    }
}
