import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackListTest {

    @Test           ///Only method from StackList class, rest are inherited
    void testPeek() {
        StackList stack = new StackList();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertEquals(1, stack.peek(2).getValue());
    }

    @Test
    void testAdd() {
        StackList stack = new StackList();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertEquals(3, stack.size());
    }

    @Test
    void testAdd2() {
        StackList stack = new StackList();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4, 2);
        assertEquals(4, stack.peek(2).getValue());
    }

    @Test
    void testRemove() {
        StackList stack = new StackList();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertEquals(3, stack.remove().getValue());
    }

    @Test
    void testContains() {
        StackList stack = new StackList();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertFalse(stack.contains(4));
    }

    @Test
    void testSize() {
        StackList stack = new StackList();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.remove();
        stack.remove();
        assertEquals(5, stack.size());
    }

    @Test
    void testDisplay() {
        StackList stack = new StackList();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);
        assertEquals("7, 6, 5, 4, 3, 2, 1,", stack.display());
    }
}