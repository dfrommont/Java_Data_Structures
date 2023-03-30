public class QueueListMain {

    public static void main(String[] args) {
        QueueList list = new QueueList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.peek(2));
        System.out.println(list.display());
    }
}
