package com.poorak.pie.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeHeightTest {
    private TreeHeight treeHeight ;

    @BeforeEach
    void setUp() {
        treeHeight = new TreeHeight();
    }

    @Test
    void getHeight() {
        assertEquals(2, treeHeight.getHeight(TreeProvider.createTree()));
        assertEquals(4, treeHeight.getHeight(TreeProvider.create6_6()));
    }
}