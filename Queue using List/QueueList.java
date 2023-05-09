/**
 * Implementation of Queue ADT using a doubly linked list, inherits mostly from DoublyLinkedList class.
 * Test class: QueueListTest, Main class: QueueListMain.
 * @version 1.0
 * @author dfrommont
 */

public class QueueList extends DoublyLinkedList{

    /**
     * QueueList() : empty constructor for QueueList as DoublyLinkedList handles initialisation itself.
     */

    public QueueList() {
    }

    /*
     * The following methods are contained within the DoublyLinkedList class and are to be used for this class:
     *
     *     * remove() : removes and returns the first Object.
     *     * @return  DoubleNode      the returned DoubleNode.
     *
     *     * contains(Object o) : returns true if the Object is in the list and false if not.
     *     * @param o     the Object to be searched for.
     *     * @return  boolean     true if the Object was found, false if not.
     *
     *     * size() : returns the size of the list.
     *     * @return  int     the size of the list.
     *
     *     * display() : returns the contents of the list in a String.
     *     * @return  String      the contents of the list.
     */

    /**
     * add(Object o) : adds a new DoubleNode with value o to the end of the queue. Overrides matching add(Object o) method from DoublyLinkedList.
     * @param o     the value to be added.
     */

    @Override                       ///Overriding the add method from DoubleLinkedList so new nodes are added to the end, not start.
    public void add(Object o) {
        if (head().getValue() == null) {
            setHead(new DoubleNode(null, null, o));
        } else {
            DoubleNode current = head();
            while (current.getNext() != null) {
                current = current.getNext();
            }
            DoubleNode node = new DoubleNode(null, current, o);
            current.setNext(node);
        }
        increment();
    }

    /**
     * peek(int i) : returns a copy of DoubleNode held at position i in the list if i is a valid index.
     * @param i     the index of the node being looked for. 0 <= i < size of list.
     * @return  DoubleNode      the node held at position i.
     */

    public DoubleNode peek(int i) {
        if (i >= 0 && i < size()) {
            DoubleNode current = head();
            for (int j = 0; j < i; j++) current = current.getNext();
            return current;
        }
        return null;
    }
}
