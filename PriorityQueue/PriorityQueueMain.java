public class PriorityQueueMain {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(new PriorityQueueNode(1, 1));
        queue.add(new PriorityQueueNode(2, 2));
        queue.add(new PriorityQueueNode(3, 3));
        queue.add(new PriorityQueueNode(4, 4));
        queue.add(new PriorityQueueNode(5, 5));
        System.out.println(queue.size());
        queue.remove(1);
        System.out.println(queue.size());
        System.out.println(queue.remove(6));
        System.out.println(queue.display());
        queue.remove(2);
        queue.shift();
        System.out.println(queue.display());
    }
}
