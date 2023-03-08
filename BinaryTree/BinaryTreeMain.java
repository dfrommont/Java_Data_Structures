public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] array = new int[] {10,13,7,6,16,11};
        tree.add(array);
        tree.add(new TreeNode(1, null, null, null));
        System.out.println(tree.preorder());
        System.out.println(tree.inorder());
        System.out.println(tree.postorder());
        System.out.println(tree.remove(16).getValue());
        System.out.println(tree.inorder());
        System.out.println(tree.size());
        System.out.println(tree.contains(13));
    }
}