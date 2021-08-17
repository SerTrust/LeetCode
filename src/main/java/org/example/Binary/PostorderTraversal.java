package org.example.Binary;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
//  145. Binary Tree Postorder Traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        setInteger(root, list);
        return list;
    }

    private void setInteger(TreeNode treeNode, List list) {
        if (treeNode != null) {
            setInteger(treeNode.left, list);
            setInteger(treeNode.right, list);
            list.add(treeNode.val);
        }
    }
}
