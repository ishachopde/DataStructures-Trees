package com.datastructures.Trees;

class Node {

    int data;
    Node left, right;

    public Node(int data) {
        data = data;
        left = right = null;
    }
}

public class BinaryTree {



    Node root;



    BinaryTree(int value){
        root  = new Node(value);
    }

    BinaryTree(){
        root = null;
    }

    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(4);
        bt.root.left = new Node(2);
        bt.root.right = new Node(6);
        System.out.println(bt.root.data);
        System.out.println(bt.root.left.data);
        System.out.println(bt.root.right.data);

}
}
