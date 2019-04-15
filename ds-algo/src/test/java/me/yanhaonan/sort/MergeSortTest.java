package me.yanhaonan.sort;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

import static org.testng.Assert.*;

/**
 * Created on 4/16/19.
 *
 * @author Vegeta
 */
public class MergeSortTest extends BaseTest {
    private Sortable<Integer> sortable = new MergeSort();

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @Test(dataProvider = "forSort")
    public void testSort(Integer[] data, Integer[] expect) throws Exception {
        sortable.sort(data);
        Assert.assertEquals(data, expect);
    }
}