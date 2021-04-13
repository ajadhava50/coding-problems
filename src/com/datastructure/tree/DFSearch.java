package com.datastructure.tree;

public class DFSearch {



    private static void preOrder(Node root) {
        if ( root == null ) return;
        System.out.print(root.data + "->");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Node root) {
        if ( root == null )
            return;
        inOrder(root.left);
        System.out.print(root.data + "->");
        inOrder(root.right);

    }

    private static void postOrder(Node root) {
        if ( root == null ) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "->");


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
       Node root5 = new Node(10);
        Node root6 = new Node(8);
        root2.left = root5;
        root3.right = root6;
        System.out.println("PRE-ORDER\n");
        preOrder(root);
        System.out.println("\n IN-ORDER\n");
        inOrder(root);
        System.out.println("\n POST-ORDER\n");
        postOrder(root);

    }


}
