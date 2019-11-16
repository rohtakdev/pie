package com.poorak.pie.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PreOrderTest {
    private PreOrder preOrder;

    @BeforeEach
    void setUp() {
        preOrder = new PreOrder();
    }

    @Test
    void print_r() {
        preOrder.print_r(TreeProvider.create6_6());
    }

    @Test
    void print() {
        preOrder.print(TreeProvider.create6_6());
    }
}