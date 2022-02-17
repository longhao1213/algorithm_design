package com.lh.sort;

/**
 * @author longhao
 * @since 2022/2/17
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {3, 21, 45, 14, 53,2,4,56,4};
        System.out.println(sort(array));
        System.out.println("");
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
