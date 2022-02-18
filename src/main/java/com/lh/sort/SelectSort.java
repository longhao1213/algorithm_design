package com.lh.sort;

/**
 * @author longhao
 * @since 2022/2/18
 */
public class SelectSort {

    /**
     * 选择排序
     * 每一次循环都找出其中最小的值 ，然后把值放在数组的开头，再循环找剩下值最小的
     */

    public static void main(String[] args) {
        int[] array = {2, 4, 15, 3, 6, 236, 7, 4};
        System.out.println(selectSort(array).toString());
        System.out.println(" ");
    }

    private static int[] selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (min > array[j]) {
                    int temp = array[j];
                    array[j] = min;
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
