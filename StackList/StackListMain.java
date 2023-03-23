public class StackListMain {

    public static void main(String[] args) {
        StackList stack = new StackList();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println(stack.size());
        System.out.println(stack.remove());
        System.out.println(stack.size());
        System.out.println(stack.display());
        System.out.println(stack.peek(1));
        System.out.println(stack.peek(6));
        System.out.println(stack.contains(2));
    }
}
