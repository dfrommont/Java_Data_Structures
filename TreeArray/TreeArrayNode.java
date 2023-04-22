import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class TreeArrayNode {

    private Object data;
    private final ArrayList<TreeArrayNode> children;
    private int length;

    public TreeArrayNode(Object data) {
        this.data = data;
        children = new ArrayList<>();
        length = 0;
    }

    public void add(Object data) {
        children.add(new TreeArrayNode(data));
        ++length;
    }

    public TreeArrayNode remove(Object data) {
        for (TreeArrayNode node : children) {
            if (node.getData() == data) {
                --length;
                return node;
            }
        }
        return null;
    }

    public TreeArrayNode getChildAt(int i) {
        if (i >= 0 && i < length) {
            return children.get(i);
        } else {
            return null;
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getLength() {
        return length;
    }

    public int getChildrenLength() {
        return children.size();
    }
}
