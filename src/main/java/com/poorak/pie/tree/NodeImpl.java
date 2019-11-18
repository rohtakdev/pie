package com.poorak.pie.tree;

import java.util.StringJoiner;

public class NodeImpl implements BinaryTree.Node<Integer> {
    private final BinaryTree.Node<Integer> left;
    private final BinaryTree.Node<Integer> right;
    private final Integer value;

    public NodeImpl(BinaryTree.Node<Integer> left, BinaryTree.Node<Integer> right, Integer value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", NodeImpl.class.getSimpleName() + "[", "]")
                .add("value=" + value)
                .toString();
    }

    @Override
    public BinaryTree.Node<Integer> getLeft() {
        return left;
    }

    @Override
    public BinaryTree.Node<Integer> getRight() {
        return right;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public BinaryTree.MutableNode<Integer> getMutable() {
        return new MutableNodeImpl(this);
    }
}
