package me.yanhaonan.sort;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

/**
 * Created on 4/14/19.
 *
 * @author Vegeta
 */
public class BubbleSortTest {
    private Sortable<Integer> sortable = new BubbleSort();

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {

    }

    @DataProvider(name = "forSort")
    public static Object[][] forSort() {
        return new Object[][] {
                {new Integer[] {1, 2, 3, 6, 5, 4}, new Integer[] {1, 2, 3, 4, 5, 6}},
                {new Integer[] {3, 5, 4, 1, 2, 6}, new Integer[] {1, 2, 3, 4, 5, 6}}
        };
    }

    @org.testng.annotations.Test(dataProvider = "forSort")
    public void testSort(Integer[] data, Integer[] expected) throws Exception {
        Integer[] sorted = sortable.sort(data);
        Assert.assertEquals(sorted, expected);
    }

    @DataProvider(name = "forSwap")
    public static Object[][] forSwap() {
        return new Object[][] {
                {new Integer[] {1, 2, 3, 4}, 1, 2, new Integer[] {1, 3, 2, 4}}
        };
    }

    @org.testng.annotations.Test(dataProvider = "forSwap")
    public void testSwap(Integer[] data, int i, int j, Integer[] expected) throws Exception {
        new BaseSort<Integer>() {}.swap(data, i, j);
        Assert.assertEquals(data, expected);
    }

}