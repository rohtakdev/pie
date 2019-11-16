package com.poorak.pie.tree;

public class CommonAncestor {

    public BinaryTree.Node<Integer> find_r(BinaryTree.Node<Integer> root, BinaryTree.Node<Integer> first, BinaryTree.Node<Integer> second){
        if(first == null || second == null ||
                first.getValue() == null || second.getValue() == null) return null;
        if(root == null) return null;
        if(first.getValue() > root.getValue() && second.getValue() > root.getValue()){
            return find(root.getRight(), first, second);
        }

        if(first.getValue() < root.getValue() && second.getValue() < root.getValue()){
            return find(root.getLeft(), first, second);
        }

        return root;
    }

    public BinaryTree.Node<Integer> find(BinaryTree.Node<Integer> root, BinaryTree.Node<Integer> first, BinaryTree.Node<Integer> second){
        if(first == null || second == null ||
                first.getValue() == null || second.getValue() == null) return null;
        if(root == null) return null;
        while(root != null){
            if(first.getValue() > root.getValue() && second.getValue() > root.getValue()){
                root = root.getRight();
            } else if(first.getValue() < root.getValue() && second.getValue() < root.getValue()){
                root = root.getLeft();
            } else return root;
        }
        return null;
    }
}
