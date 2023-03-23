/**
 * Implementation of Stack ADT using Doubly Linked Lists, inherits mostly from DoublyLinkedList class.
 * Test class: , Main class: StackListMain.
 * @version 1.0
 * @author dfrommont
 */

public class StackList extends DoublyLinkedList{

    /**
     * stackList() : Empty Constructor for StackList which by default calls the empty constructor of DoublyLinkedList.
     */

    public StackList() {
    }

    /**
     * The following methods are contained within the DoublyLinkedList class and are to be used for this class:
     *
     *     * add(object o) : adds value o to the start of the queue.
     *     * @param o     the value to be added.
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
     * peek(int i) : returns a copy of the DoubleNode held at position i.
     * @param i     the location within the Stack to be looked for
     * @return      the DoubleNode if it exists or null if not
     */

    public DoubleNode peek(int i) {
        if (i >= 0 &&  i < size()) {
            DoubleNode current = head();
            for (int j = 0; j < i; j++) current = current.getNext();
            return current;
        }
        return null;
    }

}

