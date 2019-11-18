package com.poorak.pie.tree;

import java.util.StringJoiner;

public class PrintTree {
    public static <T> void print(BinaryTree.Node<T> node, int level){
        if(node == null) return ;
        if(level ==0 ) System.out.println(node.getValue());
        level++;
        StringBuilder sb = new StringBuilder();
        //sb.append(" level "+level);
        if(node.getLeft() != null) sb.append("/");
        if(node.getRight() != null) sb.append("\\");
        sb.append(System.lineSeparator());
        if(node.getLeft() != null) sb.append(node.getLeft().getValue() + "("+node.getValue()+ ") ");
        if(node.getRight() != null) sb.append(node.getRight().getValue() + "("+node.getValue()+ ") ");
        if(node.getRight() != null || node.getLeft() != null) System.out.println(sb.toString());
        if(node.getLeft() != null) print(node.getLeft(), level);
        if(node.getRight() != null) print(node.getRight(), level);
    }
}
