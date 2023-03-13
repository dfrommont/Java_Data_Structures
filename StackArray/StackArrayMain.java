public class StackArrayMain {

    public static void main(String[] args) {
        StackArray sa = new StackArray(10);
        sa.add(1);
        sa.add(2);
        sa.add(3);
        sa.add(4);
        sa.add(5);
        sa.add(6);
        sa.add(7);
        sa.add(8);
        sa.add(9);
        sa.add(10);
        sa.add(11);
        System.out.println(sa.remove());
        System.out.println(sa.remove());
        System.out.println(sa.size());
        System.out.println(sa.peek(3));
        System.out.println(sa.contains(3));
        System.out.println(sa.display());
    }
}
