package com.poorak.pie.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.poorak.pie.tree.TreeProvider.create;
import static org.junit.jupiter.api.Assertions.*;

class BST_To_HeapTest {
    private  BST_To_Heap bst_to_heap ;

    @BeforeEach
    void setUp() {
        bst_to_heap = new BST_To_Heap();
    }

    @Test
    void heap() {
        BinaryTree.Node<Integer> root = createunOrderedTree() ;
        PrintTree.print(root, 0);
        System.out.println("========");
        PrintTree.print(bst_to_heap.heap(root), 0);

    }

    private BinaryTree.Node<Integer> createunOrderedTree() {
        return new NodeImpl(
                create(25, 50, 20), // left
                new NodeImpl( // right
                        create(12, 9, null),
                        create(45),
                        3),
                2); // value
    }



}