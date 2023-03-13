/**
 * DoubleNode class creates object that holds an Object value, a pointer to another 'next' Node and a pointer to the 'prev' Node.
 * @version 1.0
 * @author dfrommont
 */

public class DoubleNode {

    private DoubleNode next;
    private DoubleNode prev;
    private Object value;

    /**
     * DoubleNode(DoubleNode next, DoubleNode prev, Object value) : Constructor for DoubleNode that takes a next Node, previous Node and value Object.
     * @param next      the next DoubleNode
     * @param prev      the previous DoubleNode
     * @param value     the value of the DoubleNode
     */

    public DoubleNode(DoubleNode next, DoubleNode prev, Object value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    /**
     * getValue() : returns the value of the DoubleNode.
     * @return      the value of the DoubleNode.
     */

    public Object getValue() {
        return value;
    }

    /**
     * getNext() : returns the pointer to the next DoubleNode
     * @return      the next DoubleNode.
     */
    public DoubleNode getNext() {
        return next;
    }

    /**
     * getPrev() : returns the pointer to the previous DoubleNode.
     * @return      the previous DoubleNode,
     */

    public DoubleNode getPrev() {
        return prev;
    }

    /**
     * setValue() : sets the value of the DoubleNode to a new value.
     * @param value     the new value fo the DoubleNode.
     */

    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * setNext() : sets the value of the next DoubleNode pointer to a new value.
     * @param next      the new next DoubleNode pointer.
     */

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    /**
     * setPrev() : sets th value of the previous DoubleNode pointer to a new value.
     * @param prev      the new previous DoubleNode pointer.
     */

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}
