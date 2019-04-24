package me.yanhaonan.search;

/**
 * Desc:
 *
 * ------------------------------------
 *
 * @author yanhaonan@meituan.com
 * @date 2019-04-24 10:11
 */
public class BinarySearchFirstFind extends BinarySearch {

  @Override
  public int search(int[] data, int val) {
    int lo = 0, hi = data.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (data[mid] < val) {
        lo = mid + 1;
      } else if (data[mid] > val) {
        hi = mid - 1;
      } else {
        if (mid == 0 || data[mid-1] != val) {
          return mid;
        } else {
          hi = mid - 1;
        }
      }
    }
    return -1;
  }
}
