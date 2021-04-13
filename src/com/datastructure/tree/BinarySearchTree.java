package com.datastructure.tree;


/*
 verify whether a given binary tree is binary search tree or not.
  */
public class BinarySearchTree {
    static int prevdata = 0;
    static boolean isBst = false;
    public static boolean isBstUtil(Node root, int min, int max) {
        if ( root == null ) return true;
        if ( root.data > min && root.data < max
                && isBstUtil(root.left, min, root.data)
                && isBstUtil(root.right, root.data, max) )
            return true;
        else
            return false;
    }

    public static boolean isBinarySearchTree(Node root) {
        return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static void isBSTWithInOrder(Node root) {
        if ( root==null ) {
            return;
        }

        isBSTWithInOrder(root.left);

        System.out.print(root.data+"->");
        if(prevdata < root.data) {
            isBst = true;
            prevdata = root.data;
        }
        else {
            isBst = false;
           return;
        }
        isBSTWithInOrder(root.right);

    }

    public static void main(String[] args) {


        Node root = new Node(7);

        Node root1 = new Node(4);
        Node root2 = new Node(9);
        root.left = root1;
        root.right = root2;
        Node root3 = new Node(2);
        Node root4 = new Node(6);
        root1.left = root3;
        root1.right = root4;
         /*Node root5 = new Node(7);
         Node root6 = new Node(8);
         root2.left = root5;
         root3.right = root6;*/
        if ( isBinarySearchTree(root) )
            System.out.println(" Given Tree is BinarySearchTree");
        else
            System.out.println(" Given Tree is Not BinarySearchTree");
        isBSTWithInOrder(root);
        if (isBst)
            System.out.println(" Given Tree is BinarySearchTree");
        else
            System.out.println(" Given Tree is Not BinarySearchTree");

    }
}
