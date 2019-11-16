package com.poorak.pie.tree;

public class PreOrder {
    public void print(BinaryTree.Node<Integer> node){
        if(node == null) return;
        System.out.println(node);
        if(node.getLeft() != null) print(node.getLeft());
        if(node.getRight() != null) print(node.getRight());
    }
}
