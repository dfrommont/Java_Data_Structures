/**
 * Java implementation of the Binary Tree ADT using nodes and pointers, uses class TreeNode.
 * Test class: , Main class: BinaryTreeMain.
 * @version 2.1
 * @author dfrommont
 */

public class BinaryTree {

    private TreeNode root;
    private int size;

    /**
     * BinaryTree() : Constructor for BinaryTree class, takes no parameters and sets root to null and size to 0.
     */

    public BinaryTree() {
        root = null;
        size = 0;
    }

    /**
     * add(int[] array) : adds integers from an array to the binary Tree as new TreeNode objects.
     * @param array     the array of integers to be added.
     */

    public void add(int[] array) {
        for (int term : array) {
            add(new TreeNode(term, null, null, null));
        }
    }

    /**
     * add(TreeNode newNode) : adds the newNode to be Binary Tree in the correct position. If the tree is empty then the newNode becomes the root.
     * @param newNode   the new TreeNode to be added.
     */

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
            if (current.getValue() >= newNode.getValue()) {
                current.setLeft(newNode);
            } else {
                current.setRight(newNode);
            }
            newNode.setParent(current);
        }
        ++size;
    }

    /**
     * remove(int n) : removes the first TreeNode from the tree whose values the given integer.
     * If the tree does nto contain the desired node then a message is displayed and null returned.
     * @param n     the integer value fo the TreeNode being looked for.
     * @return      The TreeNode with value n if found and removed, null if not found and removed.
     */

    public TreeNode remove(int n) {
        if (contains(n)) {
            TreeNode current = root;
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
            if (current == root) {
                System.out.println("The root ("+root.getValue()+") cannot be removed from the tree");
            } else {
                if (current.getLeft() == null && current.getRight() == null) { ///You are removing a leaf
                    if (current.getParent().getLeft() == current) {
                        current.getParent().setLeft(null);
                    } else {
                        current.getParent().setRight(null);
                    }
                    current.setParent(null);
                } else { ///You are removing a node fom within the tree
                    if (current.getValue() <= root.getValue()) { ///Left side of tree procedure
                        ///Change parents pointers to point to current's left child
                        current.getParent().setLeft(current.getLeft());
                        ///Change current's left child parents pointer to point to current's parent
                        current.getLeft().setParent(current.getParent());
                        ///Change parent pointer of current's right child to the rightmost leaf of current's left child
                        TreeNode temp = current.getLeft();
                        found = false;
                        while (!found) {
                            if (temp.getLeft() == null && temp.getRight() == null) {
                                found = true;
                            } else if (temp.getRight() != null) {
                                temp = temp.getRight();
                            } else if (temp.getLeft() != null) {
                                temp = temp.getLeft();
                            }
                        }
                        temp.setRight(current.getRight());
                        if (current.getRight() != null) {
                            current.getRight().setParent(temp);
                        }
                        ///Change right pointer of rightmost leaf of current's left child to point to current's right child
                        temp.setRight(current.getRight());
                    } else { ///Right side of tree procedure
                        ///Change parents pointers to point to current's right child
                        current.getParent().setRight(current.getRight());
                        ///Change current's right child parents pointer to point to current's parent
                        current.getRight().setParent(current.getParent());
                        ///Change parent pointer of current's left child to the leftmost leaf of current's right child
                        TreeNode temp = current.getRight();
                        found = false;
                        while (!found) {
                            if (temp.getLeft() == null && temp.getRight() == null) {
                                found = true;
                            } else if (temp.getLeft() != null) {
                                temp = temp.getLeft();
                            } else if (temp.getRight() != null) {
                                temp = temp.getRight();
                            }
                        }
                        temp.setLeft(current.getLeft());
                        if (current.getLeft() != null) {
                            current.getLeft().setParent(temp);
                        }
                        ///Change left pointer of leftmost leaf of current's right child to point to current's left child
                        temp.setLeft(current.getLeft());
                    }
                    ///Change current's parents pointer to null
                    ///Change children pointers of current to null
                    current.setParent(null);
                    current.setLeft(null);
                    current.setRight(null);
                }
            }
            --size;
            return current;
        }
        System.out.println("Tree does not contains any node's with value: "+n);
        return null;
    }

    /**
     * contains(int i) : returns true/false for if the tree contains a TreeNode with value i.
     * @param i     the integer value of the TreeNode being looked for.
     * @return      True if the TreeNode with value i is present and false if not.
     */

    public boolean contains(int i) {
        String values = preorder();
        return values.contains(""+i);
    }

    /**
     * size() : return the number of TreeNode contained within tree.
     * @return      an integer corresponding to the number of TreeNode in the tree.
     */

    public int size() {
        return size;
    }

    /**
     * preorder(TreeNode n) : returns the 'preorder' order of the TreeNode for TreeNode n and it's entire subtree.
     * @param n     the TreeNode to be used as the base of the search.
     * @return      A String containing all the elements in TreeNode n's subtree in 'preorder'.
     */

    public String preorder(TreeNode n) {
        String nodes = "";
        if (n != null) {
            nodes += ", " + n.getValue();
            nodes += preorder(n.getLeft());
            nodes += preorder(n.getRight());
        }
        return nodes;
    }

    /**
     * preorder() : returns the 'preorder' order of the TreeNodes for the entire tree.
     * @return      A String containing all the elements in the tree in 'preorder'.
     */

    public String preorder() {
        String nodes = "";
        TreeNode n = root;
        if (n != null) {
            nodes += ", " + n.getValue();
            nodes += preorder(n.getLeft());
            nodes += preorder(n.getRight());
        }
        return nodes;
    }

    /**
     * inorder(TreeNode n) : returns the 'inorder' order of the TreeNodes for TreeNode n and it's entire subtree.
     * @param n     the TreeNode to be used as the base of the search.
     * @return      A String containing all the elements in TreeNode n's subtree in 'inorder'.
     */

    public String inorder(TreeNode n) {
        String nodes = "";
        if (n != null) {
            nodes += inorder(n.getLeft());
            nodes += ", " + n.getValue();
            nodes += inorder(n.getRight());
        }
        return nodes;
    }

    /**
     * inorder() : returns the 'inorder' order of the TreeNodes of the entire tree.
     * @return      A String containing all the elements in the subtree in 'inorder'.
     */

    public String inorder() {
        String nodes = "";
        TreeNode n = root;
        if (n != null) {
            nodes += inorder(n.getLeft());
            nodes += ", " + n.getValue();
            nodes += inorder(n.getRight());
        }
        return nodes;
    }

    /**
     * postorder(TreeNode n) : returns the 'postorder' order of the TreeNodes for TreeNode n and it's entire subtree.
     * @param n     the TreeNode to be used as the base of the search.
     * @return      A String containing all the elements in TreeNode n's subtree in 'postorder'.
     */

    public String postorder(TreeNode n) {
        String nodes = "";
        if (n != null) {
            nodes += postorder(n.getLeft());
            nodes += postorder(n.getRight());
            nodes += ", " + n.getValue();
        }
        return nodes;
    }

    /**
     * postorder() : returns the 'postorder' order of the TreeNodes of the entire tree.
     * @return      A String containing all the elements in the subtree in 'postorder'.
     */

    public String postorder() {
        String nodes = "";
        TreeNode n = root;
        if (n != null) {
            nodes += postorder(n.getLeft());
            nodes += postorder(n.getRight());
            nodes += ", " + n.getValue();
        }
        return nodes;
    }
}
