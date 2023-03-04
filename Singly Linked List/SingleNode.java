/**
 * Node class creates objects tha hold an Object value and a pointer to another 'next' Node.
 * @version 1.0
 * @author dfrommont
 */

public class SingleNode {

    private Object value;
    private SingleNode next;

    /**
     * Node(Object value, Node next) : Constructor for Node which takes a value and next Node.
     * @param value     the value of the Node.
     * @param next      the next Node, can also be null.
     */

    public SingleNode(Object value, SingleNode next) {
        this.value = value;
        this.next = next;
    }

    /**
     * getNext() : returns the Node held by the next pointer.
     * @return  Node    the next Node.
     */

    public SingleNode getNext() {
        return next;
    }

    /**
     * setNext() : sets the value of the next Node to the node passed in.
     * @param next      the Node to be set as next.
     */

    public void setNext(SingleNode next) {
        this.next = next;
    }

    /**
     * getValue() : returns the Object value of the Node.
     * @return  Object  the returned value Object.
     */

    public Object getValue() {
        return value;
    }

    /**
     * setValue() : sets teh value Object of the node to be a new value.
     * @param value     the new value Object.
     */
    public void setValue(Object value) {
        this.value = value;
    }
}
