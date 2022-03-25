package com.lh.sort;

import java.util.Arrays;

/**
 * @author longhao
 * @since 2022/3/25
 */
public class QuickSort {

    /**
     * 快速排序
     *
     * 1：首选选取第一个元素，把比这个元素大的值，放在右边，比这个元素小的值，放在左边
     * 2：此时数组被分为两个部分，然后，分别取这两部分的数组，再重复1的步骤，直到两边只剩下一个元素为止
     *
     * @param array
     * @param left
     * @param right
     * @return
     */
    public int[] quickSort(int[] array, int left, int right) {
        // 至少要有两个元素
        if (left < right) {
            int mid = partition(array, left, right);
            quickSort(array, left, mid - 1);
            quickSort(array, mid + 1, right);
        }
        return array;
    }

    /**
     * 归位方法
     *
     * 1：先取最最左边的数，放到一个中间值上面
     * 2：从右边开始循环，找到一个比中间值小的数，把他放在left上面
     * 3：然后从左边开始循环，找到一个比中间值大的数，放在right上面
     * 4：循环2，3步骤，直到 left>=right,
     * @param array
     * @param left
     * @param right
     * @return 中间值
     */
    public int partition(int[] array, int left, int right) {
        int temp = array[left];
        // left必须小于right，才能继续循环
        while (left < right) {
            // 从右边开始循环，找到比temp小的数,假设在循环的过程中 right 和left进行了碰撞，那么就不需要再进行了
            while (array[right] >= temp && right > left) {
                right--;
            }
            // 循环一圈后，把右边那个数，放在左边在
            array[left] = array[right];
            // 再从左边循环，找到把temp大的数,假设在循环的过程中 right 和left进行了碰撞，那么就不需要再进行了
            while (array[left] <= temp && right > left) {
                left++;
            }
            array[right] = array[left];
        }
        // 在跑完上面的循环后，left和right碰撞在一起，此时把temp的值，放在中间
        array[left] = temp;
        return left;
    }


    public static void main(String[] args) {
        int[] array = {4,2,6,8,3,6};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
        Arrays.asList(array).forEach(System.out::print);

    }
}
