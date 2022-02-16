package com.lh.hanoi;

/**
 * @author longhao
 * @since 2022/2/16
 */
public class Hanoi {

    /**
     * 通过把n 看做 2 和 3 我们可以发现规律 见图
     * 当有n个盘子的时候 ，我们可以把最下面的盘子看做n 上面的所有盘子 看做一个整体 意为n-1
     *
     * @param args
     */

    public static void main(String[] args) {
        hanoi(3, "a", "b", "c");
    }

    private static void hanoi(int n, String a, String b, String c) {
        if (n > 0) {
            // 第一次 把a经过c移动到b
            hanoi(n - 1, a, c, b);
            // 第二次 把a移动到c
            System.out.println(a+"-->"+c);
            // 第三次 把b经过a移动到c
            hanoi(n - 1, b, a, c);
        }

    }
}
