package me.yanhaonan.sort;

import org.testng.Assert;

import static org.testng.Assert.*;

/**
 * Desc:
 * ------------------------------------
 *
 * @author yanhaonan@meituan.com
 * @date 2019-04-17 10:35
 */
public class QuickSortTest extends BaseTest {
    private Sortable<Integer> sortable = new QuickSort();

    @org.testng.annotations.Test(dataProvider = "forSort")
    public void testSort(Integer[] data, Integer[] expect) {
        sortable.sort(data);
        Assert.assertEquals(data, expect);
    }
}