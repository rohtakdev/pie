package com.poorak.pie.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreOrderTest {
    private PreOrder preOrder;

    @BeforeEach
    void setUp() {
        preOrder = new PreOrder();
    }

    @Test
    void print() {
        preOrder.print(TreeProvider.create6_6());
    }
}