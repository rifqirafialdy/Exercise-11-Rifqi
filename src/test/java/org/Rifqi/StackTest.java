package org.Rifqi;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @org.junit.jupiter.api.Test
    void push() {
        Stack stack = new Stack();
        stack.push(10);
        assertEquals(10, stack.peek());
    }

    @org.junit.jupiter.api.Test
    void pop() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.peek());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        Stack stack = new Stack();
        stack.push(10);
        assertEquals(10, stack.peek());
    }
}
