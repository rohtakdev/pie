package com.poorak.pie.tree;

import com.poorak.pie.tree.BinaryTree.MutableNode;

public class MutableNodeImpl implements MutableNode<Integer> {
    private BinaryTree.Node<Integer> left;
    private BinaryTree.Node<Integer> right;
    private Integer value;

    public MutableNodeImpl(BinaryTree.Node<Integer> node) {
        this.value = node.getValue();
        this.left = node.getLeft();
        this.right = node.getRight();
    }

    @Override
    public MutableNode<Integer> setLeft(BinaryTree.Node<Integer> left) {
        this.left = left;
        return this;
    }

    @Override
    public MutableNode<Integer> setRight(BinaryTree.Node<Integer> right) {
        this.right = right;
        return this;
    }

    @Override
    public MutableNode<Integer> setValue(Integer value) {
        this.value = value;
        return this;
    }

    @Override
    public BinaryTree.Node<Integer> build() {
        return new NodeImpl(left, right, value);
    }
}
