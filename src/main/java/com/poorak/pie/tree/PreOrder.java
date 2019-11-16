package com.poorak.pie.tree;

import java.util.Stack;

public class PreOrder {
    public void print_r(BinaryTree.Node<Integer> node){
        if(node == null) return;
        System.out.println(node);
        if(node.getLeft() != null) print_r(node.getLeft());
        if(node.getRight() != null) print_r(node.getRight());
    }

    public void print(BinaryTree.Node<Integer> node){
        if(node == null) return;
        BinaryTree.Node<Integer> curr ;
        final Stack<BinaryTree.Node> stack = new Stack<>();
        stack.push(node);
        while(stack.size() > 0){
            curr = stack.pop();
            System.out.println(curr);

            if(curr.getRight() != null){
                stack.push(curr.getRight());
            }

            if(curr.getLeft() != null) {
                stack.push(curr.getLeft());
            }

        }
    }
}
