package me.yanhaonan.sort;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

/**
 * Created on 4/14/19.
 *
 * @author Vegeta
 */
public class BubbleSortTest extends BaseTest {
    private Sortable<Integer> sortable = new BubbleSort();

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {

    }

    @org.testng.annotations.Test(dataProvider = "forSort")
    public void testSort(Integer[] data, Integer[] expected) throws Exception {
        sortable.sort(data);
        Assert.assertEquals(data, expected);
    }
}