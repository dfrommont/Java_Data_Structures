public class PriorityQueue {

    private int size;
    private int greatest_priority;
    private PriorityQueueNode head;
    private int maximum_priority;

    public PriorityQueue(int maximum_priority) {
        head = null;
        size = 0;
        this.maximum_priority = maximum_priority;
        greatest_priority = maximum_priority;
    }

    public boolean add(PriorityQueueNode node) {
        if (node.getPriority() <= greatest_priority) greatest_priority = node.getPriority();
        if (size == 0) return false;
        if (node.getPriority() > maximum_priority) {
            System.err.println("The Node you attempted to add has a priority greater than is allowed");
            return false;
        }
        PriorityQueueNode current = head;
        while (current.getNext() != null && current.getNext().getPriority() <= node.getPriority()) {
            current = current.getNext();
        }
        node.setNext(current.getNext());
        node.setPrev(current);
        current.getNext().setPrev(node);
        current.setNext(node);
        ++size;
        return true;
    }

    public PriorityQueueNode remove(Object value) {
        if (size == 0) return null;
        PriorityQueueNode current = head;
        while (current.getNext() != null && current.getValue() != value) {
            current = current.getNext();
        }
        if (current.getValue() == value) {
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
            current.setPrev(null);
            current.setNext(null);
            return current;
        }
        System.out.println("nod with value: "+value+" could not be found");
        --size;
        return null;
    }

    public boolean contains(Object value) {
        if (size == 0) return false;
        PriorityQueueNode current = head;
        while (current.getNext() != value) {
            current = current.getNext();
        }
        return current.getValue() == value;
    }

    public int size() {
        return size;
    }

    public PriorityQueueNode peek(int i) {
        if (size == 0 || i > size) {
            System.err.println("Index out of bounds");
            return null;
        } else {
            PriorityQueueNode current = head;
            for (int j = 0; j <= i; i++) {
                current = current.getNext();
            }
            return current;
        }
    }

    public boolean shift() {
        int shift;
        if (greatest_priority > 1) {
            shift = greatest_priority - 1;
        } else {
            shift = 0;
        }
        PriorityQueueNode current = head;
        while (current.getNext() != null) {
            current.setPriority(current.getPriority()-shift);
            current = current.getNext();
        }
        return shift>1;
    }

    public String display() {
        StringBuilder out = new StringBuilder();
        PriorityQueueNode current = head;
        while (current.getNext() != null) {
            out.append("{ ").append(current.getValue()).append(", ").append(current.getPriority()).append(" }, ");
            current = current.getNext();
        }
        return out.toString();
    }
}
