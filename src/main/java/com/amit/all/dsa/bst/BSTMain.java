package com.amit.all.dsa.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTMain {

    public static void main(String[] args) {
        Integer[] input = {5, 3, 6, 2, 4, null, 7};
        int key = 0;
        TreeNode root = buildTree(input);
        System.out.println(root);
        System.out.println(printLevelOrder(root));

        Solution s = new Solution();

        s.deleteNode(root, key);
        System.out.println(printLevelOrder(root));

    }

    public static List<Integer> printLevelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                result.add(null);
                continue;
            }

            result.add(node.val);
            queue.offer(node.left);
            queue.offer(node.right);
        }

        // Remove trailing nulls
        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i);
            i--;
        }

        return result;
    }

    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;

        while (i < arr.length) {
            TreeNode current = queue.poll();

            // left child
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            // right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

}

class Solution {
    boolean isLeft = false;

    public TreeNode deleteNode(TreeNode root, int key) {
        /*  1.Search the node and parent node
            2. whether the node is left or right to the parent node
            3. if node has only one child then just replace the parents matched child to this
            4. if it has both children, then we will make mathced nodes left to the right node left
                 and the matched node right node to the end of the left nodes right
        */
        if (root == null) return root;

        SearchData data = new SearchData(new TreeNode(-1, root, null), root, false);
        search(data, key);
        TreeNode parent = data.parent;
        TreeNode curr = data.curr;

        if(curr == null) return root;

        if (curr.left != null && curr.right != null) {
            if (isLeft) {
                parent.left = curr.left;
                TreeNode maxNode = maxNode(curr.left);
                maxNode.right = curr.right;
            } else {

            }
        }

        return root;

    }

    private TreeNode maxNode(TreeNode root) {
        if (root == null) return null;

        if (root.right != null) {
            return maxNode(root.right);
        }
        return root;
    }

    private void search(SearchData data, int key) {
        if (data.curr == null)
            return;

        if (data.curr.val == key)
            return;

        if (key <= data.curr.val) {
            data.parent = data.curr;
            data.curr = data.curr.left;
            data.isLeft = true;
            search(data, key);
            isLeft = true;
        } else {
            data.parent = data.curr;
            data.curr = data.curr.right;
            data.isLeft = false;
            search(data, key);
            isLeft = false;
        }
    }
}

class SearchData {
    TreeNode parent;
    TreeNode curr;
    boolean isLeft;

    public SearchData(TreeNode parent, TreeNode curr, boolean isLeft) {
        this.parent = parent;
        this.curr = curr;
        this.isLeft = isLeft;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
