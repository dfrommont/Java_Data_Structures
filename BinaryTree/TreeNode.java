public class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;

    public TreeNode(int value, TreeNode left, TreeNode right, TreeNode parent) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }
    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getParent() {
        return parent;
    }
    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
