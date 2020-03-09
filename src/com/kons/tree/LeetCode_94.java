package com.kons.tree;

import com.kons.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_94 {
    class Solution {
        private List<Integer> list=new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            method(root);
            return list;
        }

        private void method(TreeNode root){
            if(root==null) return ;

            method(root.left);
            list.add(root.val);
            method(root.right);
        }
    }
}
