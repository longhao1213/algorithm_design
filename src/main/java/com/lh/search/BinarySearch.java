package com.lh.search;

/**
 * @author longhao
 * @since 2022/2/16
 */
public class BinarySearch {

    /**
     * 二分查找法
     * 前提是数组有序
     * 定义一个left right mid 分别代表 左 右 中间
     * left 不能大于right
     */

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(array, 4));
    }

    private static Object search(int[] array,int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return array[mid];
            } else if (array[mid] > target) {
                // 中间的值比目标大 那么移动right 到 mid - 1
                right = mid - 1;
            } else {
                // 中间的值比目标值小 那么移动left 到 mid + 1
                left = mid + 1;

            }
        }
        return null;
    }

}
