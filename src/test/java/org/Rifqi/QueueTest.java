package org.Rifqi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enque() {
        Queue queue = new Queue();
        queue.enque(10);
        assertEquals(10, queue.peek());
    }

    @Test
    void deque() {
        Queue queue = new Queue();
        queue.enque(10);
        queue.enque(20);
        assertEquals(10, queue.deque());
        assertEquals(20, queue.peek());
    }

    @Test
    void peek() {
        Queue queue = new Queue();
        queue.enque(10);
        assertEquals(10, queue.peek()); 
    }
}
