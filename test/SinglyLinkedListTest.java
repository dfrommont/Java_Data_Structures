import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test public void testAddFirst() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(42);
        assertEquals(1, list.size());
    }

    @Test public void testAdd() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1, 56);
        assertEquals(1, list.size());
    }

    @Test public void testAddLast() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast( 56);
        assertEquals(1, list.size());
    }

    @Test public void testRemoveFirst() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(42);
        list.removeFirst();
        assertEquals(0, list.size());
    }

    @Test public void testRemove() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1,42);
        list.remove(1);
        assertEquals(0, list.size());
    }

    @Test public void testRemoveLast() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(42);
        list.removeLast();
        assertEquals(0, list.size());
    }

    @Test public void testContains() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(42);
        assertTrue(list.contains(42));
    }

    @Test public void testReverse() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(42);
        list.addFirst(21);
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addFirst(21);
        list2.addFirst(42);
        assertEquals(list2, list.reverse());
    }

    @Test public void testDisplay() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(56);
        list.addFirst(10);
        assertEquals("56, 10, ", list.display());
    }
}