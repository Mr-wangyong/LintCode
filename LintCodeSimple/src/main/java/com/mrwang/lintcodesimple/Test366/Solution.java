package com.mrwang.lintcodesimple.Test366;

/**
 * 查找斐波纳契数列中第 N 个数。
 * <p>
 * 所谓的斐波纳契数列是指：
 * <p>
 * 前2个数是 0 和 1 。
 * 第 i 个数是第 i-1 个数和第i-2 个数的和。
 * 斐波纳契数列的前10个数字是：
 * <p>
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * 样例
 * 给定 1，返回 0
 * <p>
 * 给定 2，返回 1
 * <p>
 * 给定 10，返回 34
 *
 * @author chengwangyong
 * @date 2018/2/8
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        long l = System.currentTimeMillis();
        long fibonacci = solution.fibonacci(47);
        long l2 = System.currentTimeMillis();
        System.out.println("fibonacci =" + fibonacci+" 耗时="+(l2-l));
    }

    /*
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public long fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public long fibonacci2(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return  1;
        }
        long numPre = 0;
        long num = 1;
        long temp;
        for (int i = 2; i < n; i++) {
            temp=num;
            num=num+numPre;
            numPre=temp;
        }
        return num;
    }

}
