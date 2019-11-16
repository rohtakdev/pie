package com.poorak.pie.tree;

public class BinaryTreeImpl implements BinaryTree<Integer> {
    private final Node<Integer> root;

    public BinaryTreeImpl(Node<Integer> root) {
        if (root == null) throw new IllegalArgumentException("root node can't be null");
        this.root = root;
    }

    @Override
    public Boolean exists(Integer value) {
        if (value != null) {
            Node<Integer> curr = root;
            while (curr != null) {
                Integer curVal = curr.getValue();
                if (curVal == value) return true;
                if (value > curVal) curr = curr.getRight();
                if (value < curVal) curr = curr.getLeft();
            }
        }

        return false;
    }

    @Override
    public Boolean r_exists(Node<Integer> root, Integer value) {
        if (value == null || root == null) return false;
        Integer curVal = root.getValue();
        if (curVal == value) return true;
        if (value > curVal) return r_exists(root.getRight(), value);
        else return r_exists(root.getLeft(), value);
    }

}
