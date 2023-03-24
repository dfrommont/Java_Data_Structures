public class PriorityQueueNode {

    private Object value;
    private PriorityQueueNode next;
    private PriorityQueueNode prev;
    private int priority;

    public PriorityQueueNode(Object value, int priority) {
        this.value = value;
        next = null;
        prev = null;
        this.priority = priority;
    }

    public PriorityQueueNode getNext() {
        return next;
    }

    public void setNext(PriorityQueueNode next) {
        this.next = next;
    }

    public PriorityQueueNode getPrev() {
        return prev;
    }

    public void setPrev(PriorityQueueNode prev) {
        this.prev = prev;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
