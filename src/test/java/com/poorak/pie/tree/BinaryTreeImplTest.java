package com.poorak.pie.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeImplTest {
    private BinaryTree<Integer> binaryTree;
    private BinaryTree.Node<Integer> root;

    @BeforeEach
    void setUp() {
        root = createTree();
        binaryTree = new BinaryTreeImpl(root);
    }

    private BinaryTree.Node<Integer> createTree() {
        BinaryTree.Node<Integer> left = new NodeImpl(null, null, 50);
        BinaryTree.Node<Integer> right = new NodeImpl(null, null, 70);
        BinaryTree.Node<Integer> root = new NodeImpl(left, right, 60);
        return root;
    }

    @Test
    void exists() {
        // case 1 - positive numbers
        assertTrue(binaryTree.exists(50));
        assertEquals(binaryTree.exists(50), binaryTree.r_exists(root, 50));
        // csse 2 neg
        // case 3 nulls
        // case 4 unbalanced tree
    }
}