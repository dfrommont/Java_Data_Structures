public class Main {

    public static void main(String[] args) {
        QueueArray qa = new QueueArray(4);
        qa.add(new Node(45));
        qa.add(new Node(10));
        qa.add(new Node(21));
        qa.add(new Node(6));
        qa.add(new Node(89));
        qa.display();
        System.out.println(qa.remove());
        qa.display();
        System.out.println(qa.contains(21));
        qa.display();
        System.out.println(qa.remove());
        qa.display();
        qa.peek(2);
    }
}
