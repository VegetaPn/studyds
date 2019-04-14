package me.yanhaonan.sort;

/**
 * Created on 4/14/19.
 *
 * @author Vegeta
 */
abstract class BaseSort<T> {
   public void swap(T[] data, int i, int j) {
      T tmp = data[i];
      data[i] = data[j];
      data[j] = tmp;
   }
}
