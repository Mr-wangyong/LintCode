package com.mrwang.lintcodesimple.Test463;

/**
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 * 样例 对于数组 [3, 2, 1, 4, 5], 排序后为：[1, 2, 3, 4, 5]。
 *
 * @author chengwangyong
 * @date 2018/2/5
 */
public class Solution {

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4, 5};
        sortIntegers(a);
        System.out.println("a="+ a);
    }

    //写个冒泡吧
    public static void sortIntegers(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    swap(A, i, j);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
