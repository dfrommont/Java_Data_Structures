import java.util.NoSuchElementException;

/**
 * Implementation of Doubly Linked LIst ADT
 * @version 1.0
 * @author dfrommont
 */
public class DoublyLinkedList {

    private DoubleNode head = null;
    private int size = 0;

    /**
     * DoublyLinkedList() : Constructor for DoublyLinkedList. Takes no parameters.
     */
    public DoublyLinkedList() {

    }

    /**
     * addFirst(Object o) : adds Object o to the start of the list.
     * @param o     the Object to be added.
     */
    public void addFirst(Object o) {
        DoubleNode temp = new DoubleNode(head, null, 0);
        temp.setPrev(temp.getNext());
        head = temp;
        ++this.size;
    }

    /**
     * add(int i, Object o) : adds Object o to position i in the list.
     * @param i     the position to add the object to.
     * @param o     the Object to be added.
     */

    public void add(int i, Object o) {
        if (size < i) {
            throw new IndexOutOfBoundsException("Index "+i+" is greater than "+size);
        } else if (i == 1) {
            addFirst(o);
        } else if (i == size) {
            addLast(o);
        } else {
            DoubleNode current = head;
            int count = 0;
            while (current.getNext() != null && count < i) {
                current = head.getNext();
                ++count;
            }
            DoubleNode temp = new DoubleNode(head.getNext(), head, o);
            head.getNext().setPrev(temp);
            head.setNext(temp);
            ++this.size;
        }
    }

    /**
     * addLast(Object o) : adds Object o to teh end of the list.
     * @param o     the object to be added.
     */

    public void addLast(Object o) {
        DoubleNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        DoubleNode temp = new DoubleNode(null, current, o);
        current.setNext(temp);
        ++this.size;
    }

    /**
     * removeFirst() : removes and returns the first Object in the list.
     * @return  DoubleNode      the returned DoubleNode.
     */

    public DoubleNode removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            DoubleNode temp = head;
            head = head.getNext();
            temp.setNext(null);
            --this.size;
            return temp;
        }
    }

    /**
     * remove(int i) : removes and returns the Object at position i.
     * @param i     the position of the Object to be removed in the list.
     * @return  DoubleNode      the returned DoubleNode.
     */

    public DoubleNode remove(int i) {
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
     * removeLast() : removes and return sthe last DoubleNode in the list.
     * @return  DoubleNode      the returned DoubleNode
     */

    public DoubleNode removeLast() {
        return getNode(size);
    }

    private DoubleNode getNode(int size) {
        DoubleNode current = head;
        int i = 0;
        while (current.getNext() != null && i+1 < size) {
            current = current.getNext();
            ++i;
        }
        DoubleNode temp = current.getNext();
        current.setNext(null);
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
            if (current.equals(o)) {
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
