package com.poorak.pie.tree;

public class TreeHeight {
    public int getHeight(BinaryTree.Node<Integer> node){
        if(node == null) return 0;
        else return 1 + Math.max(   getHeight(node.getLeft()),
                                    getHeight(node.getRight()));
    }
}
