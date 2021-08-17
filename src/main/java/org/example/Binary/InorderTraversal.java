package org.example.Binary;

import java.util.*;

public class InorderTraversal {
//  94. Binary Tree Inorder Traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        setInteger(root, list);
        return list;
    }

    private void setInteger(TreeNode treeNode, List list){
        if (treeNode != null){
            setInteger(treeNode.left, list);
            list.add(treeNode.val);
            setInteger(treeNode.right, list);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

