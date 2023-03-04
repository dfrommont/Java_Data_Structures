import java.util.NoSuchElementException;

/**
 * Implementation of Doubly Linked LIst ADT, uses class DoubleNode.
 * Test class: DoublyLinkedListTest, Main class: DoubleMain.
 * @version 2.0
 * @author dfrommont
 */

public class DoublyLinkedList {

    private DoubleNode head = new DoubleNode(null, null, null);
    private int size = 0;

    /**
     * DoublyLinkedList() : Constructor for DoublyLinkedList. Takes no parameters.
     */
    public DoublyLinkedList() {

    }

    public void add(Object o) {
        DoubleNode temp = new DoubleNode(head, null, o);
        head.setPrev(temp);
        head = temp;
        ++size;
    }

    /**
     * remove(int i) : removes and returns the first Object.
     * @return  DoubleNode      the returned DoubleNode.
     */

    public DoubleNode remove() {
        head.getNext().setPrev(null);
        DoubleNode temp = head;
        head = head.getNext();
        --size;
        return temp;
    }

    /**
     * contains(Object o) : returns true if the Object is in the list and false if not.
     * @param o     the Object to be searched for.
     * @return  boolean     true if the Object was found, false if not.
     */

    public boolean contains(Object o) {
        DoubleNode current = head;
        while (current.getNext() != null) {
            if (current.getValue() == o) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /**
     * size() : returns the size of the list.
     * @return  int     the size of the list.
     */

    public int size() {
        return size;
    }

    /**
     * display() : return sthe contents of the list in a String.
     * @return  String      the contents of the list.
     */

    public String display() {
        StringBuilder out = new StringBuilder();
        DoubleNode current = head;
        while (current.getNext() != null) {
            out.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        return out.toString();
    }
}
