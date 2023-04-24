import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {

    @Test
    void testAdd() {
        PriorityQueue queue = new PriorityQueue(10);
        assertTrue(queue.add(new PriorityQueueNode(1, 1)));
    }

    @Test
    void testRemove() {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(new PriorityQueueNode(1, 1));
        queue.add(new PriorityQueueNode(2, 2));
        queue.add(new PriorityQueueNode(3, 3));
        assertEquals(2, queue.remove(2).getValue());
    }

    @Test
    void testContainsValue() {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(new PriorityQueueNode(1, 4));
        queue.add(new PriorityQueueNode(2, 5));
        queue.add(new PriorityQueueNode(3, 6));
        assertTrue(queue.containsValue(2));
    }

    @Test
    void testContainsPriority() {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(new PriorityQueueNode(1, 4));
        queue.add(new PriorityQueueNode(2, 5));
        queue.add(new PriorityQueueNode(3, 6));
        assertTrue(queue.containsPriority(5));
    }

    @Test
    void testSize() {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(new PriorityQueueNode(1, 1));
        queue.add(new PriorityQueueNode(2, 2));
        queue.add(new PriorityQueueNode(3, 3));
        assertEquals(3, queue.size());
    }

    @Test
    void testPeek() {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(new PriorityQueueNode(1, 1));
        queue.add(new PriorityQueueNode(2, 2));
        queue.add(new PriorityQueueNode(3, 3));
        assertEquals(3, queue.peek(2).getValue());
    }

    @Test
    void testShift1() {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(new PriorityQueueNode(1, 1));
        queue.add(new PriorityQueueNode(2, 2));
        queue.add(new PriorityQueueNode(3, 3));
        assertFalse(queue.shift());
    }

    @Test
    void testShift2() {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(new PriorityQueueNode(1, 3));
        queue.add(new PriorityQueueNode(2, 4));
        queue.add(new PriorityQueueNode(3, 5));
        assertTrue(queue.shift());
    }

    @Test
    void testDisplay() {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(new PriorityQueueNode(1, 1));
        queue.add(new PriorityQueueNode(2, 2));
        queue.add(new PriorityQueueNode(3, 3));
        assertEquals("{ 1, 1 }, { 2, 2 }, { 3, 3 }", queue.display());
    }
}