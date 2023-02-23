public class DoubleMain {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(21);
        list.add(1, 25);
        list.addFirst(56);
        list.addFirst(10);
        list.addFirst(8);
        list.removeFirst();
        list.removeLast();
        list.remove(2);
        list.contains(1);
        list.size();
    }
}
