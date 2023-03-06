public class BinaryTree {

    private TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void add(int[] array) {
        for (int term : array) {
            add(new TreeNode(term, null, null, null));
        }
    }

    public void add(TreeNode newNode) {
        if (root == null) {
            root = newNode;
        } else {
            TreeNode current = root;
            boolean added = false;
            while (!added) {
                if (current.getValue() >= newNode.getValue() && current.getLeft() != null) {
                    current = current.getLeft();
                } else if (current.getValue() < newNode.getValue() && current.getRight() != null) {
                    current = current.getRight();
                } else {
                    added = true;
                }
            }
            System.out.println("found: "+current.getValue());
            System.out.println("root: "+root.getValue());
            if (current.getValue() >= newNode.getValue()) {
                current.setLeft(newNode);
            } else {
                current.setRight(newNode);
            }
            newNode.setParent(current);
        }
    }

    public TreeNode remove(int n) {
        TreeNode current = root; ///This method is not correct and needs more work
        boolean found = false;
        while (!found) {
            if (current.getValue() > n && current.getLeft() != null) {
                current = current.getLeft();
            } else if (current.getValue() < n && current.getRight() != null) {
                current = current.getRight();
            } else {
                found = true;
            }
        }
        System.out.println("ee "+current.getValue());
        current.getParent().setLeft(current.getLeft());
        current.getParent().setRight(current.getRight());
        System.out.println("98"+current.getLeft().getValue());
        System.out.println("99"+current.getParent().getLeft().getValue());
        TreeNode temp = current;
        current.setParent(null);
        current.setLeft(null);
        current.setRight(null);
        return temp;
    }

    public String preorder(TreeNode n) {
        String nodes = "";
        if (n != null) {
            nodes += " " + n.getValue();
            nodes += preorder(n.getLeft());
            nodes += preorder(n.getRight());
        }
        return nodes;
    }

    public String preorder() {
        String nodes = "";
        TreeNode n = root;
        if (n != null) { // if actually have a tree node
            nodes += " " + n.getValue();         // visit the node (root of subtree)
            nodes += preorder(n.getLeft());    // preorder traverse left subtree
            nodes += preorder(n.getRight());   // preorder traverse right subtree
        }
        return nodes;
    }

    public String inorder(TreeNode n) {
        String nodes = "";
        if (n != null) { // if actually have a tree node
            nodes += inorder(n.getLeft());    // preorder traverse left subtree
            nodes += " " + n.getValue();         // visit the node (root of subtree)
            nodes += inorder(n.getRight());   // preorder traverse right subtree
        }
        return nodes;
    }

    public String inorder() {
        String nodes = "";
        TreeNode n = root;
        if (n != null) { // if actually have a tree node
            nodes += inorder(n.getLeft());    // preorder traverse left subtree
            nodes += " " + n.getValue();         // visit the node (root of subtree)
            nodes += inorder(n.getRight());   // preorder traverse right subtree
        }
        return nodes;
    }

    public String postorder(TreeNode n) {
        String nodes = "";
        if (n != null) { // if actually have a tree node
            nodes += postorder(n.getLeft());    // preorder traverse left subtree
            nodes += postorder(n.getRight());   // preorder traverse right subtree
            nodes += " " + n.getValue();         // visit the node (root of subtree)
        }
        return nodes;
    }

    public String postorder() {
        String nodes = "";
        TreeNode n = root;
        if (n != null) { // if actually have a tree node
            nodes += postorder(n.getLeft());    // preorder traverse left subtree
            nodes += postorder(n.getRight());   // preorder traverse right subtree
            nodes += " " + n.getValue();         // visit the node (root of subtree)
        }
        return nodes;
    }
}
