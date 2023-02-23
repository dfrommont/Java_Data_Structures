public class DoubleNode {

    private DoubleNode next;
    private DoubleNode prev;
    private Object value;

    public DoubleNode(DoubleNode next, DoubleNode prev, Object value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
    public DoubleNode getNext() {
        return next;
    }
    public DoubleNode getPrev() {
        return prev;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    public void setNext(DoubleNode next) {
        this.next = next;
    }
    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}
