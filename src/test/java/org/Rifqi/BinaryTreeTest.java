package org.Rifqi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void insert() {
        BinaryTree tree = new BinaryTree();

        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);

        assertTrue(tree.search(20));
        assertTrue(tree.search(10));
        assertTrue(tree.search(30));
        assertTrue(tree.search(5));
        assertTrue(tree.search(15));

        assertFalse(tree.search(25));
    }

    @Test
    void search() {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(40);
        tree.insert(60);
        tree.insert(35);
        tree.insert(45);

        assertTrue(tree.search(50));
        assertTrue(tree.search(40));
        assertTrue(tree.search(60));
        assertTrue(tree.search(35));
        assertTrue(tree.search(45));

        assertFalse(tree.search(55));
        assertFalse(tree.search(70));
    }
}
