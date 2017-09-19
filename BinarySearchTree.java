package com.datastructures.Trees;



public class BinarySearchTree {

    static Node root;
    Node createBST(int array[], int start, int end){
        System.out.println("binary search tree");
        int midpoint = (start+end)/2;
        Node root = new Node(array[midpoint]);
        //System.out.println(root.data);
        root.left = createBST(array,0,midpoint-1);
        root.right = createBST(array,midpoint+1, end);

        //System.out.println("Root "+root.data+"Left "+root.left.data+"Right "+root.right.data);

        return root;
    }

    void inorder(Node node){
        inorder(node.left);
        System.out.println(node.data+" ");

        inorder(node.right);
    }


    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree();
         int array[] = new int[]{2,4,6,7,8,11,13,16,18,21};
           int n = array.length;
        root = bst.createBST(array,0,n-1);
        bst.inorder(root);
    }
}
