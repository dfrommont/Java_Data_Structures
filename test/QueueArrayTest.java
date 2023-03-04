import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueArrayTest {

    @Test
    void add() {
        QueueArray que1 = new QueueArray(10);
        que1.add(new Node("10"));
        assertEquals(1, que1.size());
    }

    @Test
    void remove() {
        QueueArray que1 = new QueueArray(10);
        que1.add(new Node("10"));
        System.out.println(que1.remove());
        assertEquals(0, que1.size());
    }

    @Test
    void peek() {
        QueueArray que1 = new QueueArray(10);
        que1.add(new Node("10"));
        assertEquals("10", que1.peek(0));
    }

    @Test
    void contains() {
        QueueArray que1 = new QueueArray(10);
        que1.add(new Node("10"));
        assertTrue(que1.contains("10"));
    }

    @Test
    void display() {
        QueueArray que1 = new QueueArray(10);
        que1.add(new Node("10"));
        que1.add(new Node("11"));
        que1.add(new Node("12"));
        assertEquals("Queue: [10, 11, 12, null, null, null, null, null, null, null, ]", que1.display());
    }

    @Test
    void size() {
        QueueArray que1 = new QueueArray(10);
        que1.add(new Node("10"));
        que1.add(new Node("11"));
        que1.add(new Node("12"));
        assertEquals(3, que1.size());
    }
}