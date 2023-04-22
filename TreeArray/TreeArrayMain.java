public class TreeArrayMain {

    public static void main(String[] args) {
        TreeArrayNode node1 = new TreeArrayNode(10);
        TreeArrayNode node2 = new TreeArrayNode(20);
        TreeArrayNode node3 = new TreeArrayNode(30);
        TreeArrayNode node4 = new TreeArrayNode(40);
        TreeArray tree = new TreeArray(node1);
        System.out.println(tree.getSize()+", "+ tree.getHeight());
        tree.addToTree(node1, node2);
        System.out.println(tree.getSize()+", "+ tree.getHeight());
        tree.addToTree(node1, node3);
        System.out.println(tree.getSize()+", "+ tree.getHeight());
        tree.addToTree(node2, node4);
        System.out.println(tree.getSize()+", "+ tree.getHeight());
        tree.removeFromTree(node3);
        System.out.println(tree.getSize()+", "+ tree.getHeight());
    }
}
