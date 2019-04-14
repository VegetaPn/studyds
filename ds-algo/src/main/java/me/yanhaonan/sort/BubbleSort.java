package me.yanhaonan.sort;

/**
 * Created on 4/14/19.
 * @author Vegeta
 */
public class BubbleSort extends BaseSort<Integer> implements Sortable<Integer> {

    public void sort(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            boolean fin = true;
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j+1]) {
                    swap(data, j, j+1);
                    fin = false;
                }
            }
            if (fin) {
                break;
            }
        }
    }
}
