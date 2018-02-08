package com.mrwang.lintcodesimple.Test452;

import com.mrwang.lintcodesimple.Test466.ListNode;

/**
 * 删除链表中等于给定值val的所有节点。
 * 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5
 *
 * @author chengwangyong
 * @date 2018/2/7
 */
public class Solution {

    public static void main(String args[]) {
        Solution solution = new Solution();
        ListNode node = getListNode2();

        ListNode resultNode = solution.removeElements(node, 1);
        solution.foreachPrint(resultNode);
    }

    private static ListNode getListNode() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next.next = new ListNode(3);
        return node;
    }

    private static ListNode getListNode2() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        return node;
    }

    // 思路 先find到 然后去查找前面的节点 和后面的节点
    public ListNode removeElements(ListNode head, int val) {
        ListNode currentNode = head;
        ListNode preNode = null;
        while (currentNode != null) {
            if (currentNode.val == val) {
                if (preNode != null) {
                    preNode.next = currentNode.next;
                } else {
                    head = currentNode.next;
                }
                ListNode next = currentNode.next;
                currentNode.next = null;
                currentNode = next;
            } else {
                preNode = currentNode;
                currentNode = currentNode.next;
            }

        }
        return head;
    }

    public void foreachPrint(ListNode head) {
        if (head != null) {
            System.out.println("->" + head.val);
            foreachPrint(head.next);
        }
    }
}
