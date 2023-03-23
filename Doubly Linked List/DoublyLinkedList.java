/**
 * Implementation of Doubly Linked List ADT, uses class DoubleNode.
 * Test class: DoublyLinkedListTest, Main class: DoubleMain.
 * Class StackList inherits this class
 * @version 2.2
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

    /**
     * add(object o) : adds value o to the start of the queue.
     * @param o     the value to be added.
     */

    public void add(Object o) {
        DoubleNode temp = new DoubleNode(head, null, o);
        head.setPrev(temp);
        head = temp;
        ++size;
    }

    /**
     * add(Object o, int i) : adds value o to position i in the queue
     * @param o     the value to be added.
     * @param i     the position to add the value at.
     */

    public void add(Object o, int i) {
        if (head.getNext() == null) {
            add(o);
        } else if (i > size) {
            System.out.println("Index "+i+" is otu of bounds for list of length "+size);
        } else {
            DoubleNode current = head;
            for (int j = 0; j < i; j++) current = current.getNext();
            DoubleNode temp = new DoubleNode(current, current.getPrev(), o);
            current.getPrev().setNext(temp);
            current.setPrev(temp);
            ++size;
        }
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
     * display() : returns the contents of the list in a String.
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

    /**
     * head() : returns the the head DoubleNode. Used by StackList which inherits from this class.
     * @return  DoubleNode      the head of the DoubleLinkedList
     */

    public DoubleNode head() {
        return head;
    }
}
