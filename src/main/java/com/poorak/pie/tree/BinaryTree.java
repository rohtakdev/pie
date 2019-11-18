package com.poorak.pie.tree;

public interface BinaryTree<T> {
    interface Node<T>{
        Node<T> getLeft();
        Node<T> getRight();
        T getValue();
        MutableNode<T> getMutable();
    }

    interface MutableNode<T> {
        MutableNode<T> setLeft(Node<T> left);
        MutableNode<T> setRight(Node<T> right);
        MutableNode<T> setValue(T value);
        Node<T> build();
    }

    Boolean exists(T value);
    Boolean r_exists(Node<T> root, T value);
}
