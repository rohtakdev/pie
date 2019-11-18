package com.poorak.pie.tree;

public class BalancedSearchTree {

    public BinaryTree.Node<Integer> balance(BinaryTree.Node<Integer> root){
        if(root == null) return null;
        int rightH = height(root.getRight());
        int leftH =  height(root.getLeft());
        if(leftH == rightH) return root;
        if(leftH > rightH) return balance(rotateRight(root));
        else return balance(rotateLeft(root));
    }

    private BinaryTree.Node<Integer> rotateLeft(BinaryTree.Node<Integer> root) {
        BinaryTree.Node newRoot = root.getRight();
        root = root.getMutable().setRight(newRoot.getLeft()).build();
        newRoot = newRoot.getMutable().setLeft(root).build();
        return newRoot;
    }

    public BinaryTree.Node<Integer> rotateRight(BinaryTree.Node<Integer> root){
        BinaryTree.Node newRoot = root.getLeft();
        root = root.getMutable().setLeft(newRoot.getRight()).build();
        newRoot = newRoot.getMutable().setRight(root).build();
        return newRoot;
    }

    public int height(BinaryTree.Node<Integer> root){
       return new TreeHeight().getHeight(root.getRight());
    }


}
