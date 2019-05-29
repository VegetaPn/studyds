package me.yanhaonan.search;

import static org.testng.Assert.*;

import me.yanhaonan.sort.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Desc:
 *
 * ------------------------------------
 *
 * @author yanhaonan@meituan.com
 * @date 2019-04-24 10:28
 */
public class BinarySearchLastSmallerOrEqSearchTest extends BaseTest {
  private SearchAble searchAble = new BinarySearchLastSmallerOrEqSearch();

  @Test(dataProvider = "forSearch")
  public void testSearch(int[] data, int val, int expect) {
    int actual = searchAble.search(data, val);
    Assert.assertEquals(actual, expect);
  }
}