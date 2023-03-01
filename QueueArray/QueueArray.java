public class QueueArray {

    private int front;
    private int end;
    private final Node[] array;

    public QueueArray(int length) {
        front = 0;
        end = 0;
        array = new Node[length];
    }


    public void add(Node o) {
        if (array[end] != null) {
            System.out.println("Queue is full.");
        } else {
            array[end] = o;
            end = ++end % array.length;
        }
    }

    public Object remove() {
        if (end == (front+1) % array.length) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            Node temp = array[front];
            array[front] = null;
            front = ++front % array.length;
            return temp;
        }
    }

    public void peek(int i) {
        System.out.println(array[i].getValue());
    }

    public boolean contains(Object o) {
        for (Node obj : array) {
            if (obj != null) {
                if (obj.getValue() == o) return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("Queue: [");
        for (Node obj : array) {
            if (obj == null) {
                System.out.println(obj);
            } else {
                System.out.println(obj.getValue());
            }
        }
        System.out.println("]");
    }
}
