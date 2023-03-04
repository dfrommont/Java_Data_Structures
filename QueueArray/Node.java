/**
 * Node class used by QueueArray to hold a value for a position in the Queue.
 * @version 1.0
 * @author dfrommont
 */

public class Node {

    private Object value;

    /**
     * Node(Object value) : Constructor for the Node class which takes a value.
     * @param value     the value to be stored by the Node.
     */

    public Node(Object value) {
        this.value = value;
    }

    /**
     * getValue() : return teh value of the Node object.
     * @return  Object      the value held by the Node.
     */

    public Object getValue() {
        return value;
    }

    /**
     * setValue(Object value) : sets the value of the Node object to a new value.
     * @param value     the new value of the Node.
     */

    public void setValue(Object value) {
        this.value = value;
    }
}
