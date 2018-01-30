package com.mrwang.lintcodesimple.Test466;

/**
 * 计算链表中有多少个节点.
 * 样例
 * 给出 1->3->5, 返回 3
 *
 * @author chengwangyong
 * @date 2018/1/30
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("count ddddd");
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(5);
        System.out.println("count=" + countNodes(node));
    }

    /*
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public static int countNodes(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}


