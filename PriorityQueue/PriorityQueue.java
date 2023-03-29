/**
 * Implementation of Priority Queue ADT, uses class PriorityQueueNode.
 * Test class: PriorityQueueTest, Main class: PriorityQueueMain.
 * @version 1.1
 * @author dfrommont
 */

public class PriorityQueue {

    private int size;
    private int greatest_priority;
    private PriorityQueueNode head;
    private final int maximum_priority;

    /**
     * PriorityQueue(int maximum_priority) : Constructor for the PriorityQueue class that takes a maximum allowed priority as a parameter. head is set to null, size to 0 and current highest priority to max priority.
     * @param maximum_priority      the max allowed int priority
     */

    public PriorityQueue(int maximum_priority) {
        head = null;
        size = 0;
        this.maximum_priority = maximum_priority;
        greatest_priority = maximum_priority;
    }

    /**
     * add(PriorityQueueNode node) : adds node to the start of the section of the queue that contains the other nodes with the same priority or to the end.
     * @param node      the PriorityQueueNode to be added
     * @return      true if the node is added successfully, false if not
     */

    public boolean add(PriorityQueueNode node) {
        if (node.getPriority() <= greatest_priority) greatest_priority = node.getPriority();
        if (size == 0) {
            head = node;
            ++size;
            return true;
        }
        if (node.getPriority() > maximum_priority) {
            System.err.println("The Node you attempted to add has a priority greater than is allowed");
            return false;
        }
        PriorityQueueNode current = head;
        while (current.getNext() != null && current.getNext().getPriority() <= node.getPriority()) {
            current = current.getNext();
        }
        if (current.getNext() == null) {
            node.setPrev(current);
        } else {
            node.setNext(current.getNext());
            node.setPrev(current);
            current.getNext().setPrev(node);
        }
        current.setNext(node);
        ++size;
        return true;
    }

    /**
     * remove(int priority) : returns and removes the first node with the given priority.
     * @param priority  the int priority to be looked for
     * @return      the PriorityQueueNode if found, null if not.
     */

    public PriorityQueueNode remove(int priority) {
        if (size == 0) return null;
        PriorityQueueNode current = head;
        while (current.getNext() != null) {
            if (current.getPriority() == priority) break;
            current = current.getNext();
        }
        PriorityQueueNode temp = current;
        if (temp.getPriority() <= greatest_priority) {
            while (temp.getNext() != null && temp.getPriority() == greatest_priority) {
                temp = temp.getNext();
            }
            if (temp.getPriority() > greatest_priority) greatest_priority = temp.getPriority();
        }
        if (current.getNext() == null) {
            temp = current;
            current.getPrev().setNext(null);
            current.setPrev(null);
            return temp;
        } else if (current.getPrev() == null) {
            temp = current;
            current.setNext(null);
            current.getNext().setPrev(null);
            return temp;
        } else if (current.getPriority() == priority) {
            temp = current;
            System.out.println(current.getPrev());
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
            current.setPrev(null);
            current.setNext(null);
            return temp;
        }
        return null;
    }

    /**
     * containsValue(Object value) : checks if the queue contains any nodes with the given value.
     * @param value     the Object value to be searched for
     * @return      true if at least one node with the value is found, false if not
     */

    public boolean containsValue(Object value) {
        if (size == 0) return false;
        PriorityQueueNode current = head;
        while (current.getNext() != null) {
            if (current.getValue() == value) break;
            current = current.getNext();
        }
        return current.getValue() == value;
    }

    /**
     * containsPriority(int priority) : checks if the queue contains any nodes with the given priority.
     * @param priority      the int priority to be searched for
     * @return      true if at least one node with the given priority is found, false if not
     */

    public boolean containsPriority(int priority) {
        if (size == 0) return false;
        PriorityQueueNode current = head;
        while (current.getNext() != null) {
            if (current.getPriority() == priority) break;
            current = current.getNext();
        }
        return current.getPriority() == priority;
    }

    /**
     * size() : returns the size of all the values held in the queue.
     * @return      an int corresponding to the size
     */

    public int size() {
        return size;
    }

    /**
     * peek(int i) : returns a copy of the node at index i if the index is valid.
     * @param i     the index to be searched
     * @return      the node if the index is valid, null if not
     */

    public PriorityQueueNode peek(int i) {
        if (i >= 0 && i < size) {
            PriorityQueueNode current = head;
            for (int j = 0; j < i; j++) current = current.getNext();
            return current;
        }
        return null;
    }

    /**
     * shift() : if there is a disparity in the start of the priorities and priority 1, i.e. the lowest priority is >1, then all priorities are shifted so the lowest priority is now 1.
     * @return      true if there was a disparity and the priorities were shifted, false if not
     */

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

    /**
     * display() : returns a string containing all the nodes held in the priority copy.
     * @return  String      a list of all the elements in order
     */

    public String display() {
        StringBuilder out = new StringBuilder();
        PriorityQueueNode current = head;
        while (current.getNext() != null) {
            out.append("{ ").append(current.getValue()).append(", ").append(current.getPriority()).append(" }, ");
            current = current.getNext();
        }
        out.append("{ ").append(current.getValue()).append(", ").append(current.getPriority()).append(" }");
        return out.toString();
    }
}
