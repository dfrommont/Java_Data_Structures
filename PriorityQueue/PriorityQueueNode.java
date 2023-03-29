/**
 * Node class used by PriorityQueue to hold a value and pointers for the next and previous node.
 * the greatest priority level for a PriorityQueueNode is 1.
 * @version 1.0
 * @author dfrommont
 */

public class PriorityQueueNode {

    private Object value;
    private PriorityQueueNode next;
    private PriorityQueueNode prev;
    private int priority;

    /**
     * PriorityQueueNode(Object value, int priority) : Constructor for PriorityQueueNode that take a value and priority level. Next and prev points are set to null.
     * @param value     the Object value to be held by the node
     * @param priority      the int priority of the node.
     */

    public PriorityQueueNode(Object value, int priority) {
        this.value = value;
        next = null;
        prev = null;
        this.priority = priority;
    }

    /**
     * getNext() : returns the node held by the next pointer.
     * @return  PriorityQueueNode   the next node
     */

    public PriorityQueueNode getNext() {
        return next;
    }

    /**
     * setNext(PriorityQueueNode next) : sets the value of the next node pointer to a new given value.
     * @param next      the new next PriorityQueueNode to be pointed to
     */

    public void setNext(PriorityQueueNode next) {
        this.next = next;
    }

    /**
     * getPrev() : returns the node held by the prev pointer.
     * @return  PriorityQueueNode   the previous node
     */

    public PriorityQueueNode getPrev() {
        return prev;
    }

    /**
     * setPrev(PriorityQueueNode next) : sets the value of the previous node pointer to a new given value.
     * @param prev      the new previous PriorityQueueNode to be pointed to
     */

    public void setPrev(PriorityQueueNode prev) {
        this.prev = prev;
    }

    /**
     * getPriority() : returns the priority level of the node.
     * @return  int   the priority of the node
     */

    public int getPriority() {
        return priority;
    }

    /**
     * setPriority(int priority) : sets the priority level to a new given value.
     * @param priority      the new int priority level
     */

    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * getValue() : returns the value held by the node.
     * @return  Object   the PriorityQueueNode's value
     */

    public Object getValue() {
        return value;
    }

    /**
     * setValue(Object value) : sets the value of the node to a new given value.
     * @param value      the new value of the PriorityQueueNode
     */

    public void setValue(Object value) {
        this.value = value;
    }
}
