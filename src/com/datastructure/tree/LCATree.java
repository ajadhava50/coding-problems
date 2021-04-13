package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LCATree {

    Node root;

    class Node{
         int data;
         Node left,right;

        public Node(int data) {
            this.data = data;
            this.left=this.right=null;
        }
    }

    public Node add(Node root,int value) {

        if (root == null)
            root = new Node(value);
        else if(value <= root.data)
            root.left = add(root.left,value);
        else if(value >= root.data)
            root.right = add(root.right,value);

        return root;
    }
   public void preOrder(Node root){

        if (root==null)
            return;
       preOrder(root.left);
       System.out.print(root.data+"->");
       preOrder(root.right);
    }

    public void levelOrder(){

        Node temp = root;
        Queue<Node> queue = new LinkedList();
        queue.add(temp);
        while(!queue.isEmpty()){
            temp = queue.remove();
            System.out.print(temp.data+"->");
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
    }

    public static void main(String[] args) {

        LCATree tree = new LCATree();

        tree.root = tree.add(tree.root, 6);
        tree.root = tree.add(tree.root, 7);
        tree.root = tree.add(tree.root, 8);
        tree.root = tree.add(tree.root, 9);
        tree.root = tree.add(tree.root, 10);
        tree.root = tree.add(tree.root, 11);
        tree.root = tree.add(tree.root, 12);
        tree.levelOrder();
        System.out.println("");
        tree.preOrder(tree.root);

    }
}
