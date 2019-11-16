package com.poorak.pie.tree;

public interface BinaryTree<T> {
    interface Node<T>{
        Node<T> getLeft();
        Node<T> getRight();
        T getValue();
    }

    Boolean exists(T value);
    Boolean r_exists(Node<T> root, T value);
}
