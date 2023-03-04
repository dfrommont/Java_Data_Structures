import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void add() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        assertEquals(1, list.size());
    }

    @Test
    void add2() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(25, 1);
        System.out.println(list.display());
        assertEquals(4, list.size());
    }

    @Test
    void remove() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.remove();
        assertEquals(1, list.size());
    }

    @Test
    void contains() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        assertTrue(list.contains(20));
    }

    @Test
    void size() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        assertEquals(2, list.size());
    }

    @Test
    void display() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        assertEquals("20, 10, ", list.display());
    }
}