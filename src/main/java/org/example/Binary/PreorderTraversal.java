package org.example.Binary;
import java.util.*;
public class PreorderTraversal {
//  144. Binary Tree Preorder Traversal
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        setInteger(root, list);
        return list;
    }

    private void setInteger(TreeNode treeNode, List list){
        if (treeNode != null){
            list.add(treeNode.val);
            setInteger(treeNode.left, list);
            setInteger(treeNode.right, list);
        }
    }
}

