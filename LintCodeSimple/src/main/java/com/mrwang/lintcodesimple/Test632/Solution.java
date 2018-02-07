package com.mrwang.lintcodesimple.Test632;


/**
 * * 在二叉树中寻找值最大的节点并返回。
 * 样例
 * 给出如下一棵二叉树：
 * <p>
 * 1
 * /    \
 * -5      2
 * / \    /  \
 * 0  3  -4  -5
 * 返回值为 3 的节点。
 *
 * @author chengwangyong
 * @date 2018/1/30
 */
public class Solution {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(-5);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(0);
        node.left.right = new TreeNode(3);
        node.right.left = new TreeNode(-4);
        node.right.right = new TreeNode(-5);
        maxNode = node;
        System.out.println("maxNode=" + maxNode(node).val);
    }

//    public static int maxNode(TreeNode node) {
//        return findMax(node, 1);
//    }

    public static int findMax(TreeNode root, int maxNode) {
        int localMaxNode = 0;
        if (root.left != null) {
            localMaxNode++;
        }
        if (root.right != null) {
            localMaxNode++;
        }
        if (localMaxNode > maxNode) {
            maxNode = localMaxNode;
        }
        if (root.left != null) {
            findMax(root.left, maxNode);
        }
        if (root.right != null) {
            findMax(root.right, maxNode);
        }
        if (root.left == null && root.right == null) {
            return maxNode;
        }
        return localMaxNode;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);
        return left > right ? left : right;
    }


    private static TreeNode maxNode;

    public static TreeNode maxNode(TreeNode root) {
        if (root == null) {
            return root;
        }
        maxNode = maxNode.val > root.val ? maxNode : root;
        maxNode(root.left);
        System.out.println("maxNode = " + maxNode.val + " root=" + root.val);
        maxNode(root.right);
        return maxNode;
    }


}
