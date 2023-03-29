import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayTest {

    @Test
    void testAdd() {
        StackArray stack = new StackArray(3);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertEquals("Stack of length 3 is already full.", stack.add(4));
    }

    @Test
    void testRemove() {
        StackArray stack = new StackArray(3);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertEquals(3, stack.remove().getValue());
    }

    @Test
    void testSize() {
        StackArray stack = new StackArray(3);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertEquals(3, stack.size());
    }

    @Test
    void testPeek() {
        StackArray stack = new StackArray(3);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertEquals(3, stack.peek(2));
    }

    @Test
    void testContains() {
        StackArray stack = new StackArray(3);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertTrue(stack.contains(1));
    }

    @Test
    void testDisplay() {
        StackArray stack = new StackArray(3);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertEquals("1, 2, 3,", stack.display());
    }
}