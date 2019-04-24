package me.yanhaonan.search;

/**
 * Desc:
 *
 * ------------------------------------
 *
 * @author yanhaonan@meituan.com
 * @date 2019-04-24 09:39
 */
public class BinarySearch implements SearchAble {

  @Override
  public int search(int[] data, int val) {
    int lo = 0, hi = data.length - 1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (data[mid] == val) {
        return mid;
      } else if (data[mid] < val) {
        lo = mid;
      } else if (data[mid] > val) {
        hi = mid;
      }
    }
    return -1;
  }
}
