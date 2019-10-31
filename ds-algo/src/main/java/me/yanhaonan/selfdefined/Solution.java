package me.yanhaonan.selfdefined;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Desc:
 * <p>
 * ------------------------------------
 *
 * @author yanhaonan@meituan.com
 * @date 2019-10-30 17:26
 */
public class Solution {
    public String printMinNumber(int [] numbers) {
        if (null == numbers || numbers.length == 0) {
            return "";
        }
        return Arrays.stream(numbers)
                .boxed()
                .sorted(new MyComparator())
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            String s1 = String.valueOf(o1) + o2;
            String s2 = String.valueOf(o2) + o1;
            return s1.compareTo(s2);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 32, 321};
        System.out.println(new Solution().printMinNumber(nums));
    }
}
