package me.yanhaonan.sort;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

/**
 * Created on 4/15/19.
 *
 * @author Vegeta
 */
@org.testng.annotations.Test
public class BaseTest {
    @DataProvider(name = "forSort")
    public static Object[][] forSort() {
        return new Object[][] {
                {new Integer[] {1, 2, 3, 6, 5, 4}, new Integer[] {1, 2, 3, 4, 5, 6}},
                {new Integer[] {3, 5, 4, 1, 2, 6}, new Integer[] {1, 2, 3, 4, 5, 6}}
        };
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
