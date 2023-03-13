/**
 * StackNode class creates object that holds an Object value.
 * @version 1.0
 * @author dfrommont
 */

public class StackNode {

    private Object value;

    /**
     * StackNode(Object value) : Constructor for the StackNode class that takes a value as a parameter.
     * @param value     the value of the StackNode
     */

    public StackNode(Object value) {
        this.value = value;
    }

    /**
     * getValue() : returns the value held the StackNode.
     * @return  Object  the value held by the StackNode
     */

    public Object getValue() {
        return value;
    }

    /**
     * setValue(Object value) : sets the value of the StackNode to a new value.
     * @param value     the new value of the StackNode
     */

    public void setValue(Object value) {
        this.value = value;
    }
}