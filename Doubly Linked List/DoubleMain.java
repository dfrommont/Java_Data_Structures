public class DoubleMain {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(25);
        list.add(1);
        list.add(2);
        System.out.println(list.remove());
        System.out.println(list.contains(25));
        list.size();
        System.out.println(list.display());
    }
}
