package Solutions.week19.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal_Zehra(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        list.addAll(inorderTraversal_Zehra(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal_Zehra(root.right));
        return list;
    }
}
/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
