package com.poorak.pie.tree;

public class TreeProvider {
    public static BinaryTree.Node<Integer> createTree() {
        BinaryTree.Node<Integer> left = new NodeImpl(null, null, 50);
        BinaryTree.Node<Integer> right = new NodeImpl(null, null, 70);
        BinaryTree.Node<Integer> root = new NodeImpl(left, right, 60);
        return root;
    }
}
