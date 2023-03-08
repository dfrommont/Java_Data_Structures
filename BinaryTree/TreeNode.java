/**
 * Node class used by BinaryTree to hold a value and pointers for each node in the tree.
 * @version 1.0
 * @author dfrommont
 */

public class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;

    /**
     * TreeNode(int value, TreeNode left, TreeNode right, TreeNode parent) : Constructor for TreeNode class which takes a value and pointers
     * @param value     the value to be held by the node.
     * @param left      the pointer for the left child node of this node.
     * @param right     the pointer for the right child node of this node.
     * @param parent    the pointer for the parent node of this node.
     */

    public TreeNode(int value, TreeNode left, TreeNode right, TreeNode parent) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    /**
     * getValue() : returns the value of the node.
     * @return  int     teh value of the node.
     */

    public int getValue() {
        return value;
    }

    /**
     * setValue() : sets the value fo the node to a new given value.
     * @param value     the new value of the node.
     */

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * getLeft() : returns the TreeNode which the left pointer points to.
     * @return  TreeNode    the left child TreeNode.
     */

    public TreeNode getLeft() {
        return left;
    }

    /**
     * setLeft() : sets the value of the left child pointer to a new value
     * @param left      the new left child TreeNode.
     */

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * getRight() : returns the TreeNode which the right pointer points to.
     * @return  TreeNode    the right child TreeNode.
     */

    public TreeNode getRight() {
        return right;
    }

    /**
     * setRight() : sets the value of the right child pointer to a new value.
     * @param right     the new left child TreeNode.
     */

    public void setRight(TreeNode right) {
        this.right = right;
    }

    /**
     * getParent() : returns the TreeNode which the parents pointer points to.
     * @return  TreeNode    the parents TreeNode.
     */

    public TreeNode getParent() {
        return parent;
    }

    /**
     * setParents() : sets the value of the parent pointer to a new value.
     * @param parent    the new parent TreeNode.
     */

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
