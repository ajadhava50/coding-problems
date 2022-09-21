package com.datastructure.tree;

import java.util.ArrayList;

public class LeftView {
    ArrayList<Integer> result = new ArrayList<>();
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        if(root==null)return result;
        // Your code here
        leftViewUtil(root,0);
        return result;
    }
    public void leftViewUtil(Node root, int level){
        if(root==null) return;
        if(result.size()==level){
            result.add(root.data);
        }
        leftViewUtil(root.left,level+1);
        leftViewUtil(root.right,level+1);
    }
}
