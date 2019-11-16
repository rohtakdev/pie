package com.poorak.pie.tree;

public class TreeProvider {
    public static BinaryTree.Node<Integer> createTree() {
        BinaryTree.Node<Integer> left = new NodeImpl(null, null, 50);
        BinaryTree.Node<Integer> right = new NodeImpl(null, null, 70);
        BinaryTree.Node<Integer> root = new NodeImpl(left, right, 60);
        return root;
    }

    public static BinaryTree.Node<Integer> create(final Integer rootValue, final Integer leftVal, final Integer rightVal) {
        BinaryTree.Node<Integer> right = null;
        BinaryTree.Node<Integer> left = null;

        if(rightVal != null) right = new NodeImpl(null, null, rightVal);
        if(leftVal != null) left = new NodeImpl(null, null, leftVal);
        return new NodeImpl(left, right, rootValue);
    }

    public static BinaryTree.Node<Integer> create(Integer val) {
        return new NodeImpl(null, null, val);
    }

    public static BinaryTree.Node<Integer> create6_6() {
        return new NodeImpl(
                create(50, 25, 75), // left
                new NodeImpl( // right
                        create(125, 110, null),
                        create(175),
                        150),
                100); // value
    }
}
