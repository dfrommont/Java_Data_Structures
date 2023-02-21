import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class SinglyLinkedList {

    private Node head = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public void addFirst(Object o) {
        head = new Node(o, head);
        ++size;
    }

    public void add(int i, Object o) {
        if (size < i) {
            throw new IndexOutOfBoundsException("Index "+i+" is greater than "+size);
        } else if (i == 1) {
            addFirst(o);
        } else if (i == size) {
            addLast(o);
        } else {
            Node current = head;
            int count = 0;
            while (current.getNext() != null && count < i) {
                current = head.getNext();
                ++count;
            }
            Node temp = new Node(o, current.getNext());
            current.setNext(temp);
        }
    }

    public void addLast(Object o) {
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node(o, null));
    }

    public Node removeFirst() {
        Node first = head;
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            --this.size;
            return first;
        }
    }

    public Node remove(int i) {
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

    public Node removeLast() {
        return getNode(size);
    }

    private Node getNode(int size) {
        Node current = head;
        int i = 0;
        while (current.getNext() != null && i+1 < size) {
            current = current.getNext();
            ++i;
        }
        Node temp = current.getNext();
        current.setNext(null);
        return temp;
    }

    public boolean contains(Object o) {
        Node current = head;
        while (current.getNext() != null) {
            if (current.equals(o)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public SinglyLinkedList reverse() {
        ArrayList<Object> buffer = new ArrayList<>();
        Node current = head;
        while (current != null) {
            buffer.add(current.getValue());
            current = current.getNext();
        }
        Collections.reverse(buffer);
        SinglyLinkedList l2 = new SinglyLinkedList();
        Node tail = new Node(buffer.get(1), null);
        for (Object item : buffer) {
            Node temp = new Node(item, tail);
            l2.addFirst(temp);
        }
        return l2;
    }

    public int size() {
        return size;
    }

    public String display() {
        StringBuilder out = new StringBuilder();
        Node current = head;
        while (current.getNext() != null) {
            out.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        return out.toString();
    }
}
