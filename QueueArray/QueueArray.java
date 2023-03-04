/**
 * Java implementation of the Queue ADT using an array, uses class Node.
 * Test class: QueueArrayTest, Main class: Main.
 * @version 1.0
 * @author dfrommont
 */

///EDIT TOP TAGS TO SAY WHICH NODE CLASS IS BEING USED AND WHICH MAIN AND TEST IT USES

public class QueueArray {

    private int front;
    private int end;
    private final Node[] array;

    /**
     * QueueArray(int length) : Constructor for the QueueArray class that takes an integer for the length of the array.
     * @param length    the length of the array
     */

    public QueueArray(int length) {
        front = 0;
        end = 0;
        array = new Node[length];
    }

    /**
     * size() : return sthe size of the populated region of the array as an integer.
     * @return  int     the size of the populated array.
     */

    public int size() {
        if (front > end) {
            return front-end;
        } else {
            return end-front;
        }
    }

    /**
     * add(Node o) : adds Node o to the next position in the array, includes loop around if the last position is already taken.
     * @param o     the Node to be added.
     */

    public void add(Node o) {
        if (array[end] != null) {
            System.out.println("Queue is full.");
        } else {
            array[end] = o;
            end = ++end % array.length;
        }
    }

    /**
     * remove() : returns the Node at the front of the Queue.
     * @return  Node    the front Node of the queue.
     */

    public Node remove() {
        if (end == front % array.length) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            Node temp = array[front];
            array[front] = null;
            front = ++front % array.length;
            return temp;
        }
    }

    /**
     * peek(int i) : returns the value of the Node at position i without removing it.
     * @param i     the position of the Node you wish to view.
     * @return  Object  the value of the Node.
     */

    public Object peek(int i) {
        return array[i].getValue();
    }

    /**
     * contains(Object o) : returns true if the array contains Object with value o and false if not.
     * @param o     the value of the Node you are searching for.
     * @return  boolean     true if the Node is found and false if not.
     */

    public boolean contains(Object o) {
        for (Node obj : array) {
            if (obj != null) {
                if (obj.getValue() == o) return true;
            }
        }
        return false;
    }

    /**
     * display() : returns a string of all the elements of the Queue.
     * @return  String      the elements contained in the Queue.
     */

    public String display() {
        StringBuilder temp = new StringBuilder();
        temp.append("Queue: [");
        for (Node obj : array) {
            if (obj == null) {
                temp.append(obj).append(", ");
            } else {
                temp.append(obj.getValue()).append(", ");
            }
        }
        temp.append("]");
        return temp.toString();
    }
}
