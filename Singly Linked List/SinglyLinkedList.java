import java.util.NoSuchElementException;

/**
 * Java implementation of the Singly Linked List ADT, uses class SingleNode.
 * Test class: SinglyLinkedListTest, Main class: SingleMain.
 * @version 1.0
 * @author dfrommont
 */

public class SinglyLinkedList {

    private SingleNode head = null;
    private int size = 0;

    /**
     * SinglyLinkedList() : Constructor for SinglyLinkedList, takes no parameters.
     */

    public SinglyLinkedList() {
    }

    /**
     * addFirst() : adds Object o to the start of the linked list then increments the size.
     * @param o     Object to be added
     */

    public void addFirst(Object o) {
        head = new SingleNode(o, head);
        ++size;
    }

    /**
     * add(int i, Object o) : adds Object o to position i in the linked list.
     * @param i     Index where object should be added.
     * @param o     Object o to be added.
     * @exception IndexOutOfBoundsException If index is too high or low, exception is thrown.
     */

    public void add(int i, Object o) {
        if (size < i) {
            throw new IndexOutOfBoundsException("Index "+i+" is greater than "+size);
        } else if (i == 1) {
            addFirst(o);
        } else if (i == size) {
            addLast(o);
        } else {
            SingleNode current = head;
            int count = 0;
            while (current.getNext() != null && count < i) {
                current = head.getNext();
                ++count;
            }
            SingleNode temp = new SingleNode(o, current.getNext());
            current.setNext(temp);
        }
    }

    /**
     * addLast(Object o) : adds Object o to the end of the linked list.
     * @param o     Object o to be added.
     */

    public void addLast(Object o) {
        SingleNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new SingleNode(o, null));
    }

    /**
     * removeFirst() : removes and returns the first Node in the list.
     * @return  Node    the returned Node.
     */

    public SingleNode removeFirst() {
        SingleNode first = head;
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            SingleNode temp = head;
            head = head.getNext();
            temp.setNext(null);
            --this.size;
            return first;
        }
    }

    /**
     * remove(int i) : removes and returns Node at position i
     * @param i     position of Node to be removed.
     * @return  Node    teh returned Node.
     */

    public SingleNode remove(int i) {
        if (i < 1 || i > size) {
            throw new IndexOutOfBoundsException("Index i is out of bounds for [1,"+size+"]");
        } else if (i == 1) {
            return removeFirst();
        } else if (i == size) {
            return removeLast();
        } else {
            return getNode(i);
        }
    }

    /**
     * removeLast() : removes and returns the last Node in the linked list.
     * @return  Node    the returned Node.
     */

    public SingleNode removeLast() {
        return getNode(size);
    }

    private SingleNode getNode(int size) {
        SingleNode current = head;
        int i = 0;
        while (current.getNext() != null && i+1 < size) {
            current = current.getNext();
            ++i;
        }
        SingleNode temp = current.getNext();
        current.setNext(null);
        return temp;
    }

    /**
     * contains(Object o) : returns true if the linked list contains Object o and false if not.
     * @param o     the Object to be searched for
     * @return  boolean     true if the Object was found and false if not.
     */

    public boolean contains(Object o) {
        SingleNode current = head;
        while (current.getNext() != null) {
            if (current.equals(o)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /**
     * size() : returns the size of the linked list.
     * @return  int     the size of the linked list.
     */

    public int size() {
        return size;
    }

    /**
     * display() : returns a string of all the Object values held by the linked list.
     * @return  String  a String of the values held in order.
     */

    public String display() {
        StringBuilder out = new StringBuilder();
        SingleNode current = head;
        while (current.getNext() != null) {
            out.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        return out.toString();
    }
}
