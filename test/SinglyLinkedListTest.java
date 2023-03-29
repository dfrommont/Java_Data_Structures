import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void testAddFirst() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(42);
        assertEquals(1, list.size());
    }

    @Test
    void testAdd() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1, 56);
        assertEquals(1, list.size());
    }

    @Test
    void testAddLast() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast( 56);
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveFirst() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(42);
        list.removeFirst();
        assertEquals(0, list.size());
    }

    @Test
    void testRemove() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1,42);
        list.remove(1);
        assertEquals(0, list.size());
    }

    @Test
    void testRemoveLast() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(42);
        list.removeLast();
        assertEquals(0, list.size());
    }

    @Test
    void testContains() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(42);
        assertTrue(list.contains(42));
    }

    @Test
    void testDisplay() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(56);
        list.addFirst(10);
        assertEquals("56, 10, ", list.display());
    }
}