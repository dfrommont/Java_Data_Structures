import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void add() {
    }

    @Test
    void testAdd1() {
        BinaryTree tree = new BinaryTree();
        tree.add(new int[]{1, 2, 3});
        assertEquals(3, tree.size());
    }

    @Test
    void testAdd2() {
        BinaryTree tree = new BinaryTree();
        tree.add(new TreeNode(1));
        tree.add(new TreeNode(2));
        tree.add(new TreeNode(3));
        assertEquals(3, tree.size());
    }

    @Test
    void testRemove() {
        BinaryTree tree = new BinaryTree();
        tree.add(new int[]{1, 2, 3});
        tree.remove(1);
        assertEquals(2, tree.size());
    }

    @Test
    void testContains() {
        BinaryTree tree = new BinaryTree();
        tree.add(new int[]{1, 2, 3});
        assertTrue(tree.contains(2));
    }

    @Test
    void testSize() {
        BinaryTree tree = new BinaryTree();
        tree.add(new int[]{1, 2, 3});
        assertEquals(3, tree.size());
    }

    @Test
    void testPreorder() {
        BinaryTree tree = new BinaryTree();
        tree.add(new int[] {10,13,7,6,16,11,1});
        assertEquals("10,7,6,1,13,11,16,", tree.preorder());
    }

    @Test
    void testInorder() {
        BinaryTree tree = new BinaryTree();
        tree.add(new int[] {10,13,7,6,16,11,1});
        assertEquals("1,6,7,10,11,13,16,", tree.inorder());
    }

    @Test
    void testPostorder() {
        BinaryTree tree = new BinaryTree();
        tree.add(new int[] {10,13,7,6,16,11,1});
        assertEquals("1,6,7,11,16,13,10,", tree.postorder());
    }
}