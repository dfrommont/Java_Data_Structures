import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private DoubleNode head = null;
    private int size = 0;

    public DoublyLinkedList() {

    }

    public void addFirst(Object o) {
        DoubleNode temp = new DoubleNode(head, null, 0);
        temp.setPrev(temp.getNext());
        head = temp;
        ++this.size;
    }

    public void add(int i, Object o) {
        if (size < i) {
            throw new IndexOutOfBoundsException("Index "+i+" is greater than "+size);
        } else if (i == 1) {
            addFirst(o);
        } else if (i == size) {
            addLast(o);
        } else {
            DoubleNode current = head;
            int count = 0;
            while (current.getNext() != null && count < i) {
                current = head.getNext();
                ++count;
            }
            DoubleNode temp = new DoubleNode(head.getNext(), head, o);
            head.getNext().setPrev(temp);
            head.setNext(temp);
            ++this.size;
        }
    }

    public void addLast(Object o) {
        DoubleNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        DoubleNode temp = new DoubleNode(null, current, o);
        current.setNext(temp);
        ++this.size;
    }

    public DoubleNode removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            DoubleNode temp = head;
            head = head.getNext();
            temp.setNext(null);
            --this.size;
            return temp;
        }
    }

    public DoubleNode remove(int i) {
        if (i < 1 || i > size) {
            throw new IndexOutOfBoundsException("Index i is out of bounds for [1,"+size+"]");
        } else if (i == 1) {
            return removeFirst();
        } else if (i == size) {
            return removeLast();
        } else {
            return getNode(i);
        }
    }

    public DoubleNode removeLast() {
        return getNode(size);
    }

    private DoubleNode getNode(int size) {
        DoubleNode current = head;
        int i = 0;
        while (current.getNext() != null && i+1 < size) {
            current = current.getNext();
            ++i;
        }
        DoubleNode temp = current.getNext();
        current.setNext(null);
        return temp;
    }

    public boolean contains(Object o) {
        DoubleNode current = head;
        while (current.getNext() != null) {
            if (current.equals(o)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int size() {
        return size;
    }

    public String display() {
        StringBuilder out = new StringBuilder();
        DoubleNode current = head;
        while (current.getNext() != null) {
            out.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        return out.toString();
    }
}
