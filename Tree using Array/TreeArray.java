import java.util.ArrayList;

public class TreeArray {

    private int size;
    private final TreeArrayNode head;
    private int height;

    public TreeArray(TreeArrayNode head) {
        size = 0;
        this.head = head;
        height = 1;
    }

    public void addToTree(TreeArrayNode leaf, TreeArrayNode newNode) {
        ArrayList<TreeArrayNode> buffer = new ArrayList<>();
        buffer.add(head);
        while (buffer.size() > 0) {
            TreeArrayNode current = buffer.get(0);
            if (current == leaf) {
                if (current.getChildrenLength() == 0) ++height; ///Height isn't being incremented in every case where it should
                leaf.add(newNode);
                break;
            }
            int i = 0;
            while (current.getLength() > 0 && i < current.getLength()) {
                buffer.add(current.getChildAt(i));
                ++i;
            }
            buffer.remove(0);
        }
        ++size;
    }

    public TreeArrayNode removeFromTree(TreeArrayNode node) {
        ArrayList<TreeArrayNode> buffer = new ArrayList<>();
        buffer.add(head);
        while (buffer.size() > 0) {
            TreeArrayNode current = buffer.get(0);
            if (current == node) {
                if (current.getLength() == 1) --height;
                return current.remove(node);
            }
            int i = 0;
            while (current.getLength() > 0 && i < current.getLength()) {
                buffer.add(current.getChildAt(i));
                ++i;
            }
            buffer.remove(0);
        }
        --size;
        return null;
    }

    public boolean contains(Object data) {
        ArrayList<TreeArrayNode> buffer = new ArrayList<>();
        buffer.add(head);
        while (buffer.size() > 0) {
            TreeArrayNode current = buffer.get(0);
            if (current.getData() == data) {
                return true;
            }
            int i = 0;
            while (current.getLength() > 0 && i < current.getLength()) {
                buffer.add(current.getChildAt(i));
                ++i;
            }
            buffer.remove(0);
        }
        return false;
    }

    public int getHeight() {
        return height;
    }

    public int getSize() {
        return size;
    }
}
