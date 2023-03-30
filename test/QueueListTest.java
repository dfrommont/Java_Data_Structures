import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueListTest {

    @Test
    void testAdd() {
        QueueList list = new QueueList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    void testPeek() {
        QueueList list = new QueueList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.peek(2).getValue());
    }
}