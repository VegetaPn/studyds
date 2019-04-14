package me.yanhaonan.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created on 4/15/19.
 *
 * @author Vegeta
 */
public class InsertSortTest extends BaseTest {
    private Sortable<Integer> sortable = new InsertSort();

    @Test(dataProvider = "forSort")
    public void testSort(Integer[] data, Integer[] expected) throws Exception {
        sortable.sort(data);
        Assert.assertEquals(data, expected);
    }
}